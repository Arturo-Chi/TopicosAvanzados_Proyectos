package com.mycompany.finaltopicos;

import java.awt.Image;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class VentanaUsuario extends javax.swing.JFrame {
    private int cont1;
    private Persona user;
    private Reproductor player;
    Lector reader;
    
    public VentanaUsuario(Persona user, Lector reader, Reproductor player) {
        initComponents();
        this.user = user;
        this.reader = reader;
        this.player = player;
        this.setLocationRelativeTo(null);
        this.nombreUsuario.setText(user.getNombre());
        progress1.setValue(actualizarDatos(1));
        progress2.setValue(actualizarDatos(2));
        progress3.setValue(actualizarDatos(3));
        progress4.setValue(actualizarDatos(4));
        progress5.setValue(actualizarDatos(5));
        progress6.setValue(actualizarDatos(6));
        progress7.setValue(actualizarDatos(7));
        progress8.setValue(actualizarDatos(8));
        progress9.setValue(actualizarDatos(9));
        progress10.setValue(actualizarDatos(10));
        tabla5.setIcon(ajustarImage("/imagenes/num5.png", tabla5));
        tabla1.setIcon(ajustarImage("/imagenes/num1.png", tabla1));
        tabla2.setIcon(ajustarImage("/imagenes/num2.png", tabla2));
        tabla3.setIcon(ajustarImage("/imagenes/num3.png", tabla3));
        tabla4.setIcon(ajustarImage("/imagenes/num4.png", tabla4));
        
        
        tabla6.setIcon(ajustarImage("/imagenes/num6.png", tabla6));
        tabla7.setIcon(ajustarImage("/imagenes/num7.png", tabla7));
        tabla8.setIcon(ajustarImage("/imagenes/num8.png", tabla8));
        tabla9.setIcon(ajustarImage("/imagenes/num9.png", tabla9));
        tabla10.setIcon(ajustarImage("/imagenes/num10.png", tabla10));
                 
        
    }
    //reader.getAvances()[tabla-1][i].equals("0");
    public int actualizarDatos(int tabla){
        int contador=0;
        for(int i=0; i< 10; i++){
            if(buscar().getAvances()[tabla-1][i].equals("0")){
               //Si es igual a 0, entonces no se contabiliza
            }else{
                contador+=1;
            }
        }
        return contador;
        
    }
    
    public Persona buscar(){
        Persona aux = null;
        for(Persona p: reader.getLista()){
            if(p.getNombre().equals(user.getNombre())){
                aux = p;
            }
        }
        return aux;
    }
    
    public VentanaUsuario(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreUsuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        progress1 = new javax.swing.JProgressBar();
        progress2 = new javax.swing.JProgressBar();
        progress3 = new javax.swing.JProgressBar();
        progress4 = new javax.swing.JProgressBar();
        progress5 = new javax.swing.JProgressBar();
        progress6 = new javax.swing.JProgressBar();
        progress7 = new javax.swing.JProgressBar();
        progress8 = new javax.swing.JProgressBar();
        progress9 = new javax.swing.JProgressBar();
        progress10 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        btnEliminarCuenta = new javax.swing.JButton();
        tabla1 = new javax.swing.JLabel();
        tabla2 = new javax.swing.JLabel();
        tabla3 = new javax.swing.JLabel();
        tabla4 = new javax.swing.JLabel();
        tabla5 = new javax.swing.JLabel();
        tabla6 = new javax.swing.JLabel();
        tabla7 = new javax.swing.JLabel();
        tabla8 = new javax.swing.JLabel();
        tabla9 = new javax.swing.JLabel();
        tabla10 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Datos de Usuario");

        jPanel1.setBackground(new java.awt.Color(0, 0, 64));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UserProfile.png"))); // NOI18N

        nombreUsuario.setBackground(new java.awt.Color(0, 102, 102));
        nombreUsuario.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setText("User_name");
        nombreUsuario.setOpaque(true);

        progress1.setForeground(new java.awt.Color(146, 208, 80));
        progress1.setMaximum(10);

        progress2.setForeground(new java.awt.Color(233, 113, 50));
        progress2.setMaximum(10);

        progress3.setForeground(new java.awt.Color(0, 176, 240));
        progress3.setMaximum(10);

        progress4.setForeground(new java.awt.Color(255, 192, 0));
        progress4.setMaximum(10);

        progress5.setForeground(new java.awt.Color(160, 43, 147));
        progress5.setMaximum(10);

        progress6.setForeground(new java.awt.Color(192, 0, 0));
        progress6.setMaximum(10);

        progress7.setForeground(new java.awt.Color(217, 217, 217));
        progress7.setMaximum(10);

        progress8.setForeground(new java.awt.Color(158, 53, 14));
        progress8.setMaximum(10);

        progress9.setForeground(new java.awt.Color(22, 62, 100));
        progress9.setMaximum(10);

        progress10.setForeground(new java.awt.Color(25, 107, 36));
        progress10.setMaximum(10);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 204));
        jLabel2.setText("- AVANCES -");

        btnEliminarCuenta.setBackground(new java.awt.Color(51, 51, 51));
        btnEliminarCuenta.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setText("Eliminar Cuenta");
        btnEliminarCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarCuenta.setBorderPainted(false);
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        tabla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num2.png"))); // NOI18N

        tabla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num3.png"))); // NOI18N

        tabla3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num4.png"))); // NOI18N

        tabla4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num5.png"))); // NOI18N

        tabla5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num1.png"))); // NOI18N

        tabla6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num6.png"))); // NOI18N

        tabla7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num9.png"))); // NOI18N

        tabla8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num8.png"))); // NOI18N

        tabla9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num9.png"))); // NOI18N

        tabla10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num10.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tabla4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tabla5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(77, 77, 77)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tabla8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tabla9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tabla10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tabla7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tabla6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(progress9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel2)))))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarCuenta))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tabla6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(progress6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tabla7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(progress2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tabla2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tabla8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tabla9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(progress9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(progress3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tabla3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(progress4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tabla4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(progress7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(progress5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tabla5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(progress10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tabla10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(progress1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        String nombreUsuario = user.getNombre();
        Iterator<Persona> iter = reader.getLista().iterator();
        while (iter.hasNext()) {
            Persona p = iter.next();
            if (p.getNombre().equals(nombreUsuario)) {
                iter.remove();
                break;
            }
        }
        dispose();
        this.player.getClip().stop();
        new VentanaInicio().setVisible(true);
        new Cliente().enviarAlServidor(reader.listaAJson());

    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaUsuario().setVisible(true);
            }
        });
    }
    
    
    public Icon ajustarImage(String direccion, JLabel boton){
        ImageIcon icono = new ImageIcon(getClass().getResource(direccion));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        ImageIcon img = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return img;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreUsuario;
    private javax.swing.JProgressBar progress1;
    private javax.swing.JProgressBar progress10;
    private javax.swing.JProgressBar progress2;
    private javax.swing.JProgressBar progress3;
    private javax.swing.JProgressBar progress4;
    private javax.swing.JProgressBar progress5;
    private javax.swing.JProgressBar progress6;
    private javax.swing.JProgressBar progress7;
    private javax.swing.JProgressBar progress8;
    private javax.swing.JProgressBar progress9;
    private javax.swing.JLabel tabla1;
    private javax.swing.JLabel tabla10;
    private javax.swing.JLabel tabla2;
    private javax.swing.JLabel tabla3;
    private javax.swing.JLabel tabla4;
    private javax.swing.JLabel tabla5;
    private javax.swing.JLabel tabla6;
    private javax.swing.JLabel tabla7;
    private javax.swing.JLabel tabla8;
    private javax.swing.JLabel tabla9;
    // End of variables declaration//GEN-END:variables

    
}
