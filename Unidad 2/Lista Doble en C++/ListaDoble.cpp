#include <iostream.h>
#include <conio.h>

class Nodo{
   private:
   int dato;
   Nodo *sig.*ant;

public:
   Nodo(){dato=0; sig=ant=NULL;}

   Nodo(int d){dato=; sin=ant=NULL;}

   ~Nodo(){cout<<"Memoria Liberada";}

   int getDato(){
      return dato;}

   void setDato(int d){dato=d;}

   Nodo * getSig(){
      return sig;}

   void setSig(Nodo *s){sig=s;}

   Nodo * getAnt(){
      return ant;}

   void setSig(Nodo *a){ant=a;}

};



class ListaDoble{
  private:
   Nodo *inicio,*fin;
  public:
  
   ListaDoble(){inicio=fin=NULL;}
   
   Nodo* getMayorque(int d){
      for(Nodo *i=inicio->getSig(); i!=NULL; i=i->getSit()){
         if(i->getDato()>d)
            return i;
         return NULL;
      
      
      }
   
   }//Mayor que para saber que show para ordenar
   
   
   
   
   
   void InsertarOrd(int d){
      if(inicio==NULL){inicio=fin=new Nodo(d);}
      else if(d<=inicio->getDato()){
         inicio->setAnt(new Nodo(d));
         inicio->getAnt().setSig(inicio);
         inicio=inicio->getAnt();
      }
      else{
         Nodo * temp=getMayorque(d);
         if(temp==NULL){
            fin->setSig(new Nodo(d));
            fin->getSig()->setAnt(fin);
            fin=fin->getSig();
         else{
          Nodo *aux=new Nodo(d);
          aux->setSig(temp);
          aux->setAnt(temp->getAnt());
          temp->getAnt()->setSig(aux);
          aux->getAnt()->setSig(aux);
          
         
         }
     
         
         }
      
      }//else
   }//Insertar
   
   void verLista(){
   
   
   
   }//ver lista
   
   
   
   ~ListaDoble(){
   
   
   }//Destructr

};

void main(){
   ListaDoble list;
   list.InsertarOrd(10);
   list.InsertarOrd(3);
   list.verLista;
   list.InsertarOrd(7);
   list.InsertarOrd(11);
}