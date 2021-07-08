
import javax.swing.JPanel;

class NodoDC{   //Inicio de la clase
   private Notas dato;
   private NodoDC sig,ant;
   
   public NodoDC(){dato=new Notas(); sig=ant=null;}//Constructor
   
   public NodoDC(Notas d){dato=new Notas(d.getTitulo());dato=d;sig=ant=null;}//Contructor
   
   public NodoDC(String d){
   
   dato=new Notas(d);
   
   sig=ant=null;}//Contructor

   
   public Notas getDato(){
      return dato;}//Get Dato
   
   public void setDato(Notas d){dato=d;}//get dato
   
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