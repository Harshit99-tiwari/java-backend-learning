package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.annotations.Array;

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

    Laptop l1 = new Laptop();
    l1.setLid(8);
    l1.setBrand("Asuslk");
    l1.setModel("ROG75");
    l1.setRam(99);

    Laptop l2 = new Laptop();
    l2.setLid(9);
    l2.setBrand("Delllo");
    l2.setModel("XPSss");
    l2.setRam(311);

    Laptop l3 = new Laptop();
    l3.setLid(10);
    l3.setBrand("applex");
    l3.setModel("macbookkk");
    l3.setRam(14);

    Alien a1 = new Alien();
    a1.setaID(108);
    a1.setaName("Harshitta");
    a1.setTech("JAVAAfx");

    Alien a2 = new Alien();
    a2.setaID(109);
    a2.setaName("Anvita");
    a2.setTech("Pythonscript");

    Alien a3 = new Alien();
    a3.setaID(110);
    a3.setaName("Ishas");
    a3.setTech("JavaScripts");

    a1.setLaptops(Arrays.asList(l1, l2));
    a2.setLaptops(Arrays.asList(l2, l3));
    a3.setLaptops(Arrays.asList(l1));

    l1.setAliens(Arrays.asList(a1, a3));
    l2.setAliens(Arrays.asList(a1, a2));
    l3.setAliens(Arrays.asList(a2));

    SessionFactory sf = new Configuration()
        .configure()
        .addAnnotatedClass(com.example.Alien.class)
        .addAnnotatedClass(com.example.Laptop.class)
        .buildSessionFactory();

    Session session = sf.openSession();

    Transaction transaction = session.beginTransaction();

    session.persist(l1);
    session.persist(l2);
    session.persist(l3);
    session.persist(a1);
    session.persist(a2);
    session.persist(a3);
    transaction.commit();

    session.close();
    sf.close();

  }
}
