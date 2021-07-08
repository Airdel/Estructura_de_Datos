package Racional;


class NodoR{   //Inicio de la clase
   private Racional dato;
   private NodoR sig;
   
   public NodoR(){dato=new Racional(); sig=null;}//Constructor
   
   public NodoR(Racional d){dato=new Racional(); dato=d;sig=null;}//Contructor
   
   public Racional getDato(){
      return dato;}//Get Dato
   
   public void setDato(Racional d){dato=d;}//get dato
   
   public NodoR getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(NodoR s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

}//Class