import static javax.swing.JOptionPane.*;
public class Palindromo{
   public static void main(String[] trs){
   
      String pal=showInputDialog("Ingresa la frase");
      pal=pal.toLowerCase();
      pal=pal.replace(" ","");//para remplazar
   
      for(int i=0;i<pal.length()/2;i++)
         if(pal.charAt(i)!=pal.charAt(pal.length()-i-1)){showMessageDialog(null,"No es palindromo");
            return;}
      showMessageDialog(null,"si es palindro");
   
   
   }//Main
}//Class