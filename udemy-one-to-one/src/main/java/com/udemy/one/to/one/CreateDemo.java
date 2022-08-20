package com.udemy.one.to.one;

import com.udemy.one.to.one.entity.Instructor;
import com.udemy.one.to.one.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {

            //create the objects

//            Instructor instructor = new Instructor("Tipe","Monyemangene","monyemangene.2@gmail.com");
//            InstructorDetail instructorDetail = new InstructorDetail(
//                    "http://www.tipe123.com/youtube",
//                    "Love programming");


            Instructor instructor = new Instructor("Timothy","Ramaifo","tim2@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail(
                    "http://www.tim1233.com/youtube",
                    "Learning Spring Framework");
            //associate the objects

            instructor.setInstructorDetail(instructorDetail);

            //start transaction

            session.beginTransaction();

            //save the instructor

            System.out.println("Saving instructor :" + instructor +"\n");
            System.out.println("Saving instructorDetail :" + instructorDetail);
            session.save(instructor);

            //commit transaction

            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }

    }
}
