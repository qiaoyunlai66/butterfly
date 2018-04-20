package com.joe.qiao.da.db;

import com.joe.qiao.model.entity.Butterfly;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Joe Qiao
 * @Date 20/04/2018.
 */
public class HibernateTest {
    public static void main(String[] args) {
        HibernateTest hibernateTest = new HibernateTest();
        hibernateTest.test();
    }
    private void test(){
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Butterfly butterfly = new Butterfly();
        butterfly.setName("newButterfly3");
        session.persist(butterfly);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
