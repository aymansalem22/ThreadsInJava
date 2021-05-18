package practice4;

import java.io.PrintWriter;

public class WordWriter implements Runnable {

    public static final Object LOCK = new Object();
    public static int counter = 0;
    String[] names = {"first", "second", "third", "fouth", "fifth"};
    PrintWriter out;

    public WordWriter(PrintWriter out) {
        this.out = out;
    }

    @Override
    public void run() {

        for (String name : names) {
            out.println(name);
//            synchronized(LOCK){
//            int c=counter;
//                try {
//                    Thread.sleep(1);
//                } catch (Exception e) {
//                }
//                c++;
//                try {
//                    Thread.sleep(1);
//                } catch (Exception e) {
//                }
//                counter=c;}
        }

    }

}
