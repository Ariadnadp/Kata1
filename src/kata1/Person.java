package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private final static int MS_PER_SECOND =1000;
    private final static int SECONDS_PER_MINUTE=60;
    private final static int MINUTES_PER_HOURS =60;
    private final static int HOURS_PER_DAY =24;
    private final static double DAYS_PER_YEAR =365.25;
    private final static double MS_PER_YEAR=MS_PER_SECOND*SECONDS_PER_MINUTE*MINUTES_PER_HOURS*HOURS_PER_DAY*DAYS_PER_YEAR;
    
    
    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        long ms = new Date().getTime()-birthday.getTime();
        return getYears(ms);
    }

    private int getYears(long ms) {
        return (int) (ms/MS_PER_YEAR);
    }
}
