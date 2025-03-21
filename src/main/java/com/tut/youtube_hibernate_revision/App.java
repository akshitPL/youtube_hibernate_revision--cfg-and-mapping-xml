package com.tut.youtube_hibernate_revision;

import org.hibernate.cfg.Configuration;

import com.tut.modal.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	Employee e= new Employee(2,"akshit","male",96523);
    	
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    Session session = sessionFactory.openSession();
     Transaction tx= session.beginTransaction();
    
    session.save(e);
    
   tx.commit();
}
}
