import static javax.swing.JOptionPane.*;
public class ColaSimple{   //Inicio de la clase 

   private int tam,A[],tope,frente;
   
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
  
   public int getTam() {
      return tam;
   }//getTam
    
   public void setTam(int tam) {
      this.tam = tam;
   }//setTam
    
   public int getTope() {
      return tope;
   }//getTope
    
   public void setTope(int tope) {
      this.tope = tope;
   }//setTope
    
   public int getFrente() {
      return frente;
   }//getFrente
    
   public void setFrente(int frente) {
      this.frente = frente;
   }//setFrente
    
   public int[] getA() {
      return A;
   }//getA
    
   public void setA(int[] A) {
      this.A = A;
   }//setA

   public int getDato(int a){
      return A[a];
      }//getDato
   
   
   
   
   public static void main(String trs[]){
      ColaSimple p=new ColaSimple(5);
      
   }//llave del main------------------------------
}//fin de la clase-----------------------------