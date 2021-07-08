
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DigitalMonster
 */
public class ColaDoble {
    
    int iFrente=-1;
    int iFinal=-1;
    int elementoscola[];
    int tam=0;
    String opera="";

    public ColaDoble(int Tam) {
        elementoscola=new int [Tam];
        tam=Tam;
    }

    public void setOpera(String opera) {
        this.opera = opera;
    }

    public int getiFrente() {
        return iFrente;
    }

    
    public int getiFinal() {
        return iFinal;
    }

    public int[] getElementoscola() {
        return elementoscola;
    }

    public int getTam() {
        return tam;
    }

    public boolean Llena(){
        
        return(iFinal==(tam-1) && iFrente==0 )||(iFinal+1==iFrente);
    }
    public boolean Vacia(){
        return (iFrente==-1 && iFinal==-1);
    }
    public void Insertar(int dato){
       // System.out.print(Llena()+"  "+(tam-1)+"\n");
        if(Llena()){
            showMessageDialog(null,"cola Llena");
        }
        else{
            if(iFinal==(tam-1) && iFrente>0){
                iFinal=0;
                elementoscola[iFinal]=dato;
            }
            else if(iFrente>0 && iFinal!=(tam-1)){
                iFinal++;
                elementoscola[iFinal]=dato;
            }
            else{
                iFinal++;
                elementoscola[iFinal]=dato;
                iFrente=0;
            }
            
        }
    }








     
 public int RetirarIzquierda(){
        int aux=0;
        if(Vacia()==true){
            showMessageDialog(null,"Cola vacia");
        }
        else{
            elementoscola[iFrente]=aux;
            if(iFinal==iFrente){
                iFrente=-1;
                iFinal=-1;
            }
            //if(iFrente==(tam-1)){iFrente=-1;}
            
            else{
                iFrente++;
            }
        }
        return aux;
    }   
 
    public int RetirarDerecha(){
        int aux=0;
        if(Vacia()==true){
            showMessageDialog(null,"Cola vacia");
        }
        else{
            elementoscola[iFinal]=aux;
            if(iFinal==iFrente){
                iFrente=-1;
                iFinal=-1;
            }
            //if(iFrente==(tam-1)){iFrente=-1;}
            
            else{
                iFinal--;
            }
        }
        return aux;
    }    
    
     public void Retirar(){
     switch(opera){
         case "Izquierda": RetirarIzquierda(); 
          break;
         case "Derecha" : RetirarDerecha();
          break;
     }
 }
     
     
    public void RetirarAll(){
        iFrente=-1;
        iFinal=-1;
        for(int i=0;i<((tam)-1);i++){
           elementoscola[i]=0;
       
       } 
    }
    
     public int[] mostrar(){
        return elementoscola;
    }
     
      public boolean buscar(int n){
     for(int i=0;i<((tam)-1);i++)
        if(elementoscola[i]==n) return true;
        return false;
    }
     
     
     
      public void ImprimeCola(){
        for(int iCont=0; iCont<elementoscola.length; iCont++){
            System.out.println("Contenido: "+elementoscola[iCont]);
        }
    }
     
     
     
    
    
}
