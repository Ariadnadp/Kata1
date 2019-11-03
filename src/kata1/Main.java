package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person pau = new Person("Pau", new Date(84,1,6));
        System.out.println("Pau gasol tiene: " + pau.getAge());
        System.out.println(pau.getName());
    }
    
}
