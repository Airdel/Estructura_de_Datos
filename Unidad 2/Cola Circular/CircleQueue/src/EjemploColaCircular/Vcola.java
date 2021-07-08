
package EjemploColaCircular;

import java.awt.event.KeyEvent;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class Vcola extends javax.swing.JFrame {

    
    public Vcola() {
        initComponents();
         modelo=(DefaultTableModel)tblCC.getModel();
        txtTam.requestFocus();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTam = new javax.swing.JButton();
        txtTam = new javax.swing.JTextField();
        btnS = new javax.swing.JButton();
        btnNums = new javax.swing.JButton();
        txtNum = new javax.swing.JTextField();
        btnSAll = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCC = new javax.swing.JTable();
        txtInicio = new javax.swing.JTextField();
        txtFin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtLoc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTam.setText("Tam");
        btnTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTamActionPerformed(evt);
            }
        });

        txtTam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamKeyTyped(evt);
            }
        });

        btnS.setText("Sacar");
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        btnNums.setText("Ingresar");
        btnNums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNumsActionPerformed(evt);
            }
        });

        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumKeyTyped(evt);
            }
        });

        btnSAll.setText("Sacar Todos");
        btnSAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAllActionPerformed(evt);
            }
        });

        tblCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblCC);

        jButton1.setText("Localizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNums)
                                .addGap(24, 24, 24)
                                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnS))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(btnSAll)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTam)
                    .addComponent(txtTam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNums)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnS)
                                .addComponent(btnSAll)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
        private void tam(){
    try{
        tamTabla=Integer.parseInt(txtTam.getText());
        cc=new ColaCircular(tamTabla);
        modelo.setColumnCount(tamTabla);
        modelo.setRowCount(3);
    }
    catch(NumberFormatException e){
        javax.swing.JOptionPane.showMessageDialog(this,e.getMessage());
    }catch(ArrayIndexOutOfBoundsException e){}
    
    
    }
    private void btnTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTamActionPerformed
        tam();
        
    }//GEN-LAST:event_btnTamActionPerformed

    private void llenarTbl(){
        //i<=getfin
        for(int i=0;i<(tamTabla);i++){
            modelo.setValueAt(cc.mostrar()[i], 0, i);
            modelo.setValueAt("Final", 1, cc.getFinal());
            modelo.setValueAt("Frente", 2, cc.getFrente());

            
        }
    }
    private void btnNumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNumsActionPerformed
        try{
            limpiarTbl();
            cc.Insertar(Integer.parseInt(txtNum.getText()));
            txtInicio.setText(cc.getFrente()+"");
            txtFin.setText(cc.getFinal()+"");
            llenarTbl();
            //llenarTbl();
            txtNum.setText("");
        }
        catch(NumberFormatException e){
            llenarTbl();
            javax.swing.JOptionPane.showMessageDialog(this,e.getMessage());}                    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNumsActionPerformed
   
    private void limpiarTbl(){
        for(int i=0;i<tamTabla;i++){
            modelo.setValueAt(" ", 0, i);
            modelo.setValueAt(" ", 1, i);
            modelo.setValueAt(" ", 2, i);

        }
    }
    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        limpiarTbl();
        cc.Retirar();
        txtInicio.setText(cc.getFrente()+"");
        txtFin.setText(cc.getFinal()+"");
        llenarTbl();        

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSActionPerformed

    private void txtTamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamKeyTyped
         char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            btnTam.doClick();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamKeyTyped

    private void txtNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyTyped
         char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            btnNums.doClick();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumKeyTyped

    private void btnSAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAllActionPerformed
        limpiarTbl();
        cc.RetirarAll();
        txtInicio.setText(cc.getFrente()+"");
        txtFin.setText(cc.getFinal()+"");
        //llenarTbl(); 

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(cc.existe(Integer.parseInt(txtLoc.getText()))){showMessageDialog(this,"Se encuntra ");}
      else{showMessageDialog(this,"No se encuntra ");}
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Vcola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vcola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vcola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vcola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vcola().setVisible(true);
            }
        });
    }
    
    public ColaCircular cc;
    private int tamTabla;
    private DefaultTableModel modelo;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNums;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSAll;
    private javax.swing.JButton btnTam;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCC;
    private javax.swing.JTextField txtFin;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtTam;
    // End of variables declaration//GEN-END:variables
}
