/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class pemeriksaan extends javax.swing.JFrame {
    private Connection Con;
    private Statement stm;

    /**
     * Creates new form user
     */
    public pemeriksaan() {
        initComponents();
        tampilkan_data();
         setLocationRelativeTo(this);
        aktif(false);
        setTombol(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        bttambah = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kodeinap = new javax.swing.JTextField();
        kodepasien = new javax.swing.JTextField();
        namapasien = new javax.swing.JTextField();
        cariinap = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        kodedokter = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        namadokter = new javax.swing.JTextField();
        caridokter = new javax.swing.JButton();
        caripasien = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        namaperawat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tglmasuk = new javax.swing.JTextField();
        kodeperawat = new javax.swing.JComboBox();
        Tindakkan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(151, 249, 227));

        bttambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-tambah.png"))); // NOI18N
        bttambah.setBorder(null);
        bttambah.setContentAreaFilled(false);
        bttambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttambahActionPerformed(evt);
            }
        });

        btsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-simpan.png"))); // NOI18N
        btsimpan.setBorder(null);
        btsimpan.setContentAreaFilled(false);
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });

        btedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-edit.png"))); // NOI18N
        btedit.setBorder(null);
        btedit.setContentAreaFilled(false);
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });

        bthapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-hapus.png"))); // NOI18N
        bthapus.setBorder(null);
        bthapus.setContentAreaFilled(false);
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });

        btbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-batal.png"))); // NOI18N
        btbatal.setBorder(null);
        btbatal.setContentAreaFilled(false);
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });

        btkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-fKeluar.png"))); // NOI18N
        btkeluar.setBorder(null);
        btkeluar.setContentAreaFilled(false);
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btedit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bthapus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btbatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btkeluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttambah)
                    .addComponent(btedit)
                    .addComponent(btbatal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bthapus)
                    .addComponent(btsimpan)
                    .addComponent(btkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 670, 110));

        jPanel3.setBackground(new java.awt.Color(151, 249, 227));

        jPanel2.setBackground(new java.awt.Color(151, 249, 227));

        jLabel1.setText("Kode Pemeriksaan");

        jLabel3.setText("Kode Pasien");

        jLabel4.setText("Nama Pasien");

        kodeinap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeinapActionPerformed(evt);
            }
        });

        cariinap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-cari.png"))); // NOI18N
        cariinap.setBorder(null);
        cariinap.setContentAreaFilled(false);
        cariinap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariinapActionPerformed(evt);
            }
        });

        jLabel8.setText("Kode Dokter");

        kodedokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodedokterActionPerformed(evt);
            }
        });

        jLabel9.setText("Nama");

        caridokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-cari.png"))); // NOI18N
        caridokter.setBorder(null);
        caridokter.setContentAreaFilled(false);
        caridokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caridokterActionPerformed(evt);
            }
        });

        caripasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-cari.png"))); // NOI18N
        caripasien.setBorder(null);
        caripasien.setContentAreaFilled(false);
        caripasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caripasienActionPerformed(evt);
            }
        });

        jLabel10.setText("Diagnosa");

        jLabel11.setText("Tanggal Periksa");

        namaperawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaperawatActionPerformed(evt);
            }
        });

        jLabel12.setText("Hasil");

        kodeperawat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Berat", "Ringan" }));
        kodeperawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeperawatActionPerformed(evt);
            }
        });

        Tindakkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn-tindakan.png"))); // NOI18N
        Tindakkan.setBorder(null);
        Tindakkan.setContentAreaFilled(false);
        Tindakkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TindakkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeperawat, 0, 173, Short.MAX_VALUE)
                            .addComponent(namapasien)
                            .addComponent(kodepasien, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namadokter)
                            .addComponent(kodedokter)
                            .addComponent(kodeinap))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cariinap, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caridokter, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caripasien, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(53, 53, 53))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namaperawat, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tglmasuk)
                        .addGap(18, 18, 18)
                        .addComponent(Tindakkan)
                        .addGap(29, 29, 29))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kodeinap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariinap, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kodedokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caridokter))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namadokter)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kodepasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caripasien))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namapasien)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kodeperawat)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaperawat))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tglmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tindakkan))
                .addContainerGap())
        );

        jLabel5.setText("Masukkan Data Pemeriksaan");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 490, 380));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg-periksa.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
String user_id = kodeinap.getText();

String kodedokterq = kodedokter.getText();
String namadokterq = namadokter.getText();
String kodepasienq = kodepasien.getText();
String namapasienq = namapasien.getText();
String kodeperawatq = (String) kodeperawat.getSelectedItem();
String namaperawatq = namaperawat.getText();
String tglmasukq = tglmasuk.getText();
try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="UPDATE pemeriksaan SET kd_dokter='"+kodedokterq+"',nama_dokter='"+namadokterq+"',kd_pasien='"+kodepasienq+"',nama_pasien='"+namapasienq+"',diagnosa='"+kodeperawatq+"',tgl_pemeriksaan='"+namaperawatq+"',hasil='"+tglmasukq+"' WHERE kd_pemeriksaan LIKE '"+user_id+"'";
statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil diedit..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) {
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}finally{
tampilkan_data();
}
    }//GEN-LAST:event_bteditActionPerformed

    private void kodeperawatq(){ 
kodeperawat.addItem("Berat"); 
kodeperawat.addItem("Ringan"); 
kodeperawat.setSelectedIndex(-1); }
    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
kodeinap.setText("");
kodedokter.setText("");
namadokter.setText("");
kodepasien.setText("");
namapasien.setText("");
kodeperawat.setSelectedItem("");
namaperawat.setText("");
tglmasuk.setText("");
aktif(false);
setTombol(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btbatalActionPerformed

    private void cariinapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariinapActionPerformed
        // TODO add your handling code here:
        String user_id = kodeinap.getText();
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="SELECT * FROM pemeriksaan WHERE kd_pemeriksaan like '"+user_id+"'";
 ResultSet rs = statement.executeQuery(sql);
if (rs.next())
{
aktif(true);
setTombol(false);
kodedokter.setText(rs.getString(2));
namadokter.setText(rs.getString(3));
kodepasien.setText(rs.getString(4));
namapasien.setText(rs.getString(5));
kodeperawat.setSelectedItem(rs.getString(6));
namaperawat.setText(rs.getString(7));
tglmasuk.setText(rs.getString(8));


JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
statement.close();
koneksi.close();
}
catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
} 
    }//GEN-LAST:event_cariinapActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
String user_id = kodeinap.getText();

String kodedokterq = kodedokter.getText();
String namadokterq = namadokter.getText();
String kodepasienq = kodepasien.getText();
String namapasienq = namapasien.getText();
String kodeperawatq = (String) kodeperawat.getSelectedItem();
String namaperawatq = namaperawat.getText();
String tglmasukq = tglmasuk.getText();

{
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="insert into pemeriksaan values('"+user_id+"','"+kodedokterq+"','"+namadokterq+"','"+kodepasienq+"','"+namapasienq+"','"+kodeperawatq+"','"+namaperawatq+"','"+tglmasukq+"')";
int executeUpdate = statement.executeUpdate(sql);
statement.close();
JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
aktif(true);
kodeinap.setText("");

kodedokter.setText("");
namadokter.setText("");
kodepasien.setText("");
namapasien.setText("");
kodeperawat.setSelectedItem("");
namaperawat.setText("");
tglmasuk.setText("");

koneksi.close();
}
catch (     ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
finally {
tampilkan_data();
}
    }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bttambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttambahActionPerformed
aktif(true);
setTombol(false);        // TODO add your handling code here:
    }//GEN-LAST:event_bttambahActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
        String user_id = kodeinap.getText();
      try {
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="DELETE FROM pemeriksaan WHERE kd_pemeriksaan LIKE '"+user_id+"'";
statement.executeUpdate(sql);
statement.close();
kodeinap.setText("");

kodedokter.setText("");
namadokter.setText("");
kodepasien.setText("");
namapasien.setText("");
kodeperawat.setSelectedItem("");
namaperawat.setText("");
tglmasuk.setText("");

JOptionPane.showMessageDialog(null, "Data berhasil dihapus..","Insert Data",JOptionPane.INFORMATION_MESSAGE);
koneksi.close();
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e) { JOptionPane.showMessageDialog(null, "Eror: "+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}finally{
tampilkan_data();
      }
    }//GEN-LAST:event_bthapusActionPerformed

    private void kodeinapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeinapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeinapActionPerformed

    private void kodedokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodedokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodedokterActionPerformed

    private void caridokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caridokterActionPerformed
        // TODO add your handling code here:
                String kodedokterq = kodedokter.getText();
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="SELECT * FROM dokter WHERE kd_dokter like '"+kodedokterq+"'";
 ResultSet rs = statement.executeQuery(sql);
if (rs.next())
{
aktif(true);
setTombol(false);
namadokter.setText(rs.getString(2));

JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
statement.close();
koneksi.close();
}
catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
    }//GEN-LAST:event_caridokterActionPerformed

    private void caripasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caripasienActionPerformed
        // TODO add your handling code here:
                String kodepasienq = kodepasien.getText();
try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
Statement statement = (Statement) koneksi.createStatement();
String sql="SELECT * FROM pasien WHERE kd_pasien like '"+kodepasienq+"'";
 ResultSet rs = statement.executeQuery(sql);
if (rs.next())
{
aktif(true);
setTombol(false);
namapasien.setText(rs.getString(2));

JOptionPane.showMessageDialog(null, "Data ditemukan","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
else
{
JOptionPane.showMessageDialog(null, "Data tidak ditemukan ","Insert Data",JOptionPane.INFORMATION_MESSAGE);
}
statement.close();
koneksi.close();
}
catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException | HeadlessException e)
{
JOptionPane.showMessageDialog(null, "Eror:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
//System.err.println("Exception: "+e.getMessage());
}
    }//GEN-LAST:event_caripasienActionPerformed

    private void TindakkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TindakkanActionPerformed
        String kodeperawatq = (String)(kodeperawat.getSelectedItem());
        if(kodeperawatq=="Berat"){
         new rawat_inap().setVisible(true);
             dispose();
        }
        else if(kodeperawatq=="Ringan"){
            new rawat_jalan().setVisible(true);
             dispose();    
        }

    }//GEN-LAST:event_TindakkanActionPerformed

    private void kodeperawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeperawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeperawatActionPerformed

    private void namaperawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaperawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaperawatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemeriksaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new pemeriksaan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Tindakkan;
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btedit;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton bttambah;
    private javax.swing.JButton caridokter;
    private javax.swing.JButton cariinap;
    private javax.swing.JButton caripasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField kodedokter;
    private javax.swing.JTextField kodeinap;
    private javax.swing.JTextField kodepasien;
    private javax.swing.JComboBox kodeperawat;
    private javax.swing.JTextField namadokter;
    private javax.swing.JTextField namapasien;
    private javax.swing.JTextField namaperawat;
    private javax.swing.JTextField tglmasuk;
    // End of variables declaration//GEN-END:variables

    private void tampilkan_data() {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("KODE PEMERIKSAAN");
        tabelmapel.addColumn("KODE DOKTER");
        tabelmapel.addColumn("NAMA DOKTER");
        tabelmapel.addColumn("KODE PASIEN");
        tabelmapel.addColumn("NAMA PASIEN");
        tabelmapel.addColumn("DIAGNOSA");
        tabelmapel.addColumn("TANGGAL PERIKSA");
        tabelmapel.addColumn("HASIL");
        try {
            open_db();
             String sql = "select * from pemeriksaan";
            stm = (Statement) Con.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[8];
                o[0] = rs.getString("kd_pemeriksaan");
                o[1] = rs.getString("kd_dokter");
                o[2] = rs.getString("nama_dokter");
                o[3] = rs.getString("kd_pasien");
                o[4] = rs.getString("nama_pasien");
                o[5] = rs.getString("diagnosa");
                o[6] = rs.getString("tgl_pemeriksaan");
                o[7] = rs.getString("hasil");
                tabelmapel.addRow(o);
                
            }
           jTable1.setModel(tabelmapel);
        } catch (Exception e) {
        }
    }

    private void open_db() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
Con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/RumahSakit", "root", "");
            stm = (Statement) Con.createStatement();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi gagal");
            System.out.println(e.getMessage());
        }
    }

    private void aktif(boolean x) {
      
      kodepasien.setEditable(x);
      namapasien.setEditable(x);
      kodeinap.requestFocus();}

    private void setTombol(boolean t) {
     bttambah.setEnabled(t);
     btsimpan.setEnabled(!t);
     bthapus.setEnabled(!t);
     btedit.setEnabled(!t);
     btbatal.setEnabled(!t);
    }
}
