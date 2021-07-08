import static javax.swing.JOptionPane.*;
public class Pila{   //Inicio de la clase 
   private int tam,A[],tope;
   
   public Pila(){tam=0;tope=-1;}//Contrusctor
   
   public Pila(int t){
   tam=t; tope=-1; A=new int[tam];
   }//Constructor
   
   
   public boolean llena(){
      return tope==tam-1;
   }//la pila esta llena?
   
   public boolean vacia(){
      return tope==-1;
   }//la piña mp esta llena?
   
   public void meter(int d){
      if(!llena()) A[++tope]=d; 
      else showMessageDialog(null,"la pila esta llena");
   }//meter
   
   public void ver(){
      String cad="";
      for(int i=tope;i>=0; i--)
         cad=cad+"A["+i+"]="+A[i]+"\n";    
      showMessageDialog(null,cad);
   }//mostrar
   
 
   

   
   
   
   public static void main(String trs[]){
      Pila p=new Pila(5);
      p.meter(15);
      p.meter(12);
      p.meter(6);
   
      p.ver();
   }//llave del main------------------------------
}//fin de la clase-----------------------------