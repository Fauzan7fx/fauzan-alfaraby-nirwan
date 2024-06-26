/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import assets.Warna;
import javax.swing.ImageIcon;
/**
 *
 * @author fauzanalfaraby
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        
        setTitle("FutsalFusion | Dashboard"); // Memberikan judul pada jendela
        
        // Mengatur ikon jendela
        ImageIcon icon = new ImageIcon("src/assets/logo fiks2.png");
        setIconImage(icon.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        daftarButton = new javax.swing.JButton();
        loginadmButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ChatbotButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(34, 40, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 350));

        jLabel1.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Politeknik Statistika STIS");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo dashboard.png"))); // NOI18N

        daftarButton.setBackground(new java.awt.Color(255, 255, 255));
        daftarButton.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        daftarButton.setForeground(new java.awt.Color(0, 0, 0));
        daftarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo daftar (2).png"))); // NOI18N
        daftarButton.setText("Daftar kegiatan");
        daftarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daftarButton.setPreferredSize(new java.awt.Dimension(130, 30));
        daftarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                daftarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                daftarButtonMouseExited(evt);
            }
        });
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        loginadmButton.setBackground(new java.awt.Color(255, 255, 255));
        loginadmButton.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 18)); // NOI18N
        loginadmButton.setForeground(new java.awt.Color(0, 0, 0));
        loginadmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/login admin (2).png"))); // NOI18N
        loginadmButton.setText("Login Admin");
        loginadmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginadmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginadmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginadmButtonMouseExited(evt);
            }
        });
        loginadmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginadmButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Selamat Datang di Aplikasi FutsalFusion");

        ChatbotButton.setBackground(new java.awt.Color(255, 255, 255));
        ChatbotButton.setFont(new java.awt.Font("Dutch801 XBd BT", 0, 14)); // NOI18N
        ChatbotButton.setForeground(new java.awt.Color(0, 0, 0));
        ChatbotButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/help (2).png"))); // NOI18N
        ChatbotButton.setText("Help");
        ChatbotButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ChatbotButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ChatbotButtonMouseExited(evt);
            }
        });
        ChatbotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChatbotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(daftarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginadmButton, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChatbotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(ChatbotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(daftarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginadmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginadmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginadmButtonActionPerformed
        // TODO add your handling code here:
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
    }//GEN-LAST:event_loginadmButtonActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        // TODO add your handling code here:
        KegiatanFrame kf = new KegiatanFrame();
        kf.setVisible(true);
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void daftarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarButtonMouseEntered
        // TODO add your handling code here:
        daftarButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_daftarButtonMouseEntered

    private void daftarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarButtonMouseExited
        // TODO add your handling code here:
        daftarButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_daftarButtonMouseExited

    private void loginadmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginadmButtonMouseEntered
        // TODO add your handling code here:
        loginadmButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_loginadmButtonMouseEntered

    private void loginadmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginadmButtonMouseExited
        // TODO add your handling code here:
        loginadmButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_loginadmButtonMouseExited

    private void ChatbotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChatbotButtonActionPerformed
        // TODO add your handling code here:
        ChatBot1 cb = new ChatBot1();
        cb.setVisible(true);
    }//GEN-LAST:event_ChatbotButtonActionPerformed

    private void ChatbotButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChatbotButtonMouseEntered
        // TODO add your handling code here:
        ChatbotButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_ChatbotButtonMouseEntered

    private void ChatbotButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChatbotButtonMouseExited
        // TODO add your handling code here:
        ChatbotButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_ChatbotButtonMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChatbotButton;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginadmButton;
    // End of variables declaration//GEN-END:variables
}
