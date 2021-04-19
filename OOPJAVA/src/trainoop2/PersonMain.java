
package trainoop2;

public class PersonMain extends Person{

   
    public static void main(String[] args) {
        Person p1;
        p1=new Person("Manuel", 45);
        p1.counter=1;
        System.out.println(p1.counter);
        Person p2=new Person("ali", 33);
        p2.counter=2;
        System.out.println(p2.counter);
        System.out.println("--------");
        System.out.println(p1.counter);
        Person.counter=5;
        PersonMain p4=new PersonMain("alex", 45);
        displaycounter();
       p4.displayPerson();
    }

    public PersonMain(String name,int age) {
        super(name,age);
    }
    
    public static void displaycounter(){
        System.out.println(counter);
    }
    
    public   void displayPerson(){
    Person p3 = new Person("ayman salem", 33);
        System.out.println(p3);
    }
}
