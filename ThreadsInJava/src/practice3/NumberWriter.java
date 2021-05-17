package practice3;

import java.io.PrintWriter;

public class NumberWriter implements Runnable {

    PrintWriter out;

    public NumberWriter(PrintWriter out) {
        this.out = out;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(190);
            } catch (Exception e) {
            }
            out.println(i);
        }
    }

}
