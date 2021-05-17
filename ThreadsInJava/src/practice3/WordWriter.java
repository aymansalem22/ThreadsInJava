package practice3;

import java.io.PrintWriter;

public class WordWriter implements Runnable {

    PrintWriter out;

    public WordWriter(PrintWriter out) {
        this.out = out;
    }

    @Override
    public void run() {

        out.println("First");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        out.println("Second");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        out.println("Third");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        out.println("Fourth");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        out.println("Fifth");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

}
