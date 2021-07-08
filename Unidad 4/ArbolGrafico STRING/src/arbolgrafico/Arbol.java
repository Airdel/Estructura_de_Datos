
package arbolgrafico;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Digital Monster
 */
public class Arbol {

    private Nodo raiz;
    int cant;
    int altura;

   

    public Nodo getRaiz() {
        return this.raiz;
    }

    public void setRaiz(Nodo r) {
        this.raiz = r;
    }

    public Arbol() {
        this.raiz = null;
    }

    public boolean agregar(String dato) {
        Nodo nuevo = new Nodo(dato, null, null);
        insertar(nuevo, raiz);
        return true;
    }//Agregar un nodo al arbol

    public void insertar(Nodo nuevo, Nodo pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        }//if
        else {
            if (nuevo.getDato().compareTo(pivote.getDato())<1) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } 
                else {
                    insertar(nuevo, pivote.getIzq());
                }//else
            }//if 
            else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }//else
    }//insertar un nodo con agregar.
   
    
    public String cantidadNodos() {
        cant = 0;
        cantidadNodos(raiz);
        return ""+cant;
    } //cantidad de nodos del arbol

    private void cantidadNodos(Nodo reco) {
        if (reco != null) {
            cant++;
            cantidadNodos(reco.getIzq());
            cantidadNodos(reco.getDer());
        }
    }//Cantidad de nodos con un reconocedor
    
    
    
    public String cantidadNodosHoja() {
        cant = 0;
        cantidadNodosHoja(raiz);
        return ""+cant;
    }//cantidad nodos hoja
    
      private void cantidadNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.getIzq() == null && reco.getDer() == null) {
                cant++;
            }
            cantidadNodosHoja(reco.getIzq());
            cantidadNodosHoja(reco.getDer());
        }
    }//Cantidad de nodos hoja con un reconocedor

    
      public String retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return ""+altura;
    }//Retornar la altura en String

    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.getDer(), nivel + 1);
        }
    }//Algura del arbol sin retornar nada
    
    
     public String menorValor() {
         Nodo reco = raiz;
        if (raiz != null) {
            
            while (reco.getIzq() != null) {
                reco = reco.getIzq();
            }
        }
        return ("" + reco.getDato());
    }//valor menor del arbol
     
     
    public String mayorValor() {
        Nodo reco = raiz;
        if (raiz != null) {
            while (reco.getDer() != null) {
                reco = reco.getDer();
            }
        }
        return ("" + reco.getDato());
    }//Valor mayor del arbol
    
    
    int subizq = 0;
    int subder = 0;

    public String imprimirBalance() {
         subizq = 0;
         subder = 0;

        Balance(this.raiz, true, 0);
        if (subizq - subder == 0) {
            return ("El balance es: 0 ");
        }//if
        else if (subizq - subder == -1) {
            return("El balance es -1, derecha");
        } //else if
        else if (subizq - subder == 1) {
            return("El balance 1, izquierda");
        }//else if 
        else {
            return("No es balanceado.."
                    + "porque es mas grande el lado "
                    + ((subizq > subder) ? "Izquierdo" : "Derecho"));
        }//else
    }//Imprimir el balance de un arbol para saber que lado es mas grande que el otro

    public void Balance(Nodo reco, boolean lado, int i) {

        if (reco != null) {
            if (reco.getDer() == null && reco.getIzq() == null) {
                if (lado) {
                    subder = (i > subder) ? i : subder;
                }//if 
                else {
                    subizq = (i > subizq) ? i : subizq;
                }//else
            }//if

            Balance(reco.getDer(), lado, i + 1);
            if (i == 0) {
                lado = false;
            }//if
            Balance(reco.getIzq(), lado, i + 1);
        }//if principal
    }//saber si un arbol esta balanceado con recursividad (Contadores de lados)
    
    
    public String borrarMenor() {
        Nodo reco=raiz.getIzq();
        if (raiz != null) {
            if (raiz.getIzq() == null) {
                raiz = raiz.getDer();
            } //if
            else {
                Nodo anterior = raiz;
                reco = raiz.getIzq();
                while (reco.getIzq() != null) {
                    anterior = reco;
                    reco = reco.getIzq();
                }//while
                anterior.setIzq(reco.getDer());
            }//else
        }//if
        return ("Valor eliminado: " + reco.getDato());
    }//borrar el dato menor del arbol

   
    public String borrarMayor() {
        Nodo reco=raiz.getIzq();
        if (raiz != null) {
            if (raiz.getDer() == null) {
                raiz = raiz.getIzq();
            }//if
            else {
                Nodo anterior = raiz;
                reco = raiz.getDer();
                while (reco.getDer() != null) {
                    anterior = reco;
                    reco = reco.getDer();
                }//while
                anterior.setDer(reco.getIzq());
            }//else
        }//If principal
        return ("Valor eliminado: " + reco.getDato());
    }//borrar el valor mayor
    
    String[] niveles;

    public int alturaArbol() {
        altura = 0;
        alturaArbol(raiz, 0);
        return altura;
    }//Altura del arbol

    private void alturaArbol(Nodo pivote, int nivel) {
        if (pivote != null) {
            alturaArbol(pivote.getIzq(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            alturaArbol(pivote.getDer(), nivel + 1);
        }
    }//altura del arbol con pivotes

    public ArrayList imprimirNivel() {
        niveles = new String[altura + 1];
        ArrayList l=new ArrayList();
        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            l.add(niveles[i] + " ");
        }
        return l;
    }//niveles del arbol
    
      public void imprimirNivel(Nodo pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.getDato() + ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.getDer(), nivel2 + 1);
            imprimirNivel(pivote.getIzq(), nivel2 + 1);
        }
    }//imprimir los niveles con un pivote de contador
      
    
      public boolean cambiar() {
            cambiar(raiz, 1);
            return true;
    }//cambiar (prinicipal

    private void cambiar(Nodo reco, int nivel) {
        if (reco != null) {
            reco.setDato(reco.getDato());
            cambiar(reco.getIzq(), nivel + 1);
            //System.out.print(reco.getDato() + " Nivel: (" + nivel + ") ,");
            cambiar(reco.getDer(), nivel + 1);
        }
    }//cambiar los datos 
    
    
    int numeroRamas = 0;
    public ArrayList<String>ObtenerRamamayor(){
    obtenernumeroRamas(this.raiz, 0);
    return ObtenerRamamayor(this.raiz, 0, "", new ArrayList<String>());
    }//rama mayor donde se imprime
    
    public void obtenernumeroRamas(Nodo pivote, int contador) {
        if (pivote != null) {
            contador++;
            obtenernumeroRamas(pivote.getIzq(), contador);
            obtenernumeroRamas(pivote.getDer(), contador);
        }
        if (contador > this.numeroRamas) {
            this.numeroRamas = contador;
        }
    }//rama mayor (principal)

     public ArrayList<String> ObtenerRamamayor(Nodo pivote, int contador, String dato, ArrayList lista){
        if (pivote != null ) {
            dato+=pivote.getDato()+",";
            contador ++;
            lista=ObtenerRamamayor(pivote.getIzq(), contador, dato, lista);
            lista=ObtenerRamamayor(pivote.getDer(), contador, dato, lista);
            
            if (contador == this.numeroRamas) {
                lista.add(dato);
            }//if
        }//if principal
        return lista;
    }//rama mayor
    
  
    public String borrar(String x) {
        if (!this.buscar(x)) {
            return "El valor no se encuentra";
        }

        Nodo z = borrar(this.raiz, x);
        this.setRaiz(z);
        return x;
    }//borrar el valor deseado

    private Nodo borrar(Nodo r, String x) {
        if (r == null) {
            return null;//<--Dato no encontrado		
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara > 0) {
            r.setIzq(borrar(r.getIzq(), x));
        } else if (compara < 0) {
            r.setDer(borrar(r.getDer(), x));
        } else {
            System.out.println("Encontro el dato:" + x);
            if (r.getIzq() != null && r.getDer() != null) {
                /*
                 *	Buscar el menor de los derechos y lo intercambia por el dato
                 *	que desea borrar. La idea del algoritmo es que el dato a borrar 
                 *	se coloque en una hoja o en un nodo que no tenga una de sus ramas.
                 **/
                Nodo cambiar = buscarMin(r.getDer());
                String aux = cambiar.getDato();
                cambiar.setDato(r.getDato());
                r.setDato(aux);
                r.setDer(borrar(r.getDer(), x));
                System.out.println("2 ramas");
            } else {
                r = (r.getIzq() != null) ? r.getIzq() : r.getDer();
                System.out.println("Entro cuando le faltan ramas ");
            }
        }
        return r;
    }

    //buscar
    public boolean buscar(String x) {
        return (buscar(this.raiz, x));
    }

    private boolean buscar(Nodo r, String x) {
        if (r == null) {
            return (false);
        }
        int compara = ((Comparable) r.getDato()).compareTo(x);
        if (compara > 0) {
            return (buscar(r.getIzq(), x));
        } else if (compara < 0) {
            return (buscar(r.getDer(), x));
        } else {
            return (true);
        }
    }

    //buscar min
    private Nodo buscarMin(Nodo r) {
        for (; r.getIzq() != null; r = r.getIzq());
        return (r);
    }
       //imprimir preorden
    public ArrayList preOrden() {
        ArrayList l=new ArrayList();
        preOrden(raiz,l);
        return l;
    }

    private void preOrden(Nodo reco, ArrayList l) {
        if (reco != null) {
            l.add(reco.getDato() + " ");
            preOrden(reco.getIzq(),l);
            preOrden(reco.getDer(),l);
        }
    }
    //imprimir InOrden
    public ArrayList inOrden() {
        ArrayList l=new ArrayList();
        inOrden(raiz,l);
        return l;
    }

    private void inOrden(Nodo reco,ArrayList l) {
        if (reco != null) {
            inOrden(reco.getIzq(),l);
            l.add(reco.getDato() + " ");
            inOrden(reco.getDer(),l);
        }
    }

//imprimir post orden
    public ArrayList postOrden() {
        ArrayList l=new ArrayList();
        postOrden(raiz,l);
        return l;
    }

    private void postOrden(Nodo reco, ArrayList l) {
        if (reco != null) {
            postOrden(reco.getIzq(),l);
            postOrden(reco.getDer(),l);
            l.add(reco.getDato() + " ");
        }
    }
    
    //con nivel
       public ArrayList impNiveles() {
        ArrayList l=new ArrayList();
        impNiveles(raiz, 1,l);
        return l;
    }

    private void impNiveles(Nodo reco, int nivel,ArrayList l) {
        if (reco != null) {
            impNiveles(reco.getIzq(), nivel + 1, l);
            l.add(reco.getDato() + " Nivel: (" + nivel + ") ");
            impNiveles(reco.getDer(), nivel + 1, l);
        }
    }
    
    //hojas
    public ArrayList getHojas() {
        ArrayList l = new ArrayList();
        getHojas(this.raiz, l);
        return (l);
    }

    private void getHojas(Nodo r, ArrayList l) {
        if (r != null) {
            if (this.esHoja(r)) {
                l.add(r.getDato());
            }
            getHojas(r.getIzq(), l);
            getHojas(r.getDer(), l);
        }

    }
    protected boolean esHoja(Nodo x) {
        return (x != null && x.getIzq() == null && x.getDer() == null);
    }
    
    
    public String padre(String info) {
        if (info.compareTo("")>-1  || this.raiz == null) {
            return info;
        }
        String x = padre(info);
        if (x == null) {
            return x;
        }
        return (x);
    }//*/

   /* private Nodo padre(Nodo x, int info) {
        if (x == null) {
            return null;
        }
        if ((x.getIzq() != null && x.getIzq().getDato()==(info)) || (x.getDer() != null && x.getDer().getDato()==(info))) {
            return (x);
        }
        Nodo y = padre(x.getIzq(), info);
        if (y == null) {
            return (padre(x.getDer(), info));
        } else {
            return (y);
        }
    }*/
    
    //eliminar hojas
     public void podar() {
        podar(this.raiz);
    }

    private void podar(Nodo x) {
        if (x == null) {
            return;
        }
        if (this.esHoja(x.getIzq())) {
            x.setIzq(null);
        }
        if (this.esHoja(x.getDer())) {
            x.setDer(null);
        }
        podar(x.getIzq());
        podar(x.getDer());
    }
   
    
    
    
    //dibujar arbol
     public JPanel getdibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
