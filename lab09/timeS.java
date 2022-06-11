import java.util.*;

class TimeException extends Exception{
	public TimeException(String s){
		super(s);
	}
}

abstract class Time{
	private int s, m, h;
	Time(){
		s=0;
		m=0;
		h=0;
	}

	Time(int s, int m, int h) throws TimeException{
		if(s>60 || s<0) throw new TimeException("Invalid seconds");
		if(m>60 || m<0) throw new TimeException("Invalid minutes");
		if(h>24 || h<0) throw new TimeException("Invalid hours");
		this.s=s;
		this.m=m;
		this.h=h;
	}

	public int getS(){return s;}
	public int getM(){return m;}
	public int getH(){return h;}

	public void setS(int s) throws TimeException{
		if(s>60 || s<0) throw new TimeException("Invalid seconds");
		this.s = s;	
	}

	public void setM(int m) throws TimeException{
		if(m>60 || m<0) throw new TimeException("Invalid minutes");
		this.m = m;	
	}
	public void setH(int h) throws TimeException{
		if(s>24 || h<0) throw new TimeException("Invalid hours");
		this.h = h;	
	}

	void display(){
		System.out.println("\n\tTime: "+h+":"+m+":"+s);
	}
}

class Twelve extends Time{
	Twelve() throws TimeException{super(0,0,0);}
	Twelve(int s, int m, int h) throws TimeException{super(s,m,h);}

	void display(){
		String format;
		if(this.getH()<12)
			format = "AM";
		else
			format = "PM";
		System.out.println("\n\tTime: "+(this.getH()%12)+":"+this.getM()+":"+this.getS()+" "+format);
	}
}

class TwelveF extends Time{
	TwelveF() throws TimeException{super(0,0,0);}
	TwelveF(int s, int m, int h) throws TimeException{super(s,m,h);}

	void display(){
		System.out.println("\n\tTime: "+this.getH()+":"+this.getM()+":"+this.getS());
	}
}

class timeTest{
	public static void main(String []args){
		try{
			Time t1 = new Twelve(15,45,18);
			Time t2 = new TwelveF(15,45,18);
			t1.display();
			t2.display();
			t1.setH(7);
			t2.setH(9);
			t1.display();
			t2.display();
			t1.setS(61);
		}catch(TimeException e){
			System.out.println(e.getMessage());
		}
	}
}
