package com.joe.qiao.da.db;

import com.joe.qiao.model.EntityObject;

/**
 * @author Joe Qiao
 * @Date 19/04/2018.
 */
public interface SecureQueryExecutor {
    <T extends EntityObject> T saveOrUpdate(T obj);

    <T extends EntityObject> void saveNew(T obj);

    <T extends EntityObject> T remove(Class<T> clazz, long id);

    <T extends EntityObject> void remove(T eo);
}
