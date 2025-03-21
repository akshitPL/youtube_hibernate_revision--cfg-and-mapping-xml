package com.tut.youtube_hibernate_revision;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    
    System.out.println(sessionFactory);
}
}
