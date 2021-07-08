import static javax.swing.JOptionPane.*;
public class Recursividad{

   public int factLineal(int n){
      int f=1;
      for(int i=1;i<=n;i++)f=f*i;
      return f;
   }//Factorial Lineal

   public int factRecur(int n){
      if(n==1)
         return 1;
      return n*factRecur(n-1);
   }//Factorial de manera recursiva

   public int FibonacciRecursivo(int n){
      if(n==1)
         return 0;
      if(n==2)
         return 1;
      return FibonacciRecursivo(n-1)+FibonacciRecursivo(n-2);
   }//Fibonacci con recursividad

   public void VerSerieFib(int n){
      String cad="";
      for(int i=1; i<=n;i++){
         cad=cad+FibonacciRecursivo(i)+"\n";
      }//for
      showMessageDialog(null,cad);
   }//Mostrar la serie fibonacci pero bien gacha :'v

   public boolean palindromo(String s){
      if(s.length()<=1){
         return true;}
      else{
         if(s.charAt(0)==s.charAt(s.length()-1)){
            return palindromo(s.substring(1,s.length()-1));}
         else 
            return false;
      }
   }//Palindromo con recursividad

   public int mult_rusa(int a, int b){
      if(a==1) 
         return b;
      if(a%2!=0)
         return (b+mult_rusa(a/2,b*2));
      else 
         return (mult_rusa(a/2,b*2));
   }//multiplicacion rusa 

   public String invertir(int n){
      if(n<10)
         return String.valueOf(n);
      else 
         return String.valueOf(n%10)+(invertir(n/10));
   }//Invertir un numero 

   public static void latino(int fila,int col,int cont,int orden,int mat[][]){
      if(fila==0&&col==0)mat[0][0]=1;
      else
         if(fila==col)latino(fila-1,orden-1,orden,orden,mat);
         else{
            mat[fila][col]=cont;
            latino(fila,col-1,orden+1,orden,mat);
         }
   }//Cuadro Latino------INVESTIGAR QUE ES UN CUADRO LATINO Y COMO SE LLENA
   
   public boolean par(int n){
      if(n==0)
         return true;
      else 
         return impar(n-1);
   }//Recursividad cruzada (Funcion 1)
   
   public boolean impar(int n){
      if(n==0)
         return false;
      else 
         return par(n-1);
   }//Recursivdad cruzada (Funcion 2) 
   
   public int mcdnormal(int a,int b){
      if(b==0)
         return a;
      else 
         return mcdnormal(b,a%b);
   }//Maximo comun divisor de manera normal


   public int mcdEuclides(int a, int b){
      int m=0;
      if(a==b)m=a;
      else if(a>b)m=mcdEuclides(a-b,b);
      else if(a<b)m=mcdEuclides(a,b-a);
      return m;
   }//Maximo comun divisor con el metodo de Euclides 

   public String Intercambio(int n){
      if(n<10){
         return String.valueOf(n);}
      else{
         return String.valueOf(n%10)+Intercambio(n/10);}
   }//Voltear el numero de atras para adelante
   
   public float potencia(int a,int b){
      if(b==0){
         return 1;}
      if(b<0){
         return 1/potencia(a,Math.abs(b));}
      return a*potencia(a,b-1);
   }//potencia
          
   public boolean positivo(int n){
      if(n>0)
         return true;
      else 
         return negativo(n);
   }//positivo recursividad cruzada
          
   public boolean negativo(int n){
      if(n<0)
         return false;
      else 
         return positivo(n);
   }//negativo recursividad cruzada       

   public boolean esPrimoRC(int n){
      if(n==1)
         return false;
      if(n==2)
         return true;
      if(n%2!=0)
         return true;
      else   
         return NoesPrimoRC2(n);
   }//es primo con recursividad cruzada

   public boolean NoesPrimoRC2(int n){
      if(n%n==0)
         return false;
      else 
         return esPrimoRC(n);
   }//no es primo con recursividad cruzada

   public int suma_dig(int n){
      if(n==0){
         return n;}
      else{
         return suma_dig(n/10)+(n%10);}
   }//suma de los digitos de una unidad
  
   public int divR(int a, int b){
      if(b>a)
         return 0;
      else 
         return divR(a-b,b)+1;
   }//division por resta
 
   public int divRResiduo(int a, int b){
      if(b>a)
         return 1;
      else 
         return divRResiduo(a-b,b);
   }//el residuo de la division por resta
 
 
   public int imparPosi(int n){
      if(n==1) 
         return 1;
      else 
         return imparPosi(n-1)+2;
   }//El numero impar de la posicion "n"
  
   public int sumaV(int V[],int n){
      if(n==0)
         return V[n];
      else 
         return sumaV(V,n-1)+V[n];
   }//suma de un arreglo

   public int menorArr (int x [], int n, int menor) {
      if (n == 0)
         if (menor > x [n]) 
            return x [0];
         else 
            return menor;
      else
         if (menor > x [n]) 
            return menorArr (x, n - 1, x [n]);
         else 
            return menorArr (x, n - 1, menor); 
   }//el numero menor de un arreglo
   
   
   
   

  /*¨ public  int mayorArr (int numeros [], int posicion) {
      int aux;
      if (posicion == 0) 
         return numeros [posicion];
      else {
         aux = mayorArr (numeros, posicion - 1);
         if (numeros [posicion] > aux) 
            return numeros [posicion];
         else 
            return mayorArr (numeros, posicion - 1);
      }     
   }//el numero mayor del arreglo*/

   
   public boolean ordenRecursivoX(int numeros[],int posicion){
      if(numeros[posicion]==posicion+1)
         return true;
      if(numeros [posicion]>=numeros[posicion+1]) 
         return false;
      else 
         return ordenRecursivo(numeros,posicion+1);
   }//el arreglo esta ordenado de manera recursiva

   public boolean ordenRecursivo(int numeros[], int posicion){
      if(posicion>=numeros.length){
         if(numeros[posicion-1]>numeros[posicion])
            return false;
      
         if(numeros[posicion]<=numeros[posicion+1]){
            posicion=posicion-1;
            return ordenRecursivo(numeros,posicion);
         }
      }
      return true;
   }//el arreglo esta ordenado Recursivo 

   public boolean ordenRecursivoE(int A[],int i){
      if(i==A.length-1)
         return true;
      if(A[i]>A[i+1])
         return false;
      else 
         return ordenRecursivoE(A,i+1);
   }//Examen resuelto

   public boolean ordenLineal(int n[]){
      for(int i=0;i<(n.length)-1;i++)
         if(n[i]>n[1+i])
            return false;
      return true;
   }//el arreglo esta ordenado de manera lineal

   public int sumaParArr(int A[], int posI){
      if(posI==A.length)
         return 0;
      if(A[posI]%2==0)
         return sumaParArr(A,posI+1)+A[posI];
      else 
         return sumaParArr(A,posI+1);
   }//suma de los numeros pares de un arreglo*/

   public double sumatoria(int i){
      if(i==0)
         return 0;
      return sumatoria(i-1)+(1.0/(i*i));
   }//suma de un arreglo

   public void mostrar(){
      int C[]=new int [5];
      C[0]=3;
      C[1]=2;
      C[2]=7;
      C[3]=4;
      C[4]=2;
     
      showMessageDialog(null, "sumatoria:  "+sumaParArr(C,0));
   }//Mostrar


   public static void main(String trs[]){
      Recursividad e=new Recursividad();
      e.mostrar();
   }//
}//Class