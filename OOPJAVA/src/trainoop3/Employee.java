/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainoop3;

/**
 *
 * @author sayma
 */
public class Employee extends Person implements Comparable<Employee>{
    private double salary;

    public Employee(double salary,int age, String name) {
        super(age, name);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    public double totalSalary(){
    return salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n salary=" + salary + '}';
    }

    
    
    
    
    
    
    
    
    @Override
    public int compareTo(Employee e) {
   return (int) (this.totalSalary()-e.totalSalary());
    }
    
    
}
