package com.joe.qiao.domain.oozinoz.app.abstractFactory;

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

import javax.swing.JPanel;

import com.joe.qiao.domain.oozinoz.oozinoz.ui.UI;
import com.joe.qiao.domain.oozinoz.oozinoz.ui.SwingFacade;
import com.joe.qiao.domain.oozinoz.oozinoz.visualization.Visualization;

/** Show the use of an alternative GUI kit (an alternative
 *  abstract factory).
*/
public class ShowVisualization {
    public static void main(String[] args) {
        JPanel panel = new Visualization(UI.NORMAL);
        SwingFacade.launch(panel, "Operational Model");
    }
}