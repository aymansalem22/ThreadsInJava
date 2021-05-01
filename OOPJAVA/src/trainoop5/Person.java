
package trainoop5;


public class Person {
     private int id;
    private String name;
    private int age;
   
    static int nextId=1;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name!=null) ? name : "";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Type:"+getClass().getSimpleName()
                + "\nId=" + id + ", \nName=" + name + ", \nAge=" + age ;
    }

   
    
    
    
    
}
