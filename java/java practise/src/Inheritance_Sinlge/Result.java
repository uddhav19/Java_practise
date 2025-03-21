package Inheritance_Sinlge;

public class Result extends Student{
    int math, sci, che, total;
    float avg;
    void acceptmarks(){
        System.out.println("enter student math marks:");
        math = sc.nextInt();
        System.out.println("enter student math marks:");
        sci = sc.nextInt();
        System.out.println("enter student math marks:");
        che = sc.nextInt();
    }

    void calculateresult(){
        total= math+sci+che;
        avg= total/3;
    }

    void displayresult(){
        System.out.println("student roll no: "+roll);
        System.out.println("student name: "+name);
        System.out.println("student city: "+city);
        System.out.println("student total marks: "+total);
        System.out.println("student average: "+avg);
    }

    public static void main(String[] args) {
        Result obj = new Result();
        obj.accept();
        obj.acceptmarks();
        obj.calculateresult();
        obj.displayresult();
    }

}
