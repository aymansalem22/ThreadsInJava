
package practice4;

import java.io.FileWriter;
import java.io.PrintWriter;


public class Main {

   public static final String PATH="C:\\test\\q.txt";
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter(PATH);
            PrintWriter out=new PrintWriter(writer,true);
            NumberWriter numberWriter=new NumberWriter(out);
            NumberWriter[] numberWriters=new NumberWriter[100];
            WordWriter wordWriter=new WordWriter(out);
            Thread t2=new Thread(wordWriter);
            Thread[] threads=new Thread[100];
            // t2.start();
           //  t2.join();
            for (int i = 0; i < threads.length; i++) {
                threads[i]=new Thread(numberWriter);
            }
            System.out.println("with array do 100 objects");
            for (int i = 0; i < threads.length; i++) {
                numberWriters[i]=new NumberWriter(out);
                threads[i]=new Thread(numberWriters[i]);
            }
            
            for (Thread thread : threads) {
                thread.start(); 
               
            }
            for (Thread thread : threads) {
                thread.join(); 
                
            }
          
           
            System.out.println("counter is "+NumberWriter.counter);
            System.out.println("counter2 is "+NumberWriter.counter2);
          //  System.out.println("COUNTER WORD "+WordWriter.counter);
        } catch (Exception e) {
            e.printStackTrace();
        }
      
    }
    
}
