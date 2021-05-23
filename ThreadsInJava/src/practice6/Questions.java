
package practice6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;


public class Questions implements Runnable{

    public static boolean started=false;
    PrintWriter out;
    
    public static final String Q_PATH="C:\\test\\QUESTIONS.txt";
    
    public Questions(PrintWriter out){
    this.out=out;
    }
    @Override
    public void run() {
        
        try {
            FileReader reader=new FileReader(Q_PATH);
            BufferedReader in=new BufferedReader(reader);
            String line="";
            while((line=in.readLine())!=null){
            out.println(line);
            synchronized(Main.QA_PATH){
            started=true;
            Main.QA_PATH.notify();
            Main.QA_PATH.wait();
            }
            }
            
            synchronized(Main.QA_PATH){
            Main.QA_PATH.notify();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
