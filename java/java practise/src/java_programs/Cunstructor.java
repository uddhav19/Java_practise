package java_programs;

public class Cunstructor {
    int roll_no;
    String name;
    Cunstructor(){
      roll_no=31;
      name="uddhav";

    }
    void display(){
        System.out.println("roll_no"+roll_no+"\nname="+name);

    }
    public static void main(String[] args) {
        Cunstructor s= new Cunstructor();
        s.display();

    }
}
