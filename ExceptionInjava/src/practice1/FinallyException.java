
package practice1;

import javax.swing.JOptionPane;


public class FinallyException {

   
    public static void main(String[] args) {
     int x=takeInputs();
        System.out.println("Main finished with "+x);
    }
    
    
    
    public static int takeInputs(){
        try {
            String ageStr=JOptionPane.showInputDialog("Enter your age");
            int age=Integer.parseInt(ageStr);
            System.out.println("your age after five years "+(age+5));
            int y=100/age;
            System.out.println(y);
            return y;
        } 
        catch (ArithmeticException e) {
             System.out.println("first");
          System.out.println("can't divide by zero");
        }
        
        catch(Exception e){
         System.out.println("second");
            System.out.println(e.getMessage());
        }
        
        finally{
        System.out.println("bye");}
          return -1;
        }
    }

