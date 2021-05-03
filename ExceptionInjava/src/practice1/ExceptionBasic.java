
package practice1;

import javax.swing.JOptionPane;

public class ExceptionBasic {

    public static void main(String[] args) {
        try {
            String ageStr=JOptionPane.showInputDialog("Enter your age");
            int age =Integer.parseInt(ageStr);
            System.out.println("your age after five years will be "+(age+5));
            
        } catch (Exception e) {
            System.out.println("Exception happen "+e.getMessage());
             e.printStackTrace();
        }
        System.out.println("bye");
    }
    
}
