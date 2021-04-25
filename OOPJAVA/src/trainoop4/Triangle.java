
package trainoop4;


public class Triangle extends Shape {
    int l1,l2,l3;

    public Triangle(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        setPerimeter(l1+l2+l3);
        setArea(0.5*l1*l3);
    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

    @Override
    public String toString() {
        return "Triangle{"+" id"+getId() + "l1=" + l1 + ", l2=" + l2 + ", l3="
                + l3 +" perimeter= "+getPerimeter()+" area= "+getArea()+  '}';
    }
    
    
    
    
}
