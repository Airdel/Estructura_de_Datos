import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;


public class Funciones{//inicio de la clase
 
   public static int potencia(int x, int n){
      int p=1;
      for(int i=1; i<=n; i++)p=p*x;
      return p;
   }//Llave de la funcion de potencia------------------------------------------------------ 

   public static boolean esPerfecto(int n){
      int d=0;
      for (int i=1; i<=n/2; i++)
         if(n%i==0)d=d+i;
      if(d==n)
         return true; 
      else 
         return false; //esto es igual a; return d==n;
   }//Es perfecto----------------------------------------------------------------------------
  
   public static int fact(int n){
      int p=1;
      for(int i=1; i<=n; i++)p=p*i;
      return p;
   }//Llave de factorial---------------------------------------------------------------------
  
   public static double areaC(double r){
      return Math.PI*r*r;}
  //area del ciruclo-------------------------------------------------------------------------
   public static int mayor(int a, int b){
      return a>b?a:b;}
  //numero mayor-----------------------------------------------------------------------------
                                    //{if(a>b)return a; else return b;}
   public static boolean  esTriangulo(int a, int b, int c){
      if(a>=b&&a>=c&&a<(b+c))
         return true;
      if(b>=a&&b>=c&&b<(a+c))
         return true;
      if(c>=a&&c>=b&&c<(a+b))
         return true;
      return false;
   }//Funcion que retorna si es o no triangulo -------------------------------------------------
  
   public static int tipoTriangulo(int a, int b, int c){
      if(!esTriangulo(a,b,c))
         return 0;
      else if(a==b&&a==c)
         return 1;
      else if(a==b||a==c||b==c)
         return 2;
      return 3;
   }//Tipo de triangulo(0,1,2,3)----------------------------------------------------------------
 
   public static String tipoTriangulo2(int a, int b, int c){
      if (!esTriangulo(a,b,c))
         return "No es triangulo"; 
      else if(a==b&&a==c)
         return "Es un triangulo equilatero";
      else if(a==b||a==c||b==c)
         return "Es un triangulo isoceles";
      return "Es un triangulo escaleno";
   }//Tipo de triangulo 2------------------------------------------------------------------------
 //import static   
   public static void dia256(){
      int n=parseInt(showInputDialog("ingresa un numero para montar un triangulo"));
      String cad="";
      for(int r=1;r<=n;r++){
         for(int i=1;i<=r;i++)cad=cad+r;
         cad=cad+"\n";
      
      }//Llave del for de los renglones------------------------------------------------
      showMessageDialog(null,cad);
   }//triangulo de numeros "n"-------------------------------------------------------

   public static boolean esPrimo(int n){
      int d=0;
      for (int i=2; i<=n/2; i++)
         if(n%i==0)d++;
      return (d==0);
   }//es primo
   
   public static int esPrimo2(int n){
      int d=0;
      for (int i=2; i<=n/2; i++)
         if(n%i==0)d++;
      if(d==0)
         return 1;
      else 
         return 0;
   }//es primo

   public static void main(String ar[]){
      dia256();
      
   }//Llave del main
}//Llave de la clase