public class Alumnos {
   private String nom, direc, tel, numCon;
   private int edad;


 
   public Alumnos(String s){nom=s; direc="Av.De La Cultura"; tel="3111650874"; numCon=""; edad=20;}

   public Alumnos(String nombre, String direccion, String telefono, String numcontrol, int e){
      nom=nombre; direc=direccion; tel=telefono; numCon=numcontrol; edad=e;}

   public String toString(){
      return nom+"-"+direc+"-"+tel+"-"+numCon+"-"+edad;}

   public String getnom(){
      return nom;}

   public String getdirec(){
      return direc;}

   public String getTel(){
      return tel;}

   public String getnumCon(){
      return numCon;}

   public int getEdad(){
   return edad;}
   
   public void setEdad(int e){
   edad=e;
   }
   
   public boolean igualigual(String nc){
      if((numCon).equals(nc))return true;
      return false;
   }//el alumno es igual

  public boolean mismaEdad(int ed){
      if(ed==edad)return true;
      return false;
   }//el alumno es igual



   public static void main(String trs[]){
   }//main
}//class