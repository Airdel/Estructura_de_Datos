/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JFrame;

/**
 *
 * @author Airdel
 */
public class ventana extends JFrame {
    Tablero canvas;
    private final int WIDTH = 300, HEIGHT = 900;
    
    
    public ventana(){
        setTitle("Tetris!");
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        canvas = new Tablero();
         add(canvas);
         addKeyListener(new EventoTeclado());
         new EngineGraphics(canvas).start();
        
    }    
}
