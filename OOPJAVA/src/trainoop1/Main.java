
package trainoop1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

   
    public static void main(String[] args) {
       Timer t1=new Timer();
       MyAction1 action=new MyAction1();
       t1.repeat(5, action);
       
       TimerAction1 tm=new TimerAction1() {
           @Override
           public void doAction() {
               System.out.println("welcome ayman from the main method after do override");
           }
       };
       
       tm.doAction();
       
       
       
       ActionListener actionlistner=new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("use ready library ,welcome ayman");
             
           } 
    
       };
      
       javax.swing.Timer timer=new javax.swing.Timer(2000,actionlistner);
         timer.start();
         while (true) {            
           //busy loop
        }
       
       
       
        
      
    }
    
}
