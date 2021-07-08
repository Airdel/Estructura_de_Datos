import static javax.swing.JOptionPane.*;
class ListaSimpleHora{   //Inicio de la clase
   private NodoH inicio, fin;

   public ListaSimpleHora(){inicio=null;fin=null;}

   public void agregar(Hora d){
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