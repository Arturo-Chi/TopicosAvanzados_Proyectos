
package com.mycompany.finaltopicos;




import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.TransferHandler;



public class Practica extends javax.swing.JFrame{
    
    private JLabel labelSeleccionado = null;
    private Point posicionInicial = new Point(0,0);
    String seleccionado;
    
    
    
    public Practica() {
       initComponents();
       
    //textField1.addActionListener((e) -> multiplicacion());
    //textField2.addActionListener((e) -> multiplicacion());
     textField1.addActionListener((e) -> {
            textField1.setText("");
            multiplicacion();
        });

        textField2.addActionListener((e) -> {
            textField2.setText("");
            multiplicacion();
        });
    
    
    
    textField1.addFocusListener(new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent e) {
            
            multiplicacion();
        }
    });

    textField2.addFocusListener(new FocusAdapter() {
        @Override
        public void focusLost(FocusEvent e) {
            
            multiplicacion();

        }
    });
    
    label_logo.setIcon(ajustarImage("/imagenes/logoFondo.png", label_logo));
       
       
             
       imgIgual.setIcon( ajustarImage("/imagenes/igual.png", imgIgual));
       imgMultiplicacion.setIcon( ajustarImage("/imagenes/mult.png", imgMultiplicacion));
       this.setLocationRelativeTo(null);
       TransferHandler transfer = new TransferHandler("text");
        label1.setTransferHandler(transfer);
        label2.setTransferHandler(transfer);
        label3.setTransferHandler(transfer);
        label4.setTransferHandler(transfer);
        label5.setTransferHandler(transfer);
        label6.setTransferHandler(transfer);
        label7.setTransferHandler(transfer);
        label8.setTransferHandler(transfer);
        label9.setTransferHandler(transfer);
        label10.setTransferHandler(transfer);
// Repite esto para cada JLabel que necesites
       
       //JLabel [] labels = {label1, label2, label3, label4, label4, label5, label6, label7, label8, label9, label10};
       makeDraggableLabels(label1, label2, label3, label4, label5, label6, label7, label8, label9, label10);
       // makeDroppable(textField1, textField2);
       //btnLimpiar.setRequestFocusEnabled(true);

    }
    
    private void makeDraggableLabels(JLabel... labels) {
    for (JLabel label : labels) {
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                labelSeleccionado = label; 
                
                posicionInicial = e.getPoint();
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                TransferHandler handler = label.getTransferHandler();
                handler.exportAsDrag(label, e, TransferHandler.COPY);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               
                labelSeleccionado = null;
                setCursor(Cursor.getDefaultCursor());
               
            }
        });

        label.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (labelSeleccionado != null) {
                    // Creamos un TransferHandler con el texto del JLabel seleccionado
                    
                    TransferHandler handler = new TransferHandler("text");
                  
                    label.setTransferHandler(handler);
                    handler.exportAsDrag(label, e, TransferHandler.COPY);
                    //handler.exportAsDrag(label1, new MouseEvent(label1, MouseEvent.MOUSE_PRESSED, System.currentTimeMillis(), 0, 0, 0, 1, false));
                }
            }
        });
    }
}
    
    
/*
    private void makeDroppable(JTextField... textFields) {
    for (JTextField textField : textFields) {
        textField.setTransferHandler(new TransferHandler("text") {
            @Override
            public boolean canImport(TransferSupport support) {
                return true;
            }

            @Override
            public boolean importData(TransferSupport support) {
                if (!canImport(support)) {
                    return false;
                }

                if (!support.isDrop()) {
                    return false;
                }

                try {
                    String data = (String) support.getTransferable().getTransferData(DataFlavor.stringFlavor);
                    textField.setText(data);
                    return true;
                } catch (UnsupportedFlavorException | IOException ex) {
                    return false;
                }
            }
        });
    }
}*/
    

    

    public Icon ajustarImage(String direccion, JLabel boton){
        ImageIcon icono = new ImageIcon(getClass().getResource(direccion));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        ImageIcon img = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return img;
    }
    
    private void multiplicacion(){
        int resultado = 1;
        try{
            int numero1 = Integer.parseInt(textField1.getText());
            int numero2 = Integer.parseInt(textField2.getText());
            resultado = numero1*numero2;
            labelRespuesta.setText(String.valueOf(resultado));
        }catch (NumberFormatException ex) {
        }

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCentro = new javax.swing.JPanel();
        imgMultiplicacion = new javax.swing.JLabel();
        imgIgual = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        textField1 = new javax.swing.JTextField();
        textField2 = new javax.swing.JTextField();
        labelRespuesta = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        label_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("¡Construye tu propia multiplicación!");
        setBackground(new java.awt.Color(0, 0, 51));

        jPanel1.setBackground(new java.awt.Color(0, 0, 64));

        panelCentro.setBackground(new java.awt.Color(32, 178, 176));

        imgMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mult.png"))); // NOI18N
        imgMultiplicacion.setText("jLabel3");

        imgIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/igual.png"))); // NOI18N
        imgIgual.setText("jLabel4");

        label1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setText("1");
        label1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label1.setOpaque(true);

        label2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("2");
        label2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label2.setOpaque(true);

        label3.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setText("3");
        label3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label3.setOpaque(true);

        label5.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setText("5");
        label5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label5.setOpaque(true);

        label4.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setText("4");
        label4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label4.setOpaque(true);

        label6.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setText("6");
        label6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label6.setOpaque(true);

        label7.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setText("7");
        label7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label7.setOpaque(true);

        label8.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setText("8");
        label8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label8.setOpaque(true);

        label9.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setText("9");
        label9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label9.setOpaque(true);

        label10.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setText("10");
        label10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        label10.setOpaque(true);

        textField1.setFont(new java.awt.Font("MS Gothic", 1, 150)); // NOI18N
        textField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));
        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });

        textField2.setFont(new java.awt.Font("MS Gothic", 1, 150)); // NOI18N
        textField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 102)));

        labelRespuesta.setFont(new java.awt.Font("MS UI Gothic", 1, 150)); // NOI18N
        labelRespuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRespuesta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        labelRespuesta.setOpaque(true);

        btnLimpiar.setFont(new java.awt.Font("Dubai Light", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentroLayout = new javax.swing.GroupLayout(panelCentro);
        panelCentro.setLayout(panelCentroLayout);
        panelCentroLayout.setHorizontalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentroLayout.createSequentialGroup()
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentroLayout.createSequentialGroup()
                                .addComponent(imgIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 15, Short.MAX_VALUE))
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelCentroLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCentroLayout.setVerticalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentroLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(label2)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(label5))
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(imgMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentroLayout.createSequentialGroup()
                                .addComponent(imgIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label6)
                    .addComponent(label7)
                    .addComponent(label8)
                    .addComponent(label9)
                    .addComponent(label10))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        label_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_logoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        labelRespuesta.setText("");
        textField1.setText("");
        textField2.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void label_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_logoMouseClicked
     this.dispose();
    }//GEN-LAST:event_label_logoMouseClicked

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica().setVisible(true);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel imgIgual;
    private javax.swing.JLabel imgMultiplicacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JLabel label_logo;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    // End of variables declaration//GEN-END:variables

   
}