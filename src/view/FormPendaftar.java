/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import assets.Warna;
import controller.Database;
import model.Pendaftar;
import controller.PendaftarAlamatDecorator;
import controller.PendaftarBasicTable;
import controller.PendaftarJenisKelaminDecorator;
import controller.PendaftarNamaDecorator;
import controller.PendaftarNamaKegiatanDecorator;
import controller.PendaftarNimDecorator;
import controller.PendaftarTingkatDecorator;
import controller.PendaftarTlpnDecorator;
import controller.Table;
import java.sql.SQLException;
import java.awt.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author fauzanalfaraby
 */
public class FormPendaftar extends javax.swing.JInternalFrame {
    
    private ArrayList<Pendaftar> pfrList;
    private JFileChooser fileChooser;
    
    private void show_data(){
        DefaultTableModel dtm = (DefaultTableModel)
        pendaftarTable.getModel();
        
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        try{
            int no = 1;
            //isi tabel
            for(Pendaftar pfr:
                Database.getInstance().getListPendaftar()){
                dtm.addRow(new Object[]{
                    pfr.getNamaKegiatan(), 
                    pfr.getNim(), 
                    pfr.getNama(), 
                    pfr.getJk(), 
                    pfr.getTingkat(),
                    pfr.getAlamat(), 
                    pfr.getEmail(), 
                    pfr.getTlpn()});
            } 
            // Adjust the preferred height of the JScrollPane to show all rows
            int rowHeight = pendaftarTable.getRowHeight();
            int rowCount = dtm.getRowCount();
            int preferredHeight = rowHeight * rowCount;
            jScrollPane1.setPreferredSize(new Dimension(jScrollPane1.getPreferredSize().width, preferredHeight));
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void show_filter(){
        DefaultTableModel dtm = (DefaultTableModel)
        pendaftarTable.getModel();
        
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        int no = 1;
        //isi tabel
        for(Pendaftar pfr:
                pfrList){
            dtm.addRow(new Object[]{
                pfr.getNamaKegiatan(), 
                pfr.getNim(), 
                pfr.getNama(), 
                pfr.getJk(), 
                pfr.getAlamat(), 
                pfr.getTingkat(), 
                pfr.getEmail(), 
                pfr.getTlpn()});
        }
    }
    
    private void filterTable(){
        String namaKegiatan = namaKegiatanTextField.getText();
        String nim = nimTextField.getText();
        String nama = namaTextField.getText();
        String jk = "-".equals((String)jkComboBox.getSelectedItem())?
                "" : (String)jkComboBox.getSelectedItem();
        String tingkat = "-".equals((String)tingkatComboBox.getSelectedItem())?
                "" : (String)tingkatComboBox.getSelectedItem();
        String alamat = alamatTextField.getText();
        String tlpn = tlpnTextField.getText();
//        
        //Memuat isi interfecae table
        Table tabel = new PendaftarBasicTable();
        
        //Decorator untuk fiter nama kegiatan pada tabel
        Table namaKegiatanTable = new PendaftarNamaKegiatanDecorator(tabel, namaKegiatan);
        Table nimTable = new PendaftarNimDecorator(namaKegiatanTable, nim);
        Table namaTable = new PendaftarNamaDecorator(nimTable, nama);
        Table jenisKelaminTable = new PendaftarJenisKelaminDecorator(namaTable, jk);
        Table tingkatTable = new PendaftarTingkatDecorator(jenisKelaminTable, tingkat);
        Table alamatTable = new PendaftarAlamatDecorator(tingkatTable, alamat);
        Table tlpnTable = new PendaftarTlpnDecorator(alamatTable, tlpn);
        
        //Menampilkan tabel yang telah di filter pada kolom
        pfrList = tlpnTable.getList();
    }
    
    /**
     * Creates new form FormMahasiswaP
     */
    public FormPendaftar() throws SQLException {
        initComponents();
        show_data();
        // remove the title bar of a JInternalFrame in Java Swing
        ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).setNorthPane(null);
        setResizable(true);
        this.pfrList = (ArrayList<Pendaftar>) Database.getInstance().getListPendaftar();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namaKegiatanTextField = new javax.swing.JTextField();
        nimTextField = new javax.swing.JTextField();
        namaTextField = new javax.swing.JTextField();
        alamatTextField = new javax.swing.JTextField();
        tlpnTextField = new javax.swing.JTextField();
        jkComboBox = new javax.swing.JComboBox<>();
        tingkatComboBox = new javax.swing.JComboBox<>();
        filterButton = new javax.swing.JButton();
        clearFilterButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pendaftarTable = new javax.swing.JTable();
        hapusButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(241, 241, 230));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FILTER TABEL");

        jLabel2.setText("Nama kegiatan");

        jLabel3.setText("NIM");

        jLabel4.setText("Nama");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("Tingkat");

        jLabel7.setText("Alamat");

        jLabel8.setText("No.Telephone");

        jkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Laki-Laki", "Perempuan" }));

        tingkatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4" }));

        filterButton.setBackground(new java.awt.Color(204, 204, 204));
        filterButton.setText("Filter");
        filterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filterButtonMouseExited(evt);
            }
        });
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        clearFilterButton.setBackground(new java.awt.Color(204, 204, 204));
        clearFilterButton.setText("Hapus Filter");
        clearFilterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearFilterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearFilterButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearFilterButtonMouseExited(evt);
            }
        });
        clearFilterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFilterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(namaKegiatanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jkComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tingkatComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearFilterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(filterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tlpnTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaKegiatanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tingkatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tlpnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(filterButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearFilterButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(446, 348));
        jScrollPane1.setViewportView(pendaftarTable);

        pendaftarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Kegiatan", "NIM", "Nama", "Jenis Kelamin", "Tingkat", "Alamat", "Email", "No.Telepon"
            }
        ));
        pendaftarTable.setMinimumSize(new java.awt.Dimension(120, 80));
        jScrollPane1.setViewportView(pendaftarTable);

        hapusButton.setText("Hapus Pendaftar");
        hapusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hapusButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hapusButtonMouseExited(evt);
            }
        });
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Export .csv");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hapusButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapusButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) pendaftarTable.getModel();
        int i = pendaftarTable.getSelectedRow();
        String nim = (String)dtm.getValueAt(i, 1);
        try{
            Database.getInstance().deletePendaftar(nim);
            JOptionPane.showMessageDialog(this, "Data berhasil di hapus");
        }catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menghapus data " + JOptionPane.ERROR_MESSAGE);
        }
        show_data();
    }//GEN-LAST:event_hapusButtonActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        // TODO add your handling code here:
        filterTable();
        show_filter();
    }//GEN-LAST:event_filterButtonActionPerformed

    private void clearFilterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFilterButtonActionPerformed
        // TODO add your handling code here:
        namaKegiatanTextField.setText("");
        nimTextField.setText("");
        namaTextField.setText("");
        jkComboBox.setSelectedIndex(0);
        tingkatComboBox.setSelectedIndex(0);
        alamatTextField.setText("");
        tlpnTextField.setText("");
        
        try {
            pfrList = (ArrayList<Pendaftar>) Database.getInstance().getListPendaftar();
            show_data();
        } catch (SQLException ex) {
            Logger.getLogger(FormPendaftar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_clearFilterButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (fileChooser == null) {
        fileChooser = new JFileChooser(); // Pastikan fileChooser sudah diinisialisasi
    }

    int returnValue = fileChooser.showSaveDialog(this);
    if (returnValue == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        
        // Gunakan SwingWorker untuk menjalankan penulisan file di thread terpisah
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() throws Exception {
                try (FileWriter writer = new FileWriter(fileToSave)) {
                    TableModel model = pendaftarTable.getModel();
                    
                    // Menulis header
                    for (int i = 0; i < model.getColumnCount(); i++) {
                        writer.append(model.getColumnName(i));
                        if (i < model.getColumnCount() - 1) {
                            writer.append(",");
                        }
                    }
                    writer.append("\n");

                    // Menulis baris data
                    for (int row = 0; row < model.getRowCount(); row++) {
                        for (int col = 0; col < model.getColumnCount(); col++) {
                            Object value = model.getValueAt(row, col);
                            writer.append(value != null ? value.toString() : "");
                            if (col < model.getColumnCount() - 1) {
                                writer.append(",");
                            }
                        }
                        writer.append("\n");
                    }
                } catch (IOException e) {
                    throw new RuntimeException("Gagal mengekspor data ke CSV: " + e.getMessage(), e);
                }
                return null;
            }

            @Override
            protected void done() {
                try {
                    get(); // Untuk menangani exception yang mungkin terjadi selama doInBackground
                    JOptionPane.showMessageDialog(null, "Data berhasil diekspor ke .csv");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        worker.execute(); // Jalankan worker
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void filterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMouseEntered
        // TODO add your handling code here:
        filterButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_filterButtonMouseEntered

    private void filterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterButtonMouseExited
        // TODO add your handling code here:
        filterButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_filterButtonMouseExited

    private void clearFilterButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFilterButtonMouseEntered
        // TODO add your handling code here:
        clearFilterButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_clearFilterButtonMouseEntered

    private void clearFilterButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearFilterButtonMouseExited
        // TODO add your handling code here:
        clearFilterButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_clearFilterButtonMouseExited

    private void hapusButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusButtonMouseEntered
        // TODO add your handling code here:
        hapusButton.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_hapusButtonMouseEntered

    private void hapusButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusButtonMouseExited
        // TODO add your handling code here:
        hapusButton.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_hapusButtonMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(Warna.HOVERIN);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(Warna.HOVEROUT);
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamatTextField;
    private javax.swing.JButton clearFilterButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JButton hapusButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jkComboBox;
    private javax.swing.JTextField namaKegiatanTextField;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JTable pendaftarTable;
    private javax.swing.JComboBox<String> tingkatComboBox;
    private javax.swing.JTextField tlpnTextField;
    // End of variables declaration//GEN-END:variables
}
