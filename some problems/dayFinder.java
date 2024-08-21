import java.util.*;

public class dayFinder {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);  // Months are 0-based in Calendar
        calendar.set(Calendar.YEAR, year);
        
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }

    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);

     System.out.println("enter month,day and year");
        
        int month =sc.nextInt(); // enter month
        int day = sc.nextInt();  //enter day
        int year = sc.nextInt(); //enter year

        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek); 
        
        sc.close();
    }
}
