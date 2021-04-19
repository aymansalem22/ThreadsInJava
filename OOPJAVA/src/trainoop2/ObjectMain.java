package trainoop2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectMain {

    public static void main(String[] args) {
        Person p1 = new Person("ismael", 33);
        System.out.println(p1);

        Person p2 = new Person("ismael", 33);
        if (p1 == p2) {//compare address not values
            System.out.println("Matched");
        } else {
            System.out.println("not Matched");
        }
        System.out.println("after override equals to compare two values");

        if (p1.equals(p2)) {
            System.out.println("Matched");
        } else {
            System.out.println("not Matched");
        }

        System.out.println("with string\n ");
        String s = "any value";
        if (p1.equals(s)) {
            System.out.println("Matched");
        } else {
            System.out.println("not matched");
        }

        
        
        System.out.println("use clone \n");

        Person[] persons = new Person[100];

        try {

            for (int i = 0; i < persons.length; i++) {
                persons[i] = (Person) p1.clone();
                System.out.println(persons[i] + "Name :" + persons[i].getName());
            }
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(ObjectMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
