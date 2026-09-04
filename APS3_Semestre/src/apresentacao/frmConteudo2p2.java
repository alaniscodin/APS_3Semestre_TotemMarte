
package apresentacao;


public class frmConteudo2p2 extends javax.swing.JDialog {

    /**
     * Creates new form frmConteuro
     */
    public frmConteudo2p2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btninicioe = new javax.swing.JButton();
        btnvoltarTelaInicial2 = new javax.swing.JButton();
        btnvoltarTelaInicial1 = new javax.swing.JButton();
        lblTela1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btninicioe.setBackground(new java.awt.Color(79, 76, 137));
        btninicioe.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btninicioe.setForeground(new java.awt.Color(255, 255, 255));
        btninicioe.setText("voltar");
        btninicioe.setToolTipText("");
        btninicioe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btninicioe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninicioe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioeActionPerformed(evt);
            }
        });
        getContentPane().add(btninicioe);
        btninicioe.setBounds(80, 50, 140, 40);

        btnvoltarTelaInicial2.setBackground(new java.awt.Color(79, 76, 137));
        btnvoltarTelaInicial2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnvoltarTelaInicial2.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltarTelaInicial2.setText("inicio");
        btnvoltarTelaInicial2.setToolTipText("");
        btnvoltarTelaInicial2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltarTelaInicial2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvoltarTelaInicial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarTelaInicial2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltarTelaInicial2);
        btnvoltarTelaInicial2.setBounds(230, 50, 140, 40);

        btnvoltarTelaInicial1.setBackground(new java.awt.Color(79, 76, 137));
        btnvoltarTelaInicial1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnvoltarTelaInicial1.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltarTelaInicial1.setText("continuar");
        btnvoltarTelaInicial1.setToolTipText("");
        btnvoltarTelaInicial1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltarTelaInicial1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvoltarTelaInicial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarTelaInicial1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltarTelaInicial1);
        btnvoltarTelaInicial1.setBounds(1280, 700, 180, 40);

        lblTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela1_1.png"))); // NOI18N
        lblTela1.setAlignmentY(0.0F);
        getContentPane().add(lblTela1);
        lblTela1.setBounds(10, -10, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninicioeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioeActionPerformed
        frmConteudo2 frmPS = new frmConteudo2(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);
    }//GEN-LAST:event_btninicioeActionPerformed

    private void btnvoltarTelaInicial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarTelaInicial2ActionPerformed
        frmConteudo1 frmPS = new frmConteudo1(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnvoltarTelaInicial2ActionPerformed

    private void btnvoltarTelaInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarTelaInicial1ActionPerformed
        frmConteudo2p3 frmPS = new frmConteudo2p3(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);
    }//GEN-LAST:event_btnvoltarTelaInicial1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmConteudo2p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConteudo2p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConteudo2p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConteudo2p2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmConteudo2p2 dialog = new frmConteudo2p2(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninicioe;
    private javax.swing.JButton btnvoltarTelaInicial1;
    private javax.swing.JButton btnvoltarTelaInicial2;
    private javax.swing.JLabel lblTela1;
    // End of variables declaration//GEN-END:variables
}
