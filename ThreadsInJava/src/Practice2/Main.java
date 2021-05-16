
package Practice2;

import java.io.FileWriter;
import java.io.PrintWriter;


public  class Main {
    
    public static void main(String[] args) {
        try {
             FileWriter writer=new FileWriter("C:\\test\\r.text");
             PrintWriter our=new PrintWriter(writer);
             NumberWriter numberWriter=new NumberWriter(our);
             WordWriter wordWriter=new WordWriter(our);
             Thread t1=new Thread(numberWriter);
             Thread t2=new Thread(wordWriter);
             t1.start();
             t2.start();
        } catch (Exception e) {
        }
       
        
    }
    
   
   
    
    
 


}
  