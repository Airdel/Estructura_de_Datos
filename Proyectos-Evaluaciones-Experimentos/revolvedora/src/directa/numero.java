/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directa;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marval
 */
public class numero {
    private int numero;

    public numero() {
    }

    public numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    void guardar(String array) {
           FileOutputStream fb;
        Frame frame = null;
        FileDialog guardar = new FileDialog(frame, "Guardar:", FileDialog.SAVE);        
        guardar.setVisible(true);
        String lista;
        if(guardar.getFile() != null) {
            lista = guardar.getDirectory() + guardar.getFile() + ".mezcla";
        }
        try {
            fb = new FileOutputStream(guardar.getFile() + ".mezcla");
            DataOutputStream fdw = new DataOutputStream(fb);
            fdw.writeUTF(array);
            fdw.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(numero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(numero.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }

    @Override
    public String toString() {
        return "numero{" + "numero=" + numero + '}';
    }
    
    
    
    
}
