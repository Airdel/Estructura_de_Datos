
package arbolgrafico;

import Paneles.*;

public class ArbolString {
    private NodoS raiz;

    public ArbolString() {
        raiz=null;
    }

    public NodoS getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoS raiz) {
        this.raiz = raiz;
    }
    
    public void insertar(String elemento){
        if(raiz == null){
            raiz = new NodoS(elemento);
        }else
            if(raiz.getDato().equals("=")){
                insertarDer(raiz,elemento);
            }else{
                insertarIzq(raiz,elemento);
            }
    }
    
    public void insertarIzq(NodoS n,String elemento){
        if(Grafos.esOpe(elemento)==-1){
            raiz.setDer(new NodoS(elemento));
        }else{
            NodoS aux = new NodoS(elemento);
            aux.setIzq(raiz);
            setRaiz(aux);
        }
    }
    
    public void insertarDer(NodoS n,String elemento){
        NodoS aux = minimo(raiz);
        if(Grafos.esOpe(elemento)==-1){
            aux.setDer(new NodoS(elemento));
        }else{
            NodoS temp = new NodoS(elemento);
            temp.setIzq(aux.getDer());
            aux.setDer(temp);
        }
    }
    
    public NodoS minimo(NodoS n){
        return (n.getDer()==null||Grafos.esOpe(n.getDer().getDato())==-1) ? n : minimo(n.getDer());
    }
    public void inOrden(NodoS aux){
        if(aux==null){
             return;
        }else{
            inOrden(aux.getIzq());
            System.out.println(aux.getDato()+" ");
            inOrden(aux.getDer());
        }
    }
}
