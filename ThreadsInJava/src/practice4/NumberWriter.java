
package practice4;

import java.io.PrintWriter;


public class NumberWriter implements Runnable{
    
    public static final Object LOCK=new Object();
    public static int counter=0;
    public static int counter2=0;
    PrintWriter out;

    public NumberWriter(PrintWriter out) {
        this.out = out;
    }

    
    
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            out.println(i);
            synchronized(this){
            int c=counter;
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                c++;
                try {
                    
                    Thread.sleep(1);

                } catch (Exception e) {
                }
                counter=c;
            
            }
            
            synchronized(LOCK){
            int c=counter2;
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                c++;
                try {
                    Thread.sleep(1);
                } catch (Exception e) {
                }
                counter2=c;
            }
        }
    }
}
