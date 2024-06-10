package com.mycompany.finaltopicos;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class FormOperaciones extends javax.swing.JFrame {
    private int n1;
    private int n2;
    private int constante;
    private ArrayList<String> problemasgenerados = new ArrayList<String>();
    private String claveProblema ="";
    private int problemasResueltos = 0;
    private Persona usuario;
    private Lector lector;
    private Cliente cliente;

    public FormOperaciones(Lector lector, Cliente cliente, Persona usuario,int numero, String name) {
        initComponents();
        //textSolucion.Select();
        ProgressBar_avance.setMaximum(10);
        textEstatico.setText(String.valueOf(numero));
        textEstatico.setHorizontalAlignment(SwingConstants.CENTER);
        textEstatico.addMouseListener(new MouseAdapter(){
        public void mouseEntered(MouseEvent e){
            textEstatico.setForeground(Color.YELLOW);
        }});
        
        textAleatorio.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent e){
        textAleatorio.setForeground(Color.YELLOW);
        }});
        btnAyuda.setIcon(ajustarImage("/imagenes/ayuda.png", btnAyuda));
        this.setTitle(name);
        this.usuario = usuario;
        this.cliente = cliente;
        this.lector = lector;
        n1 = numero;
        
       
        //generarProblema();
        
        constante = numero;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        imgMultiplicacion.setIcon(ajustarImage("/imagenes/mult.png", imgMultiplicacion));
        imgIgual.setIcon(ajustarImage("/imagenes/igual.png", imgIgual));
        Back_logo.setIcon(ajustarImage("/imagenes/logoFondo.png", Back_logo));
        textSolucion.setHorizontalAlignment(SwingConstants.CENTER);
        
        textSolucion.addActionListener(e -> {
            btnValidar.doClick();
        });
        
        generarProblema();
         actualizarImagenes();
        textSolucion.requestFocus();
    }
    
    public FormOperaciones(){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
       
    public void generarProblema(){
        Random r = new Random();
        while(problemasgenerados. size() < 10){
            int numeroR = r.nextInt(1,11);
            n2 = numeroR;
            claveProblema = String.format("%d x %d", constante, numeroR);
            if(!problemasgenerados.contains(claveProblema)|| !isRegistrado(claveProblema)){
                problemasgenerados.add(claveProblema);
                textAleatorio.setText(String.valueOf(numeroR));
                textAleatorio.setHorizontalAlignment(SwingConstants.CENTER);
                textSolucion.setText("");
                break;
            }
        }
        textSolucion.requestFocus();
    }
    
    public boolean isRegistrado(String clave){
        for (int i = 0; i < 10; i++) {
            if(usuario.getAvances()[n1-1][i].equals(clave)){
                return true;
            }
        }
        return false;
    }
    
    public void comprobarRespuesta(){
        try{
            int solucionUser = Integer.parseInt(textSolucion.getText());
            int solucionReal = n1*n2;
            
            if(solucionUser == solucionReal){
                problemasResueltos++;
                ProgressBar_avance.setValue(problemasResueltos);
                                
                //registro de los avances del usuario
                usuario.getAvances()[constante-1][problemasResueltos-1] = claveProblema;
                //new LectorFichero().saveFile();
                this.cliente.enviarAlServidor(lector.listaAJson());
                if(problemasResueltos<10){
                    generarProblema();
                    
                }else{
                    Reproductor r = new Reproductor();
                    r.reproducirEfecto("/samples/yay.wav");
                    JOptionPane.showMessageDialog(null, "¡Terminaste la tabla del "+constante+"!", "Información", JOptionPane.INFORMATION_MESSAGE);                    
                    
                    dispose();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Inténtalo otra vez", "Error", JOptionPane.ERROR_MESSAGE);
                textSolucion.setText("");
                textSolucion.requestFocus();
            }
        }catch(NumberFormatException ne){
                JOptionPane.showMessageDialog(null, "Introduce un número válido");
                textSolucion.setText("");
                textSolucion.requestFocus();
        }
    }
    private void actualizarImagenes() {
        String nombreImagen = "t" + textEstatico.getText() + "_" + textAleatorio.getText() + ".png";
        String rutaCarpeta = "Tabla_" + constante; 
        System.out.println(nombreImagen);
        String rutaImagen = "/home/davideuanp/Escritorio/FinalTopicos/FinalTopicos/src/main/resources/imagenes/" + rutaCarpeta +"/"+ nombreImagen;
        ImageIcon imagen = new ImageIcon(new File(rutaImagen).getAbsolutePath());
        imagen = new ImageIcon(imagen.getImage().getScaledInstance(Label_Imagen.getWidth(), Label_Imagen.getHeight(), Image.SCALE_DEFAULT));

        Label_Imagen.setIcon(imagen);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentro = new javax.swing.JPanel();
        textSolucion = new javax.swing.JTextField();
        imgMultiplicacion = new javax.swing.JLabel();
        imgIgual = new javax.swing.JLabel();
        btnValidar = new javax.swing.JButton();
        textAleatorio = new javax.swing.JTextField();
        textEstatico = new javax.swing.JTextField();
        Label_Imagen = new javax.swing.JLabel();
        panelNorte = new javax.swing.JPanel();
        Back_logo = new javax.swing.JLabel();
        btnAyuda = new javax.swing.JLabel();
        ProgressBar_avance = new javax.swing.JProgressBar();
        panelSur = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelCentro.setBackground(new java.awt.Color(255, 165, 0));
        panelCentro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textSolucion.setBackground(new java.awt.Color(255, 165, 0));
        textSolucion.setFont(new java.awt.Font("MS UI Gothic", 1, 150)); // NOI18N
        textSolucion.setForeground(new java.awt.Color(0, 0, 64));
        textSolucion.setBorder(null);
        panelCentro.add(textSolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 200, 235));

        imgMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mult.png"))); // NOI18N
        imgMultiplicacion.setText("jLabel3");
        panelCentro.add(imgMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 80, 80));

        imgIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/igual.png"))); // NOI18N
        imgIgual.setText("jLabel4");
        panelCentro.add(imgIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 110, 110));

        btnValidar.setBackground(new java.awt.Color(0, 0, 64));
        btnValidar.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setText("Validar");
        btnValidar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        panelCentro.add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 540, 110, 40));

        textAleatorio.setEditable(false);
        textAleatorio.setBackground(new java.awt.Color(255, 165, 0));
        textAleatorio.setFont(new java.awt.Font("MS UI Gothic", 1, 130)); // NOI18N
        textAleatorio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textAleatorio.setBorder(null);
        textAleatorio.setPreferredSize(new java.awt.Dimension(276, 257));
        panelCentro.add(textAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 160, 150));

        textEstatico.setEditable(false);
        textEstatico.setBackground(new java.awt.Color(255, 165, 0));
        textEstatico.setFont(new java.awt.Font("MS UI Gothic", 1, 130)); // NOI18N
        textEstatico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEstatico.setBorder(null);
        textEstatico.setPreferredSize(new java.awt.Dimension(276, 257));
        panelCentro.add(textEstatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 150));
        panelCentro.add(Label_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 730, 370));

        panelNorte.setBackground(new java.awt.Color(0, 0, 64));

        Back_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back_logoMouseClicked(evt);
            }
        });

        btnAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAyudaMouseClicked(evt);
            }
        });

        ProgressBar_avance.setForeground(new java.awt.Color(153, 153, 0));
        ProgressBar_avance.setMaximum(10);
        ProgressBar_avance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ProgressBar_avance.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelNorteLayout = new javax.swing.GroupLayout(panelNorte);
        panelNorte.setLayout(panelNorteLayout);
        panelNorteLayout.setHorizontalGroup(
            panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNorteLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(Back_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ProgressBar_avance, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        panelNorteLayout.setVerticalGroup(
            panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNorteLayout.createSequentialGroup()
                .addComponent(Back_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelNorteLayout.createSequentialGroup()
                .addGroup(panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNorteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelNorteLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ProgressBar_avance, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSur.setBackground(new java.awt.Color(0, 0, 64));

        javax.swing.GroupLayout panelSurLayout = new javax.swing.GroupLayout(panelSur);
        panelSur.setLayout(panelSurLayout);
        panelSurLayout.setHorizontalGroup(
            panelSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelSurLayout.setVerticalGroup(
            panelSurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 1161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        comprobarRespuesta();
        actualizarImagenes();
    }//GEN-LAST:event_btnValidarActionPerformed

    private void Back_logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_logoMouseClicked
       this.dispose();
    }//GEN-LAST:event_Back_logoMouseClicked

    private void btnAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAyudaMouseClicked
     VentanaAyuda ayuda = new VentanaAyuda();
     ayuda.setVisible(true);
     ayuda.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAyudaMouseClicked
    
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
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOperaciones().setVisible(true);
            }
        });
    }   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back_logo;
    private javax.swing.JLabel Label_Imagen;
    private javax.swing.JProgressBar ProgressBar_avance;
    private javax.swing.JLabel btnAyuda;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel imgIgual;
    private javax.swing.JLabel imgMultiplicacion;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelNorte;
    private javax.swing.JPanel panelSur;
    private javax.swing.JTextField textAleatorio;
    private javax.swing.JTextField textEstatico;
    private javax.swing.JTextField textSolucion;
    // End of variables declaration//GEN-END:variables

    public Icon ajustarImage(String direccion, JLabel boton){
        ImageIcon icono = new ImageIcon(getClass().getResource(direccion));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        
        ImageIcon img = new ImageIcon(icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        return img;
    }
}
