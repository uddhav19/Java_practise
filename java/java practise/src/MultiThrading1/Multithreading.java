package MultiThrading1;

 public class Multithreading implements Runnable{

    @Override
    public void run() {
        //task to perform
        for (int i = 0; i < 10; i++) {
            System.out.println("child thread");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {

            }
            
        }
    }
     public static void main(String[] args) {
         Multithreading m = new Multithreading();
         Thread t = new Thread(m);
         t.start();
     }
}



