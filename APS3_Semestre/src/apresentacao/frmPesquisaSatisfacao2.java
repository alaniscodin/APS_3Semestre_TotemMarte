
package apresentacao;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import modelo.Controle;
import modelo.Estaticos;

public class frmPesquisaSatisfacao2 extends javax.swing.JDialog
{
    private void restaurarBordas() {
    // Limpa todas as bordas primeiro
    btnAvaRuim1.setBorder(null);
    btnAvaOk1.setBorder(null);
    btnAvaBom1.setBorder(null);
    btnAvaRuim2.setBorder(null);
    btnAvaOk2.setBorder(null);
    btnAvaBom2.setBorder(null);
    btnAvaRuim3.setBorder(null);
    btnAvaOk3.setBorder(null);
    btnAvaBom3.setBorder(null);

    // Pinta verde onde tem resposta gravada
    // Pergunta 1 da tela = índice 2
    if (Estaticos.RESPOSTAS[2] == 1) btnAvaRuim1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[2] == 2) btnAvaOk1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[2] == 3) btnAvaBom1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));

    // Pergunta 2 da tela = índice 3
    if (Estaticos.RESPOSTAS[3] == 1) btnAvaRuim2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[3] == 2) btnAvaOk2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[3] == 3) btnAvaBom2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));

    // Pergunta 3 da tela = índice 4
    if (Estaticos.RESPOSTAS[4] == 1) btnAvaRuim3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[4] == 2) btnAvaOk3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
    if (Estaticos.RESPOSTAS[4] == 3) btnAvaBom3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
}
    
    
    public frmPesquisaSatisfacao2(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        restaurarBordas();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbtPesquisa = new javax.swing.ButtonGroup();
        btnAvaRuim1 = new javax.swing.JButton();
        btnAvaOk1 = new javax.swing.JButton();
        btnAvaBom1 = new javax.swing.JButton();
        lblPergun3 = new javax.swing.JLabel();
        lblPergun4 = new javax.swing.JLabel();
        btnAvaRuim2 = new javax.swing.JButton();
        btnAvaOk2 = new javax.swing.JButton();
        btnAvaBom2 = new javax.swing.JButton();
        lblPergun5 = new javax.swing.JLabel();
        btnAvaRuim3 = new javax.swing.JButton();
        btnAvaOk3 = new javax.swing.JButton();
        btnAvaBom3 = new javax.swing.JButton();
        btnProxAva = new javax.swing.JButton();
        btnvoltarTela = new javax.swing.JButton();
        ruimtxt = new javax.swing.JLabel();
        oktxt = new javax.swing.JLabel();
        bomtxt = new javax.swing.JLabel();
        oktxt1 = new javax.swing.JLabel();
        ruimtxt1 = new javax.swing.JLabel();
        bomtxt1 = new javax.swing.JLabel();
        bomtxt2 = new javax.swing.JLabel();
        oktxt2 = new javax.swing.JLabel();
        ruimtxt2 = new javax.swing.JLabel();
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
        btnAvaRuim1.setBounds(460, 70, 170, 130);

        btnAvaOk1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnAvaOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaOk1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaOk1);
        btnAvaOk1.setBounds(670, 70, 170, 130);

        btnAvaBom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bom.png"))); // NOI18N
        btnAvaBom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaBom1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaBom1);
        btnAvaBom1.setBounds(870, 70, 170, 130);

        lblPergun3.setFont(new java.awt.Font("Rockwell Condensed", 1, 30)); // NOI18N
        lblPergun3.setForeground(new java.awt.Color(255, 255, 255));
        lblPergun3.setText("Interesse pelo conteúdo sobre Marte");
        getContentPane().add(lblPergun3);
        lblPergun3.setBounds(460, 30, 550, 40);

        lblPergun4.setFont(new java.awt.Font("Rockwell Condensed", 1, 30)); // NOI18N
        lblPergun4.setForeground(new java.awt.Color(255, 255, 255));
        lblPergun4.setText("Qualidade das descrições dos robôs");
        getContentPane().add(lblPergun4);
        lblPergun4.setBounds(480, 260, 540, 40);

        btnAvaRuim2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ruim.png"))); // NOI18N
        btnAvaRuim2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaRuim2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaRuim2);
        btnAvaRuim2.setBounds(460, 300, 170, 130);

        btnAvaOk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnAvaOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaOk2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaOk2);
        btnAvaOk2.setBounds(670, 300, 170, 130);

        btnAvaBom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bom.png"))); // NOI18N
        btnAvaBom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaBom2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaBom2);
        btnAvaBom2.setBounds(870, 300, 170, 130);

        lblPergun5.setFont(new java.awt.Font("Rockwell Condensed", 1, 30)); // NOI18N
        lblPergun5.setForeground(new java.awt.Color(255, 255, 255));
        lblPergun5.setText("Experiência geral ao usar o sistema");
        getContentPane().add(lblPergun5);
        lblPergun5.setBounds(480, 500, 530, 40);

        btnAvaRuim3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ruim.png"))); // NOI18N
        btnAvaRuim3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaRuim3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaRuim3);
        btnAvaRuim3.setBounds(460, 540, 170, 130);

        btnAvaOk3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        btnAvaOk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaOk3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaOk3);
        btnAvaOk3.setBounds(670, 540, 170, 130);

        btnAvaBom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bom.png"))); // NOI18N
        btnAvaBom3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvaBom3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAvaBom3);
        btnAvaBom3.setBounds(870, 540, 170, 130);

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

        btnvoltarTela.setBackground(new java.awt.Color(79, 76, 137));
        btnvoltarTela.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnvoltarTela.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltarTela.setText("voltar");
        btnvoltarTela.setToolTipText("");
        btnvoltarTela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnvoltarTela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnvoltarTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarTelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnvoltarTela);
        btnvoltarTela.setBounds(90, 40, 180, 50);

        ruimtxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ruimtxt.setForeground(new java.awt.Color(255, 255, 255));
        ruimtxt.setText("RUIM");
        getContentPane().add(ruimtxt);
        ruimtxt.setBounds(512, 200, 60, 27);

        oktxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        oktxt.setForeground(new java.awt.Color(255, 255, 255));
        oktxt.setText("BOM");
        getContentPane().add(oktxt);
        oktxt.setBounds(730, 200, 50, 27);

        bomtxt.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bomtxt.setForeground(new java.awt.Color(255, 255, 255));
        bomtxt.setText("EXCELENTE");
        getContentPane().add(bomtxt);
        bomtxt.setBounds(900, 200, 110, 27);

        oktxt1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        oktxt1.setForeground(new java.awt.Color(255, 255, 255));
        oktxt1.setText("BOM");
        getContentPane().add(oktxt1);
        oktxt1.setBounds(730, 430, 50, 27);

        ruimtxt1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ruimtxt1.setForeground(new java.awt.Color(255, 255, 255));
        ruimtxt1.setText("RUIM");
        getContentPane().add(ruimtxt1);
        ruimtxt1.setBounds(512, 430, 60, 27);

        bomtxt1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bomtxt1.setForeground(new java.awt.Color(255, 255, 255));
        bomtxt1.setText("EXCELENTE");
        getContentPane().add(bomtxt1);
        bomtxt1.setBounds(900, 430, 110, 27);

        bomtxt2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        bomtxt2.setForeground(new java.awt.Color(255, 255, 255));
        bomtxt2.setText("EXCELENTE");
        getContentPane().add(bomtxt2);
        bomtxt2.setBounds(900, 670, 110, 27);

        oktxt2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        oktxt2.setForeground(new java.awt.Color(255, 255, 255));
        oktxt2.setText("BOM");
        getContentPane().add(oktxt2);
        oktxt2.setBounds(730, 670, 50, 27);

        ruimtxt2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ruimtxt2.setForeground(new java.awt.Color(255, 255, 255));
        ruimtxt2.setText("RUIM");
        getContentPane().add(ruimtxt2);
        ruimtxt2.setBounds(512, 670, 60, 27);

        lblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoquestinorma.png"))); // NOI18N
        lblFundo.setAlignmentY(0.0F);
        lblFundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblFundo.setOpaque(true);
        getContentPane().add(lblFundo);
        lblFundo.setBounds(0, -20, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvaBom1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaBom1ActionPerformed
    {//GEN-HEADEREND:event_btnAvaBom1ActionPerformed
    
        new Controle().RegistrarResposta(2, 3);
        btnAvaBom1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaRuim1.setBorder(null);
        btnAvaOk1.setBorder(null);
    }//GEN-LAST:event_btnAvaBom1ActionPerformed

    private void btnAvaOk1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaOk1ActionPerformed
    {//GEN-HEADEREND:event_btnAvaOk1ActionPerformed
        new Controle().RegistrarResposta(2, 2);
        btnAvaOk1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaRuim1.setBorder(null);
        btnAvaBom1.setBorder(null);
    }//GEN-LAST:event_btnAvaOk1ActionPerformed

    private void btnAvaRuim1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaRuim1ActionPerformed
    {//GEN-HEADEREND:event_btnAvaRuim1ActionPerformed
        new Controle().RegistrarResposta(2, 1);
        btnAvaRuim1.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaOk1.setBorder(null);
        btnAvaBom1.setBorder(null);
    }//GEN-LAST:event_btnAvaRuim1ActionPerformed

    private void btnAvaRuim2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaRuim2ActionPerformed
    {//GEN-HEADEREND:event_btnAvaRuim2ActionPerformed
        new Controle().RegistrarResposta(3, 1);
        btnAvaRuim2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaOk2.setBorder(null);
        btnAvaBom2.setBorder(null);
    }//GEN-LAST:event_btnAvaRuim2ActionPerformed

    private void btnAvaOk2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaOk2ActionPerformed
    {//GEN-HEADEREND:event_btnAvaOk2ActionPerformed
        new Controle().RegistrarResposta(3, 2);
        btnAvaOk2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaRuim2.setBorder(null);
        btnAvaBom2.setBorder(null);
    }//GEN-LAST:event_btnAvaOk2ActionPerformed

    private void btnAvaBom2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaBom2ActionPerformed
    {//GEN-HEADEREND:event_btnAvaBom2ActionPerformed
        new Controle().RegistrarResposta(3, 3);
        btnAvaBom2.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaRuim2.setBorder(null);
        btnAvaOk2.setBorder(null);
    }//GEN-LAST:event_btnAvaBom2ActionPerformed

    private void btnAvaRuim3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaRuim3ActionPerformed
    {//GEN-HEADEREND:event_btnAvaRuim3ActionPerformed
        new Controle().RegistrarResposta(4, 1);
        btnAvaRuim3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaOk3.setBorder(null);
        btnAvaBom3.setBorder(null);
    }//GEN-LAST:event_btnAvaRuim3ActionPerformed

    private void btnAvaOk3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaOk3ActionPerformed
    {//GEN-HEADEREND:event_btnAvaOk3ActionPerformed
        new Controle().RegistrarResposta(4, 2);
        btnAvaOk3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaRuim3.setBorder(null);
        btnAvaBom3.setBorder(null);
    }//GEN-LAST:event_btnAvaOk3ActionPerformed

    private void btnAvaBom3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAvaBom3ActionPerformed
    {//GEN-HEADEREND:event_btnAvaBom3ActionPerformed
        new Controle().RegistrarResposta(4, 3);
        btnAvaBom3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
        btnAvaRuim3.setBorder(null);
        btnAvaOk3.setBorder(null);
    }//GEN-LAST:event_btnAvaBom3ActionPerformed

    private void btnProxAvaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnProxAvaActionPerformed
    {//GEN-HEADEREND:event_btnProxAvaActionPerformed
        Controle c = new Controle();
    c.ValidarMetricas(5);    // valida que todas as 5 perguntas foram respondidas

    if (Estaticos.MENSAGEM.equals("")) {
        c.FinalizarVisitante();    // cria Visitante e adiciona na lista
        frmDadosFinais frmDF = new frmDadosFinais(null, true);
        this.setVisible(false);
        frmDF.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(null, Estaticos.MENSAGEM);
    }

    }//GEN-LAST:event_btnProxAvaActionPerformed

    private void btnvoltarTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarTelaActionPerformed

        frmPesquisaSatisfacao frmPS = new frmPesquisaSatisfacao(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);
    }//GEN-LAST:event_btnvoltarTelaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bomtxt;
    private javax.swing.JLabel bomtxt1;
    private javax.swing.JLabel bomtxt2;
    private javax.swing.JButton btnAvaBom1;
    private javax.swing.JButton btnAvaBom2;
    private javax.swing.JButton btnAvaBom3;
    private javax.swing.JButton btnAvaOk1;
    private javax.swing.JButton btnAvaOk2;
    private javax.swing.JButton btnAvaOk3;
    private javax.swing.JButton btnAvaRuim1;
    private javax.swing.JButton btnAvaRuim2;
    private javax.swing.JButton btnAvaRuim3;
    private javax.swing.JButton btnProxAva;
    private javax.swing.JButton btnvoltarTela;
    private javax.swing.ButtonGroup gbtPesquisa;
    private javax.swing.JLabel lblFundo;
    private javax.swing.JLabel lblPergun3;
    private javax.swing.JLabel lblPergun4;
    private javax.swing.JLabel lblPergun5;
    private javax.swing.JLabel oktxt;
    private javax.swing.JLabel oktxt1;
    private javax.swing.JLabel oktxt2;
    private javax.swing.JLabel ruimtxt;
    private javax.swing.JLabel ruimtxt1;
    private javax.swing.JLabel ruimtxt2;
    // End of variables declaration//GEN-END:variables
}
