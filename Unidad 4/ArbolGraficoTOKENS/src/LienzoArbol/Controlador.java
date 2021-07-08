
package LienzoArbol;

import Paneles.ArbolString;

public class Controlador {
    private Lienzo objLienzo; //VISTA
    private ArbolString objArbol; //MODELO

    public Controlador(Lienzo objLienzo, ArbolString objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}
