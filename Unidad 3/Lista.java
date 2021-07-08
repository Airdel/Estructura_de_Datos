/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abne Hiram
 */
import static javax.swing.JOptionPane.*;

class Lista{
   private NodoL inicio,fin;
   
   public Lista( ){inicio=fin=null;}
   
   public void agregar(Actividades d){
	   
    if(inicio==null)
        fin=inicio=new NodoL(d);
      else{
         fin.setSig(new NodoL(d));
         fin=fin.getSig();

					  }//else  	
	}//agregar
   
	public void verLista( ){
	   String cad="";
	   for(NodoL i=inicio; i!=null; i=i.getSig( ))
		   cad=cad+" [ "+i.getDato( )+" ] ";
		showMessageDialog(null,cad);	
	}//ver
        
           public NodoL buscar(Actividades d){
      for(NodoL i=inicio; i!=null; i=i.getSig())
         if(i.getDato()==d)
            return i;
      return null;
   }//buscar

            public Actividades getPos(int posicion) throws Exception{
    // Verifica si la posiciÃ³n ingresada se encuentre en el rango
    // >= 0 y < que el numero de elementos del la lista.
     if(posicion>=0 && posicion<lengthList()){
          // Consulta si la posicion es el inicio de la lista.
        if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
            return inicio.getDato();
        }else{
                // Crea una copia de la lista.
            NodoL aux = inicio;
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
           
      public int lengthList(){
   int c=0;
       if(fin==null){return -1;}    
   for(NodoL i=inicio; i!=null; i=i.getSig())c++;
   return c;
   }
           
        public NodoL anterior(Actividades d){
      for(NodoL i=inicio; i!=null; i=i.getSig())
         if(i.getSig().getDato()==d)
            return i;
      return null;
   }//buscar
   
   public void eliminar(Actividades d){
      if(inicio.getDato()==d){inicio=inicio.getSig(); 
         return;}
      NodoL temp=anterior(d);
      if(temp!=null)temp.setSig(temp.getSig().getSig());
   }//eliminar
        
        
        
        
   public static void main(String ar[ ]){
     Lista L=new Lista();
	  //L.agregar(new Actividades("hola","l",3));	  	  	
	  L.verLista();
  }//main
}//class