
package trainoop4;


public class Square extends Rectangle {
   
    public Square(int width) {
        super(width, width);
    }

    @Override
    public String toString() {
        return "Square{"+"id "+getId()+"\n"+"width= "+getWidth()+
                ", perimeter= "+getPerimeter()+" area= "+getArea()+'}';
    }
    
   
    
}
