package com.udemy.one.to.one;

import com.udemy.one.to.one.entity.Instructor;
import com.udemy.one.to.one.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructorDetailDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {



            //start transaction

            session.beginTransaction();

            // get instructor by primary key / id
            int theId = 7;
//            Instructor instructor = session.get(Instructor.class,theId);
            InstructorDetail instructorDetail = session.get(InstructorDetail.class,theId);
            System.out.println("Found instructor: "+instructorDetail);
            // delete the instructor
            if (instructorDetail != null){
                System.out.println("Deleting :"+instructorDetail);

                //remove the associated object reference
                // break bi-directional link

                instructorDetail.getInstructor().setInstructorDetail(null);

                //Note: will also delete instructordetails
                session.delete(instructorDetail);
            }

            // commit transaction
            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }

    }
}
