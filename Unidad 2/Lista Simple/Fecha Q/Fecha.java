import static javax.swing.JOptionPane.*;
import java.util.*;
public class Fecha{

   private int d, m, a,D[ ]={0,31,28,31,30,31,30,31,31,30,31,30,31};
   private String M[]={"SELECCIONA MES","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
                    "Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
                    
   public void leer(){
      do {
         a=Integer.parseInt(showInputDialog("Year 1900-2099"));
      }while(a<1900 || a>2099);//AÑO
   
      String mes;
      do{
         mes=showInputDialog(null,"mes","Elije un mes",
            QUESTION_MESSAGE,null,M,"").toString();
      }while(mes.equals("")); //MES 
      m=posMes(mes);
      do {
         d=Integer.parseInt(showInputDialog("Dia  1-"+(D[m]+bis())));
      }while(d<1 || d>(D[m]+bis()));//DIA
   }//leer 

   public int posMes(String mes){
      for(int i=1; i<=12; i++)
         if(M[i].equals(mes))
            return i;
      return 0;
   }//Posicion del mes

   public int bis(){
      return (a%4==0 && m==2)?1:0;
   }//suma del dia del año biciesto

   public String toString(){
      return d+"/"+M[m]+"/"+a;
   }//toString

   public boolean mayor(Fecha f){
      if(a>f.a)
         return true;       //comparacion del AÑO
      else if (a<f.a)
         return false;//
   
      if(m>f.m)
         return true;       //comparacion del MES
      else if (m<f.m)
         return false;//
   
      if(d>f.d)
         return true;       //comparacion del DIA
      else 
         return false;          //
   }//Fecha mayor 
   
   public boolean menor(Fecha f){
      if(a<f.a)
         return true;       //comparacion del AÑO
      else if (a>f.a)
         return false;//
   
      if(m<f.m)
         return true;       //comparacion del MES
      else if (m>f.m)
         return false;//
   
      if(d<f.d)
         return true;       //comparacion del DIA
      else 
         return false;          //
   }//Fecha memor
   
   public boolean igual(Fecha f){
         return a==f.a&&m==f.m&&d==f.d;
   }//Fecha igual a fecha
   
   
   public Fecha(){ 
      Calendar c=new GregorianCalendar();
      d=c.get(Calendar.DATE);
      m=c.get(Calendar.MONTH)+1;
      a=c.get(Calendar.YEAR);
   }//Constructor con la del sistema
   
   public void mostrar(){
      showMessageDialog(null,d+"/"+M[m]+"/"+a);
   }//mostrar

   public Fecha(int dia, int mes, int year){
      a=Math.abs(year); // poner positivos los años
      m=Math.abs(mes);  // poner positivos los meses
      if(m>12){ a=a+m/12; m=m%12; } 
      d=dia;
      while(d>D[m]){d=d-D[m]; m++; 
         if(m>12){m=1; a++;}}
      if(m>12){ a=a+m%12; m=m%12; }
   }//fechaContructor
   
   public Fecha(String f){
      String A[]=f.split("/");
   
      int d=Integer.parseInt(A[0]);
      int m=Integer.parseInt(A[1]);
      int a=Integer.parseInt(A[2]);
   
      showMessageDialog(null,"el dia es: "+d+"\n"+"el mes es: "+m+"\n"+"el año es: "+a);
   }//Constructor en string 
   
   public int menos(Fecha f){
      int dias=0;
      int di=f.d, df=d;
      for(int i=1; i<f.m; i++)di=di+D[i];/* que an pasado desde el 01/01/2017 a la fecha */
      int i=1;
      while(i<m){df=df+D[i]; i++;}//dias de la fecha
      dias=Math.abs(df-di); 
      dias=Math.abs(a-f.a)*365-dias;//años 
      return dias;
   }//menos 
   
    public int mas(Fecha f){
      int dias=0;
      int di=f.d, df=d;
      for(int i=1; i<f.m; i++)di=di+D[i];/* que an pasado desde el 01/01/2017 a la fecha */
      int i=1;
      while(i<m){df=df+D[i]; i++;}//dias de la fecha
      dias=Math.abs(df+di); 
      dias=Math.abs(a+f.a)*365-dias;//años 
      return dias;
   }//mas
   
   
   
   public static void main(String trs[]){
      Fecha hoy=new Fecha("12/12/1222");
      //Fecha fin=new Fecha(21,02,2019); fin.mostrar();
      //int dias=fin.menos(hoy);
      //showMessageDialog(null,"hoy es: "+hoy.toString()+
      //   " y la ultima clase es: "+fin.toString()+
      //   "\n\n y para ello faltan: "+dias+" dias");
   }//main 
}//class