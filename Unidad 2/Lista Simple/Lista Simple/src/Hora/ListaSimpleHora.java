package Hora;

import static javax.swing.JOptionPane.*;
class ListaSimpleHora{   //Inicio de la clase
   private NodoH inicio, fin;

   public ListaSimpleHora(){inicio=null;fin=null;}

    public int lengthList(){
   int c=0;
       if(fin==null){return -1;}    
   for(NodoH i=inicio; i!=null; i=i.getSig())c++;
   return c;
   }

     public Hora getPos(int posicion) throws Exception{
    // Verifica si la posiciÃ³n ingresada se encuentre en el rango
    // >= 0 y < que el numero de elementos del la lista.
     if(posicion>=0 && posicion<lengthList()){
          // Consulta si la posicion es el inicio de la lista.
        if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
            return inicio.getDato();
        }else{
                // Crea una copia de la lista.
            NodoH aux = inicio;
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
   
   
   
   
   
   public void agregar(Hora d){
      if(inicio==null)
         fin=inicio=new NodoH(d);
      else{
         fin.setSig(new NodoH(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
    public void agregar(String h){
        Hora d=new Hora(h);
      if(inicio==null)
         fin=inicio=new NodoH(d);
      else{
         fin.setSig(new NodoH(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
   
   
   
   public NodoH buscar(Hora d){
      for(NodoH i=inicio; i!=null; i=i.getSig())
         if(i.getDato().igual(d))
            return i;
      return null;
   }//buscar
   
   public NodoH anterior(Hora d){
      for(NodoH i=inicio; i!=null; i=i.getSig())
         if(i.getSig().getDato().igual(d))
            return i;
      return null;
   }//buscar
   
   public void eliminar(Hora d){
      if(inicio.getDato().igual(d)){inicio=inicio.getSig(); 
         return;}
      NodoH temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
   
      public void eliminar(String h){
          Hora d =new Hora(h);
      if(inicio.getDato().igual(d)){inicio=inicio.getSig(); 
         return;}
      NodoH temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
   
   
  
   public Hora Suma(){
      NodoH R=inicio;
      Hora r=new Hora();
      while(R!=null){
         r=r.mas(R.getDato());
         R=R.getSig();
      }
      return r;
   }//sumar
  
   public Hora mayor(){
      Hora aux=new Hora();
      for(NodoH i=inicio; i!=null; i=i.getSig())
         if(i.getDato().mayor(aux))aux=i.getDato();
      return aux;
   }//mayor
    
   
   public Hora menor(){
      Hora aux=mayor();
      for(NodoH i=inicio; i!=null; i=i.getSig())
         if(i.getDato().menor(aux))aux=i.getDato();
      return aux;
   }//menor
   
     
   public void verLista(){
      String cad="";
      for(NodoH i=inicio; i!=null; i=i.getSig())
         cad=" "+cad+"[ "+i+" ]";
      showMessageDialog(null,cad+"\n Suma: "+Suma()+"\n Menor: "+menor()+"\n Mayor: "+mayor());
   }//ver lista


   public static void main(String trs[]){
      ListaSimpleHora list=new ListaSimpleHora();
      list.agregar(new Hora(10,4,42)); list.agregar(new Hora(1,42,22)); 
      list.agregar(new Hora(0,0,12)); list.agregar(new Hora(12,32,44));
      list.verLista();
   }//main
}//Class