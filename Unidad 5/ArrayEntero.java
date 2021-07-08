import static javax.swing.JOptionPane.*;

public class ArrayEntero{   //Inicio de la clase 

   private int tam,A[];
   
   public ArrayEntero(int n){
      tam=n;
      A=new int[tam];
      for(int i=0;i<tam; i++)
         A[i]=(int)(Math.random()*100);
   }//Constructor 
   
   public ArrayEntero(){
      tam=10;
      A=new int[tam];
      A[0]=5;
      A[1]=1;
      A[2]=3;
      A[3]=0;
      A[4]=2;
      A[5]=4;
      A[6]=10;
      A[7]=1;
      A[8]=3;
      A[9]=0;
   
   }//Constructor 
   
   public void leer(){
      tam=Integer.parseInt(showInputDialog("Ingresa el tamaño del arreglo"));
      A=new int[tam];
      for(int i=0;i<tam; i++)
         A[i]=Integer.parseInt(showInputDialog("A["+i+"]"));
   }//leer
   
   public void mostrar(){
      String cad="";
      for(int i=0;i<tam; i++)
         cad=cad+"A["+i+"]="+A[i]+"\n ";    
      showMessageDialog(null,cad+"\nmayor = "+mayor()+"\nmenor = "+menor()+"\nmedia = "
         +media()+"\nmoda = "+moda()+"\nPrimo Menor = "+menorPrim());
   }//mostrar
   
   public int mayor(){
      int m=A[0];
      for(int i=1; i<tam; i++) 
         if(A[i]>m)m=A[i];
      return m;
   }//mayor
   
   public int menor(){
      int m=A[0];
      for(int i=1; i<tam; i++) 
         if(A[i]<m)m=A[i];
      return m;
   }//menor
   
   public float media(){
      int s=0;
      for(int i=0; i<tam; i++)s=s+A[i];
      return (float)s/tam;
   }//media
   
   public void ordenar(){
      for(int p=1; p<tam;p++)
         for(int i=0;i<tam-p;i++)
            if(A[i]>A[i+1]){int t=A[i]; A[i]=A[i+1]; A[i+1]=t;}
   }//ordenar
   
   /*public float mediana(){
      ordenar();
      if(tam%2!=0)//impar 
         return A[tam/2];
      else 
         return (float)(A[tam/2]+A[tam/2-1])/2;
   }//mediana*/
   
   
   public int moda(){
      int C[ ]=new int[tam];
      for(int k=0; k<tam;k++)
         for(int i=k+1;i<tam;i++)
            if(A[k]==A[i]){C[k]++;}
            
      int m=0;
      for(int i=1; i<tam; i++)
         if(C[i]>C[m])m=i;
      return A[m];
   }//moda 
   
   public int menorPrim(){
      int p=0;
      ordenar();
      for(int i=0;i<tam;i++){
         if(Funciones.esPrimo(A[i]))p=p+A[i]; }
      return p;
   }//primo menor 
   
   public void bubleSort(){
      for(int p=1; p<tam;p++)
         for(int i=0;i<tam-p;i++)
            if(A[i]>A[i+1]){int t=A[i]; A[i]=A[i+1]; A[i+1]=t;}
   }//ordenar  con el metodo de la burbuja
   
   public void quicksort(int A[], int izq, int der) {
   
      int pivote=A[izq]; // tomamos primer elemento como pivote
      int i=izq; // i realiza la búsqueda de izquierda a derecha
      int j=der; // j realiza la búsqueda de derecha a izquierda
      int aux;
        
      if(A.length==1);
      
      while(i<j){            // mientras no se crucen las búsquedas
         while(A[i]<=pivote && i<j) i++; // busca elemento mayor que pivote
         while(A[j]>pivote) j--;         // busca elemento menor que pivote
         if (i<j) {                      // si no se han cruzado                      
            aux= A[i];                  // los intercambia
            A[i]=A[j];
            A[j]=aux;
         }//if
      }//while
      
      A[izq]=A[j]; // se coloca el pivote en su lugar de forma que tendremos
      A[j]=pivote; // los menores a su izquierda y los mayores a su derecha
      if(izq<j-1)
         quicksort(A,izq,j-1); // ordenamos subarray izquierdo
      if(j+1 <der)
         quicksort(A,j+1,der); // ordenamos subarray derecho
   }//Ordenamiento de datos, quicksort   
   
   public void usaQS(){
      quicksort(A,0,A.length-1);
   }//usar quick sort
   
   public void Shellsort(int [] arreglo){
      int salto,i,j,k,aux;
      salto=arreglo.length/2;
      while(salto>0){
         for(i=salto;i<arreglo.length;i++){
            j=i-salto;
            while(j>=0){
               k=j+salto;
               if(arreglo[j]<=arreglo[k]){
                  j=-1;
               }//if
               else{
                  aux=arreglo[j];
                  arreglo[j]=arreglo[k];
                  arreglo[k]=aux;
                  j-=salto;
               }//else
            }//while
         }//for
         salto=salto/2;
      }//while
   }//ordenamiento de datos, shellsort
   
   public void usaShellsort(){
      Shellsort(A);
   }//usar shellsort
   
   public void shellSortARC(){
      int salto=tam/2;
      boolean cambios=false;
      
      while(salto>0 && !cambios){
         
         for(int i=0;i<tam-salto;i++)
           
            if(A[i]>A[i+salto]){
               int t=A[i]; A[i]=A[i+salto]; A[i+salto]=t; cambios=true;
            }
               
         salto=salto/2;
      }//while
   }//shellsort de el grupo del ingeniero Arcadia
   
   public int getMax(){
      int m = A[0];
      for(int i=1;i<tam;i++){
         if (A[i] > m){
            m = A[i];
         }//if
      }//for
      return m;
   }//obtener el maximo 
   
   
   public void radixSort(){
      ColaSimple[] C=new ColaSimple[10];
      int div=1,r=0,m=getMax(),num;
      String mayor=getMax()+"";
      do{
         for(int c=0; c<10;c++){
            C[c]=new ColaSimple(tam);
         }//Tamaño de cola
         for(int i=0;i<tam;i++){
            num=A[i]/div;
            num=num%10;
            C[num].entrada(A[i]);
         }//Los mete a la cola
         int a=0;
         while(a<tam){
            for(int c=0; c<10;c++){
               int i=0;
               while(i<=C[c].getTope()){
                  A[a++]=C[c].getDato(i++);
               }//while
            }//for
         }//whilePrincipal
         div=div*10;
         r++;
      }//do
      while(r<mayor.length());
   }//radix
   
   
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
   /////////////////////////////////////////////////METODOS DE BUSQUEDA///////////////////////////////////////////////////
   
   public int busquedaSec(int d){
      for (int i=0; i<tam; i++)
         if(d==A[i])
            return i;
      return -1;
   }//busqueda secuencial
   
   public int busquedaBi(int d){
      usaShellsort();
      return busquedaBina(d,0,tam-1);
   }//ordena los datos y usa recursividad cruzada para buscar
   
   public int busquedaBina(int d, int inicio, int fin){
      int centro=((inicio-fin)/2);
      if(A[centro]==d)
         return centro;
      if(inicio==fin&&A[centro]!=d)
         return -1;
      if(A[centro]>d)
         return busquedaBina(d,centro+1,fin);
      else 
         return busquedaBina(d,inicio,centro-1);
   }//recrusividad 
   
   
   
   public static void main(String trs[]){
   
      ArrayEntero a=new ArrayEntero(20);
       
      a.mostrar(); 
      
      showMessageDialog(null,a.busquedaBi(Integer.parseInt(showInputDialog("Ingresa un numero"))));
      
   }//llave del main------------------------------
}//fin de la clase------------------------