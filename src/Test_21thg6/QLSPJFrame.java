/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Test_21thg6;

import Test22_6.Product;
import Test22_6.QLProduct;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhkon
 */
public class QLSPJFrame extends javax.swing.JFrame {

    private QLProduct qlsp = new QLProduct();
    String filename = "FL.txt";

    public QLSPJFrame() {
        initComponents();
        this.rdoCon.setSelected(true);
        this.qlsp.insert(new Product("Macbook", "sp1", "Laptop", 1, 29000));
        this.qlsp.insert(new Product("Android", "sp2", "SmartPhone", 1, 239000));
        this.qlsp.insert(new Product("TV", "sp3", "Laptop", 0, 229000));
        loadTable();
    }

    private void loadTable() {
        ArrayList<Product> ds = this.qlsp.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblSP.getModel();
        dtm.setRowCount(0);
        for (Product d : ds) {
            Object[] rowdata = {
                d.getTenSp(),
                d.getMaSp(),
                d.getDanhMuc(),
                d.getTinhTrang() == 1 ? "Còn hàng" : "Hết hàng",
                d.getDonGia()
            };
            dtm.addRow(rowdata);
        }
    }

    private Product getForm() {
        String ten = this.txtTenSp.getText();
        String ma = this.txtMaSp.getText();
        String danhMuc = (String) this.cbbDanhMuc.getSelectedItem();
        int tinhTrang = this.rdoCon.isSelected() ? 1 : 0;
        String donGia = this.txtDonGia.getText();

        if (ten.trim().equals("") || ma.trim().equals("") || donGia.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }

        Product p = new Product(ten, ma, danhMuc, tinhTrang, Double.parseDouble(donGia));
        return p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenSp = new javax.swing.JTextField();
        txtMaSp = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        cbbDanhMuc = new javax.swing.JComboBox<>();
        cbbThem = new javax.swing.JButton();
        cbbSua = new javax.swing.JButton();
        cbbXoa = new javax.swing.JButton();
        cbbXoaForm = new javax.swing.JButton();
        cbbGhi = new javax.swing.JButton();
        Doc = new javax.swing.JButton();
        cbbThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        rdoCon = new javax.swing.JRadioButton();
        rdoHet = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã sản phẩm");

        jLabel2.setText("Tên Sản phẩm");

        jLabel3.setText("Danh Mục");

        jLabel4.setText("Tình trạng");

        jLabel5.setText("Đơn giá");

        jLabel6.setText("time");

        cbbDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "SmartPhone", " " }));

        cbbThem.setText("Thêm");
        cbbThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThemActionPerformed(evt);
            }
        });

        cbbSua.setText("Sửa");
        cbbSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSuaActionPerformed(evt);
            }
        });

        cbbXoa.setText("Xoá");
        cbbXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbXoaActionPerformed(evt);
            }
        });

        cbbXoaForm.setText("Xoá Form");
        cbbXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbXoaFormActionPerformed(evt);
            }
        });

        cbbGhi.setText("Ghi file");
        cbbGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGhiActionPerformed(evt);
            }
        });

        Doc.setText("Đọc File");
        Doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocActionPerformed(evt);
            }
        });

        cbbThoat.setText("Thoát");
        cbbThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThoatActionPerformed(evt);
            }
        });

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sp", "Mã sp", "danh mục", "tình trạng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);

        buttonGroup1.add(rdoCon);
        rdoCon.setText("Còn hàng");

        buttonGroup1.add(rdoHet);
        rdoHet.setText("Hết hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbThem)
                                    .addComponent(cbbGhi))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Doc)
                                    .addComponent(cbbSua)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbXoa)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbXoaForm))
                                    .addComponent(cbbThoat)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdoCon)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdoHet))
                                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(rdoCon)
                    .addComponent(rdoHet))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbThem)
                    .addComponent(cbbSua)
                    .addComponent(cbbXoa)
                    .addComponent(cbbXoaForm))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbGhi)
                    .addComponent(Doc)
                    .addComponent(cbbThoat))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThemActionPerformed
        ArrayList<Product> ds = this.qlsp.getList();
        Product p = this.getForm();
        if (p == null) {
            return;
        }
        this.qlsp.insert(p);
        this.loadTable();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
          File file = new File(filename);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.qlsp.getList());
            JOptionPane.showMessageDialog(this, "success");
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");

        }
    }//GEN-LAST:event_cbbThemActionPerformed

    private void cbbSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSuaActionPerformed
        int row = this.tblSP.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng trên table");
            return;
        }
        Product p = this.getForm();
        this.qlsp.update(row, p);
        this.loadTable();
        JOptionPane.showMessageDialog(this, "update thành công");
    }//GEN-LAST:event_cbbSuaActionPerformed

    private void cbbXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbXoaActionPerformed
        // TODO add your handling code here:
        int row = this.tblSP.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng trên table");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá k?");
        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        } else {

        }
        this.qlsp.delete(row);
        this.loadTable();
        this.clearform();

    }//GEN-LAST:event_cbbXoaActionPerformed

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        // TODO add your handling code here:\
        int row = this.tblSP.getSelectedRow();
        if (row == -1) {
            return;
        }
        String ten = this.tblSP.getValueAt(row, 0).toString();
        String ma = this.tblSP.getValueAt(row, 1).toString();
        String danhmuc = this.tblSP.getValueAt(row, 2).toString();
        String tinhTrang = this.tblSP.getValueAt(row, 3).toString();
        String donGia = this.tblSP.getValueAt(row, 4).toString();

        this.txtTenSp.setText(ten);
        this.txtMaSp.setText(ma);
        this.cbbDanhMuc.setSelectedItem(danhmuc);
        if (tinhTrang.equalsIgnoreCase("Còn hàng")) {
            this.rdoCon.setSelected(true);
        } else {
            this.rdoHet.setSelected(true);
        }
        this.txtDonGia.setText(donGia
        );

    }//GEN-LAST:event_tblSPMouseClicked
    public void clearform() {
        this.txtTenSp.setText("");
        this.txtMaSp.setText("");
        this.rdoCon.setSelected(true);
        this.txtDonGia.setText("");
    }
    private void cbbXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbXoaFormActionPerformed
        // TODO add your handling code here:
        this.clearform();
    }//GEN-LAST:event_cbbXoaFormActionPerformed

    private void cbbGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGhiActionPerformed
        // TODO add your handling code here:
        File file = new File(filename);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.qlsp.getList());
            JOptionPane.showMessageDialog(this, "success");
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");

        }


    }//GEN-LAST:event_cbbGhiActionPerformed

    private void DocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocActionPerformed
        // TODO add your handling code here:
        File file = new File(filename);
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Product> ds = (ArrayList<Product>) ois.readObject();
            JOptionPane.showMessageDialog(this, "Đọc ok");
            this.qlsp.setList(ds);
            this.loadTable();
            ois.close();

        } catch (FileNotFoundException e) {
           e.printStackTrace();
             JOptionPane.showMessageDialog(this, "file not found");
        } catch (IOException e) {
           e.printStackTrace();
             JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
             JOptionPane.showMessageDialog(this, "Lỗi dữ liệu");
           
        }


    }//GEN-LAST:event_DocActionPerformed

    private void cbbThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cbbThoatActionPerformed

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
            java.util.logging.Logger.getLogger(QLSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSPJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSPJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Doc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbDanhMuc;
    private javax.swing.JButton cbbGhi;
    private javax.swing.JButton cbbSua;
    private javax.swing.JButton cbbThem;
    private javax.swing.JButton cbbThoat;
    private javax.swing.JButton cbbXoa;
    private javax.swing.JButton cbbXoaForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoCon;
    private javax.swing.JRadioButton rdoHet;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSp;
    private javax.swing.JTextField txtTenSp;
    // End of variables declaration//GEN-END:variables
}
