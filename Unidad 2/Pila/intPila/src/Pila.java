import java.util.Arrays;
import static javax.swing.JOptionPane.*;
public class Pila{   //Inicio de la clase 
   private int tam,tope;
   private Libro P[];
   
   public Pila(){tam=0;tope=-1;}//Constructor
   
   public Pila(int t){
   tam=t; tope=-1; A=new int[tam];
   }//Constructor
   
   public int getTope(){
   return tope;
   }//getTope
   
   public boolean llena(){
      return tope==tam-1;
   }//la pila esta llena?
   
   public boolean vacia(){
      return tope==-1;
   }//la pi�a mp esta llena?
   
   public void meter(int d){
      if(!llena()) A[++tope]=d; 
      else showMessageDialog(null,"la pila esta llena");
   }//meter
   
   public void sacar(){
   if(!vacia()){A[tope]=0;tope--;}
   else showMessageDialog(null,"la pila esta vacia");
   }//sacar
   
   
   public void ver(){
      String cad="";
      for(int i=tope;i>=0; i--)
         cad=cad+"A["+i+"]="+A[i]+"\n";    
      showMessageDialog(null,cad);
   }//mostrar
   
 public int[] mostrar() {
 return A;
 }

 public boolean existe(int n){
     for(int i=0;i<=tope;i++)
        if(A[i]==n) return true;
        return false;
 }//buscar un elemento    
   
   
   public static void main(String trs[]){
      Pila p=new Pila(3);
            System.out.println(p.getTope());

      p.meter(15);
            System.out.println(p.getTope());

      p.meter(12);
            System.out.println(p.getTope());

      p.meter(6);
            System.out.println(p.getTope());

      p.meter(4);
            System.out.println(p.getTope());

      System.out.println(p.getTope());
      p.ver();
      p.sacar();
      p.ver();
            System.out.println(p.getTope());

       
       
   }//llave del main------------------------------
}//fin de la clase-----------------------------