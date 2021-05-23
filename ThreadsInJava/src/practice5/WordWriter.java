
package practice5;

import java.io.PrintWriter;


public class WordWriter implements Runnable{
    String []words={"First","Second","Third","Fourth","Fifth"};
    PrintWriter out;
    public WordWriter(PrintWriter out){
    this.out=out;
    }

    @Override
    public void run() {
        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            out.println(word);
            synchronized(NumberWriter.LOCK){
            NumberWriter.LOCK.notify();
            if(i<word.length()-1){
                try {
                    NumberWriter.LOCK.wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            }
        }

    }
    
    
}
