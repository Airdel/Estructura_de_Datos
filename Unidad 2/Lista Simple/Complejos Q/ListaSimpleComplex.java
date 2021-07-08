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
   
   public NodoC buscar(Complex d){
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




   public static void main(String trs[]){
      ListaSimpleComplex list=new ListaSimpleComplex();
      list.agregar(new Complex(1,3)); list.agregar(new Complex(2,4)); list.agregar(new Complex(3,3)); list.agregar(new Complex(3,6));
      list.verLista();
   }//main
}//Class