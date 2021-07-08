public class NodoA {
    private int dato;
    private NodoA izq, der;

    public NodoA(int dato) {
        this.dato = dato; izq = der = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoA getIzq() {
        return izq;
    }

    public void setIzq(NodoA izq) {
        this.izq = izq;
    }

    public NodoA getDer() {
        return der;
    }

    public void setDer(NodoA der) {
        this.der = der;
    }

    @Override
    public String toString() {
        return "{" + dato + '}';
    }
    
    
    
}
