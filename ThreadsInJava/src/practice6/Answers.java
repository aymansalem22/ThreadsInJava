package practice6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Answers implements Runnable {

    PrintWriter out;

    public Answers(PrintWriter out) {
        this.out = out;
    }

    public static final String A_PATH = "C:\\test\\ANSWERS.txt";

    @Override
    public void run() {
        try {

            if (Questions.started == false) {
                synchronized (Main.QA_PATH) {

                    Main.QA_PATH.wait();// to suspend the thread 

                }
            }
            FileReader reader = new FileReader(A_PATH);
            BufferedReader in = new BufferedReader(reader);
            String line = "";
            while ((line = in.readLine()) != null) {
                out.println(line);
                synchronized (Main.QA_PATH) {
                    Main.QA_PATH.notify();
                    Main.QA_PATH.wait();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
