package org.example.Crud_operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    private static SessionFactory factory;


    public static void createstudent(){
        Session session = factory.openSession();
        try {
            Student stud = new Student();

            stud.setName("uddhav");
            stud.setCity("pune");
            session.beginTransaction();
            session.save(stud);
            session.getTransaction().commit();

        }finally {
            session.close();
        }
    }

    public static void readstudent(){
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            int studentid = 2;
            Student mystud = session.get(Student.class, studentid);
            session.getTransaction().commit();

            System.out.println("Student found: " +mystud);
        }finally {

        }
    }

    public static void updatestudent(){
        Session session = factory.openSession();
        try {
             session.beginTransaction();
             int studid= 2;
             Student mystud = session.get(Student.class,studid);

             if(mystud != null){
                 mystud.setName("mohan");
             }
             session.getTransaction().commit();
            System.out.println("student updated:"+ mystud);
            }finally {
            session.close();
        }

    }

    public static void deletestudent(){
        Session session = factory.openSession();
        try {
            session.beginTransaction();
            int studid = 2;
            Student mystud = session.get(Student.class, studid);
            if (mystud != null){
                session.delete(mystud);
                System.out.println("student deleted"+ mystud);
            }

            session.getTransaction().commit();
        }finally {

        }



    }

    public static void main(String[] args) {

        try {
            Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
            factory = cfg.buildSessionFactory();

            //createstudent();
//            readstudent();
            // updatestudent();
            deletestudent();
        }finally {
            factory.close();
        }

    }
}
