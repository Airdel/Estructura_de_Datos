/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Airdel
 */
public class threads extends Thread {
    Tablero panel;
    public threads(Tablero panel){
        this.panel=panel;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(6);
                panel.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(threads.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
