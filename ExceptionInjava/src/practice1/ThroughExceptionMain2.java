package practice1;

import javax.swing.JOptionPane;

public class ThroughExceptionMain2 {

    public static void main(String[] args) {
        try {
            String Xstr = JOptionPane.showInputDialog("enter your age");
            String Ystr = JOptionPane.showInputDialog("enter your anothervalue");
            ThroughException2.divide(Xstr, Ystr);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic divide failed " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Number Format divide failed " + e.getMessage());

        }
        System.out.println("Main Finished");
    }

}
