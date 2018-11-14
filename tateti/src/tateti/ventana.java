package tateti;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author franco
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();

    }

    pensarJugadasCpu datos = new pensarJugadasCpu();                        //Creo la clase datos para usar sus metodos
    private boolean turnoJ1 = true, opcionInvalida = true, comienzaReloj;
    /* comienzaReloj
    turnoJ1: Si esta en true es el turno del J1, se es false es turno de la cpu
    opcionInvalida: Se usa para dentro de un while para que se detenga cuando un random de con una opcion valida
    comienzaReloj:
    */
    private boolean primeraJugada=true;
    
    private final int[] presion = new int[9];
    private final int[] paneles = new int[9];
    int boton;
    int panelIA, i;
    ImageIcon iconoX = new ImageIcon(getClass().getResource("x.jpg"));
    ImageIcon iconoO = new ImageIcon(getClass().getResource("o2.png"));
    ImageIcon trofeo=new ImageIcon(getClass().getResource("trofeo.jpg"));
    ImageIcon fondo=new ImageIcon(getClass().getResource("espacio.jpg"));
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        resetearButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        resetearButton.setText("Resetear");
        resetearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetearButtonActionPerformed(evt);
            }
        });

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resetearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetearButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (!turnoJ1) {
                int ret=datos.pensar(boton,primeraJugada);
                primeraJugada=false;
                if(ret==-1)
                
                    jugadaIA();
                else{
             //       datos.cpu[ret]=1;
                    switch (ret) {
                        case 0:
                            presionarBoton(jLabel1, 0);
                            
                            break;
                        case 1:
                            presionarBoton(jLabel2, 1);
                            
                            break;
                        case 2:
                            presionarBoton(jLabel3, 2);
                            
                            break;
                        case 3:
                            presionarBoton(jLabel4, 3);
                            
                            break;
                        case 4:
                            presionarBoton(jLabel5, 4);
                            
                            break;
                        case 5:
                            presionarBoton(jLabel6, 5);
                            
                            break;
                        case 6:
                            presionarBoton(jLabel7, 6);
                            
                            break;
                        case 7:
                            presionarBoton(jLabel8, 7);
                            
                            break;
                        case 8:
                            presionarBoton(jLabel9, 8);
                            
                            break;
                        default:
                            throw new AssertionError();
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                }
            }
        }
    });

    private void controlDeJuego(int jug) {

        for (i = 0; i < 3; i++) {
            if (paneles[(i * 3)] + paneles[1 + (i * 3)] + paneles[2 + (i * 3)] == (jug * 3)) {
                timer.stop();
                comienzaReloj = false;
                ImageIcon trofeoPreparado = new ImageIcon(trofeo.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                if (jug == 1) {
                    JOptionPane.showMessageDialog(null, "Gana x", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
                } else {
                     JOptionPane.showMessageDialog(null, "Gana o", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
                }
                resetearButtonActionPerformed(null);
                return;
            }
        }

        for (i = 0; i < 3; i++) {
            if (paneles[i] + paneles[i + 3] + paneles[i + 6] == (jug * 3)) {
                timer.stop();
                comienzaReloj = false;
                ImageIcon trofeoPreparado = new ImageIcon(trofeo.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                if (jug == 1) {
                   //JOptionPane.showMessageDialog(null, "Gana X");
                    JOptionPane.showMessageDialog(null, "Gana x", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
                } else {
                    //JOptionPane.showMessageDialog(null, "Gana O");
                    JOptionPane.showMessageDialog(null, "Gana o", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
                }
                resetearButtonActionPerformed(null);
                return;
            }
        }
        if (paneles[0] + paneles[4] + paneles[8] == (jug * 3)) {
            ImageIcon trofeoPreparado = new ImageIcon(trofeo.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            timer.stop();
            comienzaReloj = false;
            if (jug == 1) {
                JOptionPane.showMessageDialog(null, "Gana x", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
            } else {
                JOptionPane.showMessageDialog(null, "Gana o", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
            }
            resetearButtonActionPerformed(null);
            return;
        }

        if (paneles[2] + paneles[4] + paneles[6] == (jug * 3)) {
            ImageIcon trofeoPreparado = new ImageIcon(trofeo.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
            timer.stop();
            comienzaReloj = false;
            if (jug == 1) {
                JOptionPane.showMessageDialog(null, "Gana x", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
            } else {
                 JOptionPane.showMessageDialog(null, "Gana o", "Winner", JOptionPane.OK_OPTION, trofeoPreparado);
            }
            resetearButtonActionPerformed(null);

        }

    }


    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        if (turnoJ1) {
            boton=0;
            presionarBoton(jLabel1, 0);
            
        }
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel2, 1);
            boton=1;
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel3, 2);
            boton=2;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel4, 3);
            boton=3;
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel5, 4);
            boton=4;
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel6, 5);
            boton=5;
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel7, 6);
            boton=6;
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel8, 7);
            boton=7;
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        if (turnoJ1) {
            presionarBoton(jLabel9, 8);
            boton=8;
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void resetearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetearButtonActionPerformed
        jLabel1.setIcon(null);
        jLabel2.setIcon(null);
        jLabel3.setIcon(null);
        jLabel4.setIcon(null);
        jLabel5.setIcon(null);
        jLabel6.setIcon(null);
        jLabel7.setIcon(null);
        jLabel8.setIcon(null);
        jLabel9.setIcon(null);

        for (i = 0; i <= 8; i++) {
            presion[i] = 0;
            paneles[i] = 0;
        }
        datos.resetear();
        turnoJ1 = true;
        primeraJugada=true;
    }//GEN-LAST:event_resetearButtonActionPerformed
    public boolean presionarBoton(JLabel label, int i) {
        if (!comienzaReloj) {
            timer.start();
            comienzaReloj=true;
        }
        if (presion[i] == 0) {
            if (turnoJ1) {

                ImageIcon iconoxPreparado = new ImageIcon(iconoX.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                label.setIcon(iconoxPreparado);
                paneles[i] = 1;
                turnoJ1 = false;
                presion[i] = 1;
                controlDeJuego(1);
            } else {
                ImageIcon iconoOPreparado = new ImageIcon(iconoO.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
                label.setIcon(iconoOPreparado);
                paneles[i] = -1;
                turnoJ1 = true;
                presion[i] = 1;
                controlDeJuego(-1);
            }

        } else {
            System.out.println(i);
            return false;
        }
        return true;
    }

    private void jugadaIA() {
        
        panelIA = (int) (Math.random() * 100) % 9;

        do {
            switch (panelIA) {
                case 0:
                    if (presionarBoton(jLabel1, 0)) {
                        datos.cpu[panelIA]=1;
                        opcionInvalida = false;
                    }
                    break;
                case 1:
                    if (presionarBoton(jLabel2, 1)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                case 2:
                    if (presionarBoton(jLabel3, 2)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                case 3:
                    if (presionarBoton(jLabel4, 3)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                case 4:
                    if (presionarBoton(jLabel5, 4)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                case 5:
                    if (presionarBoton(jLabel6, 5)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                case 6:
                    if (presionarBoton(jLabel7, 6)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                case 7:
                    if (presionarBoton(jLabel8, 7)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                case 8:
                    if (presionarBoton(jLabel9, 8)) {
                        opcionInvalida = false;
                        datos.cpu[panelIA]=1;
                    }
                    break;
                default:
                    break;
            }
            panelIA = (int) (Math.random() * 100) % 9;
        } while (opcionInvalida && verificarNoPresionados());
        opcionInvalida = true;
        
    }

    public boolean verificarNoPresionados() {
        for (int k = 0; k < 9; k++) {
            if (presion[k] == 0) {
                return true;
            }
        }
        return false;
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resetearButton;
    // End of variables declaration//GEN-END:variables

   
}
