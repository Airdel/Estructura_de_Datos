/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abne Hiram
 */
class NodoL{
   private Actividades dato;
   private NodoL sig,ant;
   public NodoL( ){dato=dato;}
	public NodoL(Actividades d ){dato=d;}
        public void setDato(Actividades d ){dato=d;}
        public Actividades getDato( ){return dato;}
	public NodoL getSig( ){return sig;}
	public void setSig(NodoL s ){sig=s;}
	public NodoL getAnt( ){return ant;}
	public void setAnt(NodoL a ){ant=a;}
	public String toString( ){return dato+"";}
}//class
