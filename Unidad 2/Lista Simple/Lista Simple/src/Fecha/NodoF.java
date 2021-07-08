package Fecha;


class NodoF{   //Inicio de la clase
   private Fecha dato;
   private NodoF sig;
   
   public NodoF(){dato=new Fecha(); sig=null;}//Constructor
   
   public NodoF(Fecha d){dato=new Fecha(); dato=d;sig=null;}//Contructor
   
   public Fecha getDato(){
      return dato;}//Get Dato
   
   public void setDato(Fecha d){dato=d;}//get dato
   
   public NodoF getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(NodoF s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

}//Class