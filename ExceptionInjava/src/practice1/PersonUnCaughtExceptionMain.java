
package practice1;

public class PersonUnCaughtExceptionMain {

    public static void main(String[] args) {
       Person p1=new Person("omar", 33);
       System.out.println(p1);
        Person p2=null;
        
        try {
            p2=new Person("hassan", 32);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(p2);
    }
    
}
