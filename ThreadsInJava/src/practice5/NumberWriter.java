
package practice5;

import java.io.PrintWriter;

public class NumberWriter implements Runnable{
  public static final Object LOCK=new Object();
    PrintWriter out;
    
    public NumberWriter(PrintWriter out){
    this.out=out;
    }
    @Override
    public void run() {
        for (int i = 1; i <=20; i++) {
            out.println(i);
            if(i%5==0){
               synchronized(LOCK){
               LOCK.notify();
                   try {
                       LOCK.wait();
                   } catch (Exception e) {
                   }
               }    
            }
        }

    }
    
}
