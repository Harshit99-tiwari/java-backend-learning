package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;



//import org.hibernate.Transaction;

public class App {
 
    public static void main(String[] args) {

      
      /*   Student s1 = new Student();
        s1.setName("harshi");
        s1.setRollNo(135);    /insert data in table
        s1.setAge(25);

        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(s1);

        transaction.commit();

        //FETCH DATA FROM TABLE
         Student s1 = new Student();
        s1.setName("harshi");
        s1.setRollNo(135);
        s1.setAge(25);

        Student s2 = null;
        
        SessionFactory sf = new Configuration().configure().addAnnotatedClass(com.example.Student.class).buildSessionFactory();
        Session session = sf.openSession();

        s2 = session.find(Student.class, 134);
        session.close();
        System.out.println(s2);
        sf.close();
       
        //UPDATE DATA IN TABLE
        Student s1 = new Student();
        s1.setName("harsh");
        s1.setRollNo(131);
        s1.setAge(20);
        SessionFactory sf = new Configuration().configure().addAnnotatedClass(com.example.Student.class).buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =  session.beginTransaction();
        session.merge(s1);
        transaction.commit();

        session.close();
        sf.close();
        System.out.println(s1);

        //UPDATE DATA THAT IS  NOT IN TABLE
         Student s1 = new Student();
        s1.setName("anvit");
        s1.setRollNo(137);
        s1.setAge(29);
        SessionFactory sf = new Configuration().configure().addAnnotatedClass(com.example.Student.class).buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction =  session.beginTransaction();
        session.merge(s1);
        transaction.commit();

        session.close();
        sf.close();
        System.out.println(s1);

        //DELETE DATA FROM TABLE
         Student s1 = new Student();
       
        SessionFactory sf = new Configuration().configure().addAnnotatedClass(com.example.Student.class).buildSessionFactory();
        Session session = sf.openSession();
        s1 = session.find(Student.class,137);
        Transaction transaction =  session.beginTransaction();
        session.remove(s1);
        transaction.commit();

        session.close();
        sf.close();
        System.out.println(s1);*/

        Laptop l1 = new Laptop();
        l1.setBrand("Asus");
        l1.setModel("ROG");
        l1.setRam(16);
        
        Alien a1 = new Alien();
        a1.setaID(102);
        a1.setaName("Harshit");
        a1.setTech("JAVA");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration()
        .configure()
        .addAnnotatedClass(com.example.Alien.class)
        .buildSessionFactory();

        Session session = sf.openSession();
       
        Transaction transaction =  session.beginTransaction();

        session.persist(a1);
        transaction.commit();

      
        session.close();
        sf.close();
      

    }
}
