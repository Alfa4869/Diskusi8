/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.MahasiswaControl;
import control.ProdiControl;
import entity.Mahasiswa;
import entity.Prodi;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import table.TableMahasiswa;

/**
 *
 * @author ASUS
 */
public class MahasiswaView extends javax.swing.JFrame {
    private ProdiControl pc;
    private MahasiswaControl mc;
    String action = null;
    List<Prodi> listProdi;

    /**
     * Creates new form MahasiswaView
     */
    public MahasiswaView() {
        initComponents();
        pc = new ProdiControl();
        mc = new MahasiswaControl();
        setComponent(false);
        setEditDeleteBtn(false);
        showMahasiswa();
        setProdiToDropdown();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMahasiswa = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblNPM = new javax.swing.JLabel();
        txtNPM = new javax.swing.JTextField();
        lblNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        lblProdi = new javax.swing.JLabel();
        cmbProdi = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMahasiswa = new javax.swing.JTable();
        btnMenuProdi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("MAHASISWA");

        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Ubah");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Cari");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblNPM.setText("Nomor Pokok Mahasiswa");

        lblNama.setText("Nama Mahasiswa");

        lblProdi.setText("Program Studi");

        cmbProdi.setToolTipText("");

        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Batal");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        tblMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMahasiswa);

        btnMenuProdi.setText("Menu Prodi");
        btnMenuProdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProdiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMahasiswaLayout = new javax.swing.GroupLayout(PanelMahasiswa);
        PanelMahasiswa.setLayout(PanelMahasiswaLayout);
        PanelMahasiswaLayout.setHorizontalGroup(
            PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                        .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                                .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbProdi, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNPM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                                        .addComponent(lblNPM, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(84, 84, 84))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelMahasiswaLayout.createSequentialGroup()
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                                .addGap(0, 7, Short.MAX_VALUE)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                        .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(lblProdi, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenuProdi, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        PanelMahasiswaLayout.setVerticalGroup(
            PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTitle))
                    .addGroup(PanelMahasiswaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenuProdi)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEdit)
                        .addComponent(btnDelete)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch)))
                .addGap(40, 40, 40)
                .addComponent(lblNPM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblProdi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMahasiswa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void setComponent(boolean value) {
        txtNPM.setEnabled(value);
        txtNama.setEnabled(value);
        cmbProdi.setEnabled(value);
        btnSave.setEnabled(value);
        btnCancel.setEnabled(value);
    }

    public void setEditDeleteBtn(boolean value) {
        btnEdit.setEnabled(value);
        btnDelete.setEnabled(value);
    }

    public void clearText() {
        txtNPM.setText("");
        txtNama.setText("");
        cmbProdi.setSelectedIndex(0);
        txtSearch.setText("");
    }
    
    public void showMahasiswa() {
        tblMahasiswa.setModel(mc.showMahasiswa(""));
    }
    
    public void setProdiToDropdown() {
        listProdi = pc.showListProdi();
        for (int i = 0; i < listProdi.size(); i++) {
            cmbProdi.addItem(listProdi.get(i));
        }
    }




    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        setComponent(true);
        clearText();
        action = "Tambah";

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        setComponent(true);
        txtNPM.setEnabled(false); //supaya NPM tidak bisa diubah
        action = "Ubah";

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        switch (getAnswer) {
            case 0: //jika jawaban user adalah Yes
                // Isilah code di sini……
                setComponent(false);
                setEditDeleteBtn(false);
                clearText();
                showMahasiswa();
            break;
            case 1: //jika jawaban user adalah No
            break;
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    
    
    
    private void btnMenuProdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProdiActionPerformed
       ProdiView pv = new ProdiView();
        this.dispose();
        pv.setVisible(true);

    }//GEN-LAST:event_btnMenuProdiActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // Ketika button cari diklik maka akan menonaktifkan component Input
        setComponent(false);

        TableMahasiswa listMhs = mc.showMahasiswa(txtSearch.getText());
        

        if (listMhs.getRowCount() == 0) {
            //Ketika data yang dicari tidak ditemukan
            setEditDeleteBtn(false);
            JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
        } else {
            //Ketika data yang dicari ditemukan
            tblMahasiswa.setModel(listMhs);
        }
        // Ketika button cari diklik maka akan menghapus seluruh isi input
        clearText();       
    

    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMahasiswaMouseClicked
        int indexProdi = -1;
        setEditDeleteBtn(true);
        setComponent(false);
        
        int clickedRow = tblMahasiswa.getSelectedRow();
        TableModel tm = tblMahasiswa.getModel();

        txtNPM.setText(tm.getValueAt(clickedRow, 0).toString());
        txtNama.setText(tm.getValueAt(clickedRow, 1).toString());

        String kode_prodi = tm.getValueAt(clickedRow, 3).toString();
        for(Prodi prodi : listProdi) {
            if (prodi.getKodeProdi().equals(kode_prodi)) {
                indexProdi = listProdi.indexOf(prodi);
            }
        }
        cmbProdi.setSelectedIndex(indexProdi);

    }//GEN-LAST:event_tblMahasiswaMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int selectedIndex = cmbProdi.getSelectedIndex();
        Prodi selectedProdi = listProdi.get(selectedIndex);

        Mahasiswa m = new Mahasiswa(txtNPM.getText(),txtNama.getText(),selectedProdi);
        
        if (action.equals("Tambah")) {
           mc.insertDataMahasiswa(m);
        } else {
            //Ketika action berstatus ubah maka akan memanggil fungsi update
            mc.updateDataMahasiswa(m);
        }
            
        setComponent(false);
        setEditDeleteBtn(false);
        clearText();
        showMahasiswa();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        setComponent(false);
        setEditDeleteBtn(false);
        clearText();

    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MahasiswaView().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMahasiswa;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnMenuProdi;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<Prodi> cmbProdi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNPM;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblProdi;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblMahasiswa;
    private javax.swing.JTextField txtNPM;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

