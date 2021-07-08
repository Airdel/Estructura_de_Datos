
class NodoC{   //Inicio de la clase
   private Complex dato;
   private NodoC sig;
   
   public NodoC(){dato=new Complex(); sig=null;}//Constructor
   
   public NodoC(Complex d){dato=new Complex(); dato=d; sig=null;}//Contructor
   
   public Complex getDato(){
      return dato;}//Get Dato
   
   public void setDato(Complex d){dato=d;}//get dato
   
   public NodoC getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(NodoC s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

}//Class