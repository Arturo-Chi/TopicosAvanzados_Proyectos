/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.finaltopicos;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;



/**
 *
 * @author artur
 */
public class VentanaMenu extends javax.swing.JFrame {
    private Persona usuario;
    private Cliente client;
    private Lector reader;
    private Reproductor r;
    private boolean estado;
    /**
     * Creates new form VentanaMenu
     * 
     */
    
    public VentanaMenu(){
        
    }
    
    public VentanaMenu(Persona user, Cliente client, Lector reader) {
        initComponents();
        this.usuario = user;
        this.client = client;
        this.reader = reader;
        this.r = new Reproductor("/samples/music.wav");
        this.estado = true;
        
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(this.panelNorte, BorderLayout.NORTH);
        this.add(this.panelCentro, BorderLayout.CENTER);
        //btnUsuario.setIcon(ajustarImagen("/imagenes/usuario.png", btnUsuario));
        btnUsuario1.setToolTipText("Ver usuario");
        btnSalir1.setToolTipText("Cerrar sesión");
        btnPractica1.setToolTipText("Modo práctica");
        btnVolumen.setToolTipText("Musica");
        
        JButton[] botones = {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10};
        for(int i=0; i<10; i++){
            int posicion = i+1;
            String nombre = "/imagenes/num"+posicion+".png";
            botones[i].setIcon(ajustarImagen(nombre, botones[i]));
        }
        
        imgLogo.setIcon(ajustarImagen("/imagenes/logoInicio.png", imgLogo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNorte = new javax.swing.JPanel();
        subPanelNorte = new javax.swing.JPanel();
        btnVolumen = new javax.swing.JButton();
        btnUsuario1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnPractica1 = new javax.swing.JButton();
        imgLogo = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MultiMaster");
        setFocusTraversalPolicyProvider(true);
        setName("VentanaMenu"); // NOI18N
        setSize(new java.awt.Dimension(849, 603));

        panelNorte.setBackground(new java.awt.Color(0, 0, 64));
        panelNorte.setName("panelNorte"); // NOI18N

        subPanelNorte.setBackground(new java.awt.Color(176, 196, 222));

        btnVolumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volumen.png"))); // NOI18N
        btnVolumen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 5, true));
        btnVolumen.setContentAreaFilled(false);
        btnVolumen.setDefaultCapable(false);
        btnVolumen.setFocusCycleRoot(true);
        btnVolumen.setName("btnVolumen"); // NOI18N
        btnVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumenActionPerformed(evt);
            }
        });

        btnUsuario1.setForeground(new java.awt.Color(0, 153, 153));
        btnUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario (1).png"))); // NOI18N
        btnUsuario1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 5, true));
        btnUsuario1.setContentAreaFilled(false);
        btnUsuario1.setDefaultCapable(false);
        btnUsuario1.setFocusCycleRoot(true);
        btnUsuario1.setName("btnUsuario"); // NOI18N
        btnUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuario1ActionPerformed(evt);
            }
        });

        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        btnSalir1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 5, true));
        btnSalir1.setContentAreaFilled(false);
        btnSalir1.setDefaultCapable(false);
        btnSalir1.setFocusCycleRoot(true);
        btnSalir1.setName("btnSalir"); // NOI18N
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnPractica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/practica.png"))); // NOI18N
        btnPractica1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 5, true));
        btnPractica1.setContentAreaFilled(false);
        btnPractica1.setDefaultCapable(false);
        btnPractica1.setFocusCycleRoot(true);
        btnPractica1.setName("btnPractica"); // NOI18N
        btnPractica1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPractica1MouseClicked(evt);
            }
        });
        btnPractica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPractica1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelNorteLayout = new javax.swing.GroupLayout(subPanelNorte);
        subPanelNorte.setLayout(subPanelNorteLayout);
        subPanelNorteLayout.setHorizontalGroup(
            subPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelNorteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPractica1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnVolumen)
                .addGap(21, 21, 21))
        );
        subPanelNorteLayout.setVerticalGroup(
            subPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPractica1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnVolumen.getAccessibleContext().setAccessibleName("btnUsuario");

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoFondo.png"))); // NOI18N

        panelCentro.setBackground(new java.awt.Color(70, 130, 180));
        panelCentro.setName("panelCentro"); // NOI18N

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num1.png"))); // NOI18N
        btn1.setContentAreaFilled(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num3.png"))); // NOI18N
        btn3.setContentAreaFilled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num4.png"))); // NOI18N
        btn4.setContentAreaFilled(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num2.png"))); // NOI18N
        btn2.setContentAreaFilled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num5.png"))); // NOI18N
        btn5.setContentAreaFilled(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num6.png"))); // NOI18N
        btn6.setContentAreaFilled(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num7.png"))); // NOI18N
        btn7.setContentAreaFilled(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num8.png"))); // NOI18N
        btn8.setContentAreaFilled(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num9.png"))); // NOI18N
        btn9.setContentAreaFilled(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/num10.png"))); // NOI18N
        btn10.setContentAreaFilled(false);
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentroLayout = new javax.swing.GroupLayout(panelCentro);
        panelCentro.setLayout(panelCentroLayout);
        panelCentroLayout.setHorizontalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentroLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        panelCentroLayout.setVerticalGroup(
            panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCentroLayout.createSequentialGroup()
                        .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCentroLayout.createSequentialGroup()
                                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCentroLayout.createSequentialGroup()
                                .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(37, 37, 37)))
                        .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout panelNorteLayout = new javax.swing.GroupLayout(panelNorte);
        panelNorte.setLayout(panelNorteLayout);
        panelNorteLayout.setHorizontalGroup(
            panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNorteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(subPanelNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addComponent(panelCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelNorteLayout.setVerticalGroup(
            panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subPanelNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(panelCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void definirTabla(int numero, String nombreTabla){
        FormOperaciones nuevo = new FormOperaciones(reader, client, usuario, numero, nombreTabla);
    }
    
    
    
    private void btnVolumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumenActionPerformed
        r.alternarSonido();
        ImageIcon icono = new ImageIcon();
        if(estado){
            estado = false;
            icono = new ImageIcon(VentanaMenu.class.getResource("/imagenes/mute.png"));
            
        }else if(!estado){
            estado = true;
            icono= new ImageIcon(VentanaMenu.class.getResource("/imagenes/volumen.png"));
        }
        btnVolumen.setIcon(icono);     
    }//GEN-LAST:event_btnVolumenActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        int estatico = 1;
        String name = "Tabla del 1";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        int estatico = 2;
        String name = "Tabla del 2";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        int estatico = 3;
        String name = "Tabla del 3";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        int estatico = 4;
        String name = "Tabla del 4";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        int estatico = 5;
        String name = "Tabla del 5";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        int estatico = 6;
        String name = "Tabla del 6";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        int estatico = 7;
        String name = "Tabla del 7";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        int estatico = 8;
        String name = "Tabla del 8";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        int estatico = 9;
        String name = "Tabla del 9";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        int estatico = 10;
        String name = "Tabla del 10";
        definirTabla(estatico, name);// TODO add your handling code here:
    }//GEN-LAST:event_btn10ActionPerformed

    private void btnUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuario1ActionPerformed
    VentanaUsuario VUser = new  VentanaUsuario(this.usuario, this.reader,this.r);
    VUser.setVisible(true);
    }//GEN-LAST:event_btnUsuario1ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
      this.dispose();
        new VentanaInicio().setVisible(true);
        client.enviarAlServidor(reader.listaAJson());
        r.getClip().stop();
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnPractica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPractica1ActionPerformed
        Practica practice = new Practica();
        practice.setVisible(true);
        practice.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPractica1ActionPerformed

    private void btnPractica1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPractica1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPractica1MouseClicked

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
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }
    
     public Icon ajustarImagen(String direccion, JButton boton){
        ImageIcon icono = new ImageIcon(VentanaMenu.class.getResource(direccion));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        Image nuevo = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING);
        ImageIcon img = new ImageIcon(nuevo);
        return img;
    }
     
       public Icon ajustarImagen(String direccion, JLabel label){
        ImageIcon icono = new ImageIcon(VentanaMenu.class.getResource(direccion));
        int ancho = label.getWidth();
        int alto = label.getHeight();
        Image nuevo = icono.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING);
        ImageIcon img = new ImageIcon(nuevo);
        return img;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnPractica1;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JButton btnVolumen;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelNorte;
    private javax.swing.JPanel subPanelNorte;
    // End of variables declaration//GEN-END:variables
}
