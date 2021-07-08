import static javax.swing.JOptionPane.*;
import java.util.*;
public class ArrayNum{
   int A[],n;
   String cad="";
   public ArrayNum(int n){
      this.n=n;
      A=new int [n];
      for(int i=0;i<n;i++)
         A[i]=(int)(Math.random()*10);
   }//Constructor

   public void ordenar(){
      for(int p=1; p<A.length;p++)
         for(int i=0;i<A.length-p;i++)
            if(A[i]>A[i+1]){int t=A[i]; A[i]=A[i+1]; A[i+1]=t;}
   }//ordenar
 
   public void mostrar(){
      for(int i=0;i<A.length;i++)
         cad=cad+"A["+i+"]="+A[i]+"\n";
      showMessageDialog(null,cad+"La moda es: "+moda()+"\nEl Mayor es: "+mayor()
         +"\nEl Menos es: "+menor()+"\nLa Media es: "+media()+"\nLa mediana es: "+mediana());
   }//Mostrar

   public boolean hayNumRep(){
      for(int i=0; i<A.length; i++)
         for(int j=i+1;i<A.length;j++)
            if(A[i]==A[j])  
               return true;
      return false;
   }// hay un numero repetido?
 
 
   public int suma(){
      int m=A[0];
      for(int i=1; i<A.length; i++) 
         if(A[i]>m)m=A[i]+A[i+1];
      return m;
   }//suma
   
   
   public int esPrimo(){
      int p=0;
      for (int i=0; i<A.length; i++){
         int c=0;
         for(int d=2;d<=A[i]/2;d++)
            if(A[i]%d==0)c++;
         if(c==0)p++;
      }
      return p;
   }//es primo
   
   public int[] serFibonacci(){
      A[0]=0;
      A[1]=1;
      for(int i=2;i<A.length;i++){
         A[i]=A[i-1]+A[i-2];}
      return A;
   }//Serie de Fibonacci
   
   public int moda(){
      int pm=0;
      int moda=0;
      for(int i=0;i<A.length;i++){
         int c=0;
         for(int k=0;k<A.length;k++){
            if(A[i]==A[k]){
               c++;
            }
         }
         if(pm<c){
            pm=c;
            moda=A[i];
         }
      }
      return moda;
   }//Moda
   
   public int mayor(){
      int m=A[0];
      for(int i=1; i<A.length; i++) 
         if(A[i]>m)m=A[i];
      return m;
   }//mayor
   
   public int menor(){
      int m=A[0];
      for(int i=1; i<A.length; i++) 
         if(A[i]<m)m=A[i];
      return m;
   }//menor
   
   public float media(){
      int s=0;
      for(int i=0; i<A.length; i++)s=s+A[i];
      return (float)s/A.length;
   }//media
   
   public String mediana(){  
      String cad="";
      if(A.length%2!=0){
         cad=A[A.length/2]+"";
         return cad;
      }
      else{
         cad=A[A.length/2]+" y "+A[A.length/2-1];
         return cad;
      }
   }//mediana

   public int[] interter(ArrayNum b){
     int inter[];
     int c=0;
   String cad="";
      for(int i=0;i<n;i++){
         for(int k=0;k<b.n;k++){
            if(A[i]==b.A[k]) {
            c++;
            }
         }
      }//primer for
      
     inter=new int[c];
           for(int i=0;i<c;i++){
         for(int k=0;k<b.n;k++){
            if(A[i]==b.A[k]) {
               inter[i]=A[i];
                  }
            }
         }           
      return inter;
   }//
     
   public static void main (String trs[]){
   int interseccion[];
      ArrayNum a=new ArrayNum(5);
      ArrayNum b=new ArrayNum(4);
      a.mostrar();
      b.mostrar();
      interseccion=a.interter(b);
      for(int i=0; i<interseccion.length;i++){
      if(interseccion[i]!=0)
      System.out.println(interseccion[i]);
      }
   }//main
}//Class