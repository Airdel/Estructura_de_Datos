import static javax.swing.JOptionPane.*;
public class Complex{
   private float r,i;
   public Complex(){r=i=0;}//Contructor
   
   public Complex(float x,float y){r=x;i=y;}//contructor con float
   
   public Complex(float x){r=x;i=0;}//constructor con un solo imaginario
   
   public Complex(String c){
   c=c.replace("+","/");
   c=c.replace("i","");
      String A[]=c.split("/");

      int r=Integer.parseInt(A[0]);
      int i=Integer.parseInt(A[1]);
      
      showMessageDialog(null,"La parte real es: "
         +r+"\n"+"la parte imaginaria es: "+i);
   }//contructor con strings
   
   public String toString(){
      return r+"+"+i+"i";}//retornar strings
      
   public void mostrar(){showMessageDialog(null,toString());}//mostrar
   
   public void mostrar(String obj){
      showMessageDialog(null,obj+"="+toString());}//Sobre carga de mostrar
   
   public Complex mas(Complex b){
      return new Complex(r+b.r, i+b.i);}//Complejo mas complejo
      
   public Complex menos(Complex b){
      return new Complex (r-b.r,i-b.i);}//Complejo menos complejo
      
   public Complex por(Complex b){
      return new Complex(r*b.r,i*b.i);}//Complejo por complejo
      
   public boolean igual(Complex b){
   return r==b.r&&i==b.i;}//complejo es igual a complejo
   
   public boolean mayor(Complex b){
   return r>b.r&&i>b.i;}//Complejo es mayor que complejo
   
    public boolean menor(Complex b){
   return r<b.r&&i<b.i;}//complejo es menor que complejo
   
   
   
      
      /*public Complex entre(Complex b){
      return new 
      }*/
      
   public static void main (String trs[]){
      /*Complex a=new Complex(3,2);
      Complex b=new Complex(7,4);
      Complex c=new Complex();
      a.mostrar(); b.mostrar("b");
      c=a.mas(b);//a+b
      c.mostrar("c");*/
      Complex d=new Complex("3+3i");
      d.mostrar();
   }//main
}//class