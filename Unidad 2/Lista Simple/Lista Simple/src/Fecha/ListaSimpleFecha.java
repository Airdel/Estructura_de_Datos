package Fecha;

import static javax.swing.JOptionPane.*;
class ListaSimpleFecha{   //Inicio de la clase
   private NodoF inicio, fin;

   public ListaSimpleFecha(){inicio=null;fin=null;}

   public void agregar(Fecha d){
      if(inicio==null)
         fin=inicio=new NodoF(d);
      else{
         fin.setSig(new NodoF(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
   public void agregar(String f){
      Fecha d=new Fecha(f);
      if(inicio==null)
         fin=inicio=new NodoF(d);
      else{
         fin.setSig(new NodoF(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
   
   
   
   
   public NodoF buscar(Fecha d){
      for(NodoF i=inicio; i!=null; i=i.getSig())
         if(i.getDato()==d)
            return i;
      return null;
   }//buscar
   
   public NodoF anterior(Fecha d){
      for(NodoF i=inicio; i!=null; i=i.getSig())
         if(i.getSig().getDato().igual(d))
            return i;
      return null;
   }//buscar
   
   public void eliminar(Fecha d){
      if(inicio.getDato().igual(d)){inicio=inicio.getSig(); 
         return;}
      NodoF temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
   
      public void eliminar(String f){
          Fecha d=new Fecha(f);
      if(inicio.getDato().igual(d)){inicio=inicio.getSig(); 
         return;}
      NodoF temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
   
   
  
   public Fecha mayor(){
      Fecha aux=new Fecha();
      for(NodoF i=inicio; i!=null; i=i.getSig())
         if(i.getDato().mayor(aux))aux=i.getDato();
      return aux;
   }//mayor
    
   
   public Fecha menor(){
      Fecha aux=mayor();
      for(NodoF i=inicio; i!=null; i=i.getSig())
         if(i.getDato().menor(aux))aux=i.getDato();
      return aux;
   }//menor
   
    
   public void verLista(){
      String cad="";
      for(NodoF i=inicio; i!=null; i=i.getSig())
         cad=" "+cad+"[ "+i+" ]";
      showMessageDialog(null,cad+"\n Menor: "+menor()+"\n Mayor: "+mayor());
   }//ver lista

 public int lengthList(){
   int c=0;
       if(fin==null){return -1;}    
   for(NodoF i=inicio; i!=null; i=i.getSig())c++;
   return c;
   }

     public Fecha getPos(int posicion) throws Exception{
    // Verifica si la posiciÃ³n ingresada se encuentre en el rango
    // >= 0 y < que el numero de elementos del la lista.
     if(posicion>=0 && posicion<lengthList()){
          // Consulta si la posicion es el inicio de la lista.
        if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
            return inicio.getDato();
        }else{
                // Crea una copia de la lista.
            NodoF aux = inicio;
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
      ListaSimpleFecha list=new ListaSimpleFecha();
      list.agregar(new Fecha(16,8,1998)); list.agregar(new Fecha(20,8,1998)); 
      list.agregar(new Fecha(21,10,2000)); list.agregar(new Fecha(12,12,2012));
      list.verLista();
   }//main
}//Class