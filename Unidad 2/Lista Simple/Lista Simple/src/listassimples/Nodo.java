package listassimples;


class Nodo{   //Inicio de la clase
   private int dato;
   private Nodo sig;
   
   public Nodo(){dato=0; sig=null;}//Constructor
   
   public Nodo(int d){dato=d;sig=null;}//Contructor
   
   public int getDato(){
      return dato;}//Get Dato
   
   public void setDato(int d){dato=d;}//get dato
   
   public Nodo getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(Nodo s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

}//Class