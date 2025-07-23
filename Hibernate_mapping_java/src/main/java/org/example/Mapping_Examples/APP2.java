package org.example.Mapping_Examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class APP2 {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory f= cfg.buildSessionFactory();

        Department d= new Department();
        d.setDep_name("computer");

        Emploee e1 = new Emploee();
        e1.setEmp_name("uddhav");
        e1.setDepartment(d);


        Emploee e2= new Emploee();
        e2.setEmp_name("dipak");
        e2.setDepartment(d);

        d.setEmploees(Arrays.asList(e1,e2));

        Session session = f.openSession();
        session.beginTransaction();
        session.save(d);
        session.getTransaction().commit();
        session.close();
        f.close();
        System.out.println("data saved succssfully");




    }
}
