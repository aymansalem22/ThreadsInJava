package Practice2;

import java.io.PrintWriter;

public class NumberWriter implements Runnable {

    PrintWriter out;

    public NumberWriter(PrintWriter out) {
        this.out = out;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 20; i++) {
                out.println(i);
                out.flush();
            }
        } catch (Exception e) {
        }

    }

}
