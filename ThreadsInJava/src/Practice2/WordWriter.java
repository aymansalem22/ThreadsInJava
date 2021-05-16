package Practice2;

import java.io.PrintWriter;

public class WordWriter implements Runnable {

    PrintWriter out;

    public WordWriter(PrintWriter out) {
        this.out = out;
    }

    @Override
    public void run() {

        try {

            out.println("first");
            out.println("second");
            out.println("third");
            out.println("fourth");
            out.println("fifth");
            out.flush();

        } catch (Exception e) {
        }
    }

}
