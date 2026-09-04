
package apresentacao;
import modelo.Controle;
import modelo.Estaticos;

public class frmDadosFinais extends javax.swing.JDialog {

    public frmDadosFinais(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        new Controle().CalcularResultado();        // ← calcula o relatório
        txtRelatorio.setText(Estaticos.MENSAGEM);  // ← mostra na área de texto
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFinalDad = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRelatorio = new javax.swing.JTextArea();
        lblTela1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btnFinalDad.setBackground(new java.awt.Color(79, 76, 137));
        btnFinalDad.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnFinalDad.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalDad.setText("FINALIZAR");
        btnFinalDad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFinalDad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalDadActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalDad);
        btnFinalDad.setBounds(1100, 680, 250, 50);

        jScrollPane1.setBackground(new java.awt.Color(37, 150, 191));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtRelatorio.setEditable(false);
        txtRelatorio.setColumns(20);
        txtRelatorio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtRelatorio.setLineWrap(true);
        txtRelatorio.setRows(5);
        txtRelatorio.setWrapStyleWord(true);
        txtRelatorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtRelatorio.setOpaque(false);
        jScrollPane1.setViewportView(txtRelatorio);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(100, 50, 1360, 600);

        lblTela1.setBackground(new java.awt.Color(255, 255, 255));
        lblTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoquestinorma.png"))); // NOI18N
        lblTela1.setAlignmentY(0.0F);
        getContentPane().add(lblTela1);
        lblTela1.setBounds(0, -10, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalDadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFinalDadActionPerformed
    {//GEN-HEADEREND:event_btnFinalDadActionPerformed
// Limpa a mensagem do relatório (vai ser usado novamente)
    Estaticos.MENSAGEM = "";

    // Volta pra tela inicial
    frmInicial inicio = new frmInicial(null, true);
    this.setVisible(false);
    inicio.setVisible(true);
    }//GEN-LAST:event_btnFinalDadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmDadosFinais dialog = new frmDadosFinais(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFinalDad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTela1;
    private javax.swing.JTextArea txtRelatorio;
    // End of variables declaration//GEN-END:variables
}
