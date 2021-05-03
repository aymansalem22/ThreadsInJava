package practice1;

import javax.swing.JOptionPane;

public class EXCEPTION {

    public static void main(String[] args) {
        try {
            String ageStr = JOptionPane.showInputDialog("Enter your age");
            int age = Integer.parseInt(ageStr);
            int x = 0;
            int y = 10 / age;
            System.out.println(y);
        } catch (ExceptionInInitializerError e) {
            System.out.println("first");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("second");
            System.out.println(e.getMessage());
        }
        System.out.println("bye");
    }

}
