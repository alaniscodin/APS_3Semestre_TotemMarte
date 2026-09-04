
package apresentacao;

import modelo.Estaticos;

public class frmInicial extends javax.swing.JDialog {

    /**
     * Creates new form frmInicial
     */
    public frmInicial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnaContinuar = new javax.swing.JButton();
        btnaSair = new javax.swing.JButton();
        lblimginicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setPreferredSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btnaContinuar.setBackground(new java.awt.Color(79, 76, 137));
        btnaContinuar.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        btnaContinuar.setForeground(new java.awt.Color(255, 255, 255));
        btnaContinuar.setText("COMEÇAR");
        btnaContinuar.setToolTipText("");
        btnaContinuar.setAlignmentX(762.0F);
        btnaContinuar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnaContinuar);
        btnaContinuar.setBounds(700, 520, 150, 50);

        btnaSair.setBackground(new java.awt.Color(79, 76, 137));
        btnaSair.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnaSair.setForeground(new java.awt.Color(255, 255, 255));
        btnaSair.setText("sair");
        btnaSair.setAlignmentX(762.0F);
        btnaSair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnaSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnaSair);
        btnaSair.setBounds(700, 580, 150, 50);

        lblimginicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TelaInicial.png"))); // NOI18N
        lblimginicial.setAlignmentY(0.0F);
        getContentPane().add(lblimginicial);
        lblimginicial.setBounds(0, -10, 1510, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaContinuarActionPerformed
        // 
        frmTeclado frmN = new frmTeclado(null,true);
        this.setVisible(false);
        frmN.setVisible(true);
    }//GEN-LAST:event_btnaContinuarActionPerformed

    private void btnaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_btnaSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmInicial dialog = new frmInicial(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnaContinuar;
    private javax.swing.JButton btnaSair;
    private javax.swing.JLabel lblimginicial;
    // End of variables declaration//GEN-END:variables
}
