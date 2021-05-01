
package trainoop5;


public class Employee extends Person implements Comparable<Employee>{

    private double salary;

    public Employee(String name, int age,double salary) {
        super(name, age);
        this.salary=salary;
    }
    
    public static void main(String[] args) {
        Employee e1=new Employee("alex", 33, 2100);
        System.out.println(e1);
    }
    
    
    public double getSalary(){
    return salary;
    }
    
    public double totalSalary(){
    return salary;
    }
    
    public void setSalary(double salary){
    this.salary=salary;
    }
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public int compareTo(Employee e) {
        return (int) (this.totalSalary()-e.totalSalary());
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSalary=" + salary ;
    }
    
    
    
    
}
