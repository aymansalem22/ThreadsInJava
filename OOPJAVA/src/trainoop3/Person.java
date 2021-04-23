
package trainoop3;


public class Person {
    private int age;
    private String name;
    private int id;
    static int nextId=1;

    public Person(int age, String name) {
        this.id=nextId++;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0&&age<120){
        this.age = age;
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name!=null)?name:"";
    }

    @Override
    public String toString() {
        return "id "+id+ "\nType: "+getClass().getSimpleName()+  "age=" + age + ", name=" + name  + '}';
    }
    
    
    
    
    
}
