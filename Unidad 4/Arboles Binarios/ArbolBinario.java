import static javax.swing.JOptionPane.*;
class ArbolBinario{

   public Nodo raiz;
   
   public void ArbolBinario(){
      Nodo raiz = new Nodo();
   }//Constructor--------------------------------------------------------------

   public boolean esVacio(){
      return (raiz == null);
   }//esta vacia?--------------------------------------------------------------

   public void insertar(int a){
      if (esVacio()) {
         Nodo nuevo = new Nodo();
         nuevo.setDato(a);
         nuevo.setDer(new ArbolBinario());
         nuevo.setIzq(new ArbolBinario());
         raiz = nuevo;
      
      }//if
      else {
         if (a > raiz.getDato()){
            (raiz.getDer()).insertar(a);
         }
         if (a < raiz.getDato()){
            (raiz.getIzq()).insertar(a);
         }
      }//else
   }//Insertar en un arbol con recursividad--------------------------------------

   public void preOrder(){
      if (!esVacio()) {
         System.out.print(raiz.getDato()+"\n");
         raiz.getIzq().preOrder();
         raiz.getDer().preOrder();
      }//if
   }//PreOrder--------------------------------------------------------------------
 
   public void inOrder(){
      if (!esVacio()) {
         raiz.getIzq().inOrder();
         System.out.print(raiz.getDato()+"\n");
         raiz.getDer().inOrder();
      }//if
   }//inOrder----------------------------------------------------------------------
 
   public void posOrder(){
      if (!esVacio()) {
         raiz.getDer().posOrder();
         raiz.getIzq().posOrder();
         System.out.print(raiz.getDato()+"\n"); 
      }//if
   }//posOrder----------------------------------------------------------------------
   
   public ArbolBinario buscar(int a){
      ArbolBinario arbolito = null;
      if (!esVacio()) {
         if (a == raiz.getDato()) {
            return this;
         }//if
         else {
            if (a < raiz.getDato()) {
               arbolito = raiz.getIzq().buscar(a);
            }//if
            else {
               arbolito = raiz.getDer().buscar(a);
            }//else
         }//else
      }//if
      return arbolito;
   }//Buscar en un arbl--------------------------------------------------------------

   public boolean existe(int a){
      if (!esVacio()) {
         if (a == raiz.getDato()) {
            return true;
         }//if
         else {
            if (a < raiz.getDato()) {
               raiz.getIzq().existe(a);
            }//if
            else {
               raiz.getDer().existe(a);
            }//else
         }//else principal
      }//if principal
      return false;
   }//Existe en el arbol?-------------------------------------------------------------
   
   public int cantidad(){
      if (esVacio()) {
         return 0;
      }//if
      else {
         return (1 + raiz.getDer().cantidad() + raiz.getIzq().cantidad());
      }//Else
   }//numero de nodos en el arbol-----------------------------------------------------
    
   public int altura() {
      if (esVacio()) {
         return 0;
      }//if
      else {
         return (1 + Math.max(((raiz.getIzq()).altura()), ((raiz.getDer()).altura())));
      }//else
   }//altura del arbol----------------------------------------------------------------


   public int buscarMin() {
      ArbolBinario arbolActual = this;
      while(!arbolActual.raiz.getIzq().esVacio() ) {
         arbolActual = arbolActual.raiz.getIzq();
      }//While
      int devuelvo= arbolActual.raiz.getDato();
      arbolActual.raiz=null;
      return devuelvo;
   }//Buscar el valor minimodo--------------------------------------------------------

   public int buscarMax() {
      ArbolBinario arbolActual = this;
      while(!arbolActual.raiz.getDer().esVacio() ) {
         arbolActual = arbolActual.raiz.getDer();
      }//while
      int devuelvo= arbolActual.raiz.getDato();
      arbolActual.raiz=null;
      return devuelvo;
   }//Buscar el valor maximo----------------------------------------------------------

   public boolean esHoja() {
      boolean hoja = false;
      if( (raiz.getIzq()).esVacio() && (raiz.getDer()).esVacio() ) {
         hoja = true;
      }//if
      return hoja;
   }//es Hoja?------------------------------------------------------------------------

   public void eliminar(int a) {
      ArbolBinario paraEliminar = buscar(a);
      if (!paraEliminar.esVacio()) {
         if (paraEliminar.esHoja()) {
            paraEliminar.raiz = null;
         }//if
         else {
            if (!paraEliminar.raiz.getIzq().esVacio() && !paraEliminar.raiz.getDer().esVacio()) {
               paraEliminar.raiz.setDato(paraEliminar.raiz.getDer().buscarMin());
            }//if
            else {
               if (paraEliminar.raiz.getIzq().esVacio()) {
                  paraEliminar.raiz = paraEliminar.raiz.getDer().raiz;
               }else{
                  paraEliminar.raiz = paraEliminar.raiz.getIzq().raiz;
               }//else
            }//else
         }//ele
      }//if
   }//Eliminar--------------------------------------------------------------------------



   public static void main(String trs[]){
      ArbolBinario abb=new ArbolBinario();
      abb.insertar(3);
      abb.insertar(2);
      abb.insertar(1);
      abb.insertar(4);
      abb.insertar(5);
      abb.insertar(12);
      abb.insertar(11);
      abb.insertar(8);
      abb.insertar(10);
      abb.insertar(9);
      abb.insertar(7);
      abb.insertar(6);
      abb.insertar(13);
      
      abb.inOrder();
      
      abb.eliminar(4);
      
      abb.inOrder();
      
      abb.posOrder();
      
      abb.buscar(4);
      
   }//main
}//ArbolBinarioClass