import static javax.swing.JOptionPane.*;
public class Racional{
   private int n,d;
   public Racional(){n=0;d=1;}
   public Racional(int a, int b){n=a;d=b;}
   public Racional(int a){n=a;d=1;}

   public void leer(){
      n=Integer.parseInt(showInputDialog("Numerador"));
      d=Integer.parseInt(showInputDialog("Denominador"));
   }//leer
   
   public void mostrar(){
      showMessageDialog(null,n+"/"+d);
   }//mostrar
   
   public void mostrar(String no){
      showMessageDialog(null,no+"="+n+"/"+d);
   }//mostrar
   
   public float toFloat(){
      return (float)n/d;}
      
   public String toString(){
      return n+"/"+d;}
      
   public Racional mas(Racional b){
      return new Racional((n*b.d)+(d*b.n),d*b.d);}
      
   public Racional mas(int e){
      return new Racional(n+d*e,d);}
      
   public Racional menos(Racional b){
      return new Racional((n*b.d)-(d*b.n),d*b.d);}
      
   public Racional menos(int e){
      return new Racional(n-d*e,d);}   
   
   public Racional por(Racional b){
      return new Racional((n*b.n),(d*b.d));}
      
   public Racional por(int e){
      return new Racional((n*e),(d));}
      
   public Racional div(Racional b){
      return new Racional((n*b.d),(d*b.n));}
      
   public Racional div(int e){
      return new Racional((n*1),(d*e));}   
   
   public Racional potencia(int n){
      Racional t=new Racional(1,1);
      for(int i=1; i<=n;i++)t=t.por(this);
      return t;}
      
   public boolean mayor(Racional b){
      return (float)n/d>(float)b.n/b.d;}
   
   public boolean mayor(int e){
      return (float)n/d>(float)e;}
   
   public boolean menor(Racional b){
      return toFloat()<b.toFloat();}

   public boolean menor(int e){
      return toFloat()<e;}
   
   public boolean mayorigual(Racional b){
      return (float)n/d>=(float)b.n/b.d;}
   
   public boolean mayorigual(int e){
      return (float)n/d>=(float)e;}
    
      public boolean menorigual(Racional b){
      return toFloat()<=b.toFloat();}

   public boolean menorigual(int e){
      return toFloat()<=(float)e;}
      
      public boolean igualigual(Racional b){
      return (float)n/d==(float)b.n/b.d;}
   
   public boolean igualigual(int e){
      return (float)n/d==(float)e;}
    
      public boolean diferente(Racional b){
      return toFloat()!=b.toFloat();}

   public boolean diferente(int e){
      return toFloat()!=(float)e;}   
      
   public static void main(String trs[]){
      Racional a=new Racional(1,4);
      Racional b=new Racional(1,3);
      Racional c=new Racional();
      c=a.mas(2); //a+b
      a.mostrar("A"); b.mostrar("B"); c.mostrar("C");
   }//main
}//Class