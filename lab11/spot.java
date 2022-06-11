abstract class Account {
    int accno;
    String accountName;
    double balance;

    Account(int acc, String name, double bal) {
        this.accno = acc;
        this.accountName = name;
        this.balance = bal;
    }

    public abstract void deposit(double a);

    public abstract double withdraw(double a);

    @Override
    public String toString() {
        return accno + "\t" + accountName + "\t" + balance;
    }
}

class SavingAccount extends Account {
    int no_of_transaction;

    SavingAccount(int accno, String name, double bal) {
        super(accno, name, bal);
        no_of_transaction = 0;
    }

    @Override
    public void deposit(double amount) {
        synchronized (this) {
            this.no_of_transaction++;
            this.balance += amount;
        }

    }

    @Override
    public double withdraw(double amount) {
        synchronized (this) {
            this.no_of_transaction++;
            this.balance -= amount;
        }
        return amount;
    }
}

class CheckingsAccount extends Account {

    CheckingsAccount(int accno, String accountname, double balance) {
        super(accno, accountname, balance);
    }

    @Override
    public void deposit(double amt) {
        this.balance += amt;
    }

    @Override
    public double withdraw(double amt) {
        double temp = this.balance - amt;
        if (temp > 1000) {
            this.balance -= amt;
            return amt;
        }
        return 0;
    }

}

class Mythreader extends Thread {
    Account a;

    Mythreader(Account a) {
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("\n[+] Crediting Rs.6500 in : " + a.accountName);
        a.deposit(6500);
        System.out.println("\n[-] Debiting Rs.2000 in : " + a.accountName);
        a.withdraw(2000);
    }
}

public class spot{
    public static void main(String args[]) throws InterruptedException{
        int k = 1;
        SavingAccount s1 = new SavingAccount(k++, "Bhuvaneshwar", 10000);
        SavingAccount s2 = new SavingAccount(k++, "Deepak", 5220);

        CheckingsAccount c1 = new CheckingsAccount(3, "Jyotir", 2000);

        s1.deposit(6008);
        s2.deposit(2050);
        System.out.println("[-] Withdrawa; : " + s1.withdraw(600) + " from " + s1.accountName);
        System.out.println("[-] Withdrawa; : " + s2.withdraw(300) + " from " + s2.accountName);

        double ss = c1.withdraw(250);
        if (ss == 0) {
            System.out.println("*** Low Balance ***" + c1.accountName);
        } else {
            System.out.println("[-] Withdrawa; 2500 from " + c1.accountName);
        }

        try {
            Mythreader t1 = new Mythreader(s1);
            Mythreader t2 = new Mythreader(s1);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(c1);

            t1.run();
            t2.run();

            t1.join();
            t2.join();

            System.out.println("\n**** After Running the threads **** ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(c1);
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
}