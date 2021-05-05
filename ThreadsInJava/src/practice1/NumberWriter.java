
package practice1;


public class NumberWriter implements Runnable{

    @Override
    public void run() {
      for(int i=0;i<2000;i++){
          System.out.println(i+1);
          try {
              Thread.sleep(100);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
    }
    
}
