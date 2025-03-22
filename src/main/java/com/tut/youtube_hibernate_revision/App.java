package com.tut.youtube_hibernate_revision;

import org.hibernate.cfg.Configuration;

import com.tut.modal.entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
      
    	Employee e= new Employee("hjn","male",96523);
    	
    	
    	StandardServiceRegistry ssr =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	
        SessionFactory sessionFactory = meta.buildSessionFactory();
    Session session = sessionFactory.openSession();
    session.save(e);
   session.beginTransaction().commit();
}
}
