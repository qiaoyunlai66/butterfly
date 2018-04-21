package com.joe.qiao.da.query;

import com.joe.qiao.da.db.SecureQueryExecutor;
import com.joe.qiao.da.db.SecureQueryExecutorPOJO;
import com.joe.qiao.model.entity.Butterfly;

/**
 * @author Joe Qiao
 * @Date 20/04/2018.
 */
public class ButterflyManagerBean implements ButterflyManager{
    @Override
    public Butterfly saveOrUpdate(Butterfly butterfly) {
        return getQueryExecutor().saveOrUpdate(butterfly);
    }
    
    @Override
    public Butterfly remove(Long butterflyId) {
        return getQueryExecutor().remove(Butterfly.class,butterflyId);
    }

    protected SecureQueryExecutor getQueryExecutor() {
        return new SecureQueryExecutorPOJO();
    }
    
}
