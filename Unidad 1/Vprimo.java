
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BrandonUlises
 */
public class Vprimo extends javax.swing.JFrame {

    /**
     * Creates new form Vprimo
     */
    public Vprimo() {
        initComponents();
        modelo=(DefaultTableModel)Vnum.getModel();
        grupoOrden.add(Ascen);
        grupoOrden.add(Desc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoOrden = new javax.swing.ButtonGroup();
        txtX = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Vnum = new javax.swing.JTable();
        TxtY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ascen = new javax.swing.JRadioButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        Desc = new javax.swing.JRadioButton();
        comboNums = new javax.swing.JComboBox<>();
        txtModa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Aceptar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Vnum.setAutoCreateRowSorter(true);
        Vnum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Vnum.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Vnum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Vnum);

        TxtY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtYActionPerformed(evt);
            }
        });

        jLabel1.setText("Tamaño Tabla");

        jLabel2.setText("x");

        grupoOrden.add(Ascen);
        Ascen.setSelected(true);
        Ascen.setText("Ascendente");
        Ascen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AscenMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AscenMousePressed(evt);
            }
        });
        Ascen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AscenActionPerformed(evt);
            }
        });

        jLabel3.setText("Tiempo de Ejecución:");

        txtTime.setText("0 MiliSeg");

        grupoOrden.add(Desc);
        Desc.setText("Descendente");
        Desc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DescMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DescMouseReleased(evt);
            }
        });
        Desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescActionPerformed(evt);
            }
        });

        comboNums.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona La Serie", "Primos", "Fibonacci", "Pares", "Impares", "Azar" }));
        comboNums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNumsActionPerformed(evt);
            }
        });

        txtModa.setText("El numero que mas se repite es: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboNums, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Ascen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Desc)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtY, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jToggleButton1))))
                            .addComponent(txtModa)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTime)))))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboNums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(TxtY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ascen)
                            .addComponent(Desc))
                        .addGap(35, 35, 35)
                        .addComponent(txtModa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTime))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    public int moda(){
      int C[]= new int[TamArreglo];
      for(int i=0;i<TamArreglo;i++)
         for (int k=i+1;k<TamArreglo;k++)
            if(ArrayNumeros[i]==ArrayNumeros[k])C[i]++;
      int pm=0;
      
      for(int i=1;i<TamArreglo;i++)
         if(C[pm]<C[i])pm=i;
      return ArrayNumeros[pm];
   }//Moda
    
    
    
    
    
    

    private void txtXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXActionPerformed

    private void TxtYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtYActionPerformed
    private void ordenDesc(){
        int aux;
     for(int i=0;i<TamArreglo;i++){
         for(int j=i+1;j<TamArreglo; j++){
	    if(ArrayNumeros[i] < ArrayNumeros [j]){
		aux = ArrayNumeros[i];
		ArrayNumeros[i] = ArrayNumeros[j];
		ArrayNumeros[j] = aux;
	    }
	}
    }
    }
    private void ordenAsc(){
        int aux;
     for(int i=0;i<TamArreglo;i++){
         for(int j=i+1;j<TamArreglo; j++){
	    if(ArrayNumeros[i] > ArrayNumeros [j]){
		aux = ArrayNumeros[i];
		ArrayNumeros[i] = ArrayNumeros[j];
		ArrayNumeros[j] = aux;
	    }
	}
    }
    }
    private void ordenes(){
        if(Ascen.isSelected()){
            ordenAsc();
            mostrar();
        }else if(Desc.isSelected()){
            ordenDesc();
            mostrar();
        }
    
    }
    private void mostrar(){
        int a=0;//contador para mostrar Arreglo
         for(int i=0;i<filas;i++){
           for (int f=0;f<columnas;f++){
                         modelo.setValueAt(ArrayNumeros[a], i, f);  
              a++;
           }
       }
      
    }
    
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        long startTime = System.currentTimeMillis();
        try{
            columnas=Integer.parseInt(txtX.getText());
            filas=Integer.parseInt(TxtY.getText());
            modelo.setColumnCount(columnas);
            modelo.setRowCount(filas);
            TamArreglo=columnas*filas;
            System.out.println(TamArreglo);
            Numeros numeros=new Numeros(TamArreglo);
            int op=comboNums.getSelectedIndex();
            ArrayNumeros= Arrays.copyOf(numeros.ArrayInterno(TamArreglo,op),TamArreglo);
            System.out.println(ArrayNumeros.length);
            ordenes();
            mostrar();
        
       long endTime = System.currentTimeMillis() - startTime;
       txtTime.setText(endTime+" Milisegundos");
       txtModa.setText("El numero que mas se repite es: "+moda());
       }catch(NumberFormatException e){
            javax.swing.JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void AscenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AscenMouseClicked
      ordenes();
// TODO add your handling code here:
    }//GEN-LAST:event_AscenMouseClicked

    private void DescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescMouseClicked
    ordenes();
// TODO add your handling code here:
    }//GEN-LAST:event_DescMouseClicked

    private void AscenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AscenMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AscenMousePressed

    private void DescMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DescMouseReleased

    private void AscenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AscenActionPerformed
    }//GEN-LAST:event_AscenActionPerformed

    private void DescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescActionPerformed
    }//GEN-LAST:event_DescActionPerformed

    private void comboNumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNumsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNumsActionPerformed

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
            java.util.logging.Logger.getLogger(Vprimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vprimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vprimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vprimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vprimo().setVisible(true);
            }
        });
    }
    private int columnas=0,filas=0,TamArreglo=0;
    private int[]ArrayNumeros;
    private DefaultTableModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Ascen;
    private javax.swing.JRadioButton Desc;
    private javax.swing.JTextField TxtY;
    private javax.swing.JTable Vnum;
    private javax.swing.JComboBox<String> comboNums;
    private javax.swing.ButtonGroup grupoOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel txtModa;
    private javax.swing.JLabel txtTime;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables
}
