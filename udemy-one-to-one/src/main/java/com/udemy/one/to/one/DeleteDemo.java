package com.udemy.one.to.one;

import com.udemy.one.to.one.entity.Instructor;
import com.udemy.one.to.one.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {



            //start transaction

            session.beginTransaction();

            // get instructor by primary key / id
            int theId = 8;
            Instructor instructor = session.get(Instructor.class,theId);

            System.out.println("Found instructor: "+instructor);
            // delete the instructor
            if (instructor != null){
                System.out.println("Deleting :"+instructor);

                //Note: will also delete instructordetails
                session.delete(instructor);
            }

            // commit transaction
            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }

    }
}
