package com.mycompany.finaltopicos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class VentanaInicio extends javax.swing.JFrame {
    
    Persona usuario;
   
   
    public VentanaInicio() {
        initComponents();
        labelReintento.setVisible(false);
        jLabel1.setIcon(ajustarImage("/imagenes/logoInicio.png",jLabel1));
        textNombre.setHorizontalAlignment(SwingConstants.CENTER);
        textNombre.addActionListener(e -> {
            btnAceptar.doClick();
        });
        this.setLocationRelativeTo(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        labelReintento = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MultiMaster");
        setSize(new java.awt.Dimension(1218, 664));

        jPanel1.setBackground(new java.awt.Color(27, 26, 50));
        jPanel1.setName("panelInicio"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoInicio.png"))); // NOI18N
        jLabel1.setName("labelLogoInicio"); // NOI18N

        textNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        textNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textNombre.setName("textInicio"); // NOI18N

        btnAceptar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setName("btnAceptar"); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        labelReintento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelReintento.setForeground(new java.awt.Color(255, 51, 51));
        labelReintento.setText("Introduce un nombre válido");
        labelReintento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese su nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(labelReintento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 165, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelReintento)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String nombreEntrada = textNombre.getText();
        Lector reader = new Lector();
        Cliente cliente = new Cliente();
        reader.jsonALista(cliente.getLista());
        
        if(!nombreEntrada.equals("")){
               usuario = new Persona(nombreEntrada);
               boolean usuarioExistente = false;
               
               for(Persona auxiliar: reader.getLista()){
                   if(auxiliar.getNombre().equals(usuario.getNombre())){
                       usuario = auxiliar;
                       usuarioExistente = true;
                       break;
                   }
               }
               
               if(!usuarioExistente){
                   for(int i=0; i < 10; i++){
                       for(int j = 0; j < 10; j++){
                           usuario.getAvances()[i][j] = "0";
                       }
                   }
                   reader.getLista().add(usuario);
               }
               cliente.enviarAlServidor(reader.listaAJson());
               
            VentanaMenu menu = new VentanaMenu(usuario, cliente, reader);
            this.dispose();
       
            menu.setVisible(true);labelReintento.setVisible(false);       
               
        }else{
            labelReintento.setVisible(true);
            
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicio().setVisible(true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelReintento;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
