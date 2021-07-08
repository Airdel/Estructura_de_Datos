import static javax.swing.JOptionPane.*;
class ListaSimple{   //Inicio de la clase
   private Nodo inicio, fin;

   public ListaSimple(){inicio=null;fin=null;}

   public void agregar(int d){
      if(inicio==null)
         fin=inicio=new Nodo(d);
      else{
         fin.setSig(new Nodo(d));
         fin=fin.getSig();
      }//else
   }//Agregar  
   
   public Nodo buscar(int d){
      for(Nodo i=inicio; i!=null; i=i.getSig())
         if(i.getDato()==d)
            return i;
      return null;
   }//buscar
   
   public Nodo anterior(int d){
      for(Nodo i=inicio; i!=null; i=i.getSig())
         if(i.getSig().getDato()==d)
            return i;
      return null;
   }//buscar
   
   public void eliminar(int d){
      if(inicio.getDato()==d){inicio=inicio.getSig(); 
         return;}
      Nodo temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
  
   public int Suma(){
      Nodo R=inicio;
      int r=0;
      while(R!=null){
         r+=R.getDato();
         R=R.getSig();
      }
      return r;
   }//sumar
  
   public int mayor(){
      int aux=0;
      for(Nodo i=inicio; i!=null; i=i.getSig())
         if(i.getDato()>aux)aux=i.getDato();
      return aux;
   }//mayor
    
   
   public int menor(){
      int aux=mayor();
      for(Nodo i=inicio; i!=null; i=i.getSig())
         if(i.getDato()<aux)aux=i.getDato();
      return aux;
   }//menor
   
   public String pares(){
      String aux="";
      for(Nodo i=inicio; i!=null; i=i.getSig())
         if(i.getDato()%2==0){aux=aux+i.getDato()+" , ";}
      return aux;
   }//pares
   
   public String inpares(){
      String aux="";
      for(Nodo i=inicio; i!=null; i=i.getSig())
         if(i.getDato()%2!=0){aux=aux+i.getDato()+" , ";}
      return aux;
   }//inpares
   
   public String esPrimoRC(){
      String cad="";
      for(Nodo i=inicio; i!=null; i=i.getSig()){
         if(i.getDato()%2!=0){
            if(i.getDato()==1)cad=cad+"";
            else
               cad=cad+i.getDato()+",";
         }
      }
         
      return cad;
   }//es primo

 
  
  
  
  
  
   public void verLista(){
      String cad="";
      for(Nodo i=inicio; i!=null; i=i.getSig())
         cad=" "+cad+"[ "+i+" ]";
      showMessageDialog(null,cad+"\n Suma: "+Suma()+"\n Menor: "+menor()+"\n Mayor: "+mayor()+
         "\n Pares: "+pares()+"\n inPares: "+inpares()+"\n Primos: "+esPrimoRC());
   }//ver lista




   public static void main(String trs[]){
      ListaSimple list=new ListaSimple();
      list.agregar(1); list.agregar(2); list.agregar(3); list.agregar(5);
      list.verLista();
   }//main
}//Class