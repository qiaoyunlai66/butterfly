package com.joe.qiao.domain.inherit;

/**
 * @author Joe Qiao
 * @Date 19/04/2018.
 */
public class SubClass extends SuperClass{
    public String name;

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.testSub();
    }
    private void testSub(){
       name="name";
       test();
    }
    
}
