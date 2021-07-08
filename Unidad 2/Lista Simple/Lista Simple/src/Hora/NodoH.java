package Hora;


class NodoH{   //Inicio de la clase
   private Hora dato;
   private NodoH sig;
   
   public NodoH(){dato=new Hora(); sig=null;}//Constructor
   
   public NodoH(Hora d){dato=new Hora(); dato=d;sig=null;}//Contructor
   
   public Hora getDato(){
      return dato;}//Get Dato
   
   public void setDato(Hora d){dato=d;}//get dato
   
   public NodoH getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(NodoH s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

}//Class