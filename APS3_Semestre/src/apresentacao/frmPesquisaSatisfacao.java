
package apresentacao;



import java.awt.Color;
import javax.swing.BorderFactory;
import modelo.Controle;
import modelo.Estaticos;
import javax.swing.JOptionPane;

public class frmPesquisaSatisfacao extends javax.swing.JDialog
{
    
    private void restaurarBordas() {
    // Primeiro: LIMPA todas as bordas (garantia de tela zerada)
    btnAvaRuim1.setBorder(null);
    btnAvaOk1.setBorder(null);
    btnAvaBom1.setBorder(null);
    btnAvaRuim2.setBorder(null);
    btnAvaOk2.setBorder(null);
    btnAvaBom2.setBorder(null);

    // Depois: PINTA verde apenas onde tem resposta gravada
    // Pergunta 1
    if (Estaticos.RESPOSTAS[0] == 1) btnAvaRuim1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[0] == 2) btnAvaOk1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[0] == 3) btnAvaBom1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));

    // Pergunta 2
    if (Estaticos.RESPOSTAS[1] == 1) btnAvaRuim2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[1] == 2) btnAvaOk2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[1] == 3) btnAvaBom2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
}
   
    public frmPesquisaSatisfacao(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        restaurarBordas();
    }

    //Pra cada botão clicado, eu chamo o Controle.RegistrarResposta passando o índice da pergunta (0 ou 1) e o valor da avaliação (1=Ruim, 2=OK, 3=Bom). 
    //Depois adiciono uma borda verde de 5 pixels no botão clicado, e tiro a borda dos outros 2 da mesma pergunta.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtPesquisa = new javax.swing.ButtonGroup();
        btnAvaRuim1 = new javax.swing.JButton();
        btnAvaOk1 = new javax.swing.JButton();
        btnAvaBom1 = new javax.swing.JButton();
        btnProxAva = new javax.swing.JButton();
        btnAvaRuim2 = new javax.swing.JButton();
        btnAvaOk2 = new javax.swing.JButton();
        btnAvaBom2 = new javax.swing.JButton();
        lblPergun2 = new javax.swing.JLabel();
        lblPergun1 = new javax.swing.JLabel();
        btnvoltarTelaInicial = new javax.swing.JButton();
        bomtxt = new javax.swing.JLabel();
        ruimtxt = new javax.swing.JLabel();
        oktxt = new javax.swing.JLabel();
        ruimtxt2 = new javax.swing.JLabel();
        oktxt2 = new javax.swing.JLabel();
        bomtxt2 = new javax.swing.JLabel();
        lblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        btnAvaRuim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ruim.png"))); // NOI18N
        btnAvaRuim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaRuim1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaRuim1);
        btnAvaRuim1.setBounds(460, 210, 170, 140);

        btnAvaOk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnAvaOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaOk1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaOk1);
        btnAvaOk1.setBounds(670, 210, 170, 140);

        btnAvaBom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bom.png"))); // NOI18N
        btnAvaBom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaBom1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaBom1);
        btnAvaBom1.setBounds(870, 210, 170, 140);

        btnProxAva.setBackground(new java.awt.Color(79, 76, 137));
        btnProxAva.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnProxAva.setForeground(new java.awt.Color(255, 255, 255));
        btnProxAva.setText("PRÓXIMO");
        btnProxAva.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProxAva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxAvaActionPerformed(evt);
            }
        });
        getContentPane().add(btnProxAva);
        btnProxAva.setBounds(1050, 680, 250, 50);

        btnAvaRuim2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ruim.png"))); // NOI18N
        btnAvaRuim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaRuim2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaRuim2);
        btnAvaRuim2.setBounds(460, 470, 170, 140);

        btnAvaOk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnAvaOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaOk2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaOk2);
        btnAvaOk2.setBounds(670, 470, 170, 140);

        btnAvaBom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bom.png"))); // NOI18N
        btnAvaBom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaBom2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaBom2);
        btnAvaBom2.setBounds(870, 470, 170, 140);

        lblPergun2.setFont(new java.awt.Font("Rockwell Condensed", 1, 31)); // NOI18N
        lblPergun2.setForeground(new java.awt.Color(255, 255, 255));
        lblPergun2.setText("Facilidade de uso do sistema");
        getContentPane().add(lblPergun2);
        lblPergun2.setBounds(540, 410, 440, 40);

        lblPergun1.setFont(new java.awt.Font("Rockwell Condensed", 1, 31)); // NOI18N
        lblPergun1.setForeground(new java.awt.Color(255, 255, 255));
        lblPergun1.setText("Organização das telas (menu e navegação)");
        getContentPane().add(lblPergun1);
        lblPergun1.setBounds(420, 150, 650, 40);

        btnvoltarTelaInicial.setBackground(new java.awt.Color(79, 76, 137));
        btnvoltarTelaInicial.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnvoltarTelaInicial.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltarTelaInicial.setText("voltar");
        btnvoltarTelaInicial.setToolTipText("");
        btnvoltarTelaInicial.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltarTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnvoltarTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarTelaInicialActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltarTelaInicial);
        btnvoltarTelaInicial.setBounds(90, 40, 180, 50);

        bomtxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bomtxt.setForeground(new java.awt.Color(255, 255, 255));
        bomtxt.setText("EXCELENTE");
        getContentPane().add(bomtxt);
        bomtxt.setBounds(900, 350, 110, 27);

        ruimtxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ruimtxt.setForeground(new java.awt.Color(255, 255, 255));
        ruimtxt.setText("RUIM");
        getContentPane().add(ruimtxt);
        ruimtxt.setBounds(512, 350, 60, 27);

        oktxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        oktxt.setForeground(new java.awt.Color(255, 255, 255));
        oktxt.setText("BOM");
        getContentPane().add(oktxt);
        oktxt.setBounds(730, 350, 50, 27);

        ruimtxt2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ruimtxt2.setForeground(new java.awt.Color(255, 255, 255));
        ruimtxt2.setText("RUIM");
        getContentPane().add(ruimtxt2);
        ruimtxt2.setBounds(512, 610, 60, 27);

        oktxt2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        oktxt2.setForeground(new java.awt.Color(255, 255, 255));
        oktxt2.setText("BOM");
        getContentPane().add(oktxt2);
        oktxt2.setBounds(730, 610, 50, 27);

        bomtxt2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bomtxt2.setForeground(new java.awt.Color(255, 255, 255));
        bomtxt2.setText("EXCELENTE");
        getContentPane().add(bomtxt2);
        bomtxt2.setBounds(900, 610, 110, 27);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avaliacao.png"))); // NOI18N
        lblFundo.setAlignmentY(0.0F);
        lblFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFundo.setOpaque(true);
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, -20, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvaBom1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaBom1ActionPerformed
    {//GEN-HEADEREND:event_btnAvaBom1ActionPerformed
        new Controle().RegistrarResposta(0, 3);                                  // pergunta 0, valor 3 (Bom)
            btnAvaBom1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            btnAvaRuim1.setBorder(null);
            btnAvaOk1.setBorder(null);
    }//GEN-LAST:event_btnAvaBom1ActionPerformed

    private void btnAvaOk1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaOk1ActionPerformed
    {//GEN-HEADEREND:event_btnAvaOk1ActionPerformed
         new Controle().RegistrarResposta(0, 2);                                  // pergunta 0, valor 2 (OK)
            btnAvaOk1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            btnAvaRuim1.setBorder(null);
            btnAvaBom1.setBorder(null);
    }//GEN-LAST:event_btnAvaOk1ActionPerformed

    private void btnAvaRuim1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaRuim1ActionPerformed
    {//GEN-HEADEREND:event_btnAvaRuim1ActionPerformed
         new Controle().RegistrarResposta(0, 1);                                  // pergunta 0, valor 1 (Ruim)
            btnAvaRuim1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));   // borda verde no clicado
            btnAvaOk1.setBorder(null);                                               // remove borda dos outros
            btnAvaBom1.setBorder(null);
    }//GEN-LAST:event_btnAvaRuim1ActionPerformed

    private void btnProxAvaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProxAvaActionPerformed
    {//GEN-HEADEREND:event_btnProxAvaActionPerformed
     // Cria o Controle e valida se as 2 primeiras respostas estão preenchidas
    Controle c = new Controle();
    c.ValidarMetricas(2);

    // Se a mensagem está vazia, deu tudo certo — avança
    if (Estaticos.MENSAGEM.equals("")) {
        frmPesquisaSatisfacao2 frmPS2 = new frmPesquisaSatisfacao2(null, true);
        this.setVisible(false);
        frmPS2.setVisible(true);
    } else {
        // Tem mensagem de erro — mostra ao usuário
        JOptionPane.showMessageDialog(null, Estaticos.MENSAGEM);
    } 
        
    }//GEN-LAST:event_btnProxAvaActionPerformed

    private void btnAvaRuim2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaRuim2ActionPerformed
    {//GEN-HEADEREND:event_btnAvaRuim2ActionPerformed
         new Controle().RegistrarResposta(1, 1);                                  // pergunta 1, valor 1 (Ruim)
            btnAvaRuim2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            btnAvaOk2.setBorder(null);
            btnAvaBom2.setBorder(null);
    }//GEN-LAST:event_btnAvaRuim2ActionPerformed

    private void btnAvaOk2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaOk2ActionPerformed
    {//GEN-HEADEREND:event_btnAvaOk2ActionPerformed
        new Controle().RegistrarResposta(1, 2);                                  // pergunta 1, valor 2 (OK)
            btnAvaOk2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            btnAvaRuim2.setBorder(null);
            btnAvaBom2.setBorder(null);
    }//GEN-LAST:event_btnAvaOk2ActionPerformed

    private void btnAvaBom2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaBom2ActionPerformed
    {//GEN-HEADEREND:event_btnAvaBom2ActionPerformed
        new Controle().RegistrarResposta(1, 3);                                  // pergunta 1, valor 3 (Bom)
            btnAvaBom2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
            btnAvaRuim2.setBorder(null);
            btnAvaOk2.setBorder(null);
    }//GEN-LAST:event_btnAvaBom2ActionPerformed

    private void btnvoltarTelaInicialActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnvoltarTelaInicialActionPerformed
    {//GEN-HEADEREND:event_btnvoltarTelaInicialActionPerformed

        frmConteudo1 frmPS = new frmConteudo1(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);
    }//GEN-LAST:event_btnvoltarTelaInicialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisaSatisfacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisaSatisfacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisaSatisfacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPesquisaSatisfacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPesquisaSatisfacao dialog = new frmPesquisaSatisfacao(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bomtxt;
    private javax.swing.JLabel bomtxt2;
    private javax.swing.JButton btnAvaBom1;
    private javax.swing.JButton btnAvaBom2;
    private javax.swing.JButton btnAvaOk1;
    private javax.swing.JButton btnAvaOk2;
    private javax.swing.JButton btnAvaRuim1;
    private javax.swing.JButton btnAvaRuim2;
    private javax.swing.JButton btnProxAva;
    private javax.swing.JButton btnvoltarTelaInicial;
    private javax.swing.ButtonGroup gbtPesquisa;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPergun1;
    private javax.swing.JLabel lblPergun2;
    private javax.swing.JLabel oktxt;
    private javax.swing.JLabel oktxt2;
    private javax.swing.JLabel ruimtxt;
    private javax.swing.JLabel ruimtxt2;
    // End of variables declaration//GEN-END:variables
}
