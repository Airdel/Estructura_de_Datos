package clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Airdel
 */
public class Raqueta {
    private int x, y;
    static final int WIDTH = 10 , HEIGHT= 75;
    
    public Raqueta(int x,int y){
        this.x=x;
        this.y=y;
    }
    
        public Rectangle2D getRaqueta(){
        return new Rectangle2D.Double(x, y, WIDTH, HEIGHT);
        }
        
        public void moverR1(Rectangle limites){
            if(EventoTeclado.w      &&    y>limites.getMinY()){
                y-=2;
            }
            if(wEventoTeclado.s && y<limites.getMaxY()-HEIGHT){
                y+=2;
            }
            
        }
        public void moverR2(Rectangle limites){
               if(EventoTeclado.up&& y>limites.getMinY()){
                y-=2;
            }
            if(EventoTeclado.down && y<limites.getMaxY()-HEIGHT){
                y+=2;
            }
            
        }
}
