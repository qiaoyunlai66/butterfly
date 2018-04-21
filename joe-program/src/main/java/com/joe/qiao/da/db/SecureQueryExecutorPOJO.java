package com.joe.qiao.da.db;

import com.joe.qiao.model.EntityObject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityNotFoundException;
import java.io.Serializable;
import java.util.List;

/**
 * @author Joe Qiao
 * @Date 19/04/2018.
 */
public class SecureQueryExecutorPOJO implements SecureQueryExecutor,Serializable{
    
    private Session session;
    
    public SecureQueryExecutorPOJO(){
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
    }
    
    @Override
    public <T extends EntityObject> T saveOrUpdate(T obj) {
        if(obj.getId()<=0){
            saveNew(obj);
        } else {
            obj = (T) getSession().merge(obj);
        }
        return obj;
    }
    @Override
    public <T extends EntityObject> void saveNew(T obj) {
        if (obj.getId() < 0) {
            obj.setId(0);
        }
        getSession().persist(obj);
    }

    @Override
    public <T extends EntityObject> T remove(Class<T> clazz, long id) {
        try {
            T eo = getSession().get(clazz, id);
            remove(eo);
            return eo;
        } catch (EntityNotFoundException ex) {
            return null;
        }
    }

//    @Override
//    public <T extends EntityObject> List<T> retrieveDataList(Class<T> primaryClass, QueryCriteria criteria) {
//        return retrieveDataList(primaryClass, criteria, false);
//    }

    @Override
    public <T extends EntityObject> void remove(T eo) {
        if (eo != null) {
            getSession().delete(eo);
        }
    }

    public Session getSession() {
        return session;
    }
}
