
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author DELL
 */
public class QLDocGia extends javax.swing.JFrame {

    ArrayList<docgiaModal> list = new ArrayList<>();
    int current = 0;
    String userName = "sa";
    String password = "hanh789";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=QLTV_BT";
    private DefaultTableModel tableModel;
    private int stt;

    /**
     * Creates new form QLDocGia
     */
    public QLDocGia() {
        initComponents();
        LoadDataToArray();
        LoadDataArrayListToTable();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton3 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldocGia = new javax.swing.JTable();
        txttenDG = new javax.swing.JTextField();
        txtmaDG = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtdiaChi = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnLamMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        rdoTheoMDG = new javax.swing.JRadioButton();
        rdoTheoTDG = new javax.swing.JRadioButton();
        txtTim = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("QUẢN LÝ ĐỘC GIẢ");

        jLabel9.setText("Mã ĐG:");

        jLabel10.setText("Tên ĐG:");

        jLabel11.setText("Giới tính:");

        jLabel14.setText("SĐT");

        jLabel15.setText("Email:");

        jLabel16.setText("Địa chỉ:");

        tbldocGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã ĐG", "Tên ĐG", "Giới tính", "SĐT", "Email", "Địa chỉ"
            }
        ));
        tbldocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldocGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldocGia);

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        jButton1.setText("Trở lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thoát");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("tìm kiếm"));

        buttonGroup2.add(rdoTheoMDG);
        rdoTheoMDG.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rdoTheoMDG.setText("Theo Mã Độc Giả");

        buttonGroup2.add(rdoTheoTDG);
        rdoTheoTDG.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rdoTheoTDG.setText("Theo Tên Độc Giả");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdoTheoTDG)
                    .addComponent(rdoTheoMDG))
                .addGap(18, 18, 18)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnTimKiem)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdoTheoMDG)
                        .addGap(9, 9, 9)
                        .addComponent(rdoTheoTDG))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton4.setText("All");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(rdoNam)
                                .addGap(50, 50, 50)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtmaDG, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txttenDG, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdiaChi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLamMoi)
                                .addGap(27, 27, 27)
                                .addComponent(btnLuu)
                                .addGap(32, 32, 32)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhat)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addGap(24, 24, 24)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtmaDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txttenDG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnLuu)
                    .addComponent(btnXoa)
                    .addComponent(btnCapNhat)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbldocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldocGiaMouseClicked
        // TODO add your handling code here:
//        int r = tbldocGia.getSelectedRow();
//        DefaultTableModel model = (DefaultTableModel) tbldocGia.getModel();
//
//        String maDG = (String) model.getValueAt(r, 0);
//        String tenDG = (String) model.getValueAt(r, 1);
//        
//
//        String gioiTinh = (String) model.getValueAt(r, 2);
//        String sdt = (String) model.getValueAt(r, 3);
//        String email = (String) model.getValueAt(r, 4);
//        String diaChi = (String) model.getValueAt(r, 5);
//
//        txtmaDG.setText(maDG);
//        txttenDG.setText(tenDG);
//        txtsdt.setText(sdt);
//        txtemail.setText(email);
//        txtdiaChi.setText(diaChi);
//
//        boolean g = gioiTinh.equalsIgnoreCase("Nam");
//        rdoNam.setSelected(g);
//        rdoNu.setSelected(!g);
        current = tbldocGia.getSelectedRow();
        Display(current);


    }//GEN-LAST:event_tbldocGiaMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        if (txtmaDG.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập mã độc giả");
            txtmaDG.requestFocus();
        }
        try {
            int row = 0;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, userName, password);
            String sql = "delete from QLDocGia where MaDocGia = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, txtmaDG.getText());

            row = st.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Mã độc giả không đúng");
            }
            xoatrang();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi");
            System.out.println(e);
        }
        LoadDataToArray();
        LoadDataArrayListToTable();
    }//GEN-LAST:event_btnXoaActionPerformed
    private void xoatrang() {

        txtmaDG.setText("");
        txttenDG.setText("");
        txtdiaChi.setText("");
        txtemail.setText("");
        txtsdt.setText("");
        rdoNam.setSelected(false);
        rdoNu.setSelected(false);

    }
    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        if (txtmaDG.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhập mã độc giả");
            txtmaDG.requestFocus();
        }
        try {
            int row = 0;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, userName, password);
            String sql = "update QLDocGia set TenDocGia=?, GioiTinh=?, SoDienThoai=?, Email=?, DiaChi=? where MaDocGia = ?";
            PreparedStatement st = conn.prepareStatement(sql);

            st.setString(1, txttenDG.getText());
            st.setString(3, txtsdt.getText());
            st.setString(4, txtemail.getText());
            st.setString(5, txtdiaChi.getText());
            st.setString(6, txtmaDG.getText());
            boolean gt;
            if (rdoNu.isSelected()) {
                gt = true;
            } else {
                gt = false;
            }
            st.setBoolean(2, gt);

            row = st.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Mã độc giả không đúng");
            }
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi");
            System.out.println(e);
        }
        LoadDataToArray();
        LoadDataArrayListToTable();
    }//GEN-LAST:event_btnCapNhatActionPerformed
    public boolean checktrung(String ma) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).maDG.equalsIgnoreCase(ma)) {
                return true;
            }

        }
        return false;
    }
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder(); // để ghi thông báo nếu để rỗng giá trị hoặc không chọn
        if (txtmaDG.getText().isBlank()) {
            sb.append("Bạn cần nhập mã độc giả\n");
        }
        if (txttenDG.getText().isBlank()) {
            sb.append("Bạn cần nhập họ tên độc giả\n");
        }
        if (txtsdt.getText().isBlank()) {
            sb.append("Bạn cần nhập sdt độc giả\n");
        }
        if (txtemail.getText().isBlank()) {
            sb.append("Bạn cần nhập email độc giả\n");
        }
        if (txtdiaChi.getText().isBlank()) {
            sb.append("Bạn cần nhập địa chỉ độc giả\n");
        }

        if (!rdoNam.isSelected() && !rdoNu.isSelected()) {
            sb.append("Bạn cần chọn giới tính độc giả\n");
        }

        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(null, sb);//nếu sb(đoạn cảnh báo) có độ dài thì xuất hiện bảng loại messa có câu cảnh báo
        } else {
            if (checktrung(txtmaDG.getText()) == true) {
                JOptionPane.showMessageDialog(this, "Nhập mã độc giả bị trùng");

            } else {
                int row = 0;

                try {

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection conn = DriverManager.getConnection(url, userName, password);
                    String sql = "insert into QLDocGia values (?,?,?,?,?,?)";
                    PreparedStatement st = conn.prepareStatement(sql);
                    st.setString(1, txtmaDG.getText());
                    st.setString(2, txttenDG.getText());
                    st.setString(4, txtsdt.getText());
                    st.setString(5, txtemail.getText());
                    st.setString(6, txtdiaChi.getText());

                    boolean gt;
                    if (rdoNu.isSelected()) {
                        gt = true;
                    } else {
                        gt = false;
                    }
                    st.setBoolean(3, gt);

                    row = st.executeUpdate();
                    if (row > 0) {
                        JOptionPane.showMessageDialog(this, "Lưu thành công");
                    } else {
                        JOptionPane.showMessageDialog(this, "Mã độc giả không đúng");
                    }
                    conn.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Lỗi");
                    System.out.println(e);
                }
            }
        }
        LoadDataToArray();
        LoadDataArrayListToTable();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
//        txtmaDG.setText("");
//        txttenDG.setText("");
//        txtsdt.setText("");
//        txtemail.setText("");
//        txtdiaChi.setText("");
//        rdoNam.setSelected(false);
//        rdoNu.setSelected(false);
//
//        txtmaDG.requestFocus();
        tableModel = (DefaultTableModel) tbldocGia.getModel();
        tableModel.setRowCount(0);
        int stt = 1;
        for (var e : list) {
            var row = new Object[]{stt++, e.getMaDG(), e.getTenDG(), e.getEmail(), e.getSdt(), e.getDiaChi()};

        }

    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new MenuChinh().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int r = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát không?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        var timK = txtTim.getText();
        if (!timK.isEmpty()) {
            if (rdoTheoMDG.isSelected()) {
                timtheoMaDG();
            } else {
                timtheoTenDG();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "ô tìm kiếm đang rỗng!");
        }

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LoadDataArrayListToTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void timtheoMaDG() {
        String maDG = txtTim.getText();
        DefaultTableModel model = (DefaultTableModel) tbldocGia.getModel();
        model.setRowCount(0);
        boolean tim = false;

        for (docgiaModal dg : list) {
            if (dg.getMaDG().toLowerCase().contains(maDG.toLowerCase())) {
                model.addRow(new Object[]{dg.getMaDG(), dg.getTenDG(), dg.isGioiTinh(), dg.getSdt(), dg.getEmail(), dg.getDiaChi()});
                tim = true;
            }
        }
        if (!tim) {
            JOptionPane.showMessageDialog(this, "Mã độc giả không tồn tại");
        }
    }

    private void timtheoTenDG() {
        String tenDG = txtTim.getText();
        DefaultTableModel model = (DefaultTableModel) tbldocGia.getModel();
        model.setRowCount(0);
        boolean tim = false;

        for (docgiaModal dg : list) {
            if (dg.getTenDG().toLowerCase().contains(tenDG.toLowerCase())) {
                model.addRow(new Object[]{dg.getMaDG(), dg.getTenDG(), dg.isGioiTinh(), dg.getSdt(), dg.getEmail(), dg.getDiaChi()});
                tim = true;
            }
        }
        if (!tim) {
            JOptionPane.showMessageDialog(this, "Tên độc giả không tồn tại");
        }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDocGia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLDocGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoTheoMDG;
    private javax.swing.JRadioButton rdoTheoTDG;
    private javax.swing.JTable tbldocGia;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtdiaChi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmaDG;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttenDG;
    // End of variables declaration//GEN-END:variables

    private void LoadDataToArray() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection conn = DriverManager.getConnection(url, userName, password);
            Statement stm = (Statement) conn.createStatement();
            String sql = "select * from QLDocGia";
            ResultSet rs = stm.executeQuery(sql);
            list.clear();
            while (rs.next()) {
                String maDG = rs.getString(1);
                String tenDG = rs.getString(2);
                boolean gioiTinh = rs.getBoolean(3);
                String sdt = rs.getString(4);
                String email = rs.getString(5);
                String diaChi = rs.getString(6);

                docgiaModal docgia = new docgiaModal(maDG, tenDG, gioiTinh, sdt, email, diaChi);
                list.add(docgia);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Ket noi that bai");
            System.out.println(e);
        }
    }

    private void LoadDataArrayListToTable() {
        DefaultTableModel model = (DefaultTableModel) tbldocGia.getModel();
        model.setRowCount(0);

        for (docgiaModal dg : list) {
            model.addRow(new Object[]{dg.getMaDG(), dg.getTenDG(), dg.isGioiTinh(), dg.getSdt(), dg.getEmail(), dg.getDiaChi()});
        }
    }

    private void Display(int current) {
        docgiaModal dg = list.get(current);
        txtmaDG.setText(dg.maDG);
        txttenDG.setText(dg.tenDG);
        txtsdt.setText(dg.sdt);
        txtemail.setText(dg.email);
        txtdiaChi.setText(dg.diaChi);
        boolean gt = dg.gioiTinh;
        if (gt == true) {
            rdoNu.setSelected(true);
        } else {
            rdoNam.setSelected(true);
        }
    }

}
