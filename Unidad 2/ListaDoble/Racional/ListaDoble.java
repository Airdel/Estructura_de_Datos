import static javax.swing.JOptionPane.*;
class ListaDoble{   //Inicio de la clase
   private NodoD inicio, fin;

   public ListaDoble(){inicio=null;fin=null;}

   public void agregar(Racional d){
      if(inicio==null)
         fin=inicio=new NodoD(d);
      else{
         NodoD temp=new NodoD(d);
         fin.setSig(temp);
         temp.setAnt(fin);
         fin=fin.getSig();
      }//else
   }//Agregar  
   
   public NodoD buscar(Racional d){
      for(NodoD i=inicio; i!=null; i=i.getSig())
         if(i.getDato().igualigual(d))
            return i;
      return null;
   }//buscar
   
   
   public void eliminar(Racional d){
      if(inicio.getDato().igualigual(d)){inicio=inicio.getSig(); 
         inicio.setAnt(null);
         return;}
         
      if(fin.getDato().igualigual(d)){
         fin=fin.getAnt();
         fin.setSig(null);
         return;
      }
      
      NodoD temp=buscar(d);
      if(temp!=null){
         temp.getAnt().setSig(temp.getSig());
         temp.getSig().setAnt(temp.getAnt());
      }
      else showMessageDialog(null,"El dato que quiere eliminar no existe");
   }//eliminar
    
   public Racional Suma(){
      NodoD R=inicio;
      Racional aux=new Racional();
      while(R!=null){
         aux=aux.mas(R.getDato());
         R=R.getSig();
      }
   
      return aux;
   }//sumar
  
   public Racional mayor(){
      Racional aux=new Racional();
      for(NodoD i=inicio; i!=null; i=i.getSig())
         if(i.getDato().mayor(aux))aux=i.getDato();
      return aux;
   }//mayor
    
   
   public Racional menor(){
      Racional aux=mayor();
      for(NodoD i=inicio; i!=null; i=i.getSig())
         if(i.getDato().menor(aux))aux=i.getDato();
      return aux;
   }//menor
   
   public String pares(){
      String aux="";
      for(NodoD i=inicio; i!=null; i=i.getSig())
         if(i.getDato().div(2).igualigual(0)){aux=aux+i.getDato()+" , ";}
      return aux;
   }//pares
   
   public String inpares(){
      String aux="";
      for(NodoD i=inicio; i!=null; i=i.getSig())
         if(i.getDato().div(2).diferente(0)){aux=aux+i.getDato()+" , ";}
      return aux;
   }//inpares
   

   public void verLista(){
      String cad="";
      for(NodoD i=inicio; i!=null; i=i.getSig())
         cad=" "+cad+"[ "+i+" ]";
      showMessageDialog(null,cad+"\n Suma: "+Suma()+"\n Menor: "+menor()+"\n Mayor: "+mayor()+
         "\n Pares: "+pares()+"\n inPares: "+inpares());//*/
      //showMessageDialog(null, cad);
   }//ver lista




   public static void main(String trs[]){
      ListaDoble list=new ListaDoble();
      list.agregar(new Racional(2,4)); list.agregar(new Racional(3,4)); list.agregar(new Racional(1,2));
      list.verLista();
      list.eliminar(new Racional(1,2));
      list.verLista();
   }//main
}//Class