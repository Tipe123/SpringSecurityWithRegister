package com.udemy.one.to.one;

import com.udemy.one.to.one.entity.Instructor;
import com.udemy.one.to.one.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetInstructorDetailDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            //start transaction
            session.beginTransaction();

            //get the instructor detail object
            int theId = 288;
            InstructorDetail instructorDetail = session.get(InstructorDetail.class,theId);
            //print the instructor detail
            System.out.println("InstructorDetail : "+instructorDetail);
            //print the associated instructor
            System.out.println("Associated Instructor: " + instructorDetail.getInstructor());
            // commit transaction
            session.getTransaction().commit();

        }catch (Exception exc){
            exc.printStackTrace();
        }
        finally {
            session.close();
            sessionFactory.close();
        }

    }
}
