import static javax.swing.JOptionPane.*;
import java.util.*;
public class ArrayNum{
   int n;
   int A[];
  
public ArrayNum(int tam){
 int r=tam; A=new int[r];
      for(int i=0;i<r;i++)
         A[i]=(int)(Math.random()*100);
}//Constructor  
  
  
 
   public void ordenar(){
      for(int p=1; p<n;p++)
         for(int i=0;i<n-p;i++)
            if(A[i]>A[i+1]){int t=A[i]; A[i]=A[i+1]; A[i+1]=t;}
   }//ordenar
 
   public boolean hayNumRep(){
      for(int i=0; i<A.length; i++)
         for(int j=i+1;i<A.length;j++)
            if(A[i]==A[j])  
               return true;
      return false;
   }// hay un numero repetido?
 
 
   public int suma(){
      int m=A[0];
      for(int i=1; i<n; i++) 
         if(A[i]>m)m=A[i]+A[i+1];
      return m;
   }//suma
   
   
   public int esPrimo(){
      int p=0;
      for (int i=0; i<n; i++){
        int c=0;
        for(int d=2;d<=A[i]/2;d++)
            if(A[i]%d==0)c++;
            if(c==0)p++;
      }
      return p;
   }//es primo
   
   public static void serFibonacci(int fib){
      int n=fib;
      int a=0, b=1, c;
      String f="0,1,";
      for(;a+b<n;){
         c=a+b;
         a=b; b=c;
         f=f+c+",";
      }//for
      showMessageDialog(null,f);
   }//Serie de Fibonacci----------------------


/*public int llenarPrimos(int lml){
   int p=0;
   int n=lml;
      for (int i=0; i<n; i++){
        int c=0;
        for(int d=2;d<=A[i]/2;d++)
            if(A[i]%d==0){p=p+A[i];}
           else A[i]=(int)(Math.random()*100);
                  }
               return p;
}//*/

  
  public static void  llenarPrimos(){
  int n, i, cnp = 0, res;
  String cad="";
        n = (int) (Math.random() * 100);
        int num[] = new int[n + 1];
        for (i = 0; i < n; i++) {
            num[i] = (int) (Math.random() * 100);
            res = 0;
            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    res++;
                   
                }
            }
            if (res == 2) {
                cnp++;
                 cad=cad+num[i]+"\n";
                showMessageDialog(null,cad);
            }
 
        }
        showMessageDialog(null,"La cantidad de numeros primos es :" + cnp);
    }
 
  
  
  
  
  
  
   public static void main (String trs[]){
      llenarPrimos();
   }//main
}//Class