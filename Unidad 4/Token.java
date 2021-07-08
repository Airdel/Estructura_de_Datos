public class Token{

   public static String[] separaToken(String cad){
      String op="=+-*/"; int p=0; String t="";
      String T[]=new String[cad.length()];
      for(int i=0;i<cad.length();i++){
         if(op.indexOf(cad.substring(i,i+1))==-1)t=t+cad.substring(i,i+1);
         else{T[p++]=t; t=""; T[p++]=cad.substring(i,i+1);}
      }//for
      T[p++]=t;
      return T;
   }//separar la cadena de la ecuacion en tokens

   public static boolean esDig(String cad){
      String dig="0123456789";
      return dig.indexOf(cad)!=-1;
   }//Es digito?

   public static boolean esLetra(String cad){
      String dig="abcdefghijklmnñopqrstuvwxyz";
      return dig.indexOf(cad.toLowerCase())!=-1;
   }//Es Letra(?)

   public static boolean esIde(String cad){
      int M[][]={{1,1,-1,-1},{1,1,1,-1}};
      int edo=0,ent;
      String c="";
      for(int i=0;i<cad.length();i++){
         c=cad.substring(i,i+1);
         if(esLetra(c))ent=0;
         else if(c.equals("_"))ent=1;
         else if(esDig(c))ent=2;
         else ent=3;
         edo=M[edo][ent];
         if(edo==-1)
            return false;
      }//for
      return true;
   }//el identificador es valido(?)

   public static boolean esEntero(String cad){
      int M[][]={{1,1,-1},{1,-1,-1}};
      int edo=0,ent;
      String c="";
      for(int i=0;i<cad.length();i++){
         c=cad.substring(i,i+1);
         if(c.equals("-"))ent=1;
         else if(esDig(c))ent=0;
         else ent=2;
         edo=M[edo][ent];
         if(edo==-1)
            return false;
      }//for
      return true;
   }//el numero es valido(?)

   public static boolean esDecimal(String cad){
      int M[][]={{2,1,-1,-1},{2,-1,-1,-1},{1,-1,3,-1},{1,-1,-1,-1}};
      int edo=0,ent;
      String c="";
      for(int i=0;i<cad.length();i++){
         c=cad.substring(i,i+1);
         if(esDig(c))ent=0;
         else if(c.equals("-"))ent=1;
         else if(c.equals("."))ent=2;
         else ent=3;
         edo=M[edo][ent];
         if(edo==-1)
            return false;
      }//for
      return true;
   }//el identificador es valido(?)



   public static void main(String trs[]){
    System.out.println(esDecimal("3."));
      //String T[]=separaToken("y=x+2");
      //for(int i=0;i<T.length;i++)
      //System.out.println(T[i]+"\n"+(esIde(T[i])?"ide":(esEntero(T[i])?"entero":"otro")));
     
   }//Main


}//Class*/