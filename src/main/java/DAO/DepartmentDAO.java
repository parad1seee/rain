package DAO;

import Model.Department;
import Util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class DepartmentDAO {

    public void create(Department department)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(department);
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

    public void update(Department department)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(department);
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

    public void delete(Department department)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(department);
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

    public Department read (int id)
    {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            final Department result = session.get(Department.class,id);
            if(result != null)
                return result;
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
