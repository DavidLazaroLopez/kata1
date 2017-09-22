package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import sun.util.calendar.Gregorian;

public class Person {
    private final String name;
    private final Calendar birthdate;
    private static final long MILISECONS_PER_YEAR  
            = (long) (1000*60*60*24*365.25);

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public Calendar getCalendar() {
        return birthdate;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (milliSecondsToYear(today.getTimeInMillis()-
                        birthdate.getTimeInMillis()));
    }
    
    private long milliSecondsToYear(long milles) {
        return milles / MILISECONS_PER_YEAR;
    }
}