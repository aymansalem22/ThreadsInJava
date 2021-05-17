
package practice3;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Main {
    public static final String PATH="C:\\test\\z.txt";
    
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter(PATH);
            PrintWriter out=new PrintWriter(writer,true);
            NumberWriter numberWriter=new NumberWriter(out);
            WordWriter wordWriter=new WordWriter(out);
            Thread t1=new Thread(numberWriter);
            Thread t2=new Thread(wordWriter);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
