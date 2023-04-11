package escritorio;

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Escritorio extends javax.swing.JFrame {

    AudioClip Musica;

    LogIn log = new LogIn();
    private int bandera = 0;
    private int banderaLog = 0;

    public Escritorio() {
        initComponents();
        
        setIconImage();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/ayaye_grande.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane() {

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jButtonLogin = new javax.swing.JButton();
        jButtonPortada = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCheckIn = new javax.swing.JMenu();
        jMenuCheckOut = new javax.swing.JMenu();
        jMenuOcupacion = new javax.swing.JMenu();
        jMenuImagenes = new javax.swing.JMenu();
        jMenuItemHabitaciones = new javax.swing.JMenuItem();
        jMenuItemHotel = new javax.swing.JMenuItem();
        jMenuItemAlberGym = new javax.swing.JMenuItem();
        jMenuItemRestaurant = new javax.swing.JMenuItem();
        jMenuServicios = new javax.swing.JMenu();
        jMenuSalir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLogin.setBackground(new java.awt.Color(153, 153, 153));
        jButtonLogin.setFont(new java.awt.Font("Lucida Fax", 3, 14)); // NOI18N
        jButtonLogin.setText("Log-In");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonPortada.setBackground(new java.awt.Color(153, 153, 153));
        jButtonPortada.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButtonPortada.setText("Mostrar Portada");
        jButtonPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPortadaActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jButtonLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButtonPortada, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jButtonLogin)
                .addGap(55, 55, 55))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonLogin, jButtonPortada});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin)
                    .addComponent(jButtonPortada, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonLogin, jButtonPortada});

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setForeground(new java.awt.Color(153, 255, 153));

        jMenuCheckIn.setText("Check-In");
        jMenuCheckIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCheckInMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCheckIn);

        jMenuCheckOut.setText("Check-Out");
        jMenuCheckOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCheckOutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCheckOut);

        jMenuOcupacion.setText("Ocupación");
        jMenuOcupacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuOcupacionMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuOcupacion);

        jMenuImagenes.setText("Imágenes");

        jMenuItemHabitaciones.setText("Habitaciones");
        jMenuItemHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHabitacionesActionPerformed(evt);
            }
        });
        jMenuImagenes.add(jMenuItemHabitaciones);

        jMenuItemHotel.setText("Hotel");
        jMenuItemHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHotelActionPerformed(evt);
            }
        });
        jMenuImagenes.add(jMenuItemHotel);

        jMenuItemAlberGym.setText("Albercas y gimnasios");
        jMenuItemAlberGym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlberGymActionPerformed(evt);
            }
        });
        jMenuImagenes.add(jMenuItemAlberGym);

        jMenuItemRestaurant.setText("Restaurantes");
        jMenuItemRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRestaurantActionPerformed(evt);
            }
        });
        jMenuImagenes.add(jMenuItemRestaurant);

        jMenuBar1.add(jMenuImagenes);

        jMenuServicios.setText("Servicios");
        jMenuServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuServiciosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuServicios);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked

        if (bandera == 1) {
            Musica.stop();
            bandera = 0;
        }

        this.dispose();

    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jMenuCheckInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCheckInMouseClicked

        if (bandera == 1) {
            Musica.stop();
            bandera = 0;
        }

        banderaLog = log.getBandera();

        if (banderaLog == 1) {
            Escritorio.jDesktopPane1.removeAll();
            this.repaint();

            CheckIn check = new CheckIn();
            Escritorio.jDesktopPane1.add(check);

            try {
                check.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.out.println("ERROR: " + ex);
            }
            check.show();
        } else {
            JOptionPane.showMessageDialog(this, "Inicie sesión para continuar");
        }

    }//GEN-LAST:event_jMenuCheckInMouseClicked

    private void jMenuCheckOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCheckOutMouseClicked

        if (bandera == 1) {
            Musica.stop();
            bandera = 0;
        }

        banderaLog = log.getBandera();

        if (banderaLog == 1) {
            Escritorio.jDesktopPane1.removeAll();
            this.repaint();

            CheckOut check = new CheckOut();
            Escritorio.jDesktopPane1.add(check);

            try {
                check.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.out.println("ERROR: " + ex);
            }
            check.show();
        } else {
            JOptionPane.showMessageDialog(this, "Inicie sesión para continuar");
        }

    }//GEN-LAST:event_jMenuCheckOutMouseClicked

    private void jMenuOcupacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuOcupacionMouseClicked

        if (bandera == 1) {
            Musica.stop();
            bandera = 0;
        }

        banderaLog = log.getBandera();

        if (banderaLog == 1) {
            Escritorio.jDesktopPane1.removeAll();
            this.repaint();

            Ocupacion ocupacion = new Ocupacion();
            Escritorio.jDesktopPane1.add(ocupacion);

            try {
                ocupacion.setMaximum(true);
            } catch (PropertyVetoException ex) {
                System.out.println("ERROR: " + ex);
            }
            ocupacion.show();
        } else {
            JOptionPane.showMessageDialog(this, "Inicie sesión para continuar");
        }

    }//GEN-LAST:event_jMenuOcupacionMouseClicked

    private void jMenuServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuServiciosMouseClicked

        if (bandera == 1) {
            Musica.stop();
            bandera = 0;
        }

        banderaLog = log.getBandera();

        if (banderaLog == 1) {
            Escritorio.jDesktopPane1.removeAll();
            this.repaint();

            Escritorio.jDesktopPane1.removeAll();
            this.repaint();

            Servicios servicios = new Servicios();
            Escritorio.jDesktopPane1.add(servicios);

            try {
                servicios.setMaximum(true);
            } catch (PropertyVetoException ex) {
                JOptionPane.showMessageDialog(this, "ERROR");
            }
            servicios.show();
        } else {
            JOptionPane.showMessageDialog(this, "Inicie sesión para continuar");
        }

    }//GEN-LAST:event_jMenuServiciosMouseClicked

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed

        try {
            log.setLocationRelativeTo(null);
            this.setVisible(true);
            log.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jMenuItemHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHabitacionesActionPerformed

        if (bandera == 1) {
            Musica.stop();
            Musica.play();
        }

        if (bandera == 0) {
            Musica = java.applet.Applet.newAudioClip(getClass().getResource("/musica/Coro_Coral.wav"));
            Musica.play();
            bandera = 1;
        }

        Escritorio.jDesktopPane1.removeAll();
        this.repaint();

        Habitaciones hab = new Habitaciones();
        this.jDesktopPane1.add(hab);

        try {
            hab.setMaximum(true);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
        hab.show();

    }//GEN-LAST:event_jMenuItemHabitacionesActionPerformed

    private void jButtonPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPortadaActionPerformed

        Portada reg = new Portada();
        Escritorio.jDesktopPane1.add(reg);

        Dimension tamanio = jDesktopPane1.getSize();
        Dimension tamFrame = reg.getSize();
        reg.setLocation((tamanio.width - tamFrame.width) / 2, (tamanio.height - tamFrame.height) / 2);
        reg.show();

    }//GEN-LAST:event_jButtonPortadaActionPerformed

    private void jMenuItemHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHotelActionPerformed

        if (bandera == 1) {
            Musica.stop();
            Musica.play();
        }

        if (bandera == 0) {
            Musica = java.applet.Applet.newAudioClip(getClass().getResource("/musica/Coro_Coral.wav"));
            Musica.play();
            bandera = 1;
        }

        Escritorio.jDesktopPane1.removeAll();
        this.repaint();

        Hotel hot = new Hotel();
        this.jDesktopPane1.add(hot);

        try {
            hot.setMaximum(true);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
        hot.show();

    }//GEN-LAST:event_jMenuItemHotelActionPerformed

    private void jMenuItemAlberGymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlberGymActionPerformed

        if (bandera == 1) {
            Musica.stop();
            Musica.play();
        }

        if (bandera == 0) {
            Musica = java.applet.Applet.newAudioClip(getClass().getResource("/musica/Coro_Coral.wav"));
            Musica.play();
            bandera = 1;
        }

        Escritorio.jDesktopPane1.removeAll();
        this.repaint();

        AlbercaGym alberGym = new AlbercaGym();
        this.jDesktopPane1.add(alberGym);

        try {
            alberGym.setMaximum(true);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
        alberGym.show();

    }//GEN-LAST:event_jMenuItemAlberGymActionPerformed

    private void jMenuItemRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRestaurantActionPerformed

        if (bandera == 1) {
            Musica.stop();
            Musica.play();
        }

        if (bandera == 0) {
            Musica = java.applet.Applet.newAudioClip(getClass().getResource("/musica/Coro_Coral.wav"));
            Musica.play();
            bandera = 1;
        }

        Escritorio.jDesktopPane1.removeAll();
        this.repaint();

        Restaurantes rest = new Restaurantes();
        this.jDesktopPane1.add(rest);

        try {
            rest.setMaximum(true);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
        rest.show();

    }//GEN-LAST:event_jMenuItemRestaurantActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonPortada;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCheckIn;
    private javax.swing.JMenu jMenuCheckOut;
    private javax.swing.JMenu jMenuImagenes;
    private javax.swing.JMenuItem jMenuItemAlberGym;
    private javax.swing.JMenuItem jMenuItemHabitaciones;
    private javax.swing.JMenuItem jMenuItemHotel;
    private javax.swing.JMenuItem jMenuItemRestaurant;
    private javax.swing.JMenu jMenuOcupacion;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JMenu jMenuServicios;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/ayaye_logo.png")));
    }

}
