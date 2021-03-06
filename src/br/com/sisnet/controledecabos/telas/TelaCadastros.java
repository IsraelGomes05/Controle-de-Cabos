
package br.com.sisnet.controledecabos.telas;

import br.com.sisnet.controledecabos.classes.Login;
import br.com.sisnet.controledecabos.classes.Vendedor;
import br.com.sisnet.controledecabos.classes.utilitarias.Cripto;
import br.com.sisnet.controledecabos.conexaobd.LoginDAO;
import br.com.sisnet.controledecabos.conexaobd.SaidaDAO;
import br.com.sisnet.controledecabos.conexaobd.VendedorDAO;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

/**
 * @author Israel Gomes Da Silva
 * @created 05/03/2018
 * @lastModified 01/07/2018
 * @version 4.1
 *
 * @Function...
 */
public class TelaCadastros extends javax.swing.JDialog {

    ViewUtil viewUtil;
    DefaultListModel listaVendedoresModel;

    public TelaCadastros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        btnAlterarUsuario.setEnabled(false);
        btnSalvarUsuario.setEnabled(false);
        btnDeletarUsuarios.setEnabled(false);
        jcbAlterarDados.setEnabled(false);
        btnCadastrarVendedor.setEnabled(false);
        btnDeletarVendedor.setEnabled(false);
        
        viewUtil = new ViewUtil();
        setAcessibilidade();
        
        listaVendedoresModel = new DefaultListModel();
        jListVendedores.setModel(listaVendedoresModel);
        
        preencherLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jpnUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        btnDeletarUsuarios = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbAlterarDados = new javax.swing.JCheckBox();
        btnSalvarUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        jpnVendedores = new javax.swing.JPanel();
        jpnVendedor = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeVendedor = new javax.swing.JTextField();
        btnCadastrarVendedor = new javax.swing.JButton();
        btnDeletarVendedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListVendedores = new javax.swing.JList<>();
        btnUsuario = new javax.swing.JButton();
        btnVendedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Usuarios/Vendedores");
        setResizable(false);

        jPanel2.setLayout(new java.awt.CardLayout());

        jpnUsuarios.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel1.setText("Usuário");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel2.setText("Senha");

        txtSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSenha.setToolTipText("Esta senha será criptografada");
        txtSenha.setEchoChar('\u2219');
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel3.setText("Confirmar Senha");

        txtConfirmarSenha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtConfirmarSenha.setEchoChar('\u2219');

        btnDeletarUsuarios.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lixo-32-azul.png"))); // NOI18N
        btnDeletarUsuarios.setText("Excluir");
        btnDeletarUsuarios.setContentAreaFilled(false);
        btnDeletarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletarUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-excluir-32-red.png"))); // NOI18N
        btnDeletarUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarUsuariosActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permissões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 13), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N

        jcbAlterarDados.setBackground(new java.awt.Color(204, 204, 204));
        jcbAlterarDados.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jcbAlterarDados.setText("Alterar Dados");
        jcbAlterarDados.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jcbAlterarDados)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jcbAlterarDados)
                .addGap(42, 42, 42))
        );

        btnSalvarUsuario.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnSalvarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32-azul.png"))); // NOI18N
        btnSalvarUsuario.setText("Cadastrar");
        btnSalvarUsuario.setContentAreaFilled(false);
        btnSalvarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarUsuario.setRolloverEnabled(true);
        btnSalvarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32 azul-claro.png"))); // NOI18N
        btnSalvarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-azul.png"))); // NOI18N
        btnAlterarUsuario.setText("Alterar");
        btnAlterarUsuario.setContentAreaFilled(false);
        btnAlterarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAlterarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lapis-32-amarelo.png"))); // NOI18N
        btnAlterarUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnUsuariosLayout = new javax.swing.GroupLayout(jpnUsuarios);
        jpnUsuarios.setLayout(jpnUsuariosLayout);
        jpnUsuariosLayout.setHorizontalGroup(
            jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnUsuariosLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnUsuariosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnUsuariosLayout.createSequentialGroup()
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jpnUsuariosLayout.createSequentialGroup()
                        .addComponent(btnDeletarUsuarios)
                        .addGap(0, 0, 0)
                        .addComponent(btnAlterarUsuario)
                        .addGap(0, 0, 0)
                        .addComponent(btnSalvarUsuario))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );
        jpnUsuariosLayout.setVerticalGroup(
            jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUsuariosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnUsuariosLayout.createSequentialGroup()
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnUsuariosLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel2))
                            .addGroup(jpnUsuariosLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnUsuariosLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3))
                            .addGroup(jpnUsuariosLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jpnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDeletarUsuarios, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAlterarUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel2.add(jpnUsuarios, "Usuarios");

        jpnVendedor.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jLabel4.setText("Nome");

        txtNomeVendedor.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        txtNomeVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeVendedorKeyPressed(evt);
            }
        });

        btnCadastrarVendedor.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnCadastrarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32-azul.png"))); // NOI18N
        btnCadastrarVendedor.setText("Cadastrar");
        btnCadastrarVendedor.setContentAreaFilled(false);
        btnCadastrarVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarVendedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-salvar-32 azul-claro.png"))); // NOI18N
        btnCadastrarVendedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVendedorActionPerformed(evt);
            }
        });

        btnDeletarVendedor.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnDeletarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-lixo-32-azul.png"))); // NOI18N
        btnDeletarVendedor.setText("Excluir");
        btnDeletarVendedor.setContentAreaFilled(false);
        btnDeletarVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletarVendedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-excluir-32-red.png"))); // NOI18N
        btnDeletarVendedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarVendedorActionPerformed(evt);
            }
        });

        jListVendedores.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jListVendedores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListVendedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListVendedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListVendedores);

        javax.swing.GroupLayout jpnVendedorLayout = new javax.swing.GroupLayout(jpnVendedor);
        jpnVendedor.setLayout(jpnVendedorLayout);
        jpnVendedorLayout.setHorizontalGroup(
            jpnVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(jpnVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnVendedorLayout.createSequentialGroup()
                        .addComponent(btnDeletarVendedor)
                        .addGap(0, 0, 0)
                        .addComponent(btnCadastrarVendedor))
                    .addGroup(jpnVendedorLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jpnVendedorLayout.setVerticalGroup(
            jpnVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVendedorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnVendedorLayout.createSequentialGroup()
                        .addGroup(jpnVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(64, 64, 64)
                        .addGroup(jpnVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrarVendedor)
                            .addComponent(btnDeletarVendedor))))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jpnVendedoresLayout = new javax.swing.GroupLayout(jpnVendedores);
        jpnVendedores.setLayout(jpnVendedoresLayout);
        jpnVendedoresLayout.setHorizontalGroup(
            jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnVendedoresLayout.setVerticalGroup(
            jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 284, Short.MAX_VALUE)
            .addGroup(jpnVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnVendedoresLayout.createSequentialGroup()
                    .addComponent(jpnVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jpnVendedores, "Vendedores");

        btnUsuario.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-gerente-64-azul.png"))); // NOI18N
        btnUsuario.setText("Usuários");
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.setRolloverEnabled(true);
        btnUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-gerente-64-cinza.png"))); // NOI18N
        btnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnVendedor.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        btnVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-funcionario-homem-64-azul.png"))); // NOI18N
        btnVendedor.setText("Vendedores");
        btnVendedor.setContentAreaFilled(false);
        btnVendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVendedor.setRolloverEnabled(true);
        btnVendedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sisnet/controledecabos/telas/imagens/icons8-funcionario-homem-64-cinza.png"))); // NOI18N
        btnVendedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVendedor)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUsuario)
                    .addComponent(btnVendedor))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void setAcessibilidade() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
    }

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            
            Login usuario = LoginDAO.busca(txtUsuario.getText());
            if (txtUsuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um nome de Usuário!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                jcbAlterarDados.setSelected(false);
                btnSalvarUsuario.setEnabled(false);
                return;
            }
            if (usuario == null) {
                txtSenha.requestFocus();
                jcbAlterarDados.setSelected(false);
                jcbAlterarDados.setEnabled(true);
                btnAlterarUsuario.setEnabled(false);
                btnDeletarUsuarios.setEnabled(false);
                btnSalvarUsuario.setEnabled(true);
            } else {
                jcbAlterarDados.setEnabled(true);
                btnAlterarUsuario.setEnabled(true);
                btnDeletarUsuarios.setEnabled(true);
                if (usuario.getAlterarDados().equals("s")) {
                    jcbAlterarDados.setSelected(true);
                } else {
                    jcbAlterarDados.setSelected(false);
                }
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    public void alterarUser() {
        String selecionado = "n";
        String senha = Cripto.criptografar(new String(txtSenha.getPassword()));
        String senhaConfirma = Cripto.criptografar(new String(txtConfirmarSenha.getPassword()));

        if (senha.equals("") || senhaConfirma.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite uma Senha válida",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        } else {
            if (senha.equals(senhaConfirma)) {
                if (jcbAlterarDados.isSelected()) {
                    selecionado = "s";
                }
                Login login = new Login(txtUsuario.getText(), senha, selecionado);
                if (LoginDAO.atualizar(login)) {
                    JOptionPane.showMessageDialog(null, "Usuário atualizado com Sucesso!",
                            "concluido", JOptionPane.WARNING_MESSAGE);
                }
                txtUsuario.setText("");
                txtSenha.setText("");
                txtConfirmarSenha.setText("");
                jcbAlterarDados.setSelected(false);
            } else {
                JOptionPane.showMessageDialog(null, "As Senhas São Diferentes!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void txtNomeVendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeVendedorKeyPressed
        validarVendedor(evt.getKeyCode());
    }//GEN-LAST:event_txtNomeVendedorKeyPressed

    public void validarVendedor(int teclaPressionada) {
        if (teclaPressionada == KeyEvent.VK_ENTER) {
            List<Vendedor> vendedorList;
            vendedorList = VendedorDAO.busca(txtNomeVendedor.getText().toUpperCase());

            if (txtNomeVendedor.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um nome para Cadastrar",
                        "Falha", JOptionPane.WARNING_MESSAGE);
                btnDeletarVendedor.setEnabled(false);
                btnCadastrarVendedor.setEnabled(false);
                return;
            }

            if (vendedorList.isEmpty()) {
                btnCadastrarVendedor.requestFocus();
                btnCadastrarVendedor.setEnabled(true);
                btnDeletarVendedor.setEnabled(false);
            } else {
                txtNomeVendedor.setText(vendedorList.get(0).getNome());
                btnDeletarVendedor.setEnabled(true);
                btnCadastrarVendedor.setEnabled(false);

            }
        }
    }


    private void btnDeletarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarVendedorActionPerformed
        String nomeVendedor = txtNomeVendedor.getText();

        if (nomeVendedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um nome para excluir",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            btnDeletarVendedor.setEnabled(false);
            btnCadastrarVendedor.setEnabled(false);
            return;
        }

        if (this.isVendedorCadastrado(nomeVendedor)) {
            String msg = "";
            if (JOptionPane.showConfirmDialog(null, "<html> <H2 ALIGN=\"center\"><FONT FACE=\"Tahoma\" COLOR=\"red\">ATENÇÃO</FONT></H2>"
                    + "<p><font  FACE=\"Arial\" SIZE=\"5\">Este Procedimento <b>excluirá o vendedor.</b>"
                    + "Também serão excluidos todos<br> os registros de <b>Saidas</b><br>"
                    + "<br>Deseja Continuar?<font></p> </html>", "Excluir Vendedor", JOptionPane.YES_NO_OPTION, -1) == 0) {

                if (VendedorDAO.excluir(nomeVendedor)) {
                    msg += "<font COLOR=\"green\"><br>Vendedor excluído com sucesso!</font><br>";
                } else {
                    msg += "<font COLOR=\"red\"><br>Falha ao excluir vendedor, contacte o desenvolvedor!</font><br>";
                }

                if (SaidaDAO.excluirTudoPorVendedor(nomeVendedor)) {
                    msg += "<font COLOR=\"green\"><br>Registros de saída Excluídos com sucesso!</font><br>";
                } else {
                    msg += "<font COLOR=\"red\"><br>Falha ao excluir as saídas, contacte o desenvolvedor!</font><br>";
                }

                JOptionPane.showMessageDialog(this, "<html>" + msg + "</html>", "Concluído", JOptionPane.INFORMATION_MESSAGE);
                btnCadastrarVendedor.setEnabled(false);
                txtNomeVendedor.setText("");
                btnDeletarVendedor.setEnabled(false);
                preencherLista();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este vendedor não está cadastrado!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarVendedorActionPerformed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtConfirmarSenha.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnCadastrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVendedorActionPerformed
        String nomeVendedor = txtNomeVendedor.getText();

        if (nomeVendedor.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um nome para Cadastrar",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            btnDeletarVendedor.setEnabled(false);
            btnCadastrarVendedor.setEnabled(false);
            return;
        }

        if (!this.isVendedorCadastrado(nomeVendedor)) {

            if (VendedorDAO.salvar(new Vendedor(nomeVendedor.toUpperCase()))) {
                JOptionPane.showMessageDialog(null, "Vendedor Salvo com sucesso!",
                        "Concluído", JOptionPane.INFORMATION_MESSAGE);
                preencherLista();
            }

            btnCadastrarVendedor.setEnabled(false);
            txtNomeVendedor.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Este vendedor já está cadastrado!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarVendedorActionPerformed

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        this.salvarUsuario();
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "Usuarios");
        viewUtil.alterarIcone(btnUsuario, "icons8-gerente-64-selecionado.png");
        viewUtil.alterarIcone(btnVendedor, "icons8-funcionario-homem-64-azul.png");
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendedorActionPerformed
        CardLayout card2 = (CardLayout) jPanel2.getLayout();
        card2.show(jPanel2, "Vendedores");
        viewUtil.alterarIcone(btnUsuario, "icons8-gerente-64-azul.png");
        viewUtil.alterarIcone(btnVendedor, "icons8-funcionario-homem-64-selecionado.png");
    }//GEN-LAST:event_btnVendedorActionPerformed

    private void jListVendedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListVendedoresMouseClicked
        txtNomeVendedor.setText((String) listaVendedoresModel.get(jListVendedores.getSelectedIndex()));
        btnDeletarVendedor.setEnabled(true);
        btnCadastrarVendedor.setEnabled(false);
    }//GEN-LAST:event_jListVendedoresMouseClicked

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        alterarUser();
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed

    private void btnDeletarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarUsuariosActionPerformed
        String usuario = txtUsuario.getText();

        if (!isUsuarioCadastrado(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuário Não está cadastrado!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (LoginDAO.excluir(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuário excluido com Sucesso!",
                    "concluido", JOptionPane.WARNING_MESSAGE);
        }
        txtUsuario.setText("");
    }//GEN-LAST:event_btnDeletarUsuariosActionPerformed

    private void preencherLista() {
        listaVendedoresModel.removeAllElements();
        List<Vendedor> listaVendedores = VendedorDAO.buscaTudo();
        for (Vendedor vendedor : listaVendedores) {
            listaVendedoresModel.addElement(vendedor.getNome());
        }

    }

    private void salvarUsuario() {
        String senha, confirmarSenha, usuario, alterarDados;

        usuario = txtUsuario.getText();
        senha = new String(txtSenha.getPassword());
        confirmarSenha = new String(txtConfirmarSenha.getPassword());
        alterarDados = jcbAlterarDados.isSelected() ? "s" : "n";

        if (usuario.isEmpty() || senha.isEmpty() || confirmarSenha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
            return;
        }
        cadastrarUsuario(new Login(usuario, senha, alterarDados), confirmarSenha);

    }

    private boolean isUsuarioCadastrado(String usuario) {
        
        Login login = LoginDAO.busca(usuario);
        return !(login == null);
    }

    private void cadastrarUsuario(Login usuario, String confirmarSenha) {

        if (isSenhasIguais(usuario.getSenha(), confirmarSenha)) {

            if (!isUsuarioCadastrado(usuario.getUsuario())) {

                usuario.setSenha(Cripto.criptografar(usuario.getSenha()));
                if (LoginDAO.salvar(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuário Salvo com Sucesso!",
                            "concluido", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado!",
                        "Falha", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public boolean isVendedorCadastrado(String nome) {
        List<Vendedor> vendedorList = VendedorDAO.busca(nome.toUpperCase());

        return !vendedorList.isEmpty();
    }

    private boolean isSenhasIguais(String senha, String confirmaSenha) {
        if (senha.equals(confirmaSenha)) {
            return true;
        }
        JOptionPane.showMessageDialog(null, "As Senhas São Diferentes!",
                "Falha", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {

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
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(TelaCadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro!!", JOptionPane.ERROR_MESSAGE);
            }
            //</editor-fold>
            //</editor-fold>

            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                TelaCadastros dialog = new TelaCadastros(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha não tratada detectada!!!",
                    "Falha", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnCadastrarVendedor;
    private javax.swing.JButton btnDeletarUsuarios;
    private javax.swing.JButton btnDeletarVendedor;
    private javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jListVendedores;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbAlterarDados;
    private javax.swing.JPanel jpnUsuarios;
    private javax.swing.JPanel jpnVendedor;
    private javax.swing.JPanel jpnVendedores;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
