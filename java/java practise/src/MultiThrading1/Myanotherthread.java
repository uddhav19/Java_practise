package MultiThrading1;

public class Myanotherthread extends Thread{

    public  void run(){
        for (int i = 0; i <10; i--) {
            System.out.println("using thraed class");
            try {
                Thread.sleep(700);
            }catch (Exception e){

            }

        }


    }

    public static void main(String[] args) {
        Myanotherthread t =new Myanotherthread();
        t.start();

    }
}
