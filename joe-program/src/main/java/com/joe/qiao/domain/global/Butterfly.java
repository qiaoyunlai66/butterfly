package com.joe.qiao.domain.global;

import com.joe.qiao.domain.logging.ButterflyLogger;

/**
 * @author Joe Qiao
 * @Date 16/04/2018.
 */
public class Butterfly {
    private String name;
    private String color;
    private String fieldWithoutGetSet;
    
    private final static ButterflyLogger logger = ButterflyLogger.getLogger(Butterfly.class);

    public Butterfly() {
        butterflyCreated();
    }
    
    public Butterfly(String name,String color,String fieldWithoutGetSet){
        this.name = name;
        this.color = color;
        this.fieldWithoutGetSet =fieldWithoutGetSet;
        butterflyCreated();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    private void butterflyCreated(){
        logger.info("Butterfly Created. name = "+name+"; color = "+color +";fieldWithoutGetSet = "+fieldWithoutGetSet);
    }
}
