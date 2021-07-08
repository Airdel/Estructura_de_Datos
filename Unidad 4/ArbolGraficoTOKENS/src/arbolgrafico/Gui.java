
package arbolgrafico;

import LienzoArbol.Controlador;
import LienzoArbol.Lienzo;
import Paneles.Grafos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Digital Monster
 */
public class Gui extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();

   
    public Gui() {
       initComponents();
       model = (DefaultTableModel) tblTokens.getModel();
       this.inicializar(false);
       this.pack();
       Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/LogoMB.png"));
       setIconImage(icon);
       getContentPane().setBackground(Color.WHITE); 
    }

    private void inicializar(boolean enable) {
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtFunc = new javax.swing.JTextArea();
        pnlArbol = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuNew = new javax.swing.JMenuItem();
        mnuSave = new javax.swing.JMenuItem();
        mnuOpen = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAnalizar = new javax.swing.JMenuItem();
        mnuGraficar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFunc.setColumns(20);
        txtFunc.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        txtFunc.setRows(5);
        jScrollPane3.setViewportView(txtFunc);

        pnlArbol.setBackground(new java.awt.Color(0, 153, 255));
        pnlArbol.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ARBOL DE EXPRESION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        pnlArbol.setForeground(new java.awt.Color(255, 255, 255));
        pnlArbol.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pnlArbol.setOpaque(false);

        javax.swing.GroupLayout pnlArbolLayout = new javax.swing.GroupLayout(pnlArbol);
        pnlArbol.setLayout(pnlArbolLayout);
        pnlArbolLayout.setHorizontalGroup(
            pnlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 928, Short.MAX_VALUE)
        );
        pnlArbolLayout.setVerticalGroup(
            pnlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 433, Short.MAX_VALUE)
        );

        tblTokens.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Token", "Tipo"
            }
        ));
        jScrollPane2.setViewportView(tblTokens);
        if (tblTokens.getColumnModel().getColumnCount() > 0) {
            tblTokens.getColumnModel().getColumn(0).setResizable(false);
            tblTokens.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Expresión:");

        jMenu1.setText("File");

        mnuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuNew.setText("Nuevo");
        mnuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewActionPerformed(evt);
            }
        });
        jMenu1.add(mnuNew);

        mnuSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuSave.setText("Guardar");
        mnuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSaveActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSave);

        mnuOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnuOpen.setText("Abrir");
        mnuOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOpenActionPerformed(evt);
            }
        });
        jMenu1.add(mnuOpen);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuAnalizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuAnalizar.setText("Analizar");
        mnuAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAnalizarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAnalizar);

        mnuGraficar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mnuGraficar.setText("Gráficar");
        mnuGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraficarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuGraficar);

        jMenuItem2.setText("Balanceo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlArbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlArbol.getAccessibleContext().setAccessibleName("panel de pruebas");
        pnlArbol.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAnalizarActionPerformed
        String dato = txtFunc.getText();
        if(dato.length()<3 || dato.equals("-"+dato.charAt(1)+"=;") || dato.equals("-"+dato.charAt(1)+dato.charAt(2)+"=;")){
            showMessageDialog(this,"introduzca una expresión válida");
        }else analiza(dato);
        
    }//GEN-LAST:event_mnuAnalizarActionPerformed

    private void mnuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSaveActionPerformed
        String fn;
        JFileChooser file = new JFileChooser();
        file.showSaveDialog(this);
        fn = file.getSelectedFile().getPath()+".txt";
        try {
            FileWriter fs = new FileWriter(fn);
            fs.write(txtFunc.getText());
            fs.flush();
        } catch(IOException ex) {
            showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_mnuSaveActionPerformed

    private void mnuOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOpenActionPerformed
        String nombreArchivo = "";
        FileDialog selec = new FileDialog(Gui.this, "Elija un archivo para abir", FileDialog.LOAD);
        selec.setVisible(true);
        if(selec.getFile() != null) {
            nombreArchivo = selec.getDirectory()+selec.getFile();
            setTitle(nombreArchivo);
        }
        try {
            BufferedReader leer = new BufferedReader(new FileReader(nombreArchivo));
            StringBuilder sb = new StringBuilder();
            String cad;
            while((cad = leer.readLine()) != null) {
                sb.append(cad + "\n");
                txtFunc.setText(sb.toString());
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            showMessageDialog(this, "Error");
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            showMessageDialog(this, "Error");
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mnuOpenActionPerformed

    private void mnuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewActionPerformed
        pnlArbol.removeAll();
        pnlArbol.repaint();
        setTitle("");
        txtFunc.setText("");
        model.setRowCount(0);
        
    }//GEN-LAST:event_mnuNewActionPerformed

    private void mnuGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraficarActionPerformed
        
        if(model.getRowCount()==0){
        javax.swing.JOptionPane.showMessageDialog(this, "Realice el analisis de expresiones primero");
        return;
        }

        try {
                
                pnlArbol.removeAll();
        Paneles.ArbolString objArbol = new Paneles.ArbolString(); //MODELO
        Lienzo objLienzo = new Lienzo(); //VISTA
        Controlador objControlador = new Controlador(objLienzo, objArbol); //CONTROLADOR
        for(int i=0;i<model.getRowCount();i++){
            System.out.println(tblTokens.getValueAt(i, 0)+"");
            if((tblTokens.getValueAt(i, 0)+"").equals(";")){
                break;
            }
            objArbol.insertar(tblTokens.getValueAt(i, 0)+"");
        }
        objControlador.iniciar();
        pnlArbol.setLayout(new BorderLayout());
        pnlArbol.add(objLienzo);
        pnlArbol.validate();                  

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato: " + e.getMessage(), "Intenta de nuevo...", 0);

        }
    }//GEN-LAST:event_mnuGraficarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        for(int i=0;i<tblTokens.getRowCount();i++){
            if(tblTokens.getValueAt(tblTokens.getRowCount()-1, 0).equals(";")){
                if((tblTokens.getValueAt(i, 1)+"").equals("Operador")){
                try{
                    if((tblTokens.getValueAt(i-1, 1)+"").equals("Identificador") ||(tblTokens.getValueAt(i-1, 1)+"").equals("Float") ){
                        if((tblTokens.getValueAt(i+1, 1)+"").equals("Identificador") ||(tblTokens.getValueAt(i+1, 1)+"").equals("Float") ){
                            
                        }else showMessageDialog(this,"Falta operando");
                    }else showMessageDialog(this,"Falta operando");
                }catch(IndexOutOfBoundsException e){ showMessageDialog(this,"Es correcto");}
            }
            }else break;
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

 

 public void analiza(String cad) {
        model.setRowCount(0);
        Object O[] = new Object[2];
        String pa = "";
        for (int i = 0; i < cad.length(); i++) {
            String car = cad.substring(i, i + 1);
            if(Grafos.esOpe(car) == 2){
                System.out.println(car);
                    try{
                        if(Grafos.esOpe(cad.substring(i-1, i))!=-1){
                            pa+=car;
                            i++;
                            car = cad.substring(i, i + 1);
                        }
                    }catch(IndexOutOfBoundsException e){ 
                        pa+=car;
                        i++;
                        car = cad.substring(i, i + 1);
                    }
                    
            }
            if(car.equals(" ")){
            
            }else{
                if (Grafos.esOpe(car) == -1) {
                    pa += car;
                } else {
                    if(pa.equals("")){
                                O[0] = car;
                                O[1] = "Operador";
                                model.addRow(O);
                    }else{
                    if (Grafos.esIde(pa)) {
                            
                                O[0] = pa;
                            O[1] = "Identificador";
                            model.addRow(O);
                        
                        O[0] = car;
                        O[1] = "Operador";
                        model.addRow(O);
                        pa = "";
                            
                        
                    } else if (Grafos.esFloat(pa)) {
                        O[0] = pa;
                        O[1] = "Float";
                        model.addRow(O);
                        O[0] = car;
                        O[1] = "Operador";
                        model.addRow(O);
                        pa = "";
                    }
                    }
                }
            }
        }
    }
    
//    public void analiza(String cad) {
//    String pal = "";
//    m.setRowCount(0);
//    Object O[] = new Object[2];
//    
//    for (int i = 0; i < cad.length(); i++) {
//        String car = cad.substring(i, i + 1);
//        if (Grafo.esOP(car) == -1) {
//            pal = pal + car;
//        } else {
//        if (Grafo.esIde(pal)) {
//                if (pal.length() > 0) {
//                    O[0] = pal; O[1] = "ide"; m.addRow(O);
//                    O[0] = car; O[1] = "op"; m.addRow(O);
//                    pal = "";
//                }
//            } else if (Grafo.esInt(pal)) {
//                if (pal.length() > 0) {
//                    O[0] = pal; O[1] = "int"; m.addRow(O);
//                    O[0] = car; O[1] = "op"; m.addRow(O);
//                    pal = "";
//                }
//            } else if (Grafo.esFloat(pal)) {
//                if (pal.length() > 1) {
//                    O[0] = pal; O[1] = "float"; m.addRow(O);
//                    O[0] = car; O[1] = "op"; m.addRow(O);
//                    pal = "";
//                }
//            }
//        }
//    }//for
//    m.setRowCount(m.getRowCount()-1);
//}
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
                new Gui().setExtendedState(new Gui().getExtendedState() | Gui.MAXIMIZED_BOTH); 
            }
        });
    }
    private DefaultTableModel model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem mnuAnalizar;
    private javax.swing.JMenuItem mnuGraficar;
    private javax.swing.JMenuItem mnuNew;
    private javax.swing.JMenuItem mnuOpen;
    private javax.swing.JMenuItem mnuSave;
    private javax.swing.JPanel pnlArbol;
    private javax.swing.JTable tblTokens;
    private javax.swing.JTextArea txtFunc;
    // End of variables declaration//GEN-END:variables

}
