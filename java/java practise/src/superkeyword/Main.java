package superkeyword;
class Base{
    int num=10;
}
public class Main extends Base{
    int num=20;
    void display(){
        System.out.println("num= "+num);
        System.out.println("num= "+super.num);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.display();
    }
}
