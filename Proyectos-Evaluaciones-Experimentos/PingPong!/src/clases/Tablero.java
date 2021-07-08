package clases;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Airdel
 */
public class Tablero extends JPanel {
   Pelota pelota = new Pelota(0,0);
   Raqueta r1 = new Raqueta(10,200);
   Raqueta r2 = new Raqueta( 894-10-Raqueta.WIDTH,200);

   public Tablero(){
      setBackground(Color.BLACK);
    
   }

   @Override
   public void paintComponent(Graphics g ){
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      g2.setColor(Color.green);
      dibujar(g2);
      dibujarPuntaje(g2);
      actualizar();
   }

   public void dibujar(Graphics2D g){
      Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());
      g.draw(linea);
      g.fill(pelota.getPelota());
      g.fill(r1.getRaqueta());
      g.fill(r2.getRaqueta()); 
   }

   public void actualizar(){
      pelota.mover(getBounds(),colision(r1.getRaqueta()),colision(r2.getRaqueta()));
      r1.moverR1(getBounds());
      r2.moverR2(getBounds());
   }

   private boolean colision(Rectangle2D r){
      return pelota.getPelota().intersects(r);
   }

   private void dibujarPuntaje(Graphics2D g) {
      Graphics2D g1 = g, g2 = g;
      Font score = new Font("Myriad Pro", Font.BOLD, 30);
      g.setFont(score);
   
      g1.drawString(Integer.toString(pelota.getScore1()), (float) getBounds().getCenterX() - 50, 30);
      g2.drawString(Integer.toString(pelota.getScore2()), (float) getBounds().getCenterX() + 25, 30);
      if (pelota.getScore1() == 5) {
         g.drawString("GANA El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
         Pelota.finJuego = true;
      }
      if (pelota.getScore2() == 5) {
         g.drawString("GANA EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
         Pelota.finJuego = true;
      }
   }

//public void iterarJuego(){
//    while(true){
//        try {
//            repaint();
//            Thread.sleep(6);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}

}