package com.joe.qiao.domain.oozinoz.app.decorator.brightness;

/*
 * Copyright (c) 2001, 2005. Steven J. Metsker.
 * 
 * Steve Metsker makes no representations or warranties about
 * the fitness of this software for any particular purpose, 
 * including the implied warranty of merchantability.
 *
 * Please use this software as you wish with the sole
 * restriction that you may not claim that you wrote it.
 */

import com.joe.qiao.domain.oozinoz.oozinoz.function.Function;
import com.joe.qiao.domain.oozinoz.oozinoz.function.T;
import com.joe.qiao.domain.oozinoz.oozinoz.ui.SwingFacade;

/**
 * Show the brightness of a (fireworks) star.
 * 
 * @author Steven J. Metsker
 */
public class ShowBrightness2 {
    public static void main(String args[]) {
        FunPanel panel = new FunPanel();
        panel.setPreferredSize(new java.awt.Dimension(200, 200));
        
        Function brightness = new Brightness(new T());
      
        panel.setXY(new T(), brightness);
        
        SwingFacade.launch(panel, "Brightness");
    }
}