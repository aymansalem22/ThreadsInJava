
package practice1;


public class ThroughException2 {
    
    public static double divide(String xStr,String yStr)
            throws ArithmeticException,NumberFormatException{
    
        double x=Double.parseDouble(xStr);
        double y=Double.parseDouble(yStr);
        double d=x/y;
        System.out.println("D: "+d);
        return d;
    }
}
