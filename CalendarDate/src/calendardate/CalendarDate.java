package calendardate;
import java.util.Calendar;

public class CalendarDate {

    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        
        System.out.println("Calendario: " + calendar1.getTime());
        
        calendar1.set(Calendar.MONTH, 11); 
        calendar1.set(Calendar.DATE, 05); 
        calendar1.set(Calendar.YEAR, 1996); 
        
        calendar1.add((Calendar.YEAR), 9);
        
        System.out.println("Calendario: " + calendar1.after(calendar2));
        System.out.println("Calendario: " + calendar1.before(calendar2));
        
        System.out.println("Calendario: " + calendar1.getTime());
        
        System.out.println("Calendario: " + calendar1.clone());
    }
}
