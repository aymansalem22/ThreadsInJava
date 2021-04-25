
package trainoop4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
   List<Shape> shapes=new ArrayList<>();
   int exit=1;
   while(exit==1){
       System.out.println("please enter shape type:s,r,t,c");
       Scanner sc=new Scanner(System.in);
       char choose=sc.next().charAt(0);
       
       switch(choose){
           case 'r':
               System.out.println("please enter width: ");
               int width=sc.nextInt();
               System.out.println("please enter height");
               int height=sc.nextInt();
               Rectangle rectangle=new Rectangle(width, height);
               shapes.add(rectangle);
               System.out.println("press '1' to add more shapes or 0 to exit");
               exit=sc.nextByte();
               break;
               
           case 's':
               System.out.println("please enter width");
               int widtth=sc.nextInt();
               Square square=new Square(widtth);
               shapes.add(square);
               System.out.println("press '1' to add more shapes or 0 to exit");
               exit=sc.nextByte();
               break;
               
           case 'c':
               System.out.println("please enter R ");
               int r = sc.nextInt();
               Circle circle = new Circle(r);
               shapes.add(circle);
               System.out.println("press '1' to add more shapes or 0 to exit");
               exit = sc.nextByte();
               break;
       
           case 't':
               System.out.println("please enter L1");
               int l1 = sc.nextInt();
               System.out.println("please enter L2");
               int l2 = sc.nextInt();
               System.out.println("please enter L3");
               int l3 = sc.nextInt();
               Triangle triangle = new Triangle(l1, l2, l3);
               shapes.add(triangle);
               System.out.println("press '1' to add more shapes or 0 to exit");
               exit = sc.nextByte();
               break;
               
           default:
               System.out.println("end program");
               return;
       
       
       
       }}
   
   
        display(shapes);
        System.out.println("--------sum Perimeter------");
        System.out.println(sumPerimeter(shapes));
        System.out.println("--------avg Perimeter------");
        System.out.println(avgPerimeter(shapes));
        System.out.println("---------sum area----------");
        System.out.println(sumArea(shapes));
        System.out.println("---------avg area----------");
        System.out.println(avgArea(shapes));
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    }
    
    public static void display(List<Shape> shapes){
        for (Shape r : shapes) {
            System.out.println(r);
            System.out.println("--------------");
        }
    
    }
    
    public static double sumPerimeter(List<Shape> shapes){
    
        double sum=0;
        for (Shape shape : shapes) {
            sum+=shape.getPerimeter();
        }
        return sum;
    }
    
    
    public static double avgPerimeter(List<Shape> shapes){
    return (shapes.isEmpty())?0
            :sumPerimeter(shapes)/shapes.size();
    
    }
    
    public static double sumArea(List<Shape> shapes){
    double sum=0;
        for (Shape shape : shapes) {
            sum+=shape.getArea();
        }
        return sum;
        
    }
    
    public static double avgArea(List<Shape> shapes){
    return (shapes.isEmpty())?0
            :sumArea(shapes)/shapes.size();
    
    }
    
    
}
