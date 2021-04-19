
package trainoop2;

public class Person implements Cloneable{
    private String name;
    private int age;
    public static int counter=0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object obj) {
    if(obj instanceof Person){
    Person p=(Person)obj;
    return this.name.equals(p.name)&&this.age==p.age;
    }
     return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
