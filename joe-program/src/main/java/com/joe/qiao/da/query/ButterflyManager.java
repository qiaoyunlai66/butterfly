package com.joe.qiao.da.query;

import com.joe.qiao.model.entity.Butterfly;

/**
 * @author Joe Qiao
 * @Date 20/04/2018.
 */
public interface ButterflyManager {
    Butterfly saveOrUpdate(Butterfly butterfly);

    Butterfly remove(Long butterflyId);
}
