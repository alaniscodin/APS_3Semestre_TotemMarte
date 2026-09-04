
package apresentacao;


public class frmConteudo5p3 extends javax.swing.JDialog {

    /**
     * Creates new form frmConteuro
     */
    public frmConteudo5p3(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnvoltarTelaInicial = new javax.swing.JButton();
        btnvoltarTelaInicial1 = new javax.swing.JButton();
        btnvoltarTelaInicial2 = new javax.swing.JButton();
        lblTela1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btnvoltarTelaInicial.setBackground(new java.awt.Color(79, 76, 137));
        btnvoltarTelaInicial.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnvoltarTelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltarTelaInicial.setText("voltar");
        btnvoltarTelaInicial.setToolTipText("");
        btnvoltarTelaInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltarTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvoltarTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarTelaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltarTelaInicial);
        btnvoltarTelaInicial.setBounds(80, 50, 140, 40);

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

        lblTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela9.png"))); // NOI18N
        lblTela1.setAlignmentY(0.0F);
        getContentPane().add(lblTela1);
        lblTela1.setBounds(10, -10, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarTelaInicialActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnvoltarTelaInicialActionPerformed
    {//GEN-HEADEREND:event_btnvoltarTelaInicialActionPerformed
        frmConteudo5p2 frmPS = new frmConteudo5p2(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);
    }//GEN-LAST:event_btnvoltarTelaInicialActionPerformed

    private void btnvoltarTelaInicial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarTelaInicial1ActionPerformed
        frmConteudo5p4 frmPS = new frmConteudo5p4(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);
    }//GEN-LAST:event_btnvoltarTelaInicial1ActionPerformed

    private void btnvoltarTelaInicial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarTelaInicial2ActionPerformed
        frmConteudo1 frmPS = new frmConteudo1(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btnvoltarTelaInicial2ActionPerformed

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
            java.util.logging.Logger.getLogger(frmConteudo5p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConteudo5p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConteudo5p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConteudo5p3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmConteudo5p3 dialog = new frmConteudo5p3(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnvoltarTelaInicial;
    private javax.swing.JButton btnvoltarTelaInicial1;
    private javax.swing.JButton btnvoltarTelaInicial2;
    private javax.swing.JLabel lblTela1;
    // End of variables declaration//GEN-END:variables
}
