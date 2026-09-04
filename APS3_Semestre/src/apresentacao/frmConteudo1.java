
package apresentacao;


public class frmConteudo1 extends javax.swing.JDialog {

    /**
     * Creates new form frmConteuro
     */
    public frmConteudo1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAnosDois = new javax.swing.JButton();
        btnAtualidade = new javax.swing.JButton();
        btnPioneiros = new javax.swing.JButton();
        btnAnosDez = new javax.swing.JButton();
        btnproximo = new javax.swing.JButton();
        lblTela1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btnAnosDois.setBackground(new java.awt.Color(79, 76, 137));
        btnAnosDois.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnAnosDois.setForeground(new java.awt.Color(255, 255, 255));
        btnAnosDois.setText("Anos 2000");
        btnAnosDois.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnosDois.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnosDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnosDoisActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnosDois);
        btnAnosDois.setBounds(240, 630, 420, 50);

        btnAtualidade.setBackground(new java.awt.Color(79, 76, 137));
        btnAtualidade.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnAtualidade.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualidade.setText("Mars 2020 e Zhurong ");
        btnAtualidade.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtualidade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualidadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualidade);
        btnAtualidade.setBounds(900, 630, 430, 50);

        btnPioneiros.setBackground(new java.awt.Color(79, 76, 137));
        btnPioneiros.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnPioneiros.setForeground(new java.awt.Color(255, 255, 255));
        btnPioneiros.setText("Os pioneiros");
        btnPioneiros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPioneiros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPioneiros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPioneirosActionPerformed(evt);
            }
        });
        getContentPane().add(btnPioneiros);
        btnPioneiros.setBounds(240, 360, 420, 50);

        btnAnosDez.setBackground(new java.awt.Color(79, 76, 137));
        btnAnosDez.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        btnAnosDez.setForeground(new java.awt.Color(255, 255, 255));
        btnAnosDez.setText("2010");
        btnAnosDez.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnosDez.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnosDez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnosDezActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnosDez);
        btnAnosDez.setBounds(900, 360, 430, 50);

        btnproximo.setBackground(new java.awt.Color(79, 76, 137));
        btnproximo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnproximo.setForeground(new java.awt.Color(255, 255, 255));
        btnproximo.setText("próximo");
        btnproximo.setToolTipText("");
        btnproximo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnproximo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproximoActionPerformed(evt);
            }
        });
        getContentPane().add(btnproximo);
        btnproximo.setBounds(690, 690, 180, 50);

        lblTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tela1.png"))); // NOI18N
        lblTela1.setAlignmentY(0.0F);
        getContentPane().add(lblTela1);
        lblTela1.setBounds(0, -10, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnosDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnosDoisActionPerformed
     frmConteudo3 frmPS = new frmConteudo3(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);  
    }//GEN-LAST:event_btnAnosDoisActionPerformed

    private void btnproximoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnproximoActionPerformed
    {//GEN-HEADEREND:event_btnproximoActionPerformed
                                                 
     frmPesquisaSatisfacao frmPS = new frmPesquisaSatisfacao(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);     
    }//GEN-LAST:event_btnproximoActionPerformed

    private void btnAtualidadeActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAtualidadeActionPerformed
    {//GEN-HEADEREND:event_btnAtualidadeActionPerformed
     frmConteudo5 frmPS = new frmConteudo5 (null, true);
        this.setVisible(false);
        frmPS.setVisible(true);     
    }//GEN-LAST:event_btnAtualidadeActionPerformed

    private void btnPioneirosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPioneirosActionPerformed
    {//GEN-HEADEREND:event_btnPioneirosActionPerformed
     frmConteudo2 frmPS = new frmConteudo2(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);            // TODO add your handling code here:
    }//GEN-LAST:event_btnPioneirosActionPerformed

    private void btnAnosDezActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAnosDezActionPerformed
    {//GEN-HEADEREND:event_btnAnosDezActionPerformed
     frmConteudo4 frmPS = new frmConteudo4(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);   
    }//GEN-LAST:event_btnAnosDezActionPerformed

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
            java.util.logging.Logger.getLogger(frmConteudo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConteudo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConteudo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConteudo2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmConteudo1 dialog = new frmConteudo1(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAnosDez;
    private javax.swing.JButton btnAnosDois;
    private javax.swing.JButton btnAtualidade;
    private javax.swing.JButton btnPioneiros;
    private javax.swing.JButton btnproximo;
    private javax.swing.JLabel lblTela1;
    // End of variables declaration//GEN-END:variables
}
