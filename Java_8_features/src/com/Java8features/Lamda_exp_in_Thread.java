package com.Java8features;


public class Lamda_exp_in_Thread {
    public static void main(String[] args) {

        Runnable runnable = () -> {    //implementing run method using lambda expression
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

            }
        };

        Thread t1 = new Thread(runnable);
        t1.run();

    }
}
