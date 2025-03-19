package java_programs;

public class This_keyword {
    int a,b;
    This_keyword(int a, int b){
        this.a=a;
        this.b=b;

    }
    void add(){
        System.out.println("sum= "+(a+b));
    }
    public static void main(String[] args) {
        This_keyword obj = new This_keyword(4,5);
        obj.add();

    }
}
