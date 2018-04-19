package com.joe.qiao.domain.inherit;


/**
 * @author Joe Qiao
 * @Date 19/04/2018.
 */
public abstract class SuperClass {
    public String name;
    
    public void test(){
        SubClass subClass =(SubClass)this;
        String n = subClass.name;
        System.out.println(n);
    }
    
}
