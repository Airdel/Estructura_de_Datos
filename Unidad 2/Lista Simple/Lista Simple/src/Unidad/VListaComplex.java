/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad;

import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class VListaComplex extends javax.swing.JFrame {

    /**
     * Creates new form VLista
     */
    public VListaComplex() {
        initComponents();
        modelo=(DefaultTableModel)tblList.getModel();
        List=new ListaSimpleRacional();
       tblList.getTableHeader().setVisible(false);
       
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        txtReal = new javax.swing.JTextField();
        btnDat = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtEliminarReal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblSuma = new javax.swing.JLabel();
        lblMayor = new javax.swing.JLabel();
        lblMenor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtImaginario = new javax.swing.JTextField();
        txtEliminarImaginario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblList.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblList.setAlignmentX(0.2F);
        tblList.setAlignmentY(0.1F);
        tblList.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblList.setGridColor(new java.awt.Color(255, 255, 255));
        tblList.setOpaque(false);
        tblList.setRowMargin(0);
        jScrollPane1.setViewportView(tblList);

        txtReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRealActionPerformed(evt);
            }
        });
        txtReal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRealKeyTyped(evt);
            }
        });

        btnDat.setText("Insertar dato");
        btnDat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtEliminarReal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEliminarRealKeyTyped(evt);
            }
        });

        lblSuma.setText("Suma:");

        lblMayor.setText("Mayor:");

        lblMenor.setText("Menor:");

        jLabel1.setText("Num");

        txtImaginario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImaginarioKeyTyped(evt);
            }
        });

        txtEliminarImaginario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEliminarImaginarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtReal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtImaginario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnDat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEliminarReal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEliminarImaginario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminar)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSuma)
                        .addGap(37, 37, 37)
                        .addComponent(lblMayor)
                        .addGap(30, 30, 30)
                        .addComponent(lblMenor)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(txtReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDat)
                    .addComponent(txtEliminarReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtImaginario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEliminarImaginario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuma)
                    .addComponent(lblMayor)
                    .addComponent(lblMenor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tam(){
    try{
        modelo.setColumnCount(List.lengthList()+1);
        modelo.setRowCount(3);
    }
    catch(NumberFormatException e){
        javax.swing.JOptionPane.showMessageDialog(this,e.getMessage());
    }catch(ArrayIndexOutOfBoundsException e){}
    }//para el tamaño
    
    
    private void limpiarTbl(){
        for(int i=0;i<List.lengthList();i++){
            modelo.setValueAt("", 0, 0);
                modelo.setValueAt("", 1, i);
                modelo.setValueAt("", 2, i);
                modelo.setValueAt("", 1, List.lengthList());
            
        }
    }
    
    private void llenarTblV3(){
        //i<=getfin
        String F="Ultimo";
        for(int i=0;i<List.lengthList();i++){
            try {
                modelo.setValueAt("Primero", 0, 0);
                modelo.setValueAt("|"+List.getPos(i)+"|==>", 1, i);
                modelo.setValueAt("Ultimo", 2, List.lengthList()-1);
                modelo.setValueAt("Null", 1, List.lengthList());

                // modelo.setValueAt("Final", 1, cc.getFinal());
                // modelo.setValueAt("Frente", 2, cc.getFrente());
            } catch (Exception ex) {
                Logger.getLogger(VListaComplex.class.getName()).log(Level.SEVERE, null, ex);
            }

            
        }
                        tblList.getColumnModel().getColumn(0).setWidth(1000);

    }
    
    private void btnDatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatActionPerformed
     try{
            
            List.agregar(Float.parseFloat(txtReal.getText()),Float.parseFloat(txtImaginario.getText()));
            tam();
            limpiarTbl();
            //llenarTbl();
            llenarTblV3();
            txtReal.setText("");
            txtImaginario.setText("");
            lblSuma.setText("Suma: "+List.Suma());
            lblMayor.setText("Mayor: "+List.mayor());
            lblMenor.setText("Menor: "+List.menor());
            
        }
        catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,e.getMessage());}
        // TODO add your handling code here:
         
    }//GEN-LAST:event_btnDatActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       limpiarTbl();
        List.eliminar(Float.parseFloat(txtEliminarReal.getText()),Float.parseFloat(txtEliminarImaginario.getText()));
        lblSuma.setText("Suma: "+List.Suma());
            lblMayor.setText("Mayor: "+List.mayor());
            lblMenor.setText("Menor: "+List.menor());
        txtEliminarReal.setText("");
        txtEliminarImaginario.setText("");
       llenarTblV3();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtRealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRealKeyTyped
           char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
         btnDat.doClick();
       }
    }//GEN-LAST:event_txtRealKeyTyped

    private void txtEliminarRealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarRealKeyTyped
       char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
         btnEliminar.doClick();
       }
    }//GEN-LAST:event_txtEliminarRealKeyTyped

    private void txtImaginarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImaginarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImaginarioKeyTyped

    private void txtEliminarImaginarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEliminarImaginarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarImaginarioKeyTyped

    private void txtRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRealActionPerformed

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
            java.util.logging.Logger.getLogger(VListaComplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VListaComplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VListaComplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VListaComplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VListaComplex().setVisible(true);
            }
        });
    }
    private DefaultTableModel modelo;
    public ListaSimpleRacional List;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDat;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMayor;
    private javax.swing.JLabel lblMenor;
    private javax.swing.JLabel lblSuma;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtEliminarImaginario;
    private javax.swing.JTextField txtEliminarReal;
    private javax.swing.JTextField txtImaginario;
    private javax.swing.JTextField txtReal;
    // End of variables declaration//GEN-END:variables
}