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
public class KegiatanFrame extends javax.swing.JFrame {

    /**
     * Creates new form KegiatanFrame
     */
    public KegiatanFrame() {
        initComponents();
        setResizable(false);
        
        setTitle("FutsalFusion | Daftar Kegiatan"); // Memberikan judul pada jendela
        
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
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        rincianTextArea = new javax.swing.JTextArea();
        kegiatanComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Daftar Kegiatan UKM Futsal");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo di kegiatan2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(370, 279));

        jLabel2.setFont(new java.awt.Font("Open Sans Extrabold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Daftar kegiatan yang dilaksanakan UKM Futsal");

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setHorizontalScrollBar(null);

        rincianTextArea.setEditable(false);
        rincianTextArea.setColumns(20);
        rincianTextArea.setLineWrap(true);
        rincianTextArea.setRows(5);
        rincianTextArea.setWrapStyleWord(true);
        jScrollPane.setViewportView(rincianTextArea);

        kegiatanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih daftar kegiatan...", "Fun Futsal", "Mini Soccer", "Bina Fisik", "Friendly Match Futsal", " " }));
        kegiatanComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        kegiatanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kegiatanComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tertarik untuk mengikuti kegiatan? Daftar di bawah sini");

        daftarButton.setText("Daftar!");
        daftarButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(daftarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kegiatanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(104, 104, 104)))
                                .addGap(0, 14, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kegiatanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(daftarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kegiatanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kegiatanComboBoxActionPerformed
        // TODO add your handling code here:
        String selectedMenu = (String) kegiatanComboBox.getSelectedItem();
        switch(selectedMenu){
            case "Fun Futsal":
                rincianTextArea.setText("Fun Futsal adalah kegiatan santai bermain futsal yang bisa diikuti oleh semua mahasiswa STIS. "
                        + "Tujuannya adalah untuk bersenang-senang dan mempererat hubungan antar mahasiswa. "
                        + "Tanggal pelaksanaan: 1 September 2024");
                break;
            case "Mini Soccer":
                rincianTextArea.setText("Mini Soccer adalah kegiatan bermain sepak bola mini yang bisa diikuti oleh semua mahasiswa STIS. "
                        + "Tujuannya adalah untuk melatih keterampilan bermain sepak bola dalam lapangan yang lebih kecil dan intensitas tinggi. "
                        + "Tanggal pelaksanaan: Coming Soon");
                break;
            case "Bina Fisik":
                rincianTextArea.setText("Bina Fisik adalah kegiatan latihan fisik yang bisa diikuti oleh semua mahasiswa STIS. "
                        + "Kegiatan ini bertujuan untuk meningkatkan kebugaran jasmani melalui berbagai latihan seperti jogging, push-up, sit-up, dan stretching. "
                        + "Tanggal pelaksanaan: 10 Agustus 2024");
                break;
            case "Friendly Match Futsal":
                rincianTextArea.setText("Friendly Match Futsal adalah pertandingan persahabatan futsal antar perguruan tinggi "
                        + "kedinasan lain yang bisa diikuti oleh semua mahasiswa STIS. "
                        + "Tujuannya adalah untuk melatih kemampuan bermain futsal dan mempererat hubungan antar kedinasan. "
                        + "Tanggal pelaksanaan: 15 Desember 2024");
                break;
            default:
                rincianTextArea.setText(" ");
        }
    }//GEN-LAST:event_kegiatanComboBoxActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        // TODO add your handling code here:
        FormPendataranKegiatan daftar = new FormPendataranKegiatan();
        daftar.setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void daftarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarButtonMouseEntered
        // TODO add your handling code here:
        daftarButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_daftarButtonMouseEntered

    private void daftarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarButtonMouseExited
        // TODO add your handling code here:
        daftarButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_daftarButtonMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JComboBox<String> kegiatanComboBox;
    private javax.swing.JTextArea rincianTextArea;
    // End of variables declaration//GEN-END:variables
}