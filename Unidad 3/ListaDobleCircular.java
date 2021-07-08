
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.*;
import javax.swing.JPanel;
class ListaDobleCircular{   //Inicio de la clase
   private NodoDC inicio,fin;

   public ListaDobleCircular(){fin=inicio=null;}

   public void agregar(Notas d){
      if(inicio==null&&fin==null)
         inicio=fin=new NodoDC(d);
      else{
         NodoDC temp=new NodoDC(d);
         
         fin.setSig(temp); 
         temp.setAnt(fin);
         fin=temp;
         fin.setSig(inicio);
         inicio.setAnt(fin);
      }//else
   }//Agregar  
   public Notas getPos(int posicion) throws Exception{
     if(posicion>=0 && posicion<lengthList()){
        if (posicion == 0) {
           
            return inicio.getDato();
        }else{
            NodoDC aux = inicio;
            for (int i = 0; i < posicion; i++) {
                   aux = aux.getSig();
             }
            return aux.getDato();
            }
    } else {
       throw new Exception("Posicion inexistente en la nota.");
        }
    }//Optener la pocision de la nota
  
     public String getPos2(int posicion) throws Exception{
     if(posicion>=0 && posicion<lengthList()){
        if (posicion == 0) {
           
            return inicio.getDato().getTitulo();
        }else{
            NodoDC aux = inicio;
            for (int i = 0; i < posicion; i++) {
                   aux = aux.getSig();
             }
            return aux.getDato().getTitulo();
            }
    } else {
       throw new Exception("Posicion inexistente en la nota.");
        }
    }//Optener la pocision de la nota
  
   public void Prioridad(String s){
      NodoDC nuevo = new NodoDC(s);
   
      if(inicio==null&&fin==null)
         inicio=fin=new NodoDC(s);
         
      else{
         for(NodoDC i=inicio; i!=fin; i=i.getSig()){
            if(i.getDato().getTitulo().compareTo(s)<0){
               nuevo.setSig(inicio);
               nuevo=inicio;
               fin.setAnt(inicio);
            }//if para cuando es menor a cero
            
            if(i.getDato().getTitulo().compareTo(s)>0){
               nuevo.setSig(fin);
               fin=nuevo;
               inicio.setAnt(fin);
            }//Else if
            
            else{
               nuevo.setSig(inicio);
               nuevo=inicio;
               fin.setSig(nuevo);
            }//Llave del else
         }//Llave del for
      
      } //llave del else principal
   
   }//Prioridades en orden alfabetico

   
   public int lengthList(){
      int c=1;
      NodoDC i=inicio;
      //System.out.println(i);
      
      if(inicio==null){
         return -1;}
      if(inicio==fin){return 1;}
            do{
         c++;
         i=i.getSig();
      }while(i!=fin);
      return c;
   }  
   
   public NodoDC buscar(Notas d){
      for(NodoDC i=inicio; i!=fin; i=i.getSig())
         if(i.getDato().igualigual(d.getTitulo())) 
            return i;
      if(fin.getDato().igualigual(d.getTitulo()))
         return  fin;
      return null;
   }//buscar
    public String buscarTx(String d){
      for(NodoDC i=inicio; i!=fin; i=i.getSig())
         if(i.getDato().getTitulo().equals(d))
            return i.getDato().getDatos();
      if(fin.getDato().getTitulo().equals(d))
         return  fin.getDato().getDatos();
      return null;
   }//buscar
  
   public void eliminar(Notas a){
       NodoDC d=new NodoDC(a);
      if(inicio.getDato().igualigual(d.getDato().getTitulo())){ 
         inicio=inicio.getSig(); 
         inicio.setAnt(fin);
         return;}
         
      if(fin.getDato().igualigual(d.getDato().getTitulo())){
         fin=fin.getAnt();
         fin.setSig(inicio);
         return;
      }
      
      NodoDC temp=buscar(a);
      if(temp!=null){
         temp.getAnt().setSig(temp.getSig());
         temp.getSig().setAnt(temp.getAnt());
      }
      else showMessageDialog(null,"El dato que quiere eliminar no existe");
   }//eliminar    
 /*  
   public void menosAmigos(int c){
      NodoDC i=inicio;
      if(i==null){showMessageDialog(null, "nota vacia"); 
         return;}
      do{ 
         if(i.getDato().getEdad()==c){
            i.getAnt().setSig(i.getSig());
            i.getSig().setAnt(i.getAnt());
            if(i==inicio)inicio=inicio.getSig();
            if(i==fin)fin=fin.getAnt();
         }//if
         i=i.getSig();
      }while(i!=fin.getSig());
   }//Eliminar por calificacion
   */
   /*
   public void menosAmigosparaExcentar(int c){
      NodoDC i=inicio; 
      if(i==null){showMessageDialog(null,"Lista Vacia");
         return;}
      for(int f=0; f<=lengthList()+1; f++){
         if(i.getDato().getEdad()==c){
            eliminar(i.getDato());
         }
         i=i.getSig();
      }    
   }//Eliminar por calificacion 
   */
   
   
   
  
  
  
  
  
   /*
   public void modificar(int localizar,int porcentaje){
      for(NodoDC i=inicio; i!=fin; i=i.getSig())
         if(i.getDato().getEdad()==localizar) i.getDato().setEdad(((porcentaje/100)+1)*i.getDato().getEdad());
         
      if(fin.getDato().getEdad()==localizar)
         fin.getDato().setEdad(((porcentaje/100)+1)*fin.getDato().getEdad());
   }//modificar 
   */
   public void modificarNota(String nombre,String dato){
       for(NodoDC i=inicio; i!=fin; i=i.getSig())
         if(i.getDato().getTitulo().equals(nombre)) i.getDato().setDatos(dato);
         
      if(fin.getDato().getTitulo().equals(nombre))
         fin.getDato().setDatos(dato); 
   
   }
   
   
   /*public Notas Suma(){
      NodoDC R=inicio;
      Notas aux=new Notas();
      while(R!=null){
         aux=aux.mas(R.getDato());
         R=R.getSig();
      }
   
      return aux;
   }//sumar
  
   public Notas mayor(){
      Notas aux=new Notas();
      for(NodoDC i=inicio; i=inicio.getAnt(); i=i.getSig())
         if(i.getDato().mayor(aux))aux=i.getDato();
      return aux;
   }//mayor
    
   
   public Notas menor(){
      Notas aux=mayor();
      for(NodoDC i=inicio; i=inicio.getAnt(); i=i.getSig())
         if(i.getDato().menor(aux))aux=i.getDato();
      return aux;
   }//menor*/
   
   public void verLista(){
      String cad="";
      NodoDC i=inicio;
      for(int f=0; f<lengthList(); f++){
         cad=cad+"["+i.getDato()+"]"+"\n";
         i=i.getSig();}
      showMessageDialog(null,cad);
   }//ver Lista
  public void Sig(int indice){
      String cad="";
      int d;
      if(indice==0){System.out.println("Inicio invalido");d=0;}
      else{
        d=indice-1;
      }
      for(int f=0; f<lengthList(); f++){
          try {
               
                cad=cad+getPos(d)+"\n";
                d++;
              } catch (Exception ex) { }
     
   }
//10 --------8      8-9-10 
     showMessageDialog(null,cad);
  }//ver Lista
  public void verLista2(){
      String cad="";
      for(NodoDC i=inicio; i!=fin; i=i.getSig())
         cad=cad+"["+i.getDato()+"]"+"\n";
      cad=cad+"["+fin.getDato()+"]";
      showMessageDialog(null,cad);///
      //showMessageDialog(null, cad);  +Suma()+"\n Menor: "+menor()+"\n Mayor: "+mayor()+
       //  "\n Pares: "+pares()+"\n inPares: "+inpares()
   }//ver nota*/
   
   


   public static void main(String trs[]){
       try {
           ListaDobleCircular not;
           not = new ListaDobleCircular();
           not.agregar(new Notas("hola1","sdklfhslkdfhsdklfsd"));
           not.agregar(new Notas("brandon2","dosfksdofksodkfsdf"));
           not.agregar(new Notas("hola3","fdds"));
           not.agregar(new Notas("hola4","fdds"));
           not.agregar(new Notas("hola5","fdds"));
            

           //not.Prioridad("Tony");
           // not.Prioridad("Martha");
           //System.out.println(not.getPos(0));
           System.out.println(not.getPos(0));
           System.out.println(not.getPos(1));
           System.out.println(not.getPos(2));
           System.out.println(not.getPos(3));
           System.out.println(not.getPos(4));
          // System.out.println(not.getPos(0));

           //not.modificarNota("brandon", "funciona");
           not.Sig(3);
           //System.out.println(not.buscarTx("brandon"));
       } //main
       catch (Exception ex) {
           Logger.getLogger(ListaDobleCircular.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}//Class