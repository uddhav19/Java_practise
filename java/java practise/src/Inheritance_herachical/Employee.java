package Inheritance_herachical;

public class Employee extends Address{
    int empl_id;
    String employ_name;
    void employee_properties(){
        System.out.println("enter employee id: ");
        empl_id = sc.nextInt();
        System.out.println("enter employee name");
        employ_name= sc.next();
    }

    void employeereslut(){
        System.out.println("pincode= "+pincode);
        System.out.println("city= "+city);
        System.out.println("state= "+state);
        System.out.println("employee name= "+employ_name);
        System.out.println("emploee id= "+empl_id);
    }

    public static void main(String[] args) {
        Employee e= new Employee();
        e.acceptproperties();
        e.employee_properties();
        e.employeereslut();

        Student s= new Student();
        s.acceptproperties();
        s.student_properties();
        s.studentresult();

    }
}
