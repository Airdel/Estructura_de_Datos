package Complex;

import static javax.swing.JOptionPane.*;
class ListaSimpleComplex{   //Inicio de la clase
   private NodoC inicio, fin;

   public ListaSimpleComplex(){inicio=null;fin=null;}

   public void agregar(Complex d){
      if(inicio==null)
         fin=inicio=new NodoC(d);
      else{
         fin.setSig(new NodoC(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
    public void agregar(float real, float imaginario){
      Complex d=new Complex(real,imaginario);
        if(inicio==null)
         fin=inicio=new NodoC(d);
      else{
         fin.setSig(new NodoC(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
   
   public NodoC buscar(float real, float imaginario){
     Complex d=new Complex(real,imaginario);
       for(NodoC i=inicio; i!=null; i=i.getSig())
         if(i.getDato()==d)
            return i;
      return null;
   }//buscar
   
   public NodoC anterior(Complex d){
      for(NodoC i=inicio; i!=null; i=i.getSig())
         if(i.getSig().getDato().igual(d))
            return i;
      return null;
   }//buscar
   
   public void eliminar(Complex d){
      if(inicio.getDato().igual(d)){inicio=inicio.getSig(); 
         return;}
      NodoC temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar

      public void eliminar(float real, float imaginario){
          Complex d=new Complex(real,imaginario);
      if(inicio.getDato().igual(d)){inicio=inicio.getSig(); 
         return;}
      NodoC temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
   
   public Complex Suma(){
      NodoC R=inicio;
      Complex r=new Complex();
      while(R!=null){
         r=r.mas(R.getDato());
         R=R.getSig();
      }
      return r;
   }//sumar
  
   public Complex mayor(){
      Complex aux=new Complex();
      for(NodoC i=inicio; i!=null; i=i.getSig())
         if(i.getDato().mayor(aux))aux=i.getDato();
      return aux;
   }//mayor
    
   
   public Complex menor(){
      Complex aux=mayor();
      for(NodoC i=inicio; i!=null; i=i.getSig())
         if(i.getDato().menor(aux))aux=i.getDato();
      return aux;
   }//menor
   
   
 
   public void verLista(){
      String cad="";
      for(NodoC i=inicio; i!=null; i=i.getSig())
         cad=" "+cad+"[ "+i+" ]";
      showMessageDialog(null,cad+"\n Suma: "+Suma()+"\n Menor: "+menor()+"\n Mayor: "+mayor());
   }//ver lista

     public int lengthList(){
   int c=0;
       if(fin==null){return -1;}    
   for(NodoC i=inicio; i!=null; i=i.getSig())c++;
   return c;
   }

     public Complex getPos(int posicion) throws Exception{
    // Verifica si la posiciÃ³n ingresada se encuentre en el rango
    // >= 0 y < que el numero de elementos del la lista.
     if(posicion>=0 && posicion<lengthList()){
          // Consulta si la posicion es el inicio de la lista.
        if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
            return inicio.getDato();
        }else{
                // Crea una copia de la lista.
            NodoC aux = inicio;
                // Recorre la lista hasta la posiciÃ³n ingresada.
            for (int i = 0; i < posicion; i++) {
                   aux = aux.getSig();
             }
                // Retorna el valor del nodo.
            return aux.getDato();
            }
        // Crea una excepciÃ³n de Posicion inexistente en la lista.
    } else {
       throw new Exception("Posicion inexistente en la lista.");
        }
    }//Retorna la posicion del numero a buscar
     


   public static void main(String trs[]){
      ListaSimpleComplex list=new ListaSimpleComplex();
      list.agregar(new Complex(1,3)); list.agregar(new Complex(2,4)); list.agregar(new Complex(3,3)); list.agregar(new Complex(3,6));
      list.verLista();
   }//main
}//Class