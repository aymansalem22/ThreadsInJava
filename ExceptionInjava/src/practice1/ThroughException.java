
package practice1;


public class ThroughException {
    
    public static double divide(double x,double y) throws ArithmeticException{
    if(y==0){
    throw new ArithmeticException("cant divide by zero");
    
    }
    return x/y;
        
    }
}
