/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dna
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nm = new javax.swing.JLabel();
        kls = new javax.swing.JLabel();
        al = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        OKE = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nm1 = new javax.swing.JLabel();
        kls1 = new javax.swing.JLabel();
        al2 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JTextField();
        Kelas1 = new javax.swing.JTextField();
        Alamat1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nm.setText("Nama");
        getContentPane().add(nm);
        nm.setBounds(90, 50, 40, 14);

        kls.setText("Kelas");
        getContentPane().add(kls);
        kls.setBounds(90, 80, 40, 14);

        al.setText("Alamat");
        getContentPane().add(al);
        al.setBounds(90, 110, 40, 14);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(160, 50, 130, 20);
        getContentPane().add(Kelas);
        Kelas.setBounds(160, 80, 130, 20);
        getContentPane().add(Alamat);
        Alamat.setBounds(160, 110, 130, 20);

        OKE.setText("OKE");
        OKE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKEActionPerformed(evt);
            }
        });
        getContentPane().add(OKE);
        OKE.setBounds(170, 140, 73, 23);

        jLabel4.setText("Formulir");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 10, 50, 14);

        nm1.setText("Nama");
        getContentPane().add(nm1);
        nm1.setBounds(90, 180, 40, 14);

        kls1.setText("Kelas");
        getContentPane().add(kls1);
        kls1.setBounds(90, 210, 40, 14);

        al2.setText("Alamat");
        getContentPane().add(al2);
        al2.setBounds(90, 240, 40, 14);

        Nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(Nama1);
        Nama1.setBounds(160, 180, 130, 20);
        getContentPane().add(Kelas1);
        Kelas1.setBounds(160, 210, 130, 20);
        getContentPane().add(Alamat1);
        Alamat1.setBounds(160, 240, 130, 20);

        setBounds(0, 0, 416, 338);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void OKEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKEActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        Nama1.setText(nama);
        String kelas = Kelas.getText();
        Kelas1.setText(kelas);
        String alamat = Alamat.getText();
        Alamat1.setText(alamat);
    }//GEN-LAST:event_OKEActionPerformed

    private void Nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nama1ActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Alamat1;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Kelas1;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nama1;
    private javax.swing.JButton OKE;
    private javax.swing.JLabel al;
    private javax.swing.JLabel al2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel kls;
    private javax.swing.JLabel kls1;
    private javax.swing.JLabel nm;
    private javax.swing.JLabel nm1;
    // End of variables declaration//GEN-END:variables
}
