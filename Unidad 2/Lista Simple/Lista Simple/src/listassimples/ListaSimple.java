package listassimples;

import java.util.logging.Level;
import java.util.logging.Logger;
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
    if(buscar(d)!=null){
      if(inicio.getDato()==d){inicio=inicio.getSig(); 
         return;}
      Nodo temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
    }
    else{showMessageDialog(null,"no se encunentra el dato");}
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
   public int lengthList(){
   int c=0;
       if(fin==null){return -1;}    
   for(Nodo i=inicio; i!=null; i=i.getSig())c++;
   return c;
   }

   public int getPos(int posicion) throws Exception{
    // Verifica si la posiciÃ³n ingresada se encuentre en el rango
    // >= 0 y < que el numero de elementos del la lista.
     if(posicion>=0 && posicion<lengthList()){
          // Consulta si la posicion es el inicio de la lista.
        if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
            return inicio.getDato();
        }else{
                // Crea una copia de la lista.
            Nodo aux = inicio;
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
    }//Optener la pocision de la lista

   public static void main(String trs[]){
      ListaSimple list=new ListaSimple();
      list.agregar(1); list.agregar(2); list.agregar(3); list.agregar(5);
      list.verLista();
      list.eliminar(10);
      list.verLista();
       try {
           System.out.println(list.lengthList()+"\n"+list.getPos(0));
       } catch (Exception ex) {
           Logger.getLogger(ListaSimple.class.getName()).log(Level.SEVERE, null, ex);
       }
   }//main
}//Class