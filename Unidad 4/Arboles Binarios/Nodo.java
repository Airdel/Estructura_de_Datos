class Nodo{
   private ArbolBinario izq;
   private ArbolBinario der;
   private int dato;
 
   private void nodoArbol(){
      izq = null;
      der = null;
      dato = 0;
   }//Constructor
   
   public int getDato(){
      return dato;}//Get Dato
   
   public void setDato(int d){dato=d;}//get dato
   
   public ArbolBinario getDer(){
      return der;}//Get Deruiente
   
   public void setDer(ArbolBinario s){der=s;}//Get Deruiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

   public ArbolBinario getIzq(){
      return izq;
   }//get izqerior
  
   public void setIzq(ArbolBinario a){
      izq=a;
   }//set izqerior
}//class





