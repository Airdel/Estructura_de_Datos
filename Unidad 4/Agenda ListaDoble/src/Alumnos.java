public class Alumnos {
   private String titulo, datos;
 //  private int edad;

   

   public Alumnos(){titulo="nota 0";datos="null";}
   
   public Alumnos(String s){titulo=s; datos="";}

   public Alumnos(String tit, String dat){
      titulo=tit; datos=dat;}



   public String toString(){
      return titulo+"-"+datos;}

  
   
   public boolean igualigual(String tit){
      if((titulo).equals(tit))return true;
      return false;
   }//el alumno es igual


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }




   public static void main(String trs[]){
   }//main
}//class