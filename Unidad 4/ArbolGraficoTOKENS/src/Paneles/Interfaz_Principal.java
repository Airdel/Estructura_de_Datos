
package Paneles;

import LienzoArbol.Controlador;
import LienzoArbol.Lienzo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultEditorKit;
import javax.swing.undo.UndoManager;

public class Interfaz_Principal extends javax.swing.JFrame {
    private FileNameExtensionFilter filtro = new FileNameExtensionFilter(("Archivos txt"),"txt");
    
    public Interfaz_Principal() {
        initComponents();
        model = (DefaultTableModel) tblToken.getModel();
        this.setLocationRelativeTo(null);
        this.setTitle("Arbol de Expresion");
        mnuCut.addActionListener(new DefaultEditorKit.CutAction());
        mnuCopy.addActionListener(new DefaultEditorKit.CopyAction());
        mnuPaste.addActionListener(new DefaultEditorKit.PasteAction());
        iniMnu();
    }
    
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
    
    public File saveTbl() {
        File f = new File("Hi.txt");
        try {
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < tblToken.getRowCount(); i++) {
                for (int k = 0; k < tblToken.getColumnCount(); k++) {
                    bw.write((String) tblToken.getValueAt(i, k) + " ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
            return f;
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
        public void actLis() {
        txtEditor.getDocument().addUndoableEditListener(
                new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                editManager.addEdit(e.getEdit());
            }
        });
    }
    
        public void iniMnu() {
        if (editManager.canRedo()) {
            mnuRedo.setEnabled(true);
        } else {
            mnuRedo.setEnabled(false);
        }
        if (editManager.canUndo()) {
            mnuUndo.setEnabled(true);
        } else {
            mnuUndo.setEnabled(false);
        }
        if (txtEditor.getSelectedText() == null) {
            mnuCut.setEnabled(false);
            mnuCopy.setEnabled(false);
            mnuDelete.setEnabled(false);
        } else {
            mnuCut.setEnabled(true);
            mnuCopy.setEnabled(true);
            mnuDelete.setEnabled(true);
        }
    }
        
       public void readTbl(File f) {
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            Object[] line = br.lines().toArray();
            for (int i = 0; i < line.length; i++) {
                String[] row = line[i].toString().split(" ");
                model.addRow(row);
            }
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
        public static void selectTxt() {
        if(txtEditor.getText().indexOf(Interfaz_Remplazar.txtFind.getText())==-1){
            return;
        }
        txtEditor.requestFocus();
        txtEditor.setSelectionStart(txtEditor.getText().indexOf(Interfaz_Remplazar.txtFind.getText(), globfin));
        txtEditor.setSelectionEnd(txtEditor.getText().indexOf(Interfaz_Remplazar.txtFind.getText(), globfin) + Interfaz_Remplazar.txtFind.getText().length());
    }

    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuItem14 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        pnlArbol = new javax.swing.JPanel();
        btnAnalizar = new javax.swing.JButton();
        btnArbol = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEditor = new javax.swing.JTextArea();
        btnAAR = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnu = new javax.swing.JMenu();
        mnuNew = new javax.swing.JMenuItem();
        mnuAbrir = new javax.swing.JMenuItem();
        mnuGuardar = new javax.swing.JMenuItem();
        mnuGuardarC = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuUndo = new javax.swing.JMenuItem();
        mnuRedo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuCut = new javax.swing.JMenuItem();
        mnuCopy = new javax.swing.JMenuItem();
        mnuPaste = new javax.swing.JMenuItem();
        mnuDelete = new javax.swing.JMenuItem();
        mnuSAll = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuFind = new javax.swing.JMenuItem();
        mnuRemplazar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu8.setText("jMenu8");

        jMenu9.setText("jMenu9");

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnlArbol.setBackground(new java.awt.Color(255, 255, 255));
        pnlArbol.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 3, true), "Arbol Sintactico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 102, 153))); // NOI18N

        javax.swing.GroupLayout pnlArbolLayout = new javax.swing.GroupLayout(pnlArbol);
        pnlArbol.setLayout(pnlArbolLayout);
        pnlArbolLayout.setHorizontalGroup(
            pnlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        pnlArbolLayout.setVerticalGroup(
            pnlArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonAnalizar.png"))); // NOI18N
        btnAnalizar.setBorder(null);
        btnAnalizar.setBorderPainted(false);
        btnAnalizar.setContentAreaFilled(false);
        btnAnalizar.setFocusable(false);
        btnAnalizar.setRequestFocusEnabled(false);
        btnAnalizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAnalizarON.png"))); // NOI18N
        btnAnalizar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAnalizarON.png"))); // NOI18N
        btnAnalizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAnalizarON.png"))); // NOI18N
        btnAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarActionPerformed(evt);
            }
        });

        btnArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArbolOFF.png"))); // NOI18N
        btnArbol.setBorder(null);
        btnArbol.setBorderPainted(false);
        btnArbol.setContentAreaFilled(false);
        btnArbol.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArbolON.png"))); // NOI18N
        btnArbol.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArbolON.png"))); // NOI18N
        btnArbol.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArbolON.png"))); // NOI18N
        btnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolActionPerformed(evt);
            }
        });

        txtEditor.setColumns(20);
        txtEditor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEditor.setRows(5);
        txtEditor.setText("juan/pepe-total=precio+precio*0.16;");
        txtEditor.setAutoscrolls(false);
        txtEditor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 87, 34), 3));
        txtEditor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtEditorMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(txtEditor);

        btnAAR.setText("jButton1");
        btnAAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnalizar)
                        .addGap(13, 13, 13)
                        .addComponent(btnArbol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAAR)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnalizar)
                    .addComponent(btnArbol)
                    .addComponent(btnAAR))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addGap(280, 280, 280))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(pnlArbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jMenuBar1.setBackground(new java.awt.Color(43, 137, 224));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFocusable(false);
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setRequestFocusEnabled(false);

        mnu.setBackground(new java.awt.Color(43, 137, 224));
        mnu.setForeground(new java.awt.Color(255, 255, 255));
        mnu.setText("  Archivo");
        mnu.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        mnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuActionPerformed(evt);
            }
        });

        mnuNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnuNew.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArchicoIMG/add-file.png"))); // NOI18N
        mnuNew.setText("Nuevo");
        mnuNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuNewActionPerformed(evt);
            }
        });
        mnu.add(mnuNew);

        mnuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnuAbrir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArchicoIMG/Open-folder-search-icon.png"))); // NOI18N
        mnuAbrir.setText("Abrir");
        mnuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAbrirActionPerformed(evt);
            }
        });
        mnu.add(mnuAbrir);

        mnuGuardar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArchicoIMG/Save_37110.png"))); // NOI18N
        mnuGuardar.setText("Guardar");
        mnuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarActionPerformed(evt);
            }
        });
        mnu.add(mnuGuardar);

        mnuGuardarC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuGuardarC.setText("Guardar Como");
        mnuGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGuardarCActionPerformed(evt);
            }
        });
        mnu.add(mnuGuardarC);
        mnu.add(jSeparator2);

        mnuExit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuExit.setText("Salir");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnu.add(mnuExit);

        jMenuBar1.add(mnu);

        jMenu2.setBackground(new java.awt.Color(43, 137, 224));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Editar");
        jMenu2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N

        mnuUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        mnuUndo.setText("Undo");
        mnuUndo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUndoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuUndo);

        mnuRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        mnuRedo.setText("Redo");
        mnuRedo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRedoActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRedo);
        jMenu2.add(jSeparator3);

        mnuCut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnuCut.setText("Cut");
        jMenu2.add(mnuCut);

        mnuCopy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuCopy.setText("Copy");
        jMenu2.add(mnuCopy);

        mnuPaste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        mnuPaste.setText("Paste");
        jMenu2.add(mnuPaste);

        mnuDelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        mnuDelete.setText("Delete");
        jMenu2.add(mnuDelete);

        mnuSAll.setText("Select All");
        mnuSAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSAllActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSAll);
        jMenu2.add(jSeparator5);

        mnuFind.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        mnuFind.setText("Find");
        jMenu2.add(mnuFind);

        mnuRemplazar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mnuRemplazar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mnuRemplazar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ArchicoIMG/Other-Power-Switch-User-Metro-icon.png"))); // NOI18N
        mnuRemplazar.setText("Remplazar");
        mnuRemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRemplazarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRemplazar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarActionPerformed
        analiza((txtEditor.getText()).trim());
    }//GEN-LAST:event_btnAnalizarActionPerformed

    private void btnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolActionPerformed
            if(model.getRowCount()==0){
            javax.swing.JOptionPane.showMessageDialog(this, "Analize su exprecion primero");
            return;
        }
        pnlArbol.removeAll();
        ArbolString objArbol = new ArbolString(); //MODELO
        Lienzo objLienzo = new Lienzo(); //VISTA
        Controlador objControlador = new Controlador(objLienzo, objArbol); //CONTROLADOR
        for(int i=0;i<model.getRowCount();i++){
            System.out.println(tblToken.getValueAt(i, 0)+"");
            if((tblToken.getValueAt(i, 0)+"").equals(";")){
                break;
            }
            objArbol.insertar(tblToken.getValueAt(i, 0)+"");
        }
        objControlador.iniciar();
        pnlArbol.setLayout(new BorderLayout());
        pnlArbol.add(objLienzo);
        pnlArbol.validate();
    }//GEN-LAST:event_btnArbolActionPerformed

    private void mnuRemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRemplazarActionPerformed
        Interfaz_Remplazar rem=new Interfaz_Remplazar();
        rem.setVisible(true);
    }//GEN-LAST:event_mnuRemplazarActionPerformed

    private void txtEditorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEditorMouseReleased
               iniMnu();
        if (SwingUtilities.isRightMouseButton(evt)) {
            JPopupMenu popup = new JPopupMenu();
            popup.add(new JMenuItem("Undo")).setModel(mnuUndo.getModel());
            popup.add(new JMenuItem("Redo")).setModel(mnuRedo.getModel());
            popup.add(new JPopupMenu.Separator());
            popup.add(new JMenuItem("Cut")).setModel(mnuCut.getModel());
            popup.add(new JMenuItem("Copy")).setModel(mnuCopy.getModel());
            popup.add(new JMenuItem("Paste")).setModel(mnuPaste.getModel());
            popup.add(new JMenuItem("Delete")).setModel(mnuDelete.getModel());
            popup.add(new JMenuItem("Select All")).setModel(mnuSAll.getModel());
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_txtEditorMouseReleased

    private void mnuRedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRedoActionPerformed
        if (editManager.canRedo()) {
            editManager.redo();
        }      
    }//GEN-LAST:event_mnuRedoActionPerformed

    private void mnuNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuNewActionPerformed
        pnlArbol.removeAll();
        pnlArbol.repaint();
        model.setRowCount(0);
        txtEditor.setText("");
        
    }//GEN-LAST:event_mnuNewActionPerformed

    private void mnuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAbrirActionPerformed
                BufferedReader br=null;
        String texto="",linea,ruta="";
        
        try{
            /*
            Abrir explorador de archivos para seleccionar
            alguno
            */
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(filtro);
            int opcion=fc.showOpenDialog(this);
            if(opcion ==JFileChooser.APPROVE_OPTION){
                ruta=fc.getSelectedFile().toString();
            }
            /*
            Leer el archivo txt linea por linea
            */
            br = new BufferedReader(new FileReader(ruta));
            while((linea=br.readLine())!=null){
               txtEditor.setText(texto+=linea+"\n");   
            }
            this.setTitle(fc.getSelectedFile().getName());
            br.close();
        }catch(IOException ex){   
        }
        btnAnalizar.doClick();
        btnArbol.doClick();
    }//GEN-LAST:event_mnuAbrirActionPerformed
    
    private void guardar(){
        /* File f = new File(this.getTitle());
        System.out.println(f.exists());
        if (!f.exists()) {
        mnuGuardarC.doClick();
        return;
        }
        try {
        FileOutputStream fichero = new FileOutputStream(this.getTitle());
        ObjectOutputStream oos = new ObjectOutputStream(fichero);
        oos.writeObject(txtEditor.getText());
        oos.writeObject(saveTbl());
        oos.close();
        } catch (FileNotFoundException ex) {
        Logger.getLogger(Interfaz_Principal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
        Logger.getLogger(Interfaz_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        /* File f = new File(this.getTitle());
        if (!f.exists()) {
        mnuGuardarC.doClick();
        return;
        }*/
        if(nameFile.equals("")){
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de texto",".txt");
        chooser.setFileFilter(filter);
        if(chooser.showSaveDialog(this)==0){
        nameFile=chooser.getSelectedFile().getPath()+".txt";
        }
        try {
        java.io.FileWriter fw=new java.io.FileWriter(nameFile);
        String texto=txtEditor.getText().replace("\n","\r\n");
        fw.write(texto);
        fw.flush();
        } catch (FileNotFoundException ex) {
        
        } catch (IOException ex) {
        
        }
        
        }//if namesFile="";
        else{
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivo de texto","txt");
        chooser.setFileFilter(filter);
        try {
        java.io.FileOutputStream fs=new java.io.FileOutputStream(nameFile);
        byte b[]=txtEditor.getText().replace("\n","\r\n").getBytes();
        fs.write(b);
        fs.flush();
        } catch (FileNotFoundException ex) {
        
        } catch (IOException ex) {
        
        }
        }
    }
    
    private void mnuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarActionPerformed
       guardar();
    }//GEN-LAST:event_mnuGuardarActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        int au=showConfirmDialog(this,"¿Seguro que desea salir?");
        if(au==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_mnuExitActionPerformed
    
    public void cerrar(){
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION){
        System.exit(0);
        }else{}
}
    
    private void mnuUndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUndoActionPerformed
        if (editManager.canUndo()) {
            editManager.undo();
        }
    }//GEN-LAST:event_mnuUndoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void mnuSAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSAllActionPerformed
        txtEditor.selectAll();
    }//GEN-LAST:event_mnuSAllActionPerformed

    private void mnuGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGuardarCActionPerformed
        JFileChooser fc = new JFileChooser();
        int seleccion = fc.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                nameFile=fc.getSelectedFile().getPath()+".txt";
                java.io.FileWriter fw=new java.io.FileWriter(nameFile);
                String texto=txtEditor.getText().replace("\n","\r\n");
                fw.write(texto);
                fw.flush();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Interfaz_Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_mnuGuardarCActionPerformed

    private void mnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuActionPerformed

    private void btnAARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAARActionPerformed
        for(int i=0;i<tblToken.getRowCount();i++){
            if(tblToken.getValueAt(tblToken.getRowCount()-1, 0).equals(";")){
                if((tblToken.getValueAt(i, 1)+"").equals("Operador")){
                try{
                    if((tblToken.getValueAt(i-1, 1)+"").equals("Identificador")){
                        if((tblToken.getValueAt(i+1, 1)+"").equals("Identificador")){
                            
                        }else showMessageDialog(this,"Falta operando");
                    }else showMessageDialog(this,"Falta operando");
                }catch(IndexOutOfBoundsException e){ showMessageDialog(this,"Falta operando");}
            }
            }else break;
        }
    }//GEN-LAST:event_btnAARActionPerformed
    
    
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }
                new Interfaz_Principal().setVisible(true);
                
            }
        });
    }
    private String nameFile="";
    private DefaultTableModel model;
    private static int globfin = 0;
    final UndoManager editManager = new UndoManager();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAAR;
    private javax.swing.JButton btnAnalizar;
    private javax.swing.JButton btnArbol;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    public static javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem14;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu mnu;
    private javax.swing.JMenuItem mnuAbrir;
    private javax.swing.JMenuItem mnuCopy;
    private javax.swing.JMenuItem mnuCut;
    private javax.swing.JMenuItem mnuDelete;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFind;
    private javax.swing.JMenuItem mnuGuardar;
    private javax.swing.JMenuItem mnuGuardarC;
    private javax.swing.JMenuItem mnuNew;
    private javax.swing.JMenuItem mnuPaste;
    private javax.swing.JMenuItem mnuRedo;
    private javax.swing.JMenuItem mnuRemplazar;
    private javax.swing.JMenuItem mnuSAll;
    private javax.swing.JMenuItem mnuUndo;
    private javax.swing.JPanel pnlArbol;
    public static javax.swing.JTextArea txtEditor;
    // End of variables declaration//GEN-END:variables
}
