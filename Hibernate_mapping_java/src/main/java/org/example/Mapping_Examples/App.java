package org.example.Mapping_Examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();

      Person person = new Person();
      person.setId(1);
      person.setName("uddhav");

      Passport passport = new Passport();
      passport.setId(101);
      passport.setPassportnumber("A123456");

      person.setPassport(passport);
      passport.setPerson(person);




        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(person);
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
