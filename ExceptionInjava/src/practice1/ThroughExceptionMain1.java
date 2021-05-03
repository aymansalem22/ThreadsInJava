
package practice1;


public class ThroughExceptionMain1 {

    
    public static void main(String[] args) {
        try {
            ThroughException.divide(50, 0);
        } catch (Exception e) {
            System.out.println("divide failed "+e.getMessage());
        }
        System.out.println("Main finished");
    }
    
}
