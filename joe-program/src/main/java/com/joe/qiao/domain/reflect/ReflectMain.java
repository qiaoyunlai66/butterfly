package com.joe.qiao.domain.reflect;

import com.joe.qiao.domain.logging.ButterflyLogger;
import com.joe.qiao.domain.logging.LogMessage;
import com.joe.qiao.global.Butterfly;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Joe Qiao
 * @Date 02/02/2018.
 */
public class ReflectMain {
    
    private static final ButterflyLogger logger = ButterflyLogger.getLogger(ReflectMain.class);
    
    Butterfly butterfly;
    
    public ReflectMain(Butterfly butterfly){
        this.butterfly = butterfly;
    }
    
    public static void main(String[] args) {
        ReflectMain reflectMain = new ReflectMain(new Butterfly("yellowButterfly",null,null));
        //test PropertyUtils
        reflectMain.testPropertyUtils();
    }

    private void testPropertyUtils() {
        logger.info("--begin the test of property utils--");
        try {
            logger.info("get name from butterfly using PropertyUtils.getProperty");
            String name = (String) PropertyUtils.getProperty(butterfly, "name");
            logger.info("set color yellow to butterfly using PropertyUtils.setProperty");
            PropertyUtils.setProperty(butterfly,"color","yellow");
            logger.info("get color from butterfly using PropertyUtils.getProperty");
            String color = (String) PropertyUtils.getProperty(butterfly, "color");
//            logger.info("get fieldWithoutGetSet from butterfly using PropertyUtils.getProperty");
//            String fieldWithoutGetSet = (String) PropertyUtils.getProperty(butterfly, "fieldWithoutGetSet");
            logger.info("Butterfly Created. name = "+name+"; color = "+color +";fieldWithoutGetSet = ");
        } catch (Exception e) {
            logger.error(LogMessage.PH_APPSERVER_JOE_PROGRAM_NORMAL_ERROR,e);
        } 
    }
}
