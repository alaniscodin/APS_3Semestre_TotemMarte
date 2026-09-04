
package apresentacao;
import modelo.Controle;
import modelo.Estaticos;
import javax.swing.JOptionPane;

public class frmTeclado extends javax.swing.JDialog {

    private javax.swing.JTextField campoAtivo;
    
    public frmTeclado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        campoAtivo = txtNome;

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnproximoTecl = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnq = new javax.swing.JButton();
        btnw = new javax.swing.JButton();
        btne = new javax.swing.JButton();
        btnr = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnt = new javax.swing.JButton();
        btny = new javax.swing.JButton();
        btnu = new javax.swing.JButton();
        btni = new javax.swing.JButton();
        btno = new javax.swing.JButton();
        btnp = new javax.swing.JButton();
        btna = new javax.swing.JButton();
        btns = new javax.swing.JButton();
        btnz = new javax.swing.JButton();
        btnx = new javax.swing.JButton();
        btnc = new javax.swing.JButton();
        btnv = new javax.swing.JButton();
        btnb = new javax.swing.JButton();
        btnn = new javax.swing.JButton();
        btnm = new javax.swing.JButton();
        btnd = new javax.swing.JButton();
        btnf = new javax.swing.JButton();
        btng = new javax.swing.JButton();
        btnh = new javax.swing.JButton();
        btnj = new javax.swing.JButton();
        btnk = new javax.swing.JButton();
        btnl = new javax.swing.JButton();
        btnç = new javax.swing.JButton();
        btnespaco = new javax.swing.JButton();
        btnapagar = new javax.swing.JButton();
        lblTela1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1525, 790));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informe seu nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 220, 270, 20);

        btnproximoTecl.setBackground(new java.awt.Color(79, 76, 137));
        btnproximoTecl.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        btnproximoTecl.setForeground(new java.awt.Color(255, 255, 255));
        btnproximoTecl.setText("próximo");
        btnproximoTecl.setToolTipText("");
        btnproximoTecl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnproximoTecl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnproximoTecl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproximoTeclActionPerformed(evt);
            }
        });
        getContentPane().add(btnproximoTecl);
        btnproximoTecl.setBounds(1240, 680, 180, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Informe sua idade:");
        jLabel2.setMaximumSize(new java.awt.Dimension(145, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(145, 25));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(970, 220, 220, 20);

        txtNome.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(410, 260, 510, 50);

        txtIdade.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtIdade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdadeMouseClicked(evt);
            }
        });
        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdade);
        txtIdade.setBounds(1030, 260, 110, 50);

        btn4.setBackground(new java.awt.Color(68, 67, 105));
        btn4.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setToolTipText("");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setPreferredSize(new java.awt.Dimension(60, 60));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(580, 350, 70, 40);

        btn2.setBackground(new java.awt.Color(68, 67, 105));
        btn2.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setToolTipText("");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setPreferredSize(new java.awt.Dimension(60, 60));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(420, 350, 70, 40);

        btn3.setBackground(new java.awt.Color(68, 67, 105));
        btn3.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setToolTipText("");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setPreferredSize(new java.awt.Dimension(60, 60));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(500, 350, 70, 40);

        btn1.setBackground(new java.awt.Color(68, 67, 105));
        btn1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setToolTipText("");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setPreferredSize(new java.awt.Dimension(60, 60));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
                btnaActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(340, 350, 70, 40);

        btn5.setBackground(new java.awt.Color(68, 67, 105));
        btn5.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setPreferredSize(new java.awt.Dimension(60, 60));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
                btnaActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(660, 350, 70, 40);

        btn6.setBackground(new java.awt.Color(68, 67, 105));
        btn6.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setToolTipText("");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setPreferredSize(new java.awt.Dimension(60, 60));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(740, 350, 70, 40);

        btn7.setBackground(new java.awt.Color(68, 67, 105));
        btn7.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setToolTipText("");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setPreferredSize(new java.awt.Dimension(60, 60));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(820, 350, 70, 40);

        btn8.setBackground(new java.awt.Color(68, 67, 105));
        btn8.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setToolTipText("");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setPreferredSize(new java.awt.Dimension(60, 60));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(900, 350, 70, 40);

        btn9.setBackground(new java.awt.Color(68, 67, 105));
        btn9.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setToolTipText("");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setPreferredSize(new java.awt.Dimension(60, 60));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(980, 350, 70, 40);

        btnq.setBackground(new java.awt.Color(68, 67, 105));
        btnq.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnq.setForeground(new java.awt.Color(255, 255, 255));
        btnq.setText("q");
        btnq.setToolTipText("");
        btnq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnq.setPreferredSize(new java.awt.Dimension(60, 60));
        btnq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnq);
        btnq.setBounds(370, 400, 70, 40);

        btnw.setBackground(new java.awt.Color(68, 67, 105));
        btnw.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnw.setForeground(new java.awt.Color(255, 255, 255));
        btnw.setText("w");
        btnw.setToolTipText("");
        btnw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnw.setPreferredSize(new java.awt.Dimension(60, 60));
        btnw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnw);
        btnw.setBounds(450, 400, 70, 40);

        btne.setBackground(new java.awt.Color(68, 67, 105));
        btne.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btne.setForeground(new java.awt.Color(255, 255, 255));
        btne.setText("e");
        btne.setToolTipText("");
        btne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btne.setPreferredSize(new java.awt.Dimension(60, 60));
        btne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btne);
        btne.setBounds(530, 400, 70, 40);

        btnr.setBackground(new java.awt.Color(68, 67, 105));
        btnr.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnr.setForeground(new java.awt.Color(255, 255, 255));
        btnr.setText("r");
        btnr.setToolTipText("");
        btnr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnr.setPreferredSize(new java.awt.Dimension(60, 60));
        btnr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnr);
        btnr.setBounds(610, 400, 70, 40);

        btn0.setBackground(new java.awt.Color(68, 67, 105));
        btn0.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setToolTipText("");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setPreferredSize(new java.awt.Dimension(60, 60));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(1060, 350, 70, 40);

        btnt.setBackground(new java.awt.Color(68, 67, 105));
        btnt.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnt.setForeground(new java.awt.Color(255, 255, 255));
        btnt.setText("t");
        btnt.setToolTipText("");
        btnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnt.setPreferredSize(new java.awt.Dimension(60, 60));
        btnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnt);
        btnt.setBounds(690, 400, 70, 40);

        btny.setBackground(new java.awt.Color(68, 67, 105));
        btny.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btny.setForeground(new java.awt.Color(255, 255, 255));
        btny.setText("y");
        btny.setToolTipText("");
        btny.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btny.setPreferredSize(new java.awt.Dimension(60, 60));
        btny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btny);
        btny.setBounds(770, 400, 70, 40);

        btnu.setBackground(new java.awt.Color(68, 67, 105));
        btnu.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnu.setForeground(new java.awt.Color(255, 255, 255));
        btnu.setText("u");
        btnu.setToolTipText("");
        btnu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnu.setPreferredSize(new java.awt.Dimension(60, 60));
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnu);
        btnu.setBounds(850, 400, 70, 40);

        btni.setBackground(new java.awt.Color(68, 67, 105));
        btni.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btni.setForeground(new java.awt.Color(255, 255, 255));
        btni.setText("i");
        btni.setToolTipText("");
        btni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btni.setPreferredSize(new java.awt.Dimension(60, 60));
        btni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btni);
        btni.setBounds(930, 400, 70, 40);

        btno.setBackground(new java.awt.Color(68, 67, 105));
        btno.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btno.setForeground(new java.awt.Color(255, 255, 255));
        btno.setText("o");
        btno.setToolTipText("");
        btno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btno.setPreferredSize(new java.awt.Dimension(60, 60));
        btno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btno);
        btno.setBounds(1010, 400, 70, 40);

        btnp.setBackground(new java.awt.Color(68, 67, 105));
        btnp.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnp.setForeground(new java.awt.Color(255, 255, 255));
        btnp.setText("p");
        btnp.setToolTipText("");
        btnp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnp.setPreferredSize(new java.awt.Dimension(60, 60));
        btnp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnp);
        btnp.setBounds(1090, 400, 70, 40);

        btna.setBackground(new java.awt.Color(68, 67, 105));
        btna.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btna.setForeground(new java.awt.Color(255, 255, 255));
        btna.setText("a");
        btna.setToolTipText("");
        btna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btna.setPreferredSize(new java.awt.Dimension(60, 60));
        btna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaActionPerformed(evt);
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btna);
        btna.setBounds(390, 450, 70, 40);

        btns.setBackground(new java.awt.Color(68, 67, 105));
        btns.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btns.setForeground(new java.awt.Color(255, 255, 255));
        btns.setText("s");
        btns.setToolTipText("");
        btns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btns.setPreferredSize(new java.awt.Dimension(60, 60));
        btns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btns);
        btns.setBounds(470, 450, 70, 40);

        btnz.setBackground(new java.awt.Color(68, 67, 105));
        btnz.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnz.setForeground(new java.awt.Color(255, 255, 255));
        btnz.setText("z");
        btnz.setToolTipText("");
        btnz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnz.setPreferredSize(new java.awt.Dimension(60, 60));
        btnz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnz);
        btnz.setBounds(370, 500, 70, 40);

        btnx.setBackground(new java.awt.Color(68, 67, 105));
        btnx.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnx.setForeground(new java.awt.Color(255, 255, 255));
        btnx.setText("x");
        btnx.setToolTipText("");
        btnx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnx.setPreferredSize(new java.awt.Dimension(60, 60));
        btnx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnx);
        btnx.setBounds(450, 500, 70, 40);

        btnc.setBackground(new java.awt.Color(68, 67, 105));
        btnc.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnc.setForeground(new java.awt.Color(255, 255, 255));
        btnc.setText("c");
        btnc.setToolTipText("");
        btnc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnc.setPreferredSize(new java.awt.Dimension(60, 60));
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnc);
        btnc.setBounds(530, 500, 70, 40);

        btnv.setBackground(new java.awt.Color(68, 67, 105));
        btnv.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnv.setForeground(new java.awt.Color(255, 255, 255));
        btnv.setText("v");
        btnv.setToolTipText("");
        btnv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnv.setPreferredSize(new java.awt.Dimension(60, 60));
        btnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnv);
        btnv.setBounds(890, 500, 70, 40);

        btnb.setBackground(new java.awt.Color(68, 67, 105));
        btnb.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnb.setForeground(new java.awt.Color(255, 255, 255));
        btnb.setText("b");
        btnb.setToolTipText("");
        btnb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnb.setPreferredSize(new java.awt.Dimension(60, 60));
        btnb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnb);
        btnb.setBounds(970, 500, 70, 40);

        btnn.setBackground(new java.awt.Color(68, 67, 105));
        btnn.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnn.setForeground(new java.awt.Color(255, 255, 255));
        btnn.setText("n");
        btnn.setToolTipText("");
        btnn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnn.setPreferredSize(new java.awt.Dimension(60, 60));
        btnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnn);
        btnn.setBounds(1050, 500, 70, 40);

        btnm.setBackground(new java.awt.Color(68, 67, 105));
        btnm.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnm.setForeground(new java.awt.Color(255, 255, 255));
        btnm.setText("m");
        btnm.setToolTipText("");
        btnm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnm.setPreferredSize(new java.awt.Dimension(60, 60));
        btnm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmActionPerformed(evt);
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnm);
        btnm.setBounds(1130, 500, 70, 40);

        btnd.setBackground(new java.awt.Color(68, 67, 105));
        btnd.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnd.setForeground(new java.awt.Color(255, 255, 255));
        btnd.setText("d");
        btnd.setToolTipText("");
        btnd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnd.setPreferredSize(new java.awt.Dimension(60, 60));
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnd);
        btnd.setBounds(550, 450, 70, 40);

        btnf.setBackground(new java.awt.Color(68, 67, 105));
        btnf.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnf.setForeground(new java.awt.Color(255, 255, 255));
        btnf.setText("f");
        btnf.setToolTipText("");
        btnf.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnf.setPreferredSize(new java.awt.Dimension(60, 60));
        btnf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnf);
        btnf.setBounds(630, 450, 70, 40);

        btng.setBackground(new java.awt.Color(68, 67, 105));
        btng.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btng.setForeground(new java.awt.Color(255, 255, 255));
        btng.setText("g");
        btng.setToolTipText("");
        btng.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btng.setPreferredSize(new java.awt.Dimension(60, 60));
        btng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btng);
        btng.setBounds(710, 450, 70, 40);

        btnh.setBackground(new java.awt.Color(68, 67, 105));
        btnh.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnh.setForeground(new java.awt.Color(255, 255, 255));
        btnh.setText("h");
        btnh.setToolTipText("");
        btnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnh.setPreferredSize(new java.awt.Dimension(60, 60));
        btnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnh);
        btnh.setBounds(790, 450, 70, 40);

        btnj.setBackground(new java.awt.Color(68, 67, 105));
        btnj.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnj.setForeground(new java.awt.Color(255, 255, 255));
        btnj.setText("j");
        btnj.setToolTipText("");
        btnj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnj.setPreferredSize(new java.awt.Dimension(60, 60));
        btnj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnj);
        btnj.setBounds(870, 450, 70, 40);

        btnk.setBackground(new java.awt.Color(68, 67, 105));
        btnk.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnk.setForeground(new java.awt.Color(255, 255, 255));
        btnk.setText("k");
        btnk.setToolTipText("");
        btnk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnk.setPreferredSize(new java.awt.Dimension(60, 60));
        btnk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnk);
        btnk.setBounds(950, 450, 70, 40);

        btnl.setBackground(new java.awt.Color(68, 67, 105));
        btnl.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnl.setForeground(new java.awt.Color(255, 255, 255));
        btnl.setText("l");
        btnl.setToolTipText("");
        btnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnl.setPreferredSize(new java.awt.Dimension(60, 60));
        btnl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnl);
        btnl.setBounds(1030, 450, 70, 40);

        btnç.setBackground(new java.awt.Color(68, 67, 105));
        btnç.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnç.setForeground(new java.awt.Color(255, 255, 255));
        btnç.setText("ç");
        btnç.setToolTipText("");
        btnç.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnç.setPreferredSize(new java.awt.Dimension(60, 60));
        btnç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btnç);
        btnç.setBounds(1110, 450, 70, 40);

        btnespaco.setBackground(new java.awt.Color(68, 67, 105));
        btnespaco.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnespaco.setForeground(new java.awt.Color(255, 255, 255));
        btnespaco.setText("espaço");
        btnespaco.setToolTipText("");
        btnespaco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnespaco.setPreferredSize(new java.awt.Dimension(60, 60));
        btnespaco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnespacoActionPerformed(evt);
            }
        });
        getContentPane().add(btnespaco);
        btnespaco.setBounds(610, 500, 270, 40);

        btnapagar.setBackground(new java.awt.Color(68, 67, 105));
        btnapagar.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        btnapagar.setForeground(new java.awt.Color(255, 255, 255));
        btnapagar.setText("apagar");
        btnapagar.setToolTipText("");
        btnapagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnapagar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnapagar);
        btnapagar.setBounds(1180, 380, 130, 40);

        lblTela1.setBackground(new java.awt.Color(51, 51, 51));
        lblTela1.setForeground(new java.awt.Color(255, 255, 255));
        lblTela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundoquestinorma.png"))); // NOI18N
        lblTela1.setAlignmentY(0.0F);
        getContentPane().add(lblTela1);
        lblTela1.setBounds(0, -10, 1525, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnproximoTeclActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnproximoTeclActionPerformed
    {//GEN-HEADEREND:event_btnproximoTeclActionPerformed
 // Cria o Controle e chama o cadastro (que dispara a Validacao)
    Controle c = new Controle();
    c.CadastrarVisitante(txtNome.getText(), txtIdade.getText());

    // Se a mensagem está vazia, deu tudo certo — avança
    if (Estaticos.MENSAGEM.equals("")) {
        frmConteudo1 frmPS = new frmConteudo1(null, true);
        this.setVisible(false);
        frmPS.setVisible(true);
    } else {
        // Tem mensagem de erro — mostra ao usuário
        JOptionPane.showMessageDialog(null, Estaticos.MENSAGEM);
    }
    }//GEN-LAST:event_btnproximoTeclActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
       campoAtivo = txtNome;
    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtIdadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdadeMouseClicked
        campoAtivo = txtIdade;
    }//GEN-LAST:event_txtIdadeMouseClicked

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
                                            
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
                                               
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmActionPerformed
                                             
    }//GEN-LAST:event_btnmActionPerformed

    private void btnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaActionPerformed
        
    }//GEN-LAST:event_btnaActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
         campoAtivo.setText(campoAtivo.getText() + evt.getActionCommand());                                      
    }//GEN-LAST:event_btnActionPerformed

    private void btnapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagarActionPerformed
        String texto = campoAtivo.getText();
    if (texto.length() > 0) {
    campoAtivo.setText(texto.substring(0, texto.length() - 1));
    }
    //Eu pego o texto atual do campo ativo. Se ele tem pelo menos 1 caractere, eu uso substring pra criar uma versão sem o último caractere e 
    //coloco de volta no campo. O if é pra evitar erro caso o campo esteja vazio.
    }//GEN-LAST:event_btnapagarActionPerformed

    private void btnespacoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnespacoActionPerformed
        campoAtivo.setText(campoAtivo.getText() + " ");
        //Mesmo padrão dos outros botões: pega o texto atual e adiciona um espaço no final.
    }//GEN-LAST:event_btnespacoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmTeclado dialog = new frmTeclado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btna;
    private javax.swing.JButton btnapagar;
    private javax.swing.JButton btnb;
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btne;
    private javax.swing.JButton btnespaco;
    private javax.swing.JButton btnf;
    private javax.swing.JButton btng;
    private javax.swing.JButton btnh;
    private javax.swing.JButton btni;
    private javax.swing.JButton btnj;
    private javax.swing.JButton btnk;
    private javax.swing.JButton btnl;
    private javax.swing.JButton btnm;
    private javax.swing.JButton btnn;
    private javax.swing.JButton btno;
    private javax.swing.JButton btnp;
    private javax.swing.JButton btnproximoTecl;
    private javax.swing.JButton btnq;
    private javax.swing.JButton btnr;
    private javax.swing.JButton btns;
    private javax.swing.JButton btnt;
    private javax.swing.JButton btnu;
    private javax.swing.JButton btnv;
    private javax.swing.JButton btnw;
    private javax.swing.JButton btnx;
    private javax.swing.JButton btny;
    private javax.swing.JButton btnz;
    private javax.swing.JButton btnç;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTela1;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
