package DAO;

import Model.Student;
import Util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class StudentDAO {

    public void create(Student student)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();
        } catch (HibernateException e)
        {
            System.out.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public void update(Student student)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(student);
            session.getTransaction().commit();
        } catch (HibernateException e)
        {
            System.out.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public void delete(Student student)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(student);
            session.getTransaction().commit();
        } catch (HibernateException e)
        {
            System.out.println(e.getMessage());
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }

    public Student read (int id)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            final Student result = session.get(Student.class,id);
            if(result != null){
                Hibernate.initialize(result.getDepartment());
                return result;
            }
            else return  null;
        } catch (HibernateException e){
            System.out.println(e.getMessage());
        } finally {
            if(session != null && session.isOpen())
                session.close();
        }

        return null;
    }
}

