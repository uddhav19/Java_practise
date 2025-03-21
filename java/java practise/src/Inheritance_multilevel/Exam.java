package Inheritance_multilevel;

public class Exam extends Student{
    int math, sci, chem, total;
    float avg;
    void acceptmarks(){
        System.out.println("enter math marks:");
        math= sc.nextInt();
        System.out.println("enter sci marks:");
        sci= sc.nextInt();
        System.out.println("enter chem marks:");
        chem= sc.nextInt();

    }
    void calculateresult(){
        total= math+sci+chem;
        avg=total/3;
    }
}
