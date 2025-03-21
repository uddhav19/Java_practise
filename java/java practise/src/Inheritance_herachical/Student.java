package Inheritance_herachical;

public class Student extends Address{
    int stud_id;
    String stud_name;
    void student_properties(){
        System.out.println("enter student id");
        stud_id = sc.nextInt();
        System.out.println("enter student name");
        stud_name= sc.next();
    }
    void studentresult(){
        System.out.println("pincode= "+pincode);
        System.out.println("city= "+city);
        System.out.println("state= "+state);
        System.out.println("student id= "+ stud_id);
        System.out.println("student name= "+stud_name);
    }
}
