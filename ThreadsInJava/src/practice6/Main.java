
package practice6;

import java.io.FileWriter;
import java.io.PrintWriter;


public class Main {
    public static final String QA_PATH = "C:\\test\\QA.txt";
    
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter(QA_PATH);
            PrintWriter out=new PrintWriter(writer,true);
            Questions questions=new Questions(out);
            Answers answers=new Answers(out);
            Thread Qthread=new Thread(questions);
            Thread Athread=new Thread(answers);
            Qthread.start();
            Athread.start();
            Qthread.join();
            Athread.join();
            
            
        } catch (Exception e) {
        }
        System.out.println("Successfully Completed");
    }
    
}
