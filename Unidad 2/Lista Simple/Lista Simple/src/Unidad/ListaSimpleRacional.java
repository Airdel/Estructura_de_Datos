package Unidad;

import static javax.swing.JOptionPane.*;
class ListaSimpleUnidad{   //Inicio de la clase
   private NodoU inicio, fin;

   public ListaSimpleUnidad(){inicio=null;fin=null;}

   public void agregar(Unidad d){
      if(inicio==null)
         fin=inicio=new NodoU(d);
      else{
         fin.setSig(new NodoU(d));
         fin=fin.getSig();
      }//els
   }//Agregar  
   
   public void agregarInicio(Unidad d){
      if(inicio==null)
         fin=inicio=new NodoU(d);
      else{
          NodoU nuevo =new NodoU(d);
         nuevo.setSig(inicio);
            inicio = nuevo;
      }//else
   }//Agregar  
  
   public NodoU buscar(Unidad d){
      for(NodoU i=inicio; i!=null; i=i.getSig())
         if(i.getDato().igualigual(d))
            return i;
      return null;
   }//buscar
   
   public NodoU anterior(Unidad d){
      for(NodoU i=inicio; i!=null; i=i.getSig())
         if(i.getSig().getDato().igualigual(d))
            return i;
      return null;
   }//buscar
   
   public void eliminar(Unidad d){
      if(inicio.getDato().igualigual(d)){inicio=inicio.getSig(); 
         return;}
      NodoU temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
  
   public Unidad mayor(){
      Unidad aux=new Unidad();
      for(NodoU i=inicio; i!=null; i=i.getSig())
         if(i.getDato().mayor(aux))aux=i.getDato();
      return aux;
   }//mayor
   
   public Unidad menor(){
      Unidad aux=mayor();
      for(NodoU i=inicio; i!=null; i=i.getSig())
         if(i.getDato().menor(aux))aux=i.getDato();
      return aux;
   }//menor
   
   public void verLista(){
      String cad="";
      for(NodoU i=inicio; i!=null; i=i.getSig())
         cad=cad+"[ "+i+" ]"+"\n";
      showMessageDialog(null,cad);
   }//ver lista

   public static void main(String trs[]){
      ListaSimpleUnidad list=new ListaSimpleUnidad();
      list.agregar(new Unidad(1,100,"Unidad 1")); 
      list.agregar(new Unidad(3,100,"Unidad 3")); 
      list.agregar(new Unidad(3,80,"Unidad 3"));
      list.agregar(new Unidad(1,80,"Unidad 1"));
      list.verLista();
      list.agregarInicio(new Unidad(12,80,"Tony"));
      list.verLista();
   }//main
}//Class