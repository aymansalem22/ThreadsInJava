
package trainoop4;


public class Shape {
    private int id;
    static int nextId=1;
    private double perimeter;
    private double area;

    public Shape() {
        id = nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" + "perimeter=" + perimeter + ", area=" + area + '}';
    }
    
    
    
    
    
}
