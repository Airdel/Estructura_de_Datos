package Unidad;


import static javax.swing.JOptionPane.*;
public class Unidad{
   private int numero,calificacion;
   private String nombre;
   public Unidad(){numero=0;calificacion=100;nombre="Recursividad";}
   public Unidad(int a, int b, String n){numero=a;calificacion=b; nombre=n;}

      
   public String toString(){
      return nombre+"/"+numero+"/"+calificacion;}
      
   
      
   public boolean mayor(Unidad b){
      return numero>b.numero;}
   
   public boolean mayor(int e){
      return numero>e;}
   
   public boolean menor(Unidad b){
      return numero<b.numero;}

   public boolean menor(int e){
      return numero<e;}
   
   public boolean mayorigual(Unidad b){
      return numero>=b.numero;}
   
   public boolean mayorigual(int e){
      return numero>=e;}
    
      public boolean menorigual(Unidad b){
      return   numero<=b.numero;}

   public boolean menorigual(int e){
      return numero<e;}
      
      public boolean igualigual(Unidad b){
      return numero<b.numero;}
   
   public boolean igualigual(int e){
      return numero<e;}
    
      public boolean diferente(Unidad b){
       return numero!=b.numero;}

   public boolean diferente(int e){
      return numero!=e;}   
      
   public static void main(String trs[]){
      Unidad a=new Unidad(1,100,"Recursividad");
      Unidad b=new Unidad(3,90,"Unidad 2");
      Unidad c=new Unidad();
      
   }//main
}//Class