package Unidad;


class NodoU{   //Inicio de la clase
   private Unidad dato;
   private NodoU sig;
   
   public NodoU(){dato=new Unidad(); sig=null;}//Constructor
   
   public NodoU(Unidad d){dato=new Unidad(); dato=d;sig=null;}//Contructor
   
   public Unidad getDato(){
      return dato;}//Get Dato
   
   public void setDato(Unidad d){dato=d;}//get dato
   
   public NodoU getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(NodoU s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

}//Class