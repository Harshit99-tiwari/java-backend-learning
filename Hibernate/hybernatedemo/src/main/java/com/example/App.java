package com.example;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


//import org.hibernate.Transaction;

public class App {

  public static void main(String[] args) {

    /*
     * Student s1 = new Student();
     * s1.setName("harshi");
     * s1.setRollNo(135); /insert data in table
     * s1.setAge(25);
     * 
     * Configuration cfg = new Configuration();
     * cfg.configure();
     * SessionFactory sf = cfg.buildSessionFactory();
     * Session session = sf.openSession();
     * Transaction transaction = session.beginTransaction();
     * 
     * session.persist(s1);
     * 
     * transaction.commit();
     * 
     * //FETCH DATA FROM TABLE
     * Student s1 = new Student();
     * s1.setName("harshi");
     * s1.setRollNo(135);
     * s1.setAge(25);
     * 
     * Student s2 = null;
     * 
     * SessionFactory sf = new
     * Configuration().configure().addAnnotatedClass(com.example.Student.class).
     * buildSessionFactory();
     * Session session = sf.openSession();
     * 
     * s2 = session.find(Student.class, 134);
     * session.close();
     * System.out.println(s2);
     * sf.close();
     * 
     * //UPDATE DATA IN TABLE
     * Student s1 = new Student();
     * s1.setName("harsh");
     * s1.setRollNo(131);
     * s1.setAge(20);
     * SessionFactory sf = new
     * Configuration().configure().addAnnotatedClass(com.example.Student.class).
     * buildSessionFactory();
     * Session session = sf.openSession();
     * Transaction transaction = session.beginTransaction();
     * session.merge(s1);
     * transaction.commit();
     * 
     * session.close();
     * sf.close();
     * System.out.println(s1);
     * 
     * //UPDATE DATA THAT IS NOT IN TABLE
     * Student s1 = new Student();
     * s1.setName("anvit");
     * s1.setRollNo(137);
     * s1.setAge(29);
     * SessionFactory sf = new
     * Configuration().configure().addAnnotatedClass(com.example.Student.class).
     * buildSessionFactory();
     * Session session = sf.openSession();
     * Transaction transaction = session.beginTransaction();
     * session.merge(s1);
     * transaction.commit();
     * 
     * session.close();
     * sf.close();
     * System.out.println(s1);
     * 
     * //DELETE DATA FROM TABLE
     * Student s1 = new Student();
     * 
     * SessionFactory sf = new
     * Configuration().configure().addAnnotatedClass(com.example.Student.class).
     * buildSessionFactory();
     * Session session = sf.openSession();
     * s1 = session.find(Student.class,137);
     * Transaction transaction = session.beginTransaction();
     * session.remove(s1);
     * transaction.commit();
     * 
     * session.close();
     * sf.close();
     * System.out.println(s1);
     */

  /*  Book b = new Book();
    b.setBid(1);
    b.setBauthor("rd sharma");
    b.setBname("physics");
    b.setBprice(500);

    Book b1 = new Book();
    b1.setBid(2);
    b1.setBauthor("rk sharma");
    b1.setBname("math");
    b1.setBprice(600);

    Book b2 = new Book();
    b2.setBid(3);
    b2.setBauthor("pk kumar");
    b2.setBname("sst");
    b2.setBprice(50);

    Book b3 = new Book();
    b3.setBid(4);
    b3.setBauthor("rs agrwl");
    b3.setBname("physics");
    b3.setBprice(500);*/

    SessionFactory sf = new Configuration()
        .configure()
        .addAnnotatedClass(com.example.Book.class)
        .buildSessionFactory();

    Session session = sf.openSession();

    Query query =  session.createQuery("from Book where bprice = 500");
    List<Book> books  = query.getResultList();
    System.out.println(books);

    session.close();
    sf.close();

  }
}
