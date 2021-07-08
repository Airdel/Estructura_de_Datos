/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JFrame;
import control.EngineGraphics;
/**
 *
 * @author Marval
 */
public class ventana extends JFrame {
    Tablero canvas;
    private final int WIDTH = 900, HEIGHT = 600;
    private Tablero panel;
    private threads threads;
    public ventana(){
        setTitle("Titulo creativo para esto");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        canvas = new Tablero();
        
        add(canvas);
        addKeyListener(new EventoTeclado());
        new EngineGraphics(canvas).start();

 
        
    }

}
