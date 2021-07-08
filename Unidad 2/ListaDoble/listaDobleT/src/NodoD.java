
class NodoD{   //Inicio de la clase
   private Racional dato;
   private NodoD sig,ant;
   
   public NodoD(){dato=new Racional(); sig=ant=null;}//Constructor
   
   public NodoD(Racional d){dato=new Racional();dato=d;sig=ant=null;}//Contructor
   
   public Racional getDato(){
      return dato;}//Get Dato
   
   public void setDato(Racional d){dato=d;}//get dato
   
   public NodoD getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(NodoD s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

   public NodoD getAnt(){
      return ant;
   }//get anterior
  
   public void setAnt(NodoD a){
      ant=a;
   }//


}//Class