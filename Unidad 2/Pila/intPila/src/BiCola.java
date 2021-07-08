
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class BiCola {
    private int tam,A[],tope;
   
   public BiCola(){tam=0;tope=-1;}//Contrusctor
   
   public BiCola(int t){
      tam=t; tope=-1; A=new int[tam];
   }//Constructor
   
 
   public boolean llena(){
      return tope==tam-1;
   }//la cola esta llena?
   
   public boolean vacia(){
      return tope==-1;
   }//la cola  esta vacia
   
   public void entrada(int d,boolean op){
      if(!llena()) A[++tope]=d; 
      else{
          salida();
          entrada(d,op);
      }
   }//entrada
  public int getTope(){
      return tope;
  }
   public int salida(){
      int aux=0;
      if(!vacia()){
         aux=A[0];
         for(int i=0;i<tope;i++)
            A[i]=A[i+1]; 
         tope--;
      }
      return aux;
   }//salida
   public int[] mostrar(){
   return A;
   }
   
   public void ver(){
      String cad="";
      for(int i=tope;i>=0; i--)
         cad=cad+"A["+i+"]="+A[i]+"\n";    
      showMessageDialog(null,cad);
   }//mostrar
   public boolean existe(int n){
     for(int i=0;i<=tope;i++)
        if(A[i]==n) return true;
        return false;
   }  
    public static void main(String trs[]){
      ColaSimple p=new ColaSimple(3);
      p.entrada(1);
      p.entrada(2);
      p.entrada(3);
      p.ver();
      p.entrada(4);
      p.ver();
      
      
   }//llave del main------------------------------
    
}
