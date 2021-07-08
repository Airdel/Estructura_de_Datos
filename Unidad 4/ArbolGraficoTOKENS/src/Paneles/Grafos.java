
package Paneles;

public class Grafos {
        
    public static boolean esIde(String cad){
        int M[][]={
            {1,1,1,-1,-1},
            {1,1,1,1,-1}
        };
        int ent,end=0;
        for(int i=0;i<cad.length();i++){
            char c =cad.charAt(i);
            if(Character.isAlphabetic(c))ent=0;
            else if(c=='-')ent=1;
            else if(c=='$')ent=2;
            else if(Character.isDigit(c))ent=3;
            else return false;
            end=M[end][ent];
            if(end==-1)return false;
        }
        return true;
    }
    
    public static boolean esFloat(String cad){
        cad=cad.trim();
        if(cad.equals("-")){
            return false;
        }
        int M[][]={
            {1,2,-1,-1},
            {1,-1,3,-1},
            {1,-1,-1,-1},
            {3,-1,-1,-1}
        };
        int ent,end=0;
        for(int i=0;i<cad.length();i++){
            char c=cad.charAt(i);
            if(Character.isDigit(c))ent=0;
            else if(c=='-')ent=1;
            else if(c=='.')ent=2;
            else return false;
            end=M[end][ent]; if(end==-1)return false;
        }
        if(cad.charAt(cad.length()-1)=='.')return false;
        return true;
    }
    
    public static boolean esHex(String cad){
        int M[][]={
            {0,0,-1},
        };
        int ent,end=0;
        for(int i=0;i<cad.length();i++){
            char c=cad.charAt(i);
            if(Character.isDigit(c))ent=0;
            else if(c>='A'&&c<='F')ent=1;
            else return false;
            end=M[end][ent]; if(end==-1)return false;
        }
        return true;
    }
    
    public static int esOpe(String cad){
        String OP[]={"=","+","-","*","/",";"};
        for(int i=0;i<OP.length;i++){
            if(cad.equals(OP[i]))return i;
        }
        return -1;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(esFloat(" -0.3"));
    }
}
