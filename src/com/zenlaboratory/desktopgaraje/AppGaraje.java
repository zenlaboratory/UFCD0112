/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package com.zenlaboratory.desktopgaraje;

/**
 *
 * @author zenlaboratory
 */
public class AppGaraje extends javax.swing.JFrame {

    /**
     * Creates new form AppGaraje
     */
    public AppGaraje() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numeroPlazas = new javax.swing.JLabel();
        campoPlazas = new javax.swing.JTextField();
        botonCrear = new javax.swing.JButton();
        etiquetaPlazas = new javax.swing.JLabel();
        etiquetaNumeroPlazas = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        infoOcupadas = new javax.swing.JTextField();
        infoLibres = new javax.swing.JTextField();
        libres = new javax.swing.JLabel();
        ocupadas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Garaje");

        numeroPlazas.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        numeroPlazas.setText("NÚMERO DE PLAZAS: ");

        campoPlazas.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        campoPlazas.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        botonCrear.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        botonCrear.setText("CREAR");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        etiquetaPlazas.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        etiquetaPlazas.setText("PLAZAS");

        etiquetaNumeroPlazas.setFont(new java.awt.Font("Liberation Sans", 0, 48)); // NOI18N
        etiquetaNumeroPlazas.setForeground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PLAZA", "MATRÍCULA", "MARCA", "MODELO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.setShowGrid(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        infoOcupadas.setBackground(new java.awt.Color(255, 51, 51));
        infoOcupadas.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        infoOcupadas.setForeground(new java.awt.Color(255, 255, 255));
        infoOcupadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        infoOcupadas.setText("OCUPADAS:");
        infoOcupadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoOcupadasActionPerformed(evt);
            }
        });

        infoLibres.setBackground(new java.awt.Color(0, 204, 0));
        infoLibres.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        infoLibres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        infoLibres.setText("LIBRES:");
        infoLibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoLibresActionPerformed(evt);
            }
        });

        libres.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N

        ocupadas.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel1.setText("MATRÍCULA:");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel2.setText("MODELO:");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setText("MARCA:");

        jTextField1.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextField1.setText("jTextField1");

        jTextField2.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextField2.setText("jTextField1");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jTextField3.setText("jTextField1");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/zenlaboratory/desktopgaraje/images/exit.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/zenlaboratory/desktopgaraje/images/parking.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(numeroPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(campoPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(50, 50, 50)
                                            .addComponent(botonCrear))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(53, 53, 53)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(infoLibres)
                                    .addComponent(infoOcupadas, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ocupadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(libres, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(etiquetaPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(etiquetaNumeroPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(343, 343, 343))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1894, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numeroPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(etiquetaPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(etiquetaNumeroPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(infoLibres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(libres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ocupadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoOcupadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );

        numeroPlazas.getAccessibleContext().setAccessibleName("numeroPlazas");
        campoPlazas.getAccessibleContext().setAccessibleName("campoPlazas");
        botonCrear.getAccessibleContext().setAccessibleName("botonCrear");
        jLabel4.getAccessibleContext().setAccessibleName("¡ CITROEN C4 - 8765BBG - APARCADO -");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        // TODO add your handling code here:

        etiquetaNumeroPlazas.setText(campoPlazas.getText());
        botonCrear.setEnabled(false);
        campoPlazas.setEnabled(false);
        libres.setText(campoPlazas.getText());
        ocupadas.setText("0");

    }//GEN-LAST:event_botonCrearActionPerformed

    private void infoLibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoLibresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoLibresActionPerformed

    private void infoOcupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoOcupadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoOcupadasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        jLabel4.setText("¡ CITROEN C4 - 8765BBG - APARCADO !");
        System.out.println("com.zenlaboratory.desktopgaraje.AppGaraje.jButton2ActionPerformed()");
            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AppGaraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGaraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGaraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGaraje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGaraje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField campoPlazas;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JLabel etiquetaNumeroPlazas;
    private javax.swing.JLabel etiquetaPlazas;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JTextField infoLibres;
    private javax.swing.JTextField infoOcupadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel libres;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel numeroPlazas;
    private javax.swing.JLabel ocupadas;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
