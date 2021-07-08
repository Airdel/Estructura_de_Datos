import static javax.swing.JOptionPane.*;

public class ArbolBinE {
    private NodoA raiz;

    public ArbolBinE() {
        raiz  = null;
    }
    
    public void push(int n) {
        if(raiz == null)raiz = new NodoA(n);
        else{
            NodoA aux = raiz, padre = null;
            while(aux != null) {
                padre = aux;
                if(n >= aux.getDato())aux = aux.getDer();
                else aux = aux.getIzq();
            }//while
            if(n >= padre.getDato())padre.setDer(new NodoA(n));
            else padre.setIzq(new NodoA(n));
        }
    }
    
    public void inOrden(NodoA a) {
        if(a == null) return;
        inOrden(a.getIzq()); System.out.print(a + "\n");inOrden(a.getDer());
    }
    
    public void preOrden(NodoA a) {
        if(a == null)return;
        System.out.print(a+"\n"); preOrden(a.getIzq()); preOrden(a.getDer());
    }
    
    public void postOrden(NodoA a) {
        if(a == null)return;
        postOrden(a.getIzq()); postOrden(a.getDer()); System.out.print(a + "\n");
    }
    
    public NodoA getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoA raiz) {
        this.raiz = raiz;
    }
    
    private boolean buscar(int n) {
        return buscar(raiz, n);
    }
    
    private boolean buscar(NodoA a, int n) {
        if(a == null)return false;
        if(n == a.getDato())return true;   
        return 
        n < a.getDato() ? buscar(a.getIzq(), n): buscar(a.getDer(), n);       
    }
    
    public void pop(int n) {
        pop(raiz, n);
    }
    
    private NodoA pop(NodoA a, int n) {
        if (a == null) {
            return null;
        }
        if(n == a.getDato()) {
            if (a.getIzq() == null && a.getDer() == null) {
                return null;
            }
            if (a.getDer() == null) {
                return a.getIzq();
            }
            if (a.getIzq() == null) {
                return a.getDer();
            }
            int valorMin = buscarMin(a.getDer());
            a.setDato(valorMin);
            a.setDer(pop(a.getDer(), valorMin));
            return a;
        }
        if(n < a.getDato()) {
            a.setIzq(pop(a.getIzq(), n));
            return a;
        }
        a.setDer(pop(a.getDer(), n));
        return a;
    }
    
    private int buscarMin(NodoA a) {
return a.getIzq() == null ? a.getDato() : buscarMin(a.getIzq()); 
    }
    
    public static void main(String[]LFMG) {
        ArbolBinE a = new ArbolBinE();
        a.push(3);a.push(4);a.push(10);
        a.push(6);a.push(7);a.push(15);
        a.push(16);a.push(14);  
        a.preOrden(a.getRaiz());
        System.out.println(a.buscar(8));
        a.pop(10);
        System.out.println("-----------------------------\n");
        a.preOrden(a.getRaiz());
    }
    
}
