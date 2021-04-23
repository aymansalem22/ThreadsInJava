
package trainoop3;


public class Manager extends Employee{
    private double bonus;
    
    public Manager(double bonus,double salary, int age, String name) {
        super(salary, age, name);
        this.bonus=bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\n bonus=" + bonus + '}';
    }

    @Override
    public double totalSalary() {
        return super.totalSalary()+bonus; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
