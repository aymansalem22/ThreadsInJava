
package trainoop4;


public class Rectangle extends Shape  {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        setPerimeter(2*(height+width));
        setArea(height*width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{"+"id  "+getId() +"\ntype "+getClass().getSimpleName()+ "width=" + width + ", height=" + height +" perimeter= "+getPerimeter()+" area= "+getArea()+ '}';
    }
    
    
    
    
    
}
