/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Assignment;

import Assignment.QLNhanVien;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author anhkon
 */
public class QLNVJFrame extends javax.swing.JFrame {
    private DefaultTableModel dtm;
    private QLNhanVien qlnv = new QLNhanVien();
    String filename = "file_asm.txt";

    public QLNVJFrame() {
        initComponents();

        this.rdoNam.setSelected(true);
        this.qlnv = new QLNhanVien();
        this.qlnv.insert(new NhanVien("PH12345", "Nguyễn Văn A", "13/08/1999", 1, 200000f, "Nhân Viên"));
        this.qlnv.insert(new NhanVien("PH12346", "Phạm Thị Phương", "15/11/1992", 0, 400000f, "Trưởng phòng"));
        this.qlnv.insert(new NhanVien("PH12347", "Bùi Văn Đức", "12/02/2001", 1, 150000f, "Nhân Viên"));
        this.qlnv.insert(new NhanVien("PH12348", "An Văn Nam", "11/01/1990", 1, 300000f, "Nhân Viên"));
        this.loadTable();
        this.clearForm();
        new Thread() {
            public void run() {
                while (true) {
                    Calendar ca = new GregorianCalendar();

                    int hour = ca.get(Calendar.HOUR_OF_DAY);
                    int minute = ca.get(Calendar.MINUTE);
                    int second = ca.get(Calendar.SECOND);

                    String time = hour + ":" + minute + ":" + second;

                    lblTime.setText(time);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }

    private void loadTable() {
        ArrayList<NhanVien> ds = this.qlnv.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblNv.getModel();
        dtm.setRowCount(0);
        for (NhanVien n : ds) {
            Object[] rowData = {
                n.getMaNv(),
                n.getHoTen(),
                n.getGioiTinh() == 1 ? "Nam" : "Nữ",
                n.getNgaySinh(),
                n.getLuong(),
                n.getChucVu()
            };
            dtm.addRow(rowData);
        }
    }

    private NhanVien getFormData() {
        String maNv = this.txtManv.getText();
        String hoTen = this.txtName.getText();

        String luong = this.txtLuong.getText();
        String ngaySinh = this.txtNgaySinh.getText();

        String chucVu = this.cbbChucVu.getSelectedItem().toString();
        int gt = this.rdoNam.isSelected() ? 1 : 0;

        if (txtName.getText().trim().equals("") || txtNgaySinh.getText().trim().equals("") || txtLuong.getText().trim().equals("") || txtManv.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }

        if (txtName.getText().trim().length() < 6) {
            JOptionPane.showMessageDialog(this, " tên phải lớn hơn 6 kí tự");
            return null;
        }
        if (txtManv.getText().trim().length() < 7) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên phải đúng 7 kí tự");
            return null;
        } else if (txtManv.getText().trim().length() > 7) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên phải đúng 7 kí tự");
            return null;
        } else {

        }

        try {
            double Luong = Double.parseDouble(txtLuong.getText());
            if (Luong <= 0) {
                JOptionPane.showMessageDialog(this, "Lương phải lớn hơn 0");
                return null;
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lương phải là số");

        }
        
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/MM/yyyy");      
        try {
            Date date = sdf.parse(txtNgaySinh.getText());

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ngày sinh không đúng định dạng");
            return null;
        }

        NhanVien nv = new NhanVien(maNv, hoTen, ngaySinh, gt, Double.parseDouble(luong), chucVu);
        return nv;
    }

    private void clearForm() {
        this.txtManv.setText("");
        this.txtName.setText("");
        this.txtNgaySinh.setText("");
        this.txtLuong.setText("");
        this.rdoNam.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        cbbChucVu = new javax.swing.JComboBox<>();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbbSort = new javax.swing.JComboBox<>();
        cbbChieu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNv = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaForm = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã NV");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Ngày sinh");

        jLabel4.setText("Giới tính");

        jLabel5.setText("Lương");

        jLabel6.setText("Chức vụ");

        cbbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trưởng phòng", "Nhân viên", "None" }));
        cbbChucVu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbChucVuItemStateChanged(evt);
            }
        });
        cbbChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChucVuActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        jLabel7.setText("Sắp xếp theo");

        jLabel8.setText("Chiều");

        cbbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Lương", "Ngày sinh" }));
        cbbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSortActionPerformed(evt);
            }
        });

        cbbChieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));
        cbbChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChieuActionPerformed(evt);
            }
        });

        tblNv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nv", "Họ tên", "Giới tính", "Ngày sinh", "Lương", "Chức vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNv);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXoaForm.setText("Xoá Form");
        btnXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnDoc.setText("Đọc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnFind.setText("Tìm NV");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 0, 0));
        lblTime.setText("time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(297, 297, 297)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem)
                                    .addComponent(btnDoc))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGhi)
                                    .addComponent(btnSua))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(btnFind))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXoaForm)
                                        .addGap(6, 6, 6))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtManv)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(rdoNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdoNu))
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblTime)))
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(cbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaForm)
                    .addComponent(btnThoat))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDoc)
                            .addComponent(btnGhi)
                            .addComponent(btnFind))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        ArrayList<NhanVien> ds = this.qlnv.getList();
        NhanVien nv = this.getFormData();
        if (nv == null) {
            return;
        }

        this.qlnv.insert(nv);
        this.loadTable();
        this.clearForm();

        JOptionPane.showMessageDialog(this, "Thêm mới thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblNvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNvMouseClicked
        // TODO add your handling code here:
        int row = this.tblNv.getSelectedRow();

        if (row == -1) {
            return;
        }
        String maNv = this.tblNv.getValueAt(row, 0).toString();
        String hoTen = this.tblNv.getValueAt(row, 1).toString();
        String gioiTinh = this.tblNv.getValueAt(row, 2).toString();

        String NgaySinh = this.tblNv.getValueAt(row, 3).toString();
        String Luong = this.tblNv.getValueAt(row, 4).toString();
        String ChucVu = this.tblNv.getValueAt(row, 5).toString();

        this.txtManv.setText(maNv);
        this.txtName.setText(hoTen);
        this.txtLuong.setText(Luong);
        this.txtNgaySinh.setText(NgaySinh);

        this.cbbChucVu.setSelectedItem(ChucVu);

        if (gioiTinh.equals("Nam")) {
            this.rdoNam.setSelected(true);
        } else {
            this.rdoNu.setSelected(true);
        }
    }//GEN-LAST:event_tblNvMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = this.tblNv.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa trên Table");
            return;
        }

        NhanVien nv = this.getFormData();
        if (nv == null) {
            return;
        }

        this.qlnv.update(row, nv);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnXoaFormActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = this.tblNv.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng trên table");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa bản ghi này?");

        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        } else {

        }

        this.qlnv.delete(row);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnXoaActionPerformed


    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        ArrayList<NhanVien> ds = this.qlnv.getList();
        if (txtManv.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống mã NV");
            this.tblNv.getSelectionModel().clearSelection();
            this.clearForm();
            return;
            
        }
        String maNV = this.txtManv.getText();
        NhanVien nhanVien = null;
        int viTri = -1;
        for (NhanVien d : ds) {
            viTri++;
            if (d.getMaNv().equalsIgnoreCase(maNV)) {
                this.txtManv.setText(d.getMaNv());
                this.txtName.setText(d.getHoTen());
                this.txtLuong.setText(d.getNgaySinh());
                this.txtNgaySinh.setText(d.getNgaySinh());

                this.cbbChucVu.setSelectedItem(d.getChucVu());

                if (d.getGioiTinh() == 1) {
                    this.rdoNam.setSelected(true);
                } else {
                    this.rdoNu.setSelected(true);
                }
                JOptionPane.showMessageDialog(this, "Đã tìm thấy");
                this.tblNv.setRowSelectionInterval(viTri, viTri);
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Không tìm thấy");
        this.clearForm();
        
        this.tblNv.getSelectionModel().clearSelection();


    }//GEN-LAST:event_btnFindActionPerformed

    public void sapXepTenTang() {
        ArrayList<NhanVien> ds = this.qlnv.getList();
        Collections.sort(ds, (n1, n2) -> (n1.getHoTen().compareTo(n2.getHoTen())));
    }

    public void sapXepTenGiam() {
        ArrayList<NhanVien> ds = this.qlnv.getList();
        Collections.sort(ds, (n1, n2) -> (n2.getHoTen().compareTo(n1.getHoTen())));
    }

    public void sapXepluong() {
        ArrayList<NhanVien> ds = this.qlnv.getList();
        Collections.sort(ds, (n1, n2) -> (int) (n1.getLuong() - n2.getLuong()));

    }

    public void sapXepluongGiam() {
        ArrayList<NhanVien> ds = this.qlnv.getList();
        Collections.sort(ds, (n1, n2) -> (int) (n2.getLuong() - n1.getLuong()));

    }

    public void sapXeptuoiTang() {
        ArrayList<NhanVien> ds = this.qlnv.getList();
        Collections.sort(ds, (n1, n2) -> (n1.getNgaySinh().compareTo(n2.getNgaySinh())));
    }

    public void sapXeptuoiGiam() {
        ArrayList<NhanVien> ds = this.qlnv.getList();
        Collections.sort(ds, (n1, n2) -> (n2.getNgaySinh().compareTo(n1.getNgaySinh())));
    }


    private void cbbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSortActionPerformed
        // TODO add your handling code here:
//        if (this.cbbSort.getSelectedIndex() == 0) {
//            this.sapXepTenTang();
//
//        } else if (this.cbbSort.getSelectedIndex() == 1) {
//            this.sapXepluong();
//        } else {
//            this.sapXeptuoiTang();
//        }
    }//GEN-LAST:event_cbbSortActionPerformed

    private void cbbChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChieuActionPerformed
//         TODO add your handling code here:
        if (this.cbbChieu.getSelectedIndex() == 0 && this.cbbSort.getSelectedIndex() == 0) {
            this.sapXepTenTang();
            this.loadTable();
        } else if (this.cbbChieu.getSelectedIndex() == 1 && this.cbbSort.getSelectedIndex() == 0) {
            this.sapXepTenGiam();
            this.loadTable();
        }
        if (this.cbbChieu.getSelectedIndex() == 0 && this.cbbSort.getSelectedIndex() == 1) {
            this.sapXepluong();
            this.loadTable();
        } else if (this.cbbChieu.getSelectedIndex() == 1 && this.cbbSort.getSelectedIndex() == 1) {
            this.sapXepluongGiam();
            this.loadTable();
        }
        if (this.cbbChieu.getSelectedIndex() == 0 && this.cbbSort.getSelectedIndex() == 2) {
            this.sapXeptuoiTang();
            this.loadTable();
        } else if (this.cbbChieu.getSelectedIndex() == 1 && this.cbbSort.getSelectedIndex() == 2) {
            this.sapXeptuoiGiam();
            this.loadTable();
        }
    }//GEN-LAST:event_cbbChieuActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        File file = new File(this.filename);
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.qlnv.getList());
            JOptionPane.showMessageDialog(this, "Ghi thành công");
            oos.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        // TODO add your handling code here:
        File file = new File(filename);
        if (file.exists() == false) {
            JOptionPane.showMessageDialog(this, "File ko tồn tại");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<NhanVien> ds = (ArrayList<NhanVien>) ois.readObject();
            ois.close();
            this.qlnv.setList(ds);
            this.loadTable();
            JOptionPane.showMessageDialog(this, "Đọc thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Lỗi dữ liệu");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDocActionPerformed

        private void filter(String loc){
            TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
                tblNv.setRowSorter(trs);
              if (loc != "None") {
                trs.setRowFilter(RowFilter.regexFilter(loc));
            } else {
                tblNv.setRowSorter(trs);   
            }
            
        }
    private void cbbChucVuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbChucVuItemStateChanged
        // TODO add your handling code here:
       
    
    }//GEN-LAST:event_cbbChucVuItemStateChanged

    private void cbbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChucVuActionPerformed
         String loc = this.cbbChucVu.getSelectedItem().toString();
        int row = this.tblNv.getSelectedRow();
        ArrayList<NhanVien> list = new ArrayList<>();
        int index = cbbChucVu.getSelectedIndex();
        if (index > 0) {
            String value = cbbChucVu.getItemAt(index);
            filter(loc);
        }
       loadTable();
        
    }//GEN-LAST:event_cbbChucVuActionPerformed

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
            java.util.logging.Logger.getLogger(QLNVJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNVJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNVJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNVJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNVJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChieu;
    private javax.swing.JComboBox<String> cbbChucVu;
    private javax.swing.JComboBox<String> cbbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblNv;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}
