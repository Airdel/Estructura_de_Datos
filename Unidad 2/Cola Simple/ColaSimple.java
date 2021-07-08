import static javax.swing.JOptionPane.*;
public class ColaSimple{   //Inicio de la clase 
   private int tam,A[],tope;
   
   public ColaSimple(){tam=0;tope=-1;}//Contrusctor
   
   public ColaSimple(int t){
      tam=t; tope=-1; A=new int[tam];
   }//Constructor
   
   
   public boolean llena(){
      return tope==tam-1;
   }//la cola esta llena?
   
   public boolean vacia(){
      return tope==-1;
   }//la cola  esta vacia
   
   public void entrada(int d){
      if(!llena()) A[++tope]=d; 
      else showMessageDialog(null,"la pila esta llena");
   }//entrada
   
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
   
   
   public void ver(){
      String cad="";
      for(int i=tope;i>=0; i--)
         cad=cad+"A["+i+"]="+A[i]+"\n";    
      showMessageDialog(null,cad);
   }//mostrar
  
   
   
   
   
   public static void main(String trs[]){
      ColaSimple p=new ColaSimple(5);
      
   }//llave del main------------------------------
}//fin de la clase-----------------------------