import static javax.swing.JOptionPane.*;
class ListaSimpleRacional{   //Inicio de la clase
   private NodoR inicio, fin;

   public ListaSimpleRacional(){inicio=null;fin=null;}

   public void agregar(Racional d){
      if(inicio==null)
         fin=inicio=new NodoR(d);
      else{
         fin.setSig(new NodoR(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
   public NodoR buscar(Racional d){
      for(NodoR i=inicio; i!=null; i=i.getSig())
         if(i.getDato().igualigual(d))
            return i;
      return null;
   }//buscar
   
   public NodoR anterior(Racional d){
      for(NodoR i=inicio; i!=null; i=i.getSig())
         if(i.getSig().getDato().igualigual(d))
            return i;
      return null;
   }//buscar
   
   public void eliminar(Racional d){
      if(inicio.getDato().igualigual(d)){inicio=inicio.getSig(); 
         return;}
      NodoR temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
  
   public Racional Suma(){
      NodoR R=inicio;
      Racional r=new Racional();
      while(R!=null){
         r=r.mas(R.getDato());
         R=R.getSig();
      }
      return r;
   }//sumar
  
   public Racional mayor(){
      Racional aux=new Racional();
      for(NodoR i=inicio; i!=null; i=i.getSig())
         if(i.getDato().mayor(aux))aux=i.getDato();
      return aux;
   }//mayor
    
   
   public Racional menor(){
      Racional aux=mayor();
      for(NodoR i=inicio; i!=null; i=i.getSig())
         if(i.getDato().menor(aux))aux=i.getDato();
      return aux;
   }//menor
   
   public String pares(){
      String aux="";
      for(NodoR i=inicio; i!=null; i=i.getSig())
         if(i.getDato().div(2).igualigual(0)){aux=aux+i.getDato()+" , ";}
      return aux;
   }//pares
   
   public String inpares(){
      String aux="";
      for(NodoR i=inicio; i!=null; i=i.getSig())
         if(i.getDato().div(2).diferente(0)){aux=aux+i.getDato()+" , ";}
      return aux;
   }//inpares
   

   public void verLista(){
      String cad="";
      for(NodoR i=inicio; i!=null; i=i.getSig())
         cad=" "+cad+"[ "+i+" ]";
      showMessageDialog(null,cad+"\n Suma: "+Suma()+"\n Menor: "+menor()+"\n Mayor: "+mayor()+
         "\n Pares: "+pares()+"\n inPares: "+inpares());
   }//ver lista




   public static void main(String trs[]){
      ListaSimpleRacional list=new ListaSimpleRacional();
      list.agregar(new Racional(1,2)); list.agregar(new Racional(3,2)); 
      list.agregar(new Racional(3,3)); list.agregar(new Racional(10,1));
      list.verLista();
   }//main
}//Class