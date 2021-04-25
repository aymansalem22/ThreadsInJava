
package trainoop4;


public class Circle extends Shape {
    private double diameter;
    final double PI=3.14;

    public Circle(double r) {
        this.diameter = r;
        setPerimeter(2*PI*0.5*diameter);
        setArea(PI*(0.5*diameter)*(0.5*diameter));
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Circle{" + "id "+getId() + "\ndiameter=" + diameter +", perimeter= "+getPerimeter()+", area= "+getArea()  +'}';
    }
    
    
    
}
