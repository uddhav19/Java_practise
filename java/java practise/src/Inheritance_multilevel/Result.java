package Inheritance_multilevel;

public class Result extends Exam{
    void showresult(){
        System.out.println("student roll no= "+roll);
        System.out.println("student name = "+name);
        System.out.println("student total marks= "+total);
        System.out.println("student avg= "+avg);
    }

    public static void main(String[] args) {

        Result r= new Result();
        r.accept();
        r.acceptmarks();
        r.calculateresult();
        r.showresult();
    }
}
