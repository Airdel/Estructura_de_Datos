
import static javax.swing.JOptionPane.showMessageDialog;

public class Grafo {
    public static boolean esIde(String cad) {
        int M[][] = {{1,1,1,-1,-1},{1,1,1,1,-1}}, edo = 0, ent;
        for(int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if(c == '_')ent = 1; else if(c == '$')ent = 2;
            else if(Character.isLetter(c))ent = 0;
            else if(Character.isDigit(c))ent = 3;
            else return false;
            edo = M[edo][ent]; if(edo == -1)return false;
        }//for
        return true;
    }
    
    public static boolean esInt(String cad) {
        int M[][] = {{1,1,-1},{1,-1,-1}}, edo = 0, ent;
        for(int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if(Character.isDigit(c))ent = 0; else if(c == '-')ent = 1;
            else return false;
            edo = M[edo][ent]; if(edo == -1)return false;
        }//for
        return true;
    }
    
    public static boolean esFloat(String cad) {
        cad=cad.trim();
        int M[][] = {{1,2,-1,-1},{1,-1, 3, -1},{1,-1,-1, -1}, {3, -1, -1, -1}}, edo = 0, ent;
        for(int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if(Character.isDigit(c))ent = 0; else if(c == '.')ent = 2;
            else if(c == '-')ent = 1;
            else return false;
            edo = M[edo][ent]; if(edo == -1)return false;
        }//for
        return true;
    }
    
    public static boolean esHex(String cad) {
        int M[][] = {{0,0,-1}}, edo = 0, ent;
        for(int i = 0; i < cad.length(); i++) {
            char c = cad.charAt(i);
            if(Character.isDigit(c))ent = 0;
            else if(c >= 'A' && c <= 'F')ent = 1;
            else return false;
            edo = M[edo][ent]; if(edo == -1)return false;
        }
        return true;
    }    
    
    public static int esOP(String c) {
        String OP[] = {"=", "+", "-", "/", "*", ";"};
        for(int i = 0; i < OP.length; i++)
            if(c.equals(OP[i]))return i;
        return -1;
    }
    
    public static void main(String[] args) {
        showMessageDialog(null, esFloat("0.16"));
    }
}
