/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainoop1;

/**
 *
 * @author sayma
 */
public class Timer {
    public void repeat(int sec,TimerAction1 action){
        for (int i = 0; i < 5; i++) {
        
{
        try {
              Thread.sleep(sec*1000);
            action.doAction();
        } catch (Exception e) {
        }
  
    
    }}}
}
