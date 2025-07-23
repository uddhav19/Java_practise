package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class App3 {

    //Many to many mapping

    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");


        SessionFactory f= cfg.buildSessionFactory();
        Session session = f.openSession();
        Course java = new Course();
        java.setCourse_name("java");

        Course python = new Course();
        python.setCourse_name("python");

        Student s1 = new Student();
        s1.setStud_name("xyz");
        s1.setCourses(Arrays.asList(java,python));

        Student s2=new Student();
        s2.setStud_name("abc");
        s2.setCourses(Arrays.asList(java));

        session.beginTransaction();
        session.save(s1);
        session.save(s2);

        session.getTransaction().commit();
        session.close();
        f.close();

    }



}
