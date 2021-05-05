
package practice1;


public class ThreadMain {

   
    public static void main(String[] args) {
        System.out.println("Main Started");
        NumberWriter numberWriter=new NumberWriter();
        WordWriter wordWriter=new WordWriter();
        Thread t1=new Thread(numberWriter);
        Thread t2=new Thread(wordWriter);
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println("End");
    }
    
}
