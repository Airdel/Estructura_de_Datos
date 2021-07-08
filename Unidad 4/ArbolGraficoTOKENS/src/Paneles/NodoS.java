

package Paneles;

public class NodoS {
    private String dato;
    private NodoS izq,der;
    
    public int nodosCompletos(NodoS n) {
        if (n == null) {
            return 0;
        } else {
            if (n.izq != null && n.der != null) {
                return nodosCompletos(n.izq) + nodosCompletos(n.der) + 1;
            }
            return nodosCompletos(n.izq) + nodosCompletos(n.der);
        }
    }

    public NodoS(String dato) {
        this.dato = dato;
        izq=der=null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoS getIzq() {
        return izq;
    }

    public void setIzq(NodoS izq) {
        this.izq = izq;
    }

    public NodoS getDer() {
        return der;
    }

    public void setDer(NodoS der) {
        this.der = der;
    }
}
