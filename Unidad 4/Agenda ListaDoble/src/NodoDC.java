
class NodoDC{   //Inicio de la clase
   private Alumnos dato;
   private NodoDC sig,ant;
   
   public NodoDC(){dato=new Alumnos(); sig=ant=null;}//Constructor
   
   public NodoDC(Alumnos d){dato=new Alumnos();dato=d;sig=ant=null;}//Contructor
   
   public NodoDC(String d){
   
   dato=new Alumnos(d);
   
   sig=ant=null;}//Contructor

   
   public Alumnos getDato(){
      return dato;}//Get Dato
   
   public void setDato(Alumnos d){dato=d;}//get dato
   
   public NodoDC getSig(){
      return sig;}//Get Siguiente
   
   public void setSig(NodoDC s){sig=s;}//Get Siguiente
   
   public String toString(){
      return dato+"";}//Metodo toString 

   public NodoDC getAnt(){
      return ant;
   }//get anterior
  
   public void setAnt(NodoDC a){
      ant=a;
   }//


}//Class