import static javax.swing.JOptionPane.*;
import java.util.*;
public class Hora{
   private int h,m,s;

   public Hora(){
      Calendar c=new GregorianCalendar();
      h=c.get(Calendar.HOUR);
      m=c.get(Calendar.MINUTE);
      s=c.get(Calendar.SECOND);
   }//Hora
   
   public Hora(int a, int b, int c){h=a;m=b;s=c; validaHora();}//Constructor
  
   
   public void validaHora(){
      if(s>59){ m=m+s/60; s=s%60;}
      if(m>59){h=h+m/60; m=m%60;}
      if(h>23)h=h%24;
   }//validaHora
   
   public String toString(){
      String hr=h+"", mn=m+"", se=s+"";
      if(h<10)hr="0"+h;
      if(m<10)mn="0"+m;
      if(s<10)se="0"+s;
      return hr+":"+mn+":"+se;
   }//toString
   
   public void mostrar(){showMessageDialog(null,toString());}
        
   public Hora menos(Hora x){
      int si=h*3600+m*60+s;
      int sd=x.h*3600+x.m*60+x.s;
      int r=Math.abs(si-sd);
      return new Hora(0,0,r); 
   }//Hora menos Hora
         
     public Hora mas(Hora x){
      int si=h*3600+m*60+s;
      int sd=x.h*3600+x.m*60+x.s;
      int r=Math.abs(si+sd);
      return new Hora(0,0,r); 
   }//Hora menos Hora     
         
         
         
   public Hora mas(int x){
      return new Hora(0,0,h*3600+m*60+s+x);
   }//Hora mas Hora
   
   public boolean igual(Hora q){
   return h==q.h&&m==q.m&&s==q.s;
   }//hora igual a hora
   
   public boolean menor(Hora q){
   return h<q.h&&m<q.m&&s<q.s;
   }//Hora menor que hora
   
   public boolean mayor(Hora q){
   return h>q.h&&m>q.m&&s>q.s;
   }//Hora mayor que hora
   
   
   public Hora(String f){
      String A[]=f.split(":");
   
      int h=Integer.parseInt(A[0]);
      int m=Integer.parseInt(A[1]);
      int s=Integer.parseInt(A[2]);
   
      showMessageDialog(null,"las horas son: "
         +h+"\n"+"los minutos son: "+m+"\n"+"los segundos son: "+s);
   }//separar las Horas para mostrrar
         
   public static void main (String trs[]){
      //Hora inicio=new Hora(); inicio.mostrar();
      //Hora fin=new Hora(5,16,0); fin.mostrar();
      //Hora clase=new Hora(0,0,0);
      //clase=fin.menos(inicio);clase.mostrar();//fin inicio
      //fin=fin.mas(10000); fin.mostrar();
      Hora tarea=new Hora("10:10:10");tarea.mostrar();//<---tarea constructor que recibe la cadena y lo separe
   }//main
}//class