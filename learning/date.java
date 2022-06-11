import java.util.Calendar;
import java.util.Date;
import java.time.ZonedDateTime;
class Example {
   public static void main(String[] args) 
   {
      //Getting the current date
      Date date = new Date();
      //This method returns the time in millis
      long timeMilli = date.getTime();
      System.out.println("Time in milliseconds using Date class: " + timeMilli);

      //creating Calendar instance
      Calendar calendar = Calendar.getInstance();
      //Returns current time in millis
      long timeMilli2 = calendar.getTimeInMillis();
      System.out.println("Time in milliseconds using Calendar: " + timeMilli2);
      
      //Java 8 - toEpochMilli() method of ZonedDateTime
      System.out.println("Getting time in milliseconds in Java 8: " + 
      ZonedDateTime.now().toInstant().toEpochMilli());
   }
}

/*
import java.time.LocalDate; // import the LocalDate class

public class Main {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  }
}
*/


/*
import java.time.LocalDateTime; // import the LocalDateTime class

public class Main {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}

*/