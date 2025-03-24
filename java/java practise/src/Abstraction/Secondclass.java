package Abstraction;

public class Secondclass extends Abstractclass{
    public static void main(String[] args) {
        Secondclass obj = new Secondclass();
        obj.show();
        obj.display();
    }

    @Override
    void show() {
        System.out.println("hello second class");
    }
}
