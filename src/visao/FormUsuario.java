package visao;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import modeloBeans.BeansUsuario;
import modeloBeans.ModeloTabela;
import modeloConexao.ConexaoBD;
import modeloDao.DaoUsuario;

/**
 *
 * 
 */
public class FormUsuario extends javax.swing.JFrame {

    BeansUsuario mod = new BeansUsuario();
    DaoUsuario dao = new DaoUsuario();
    ConexaoBD conex = new ConexaoBD();
    int flag = 0;
    
    public FormUsuario() {
        initComponents();
        preencherTabela("select * from usuarios order by cod_usuario");
        
                        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/Imagens/salao.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtomCancelar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();
        jLabelCod = new javax.swing.JLabel();
        jTextFieldCod = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Usuário:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Tipo:");

        jLabel6.setText("Confirmar Senha:");

        jTextFieldUsuario.setEnabled(false);

        jPasswordFieldSenha.setEnabled(false);

        jPasswordFieldConfirmarSenha.setEnabled(false);

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "administrador", "funcionário" }));
        jComboBoxTipo.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtomCancelar.setText("Cancelar");
        jButtomCancelar.setEnabled(false);
        jButtomCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtomCancelarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUsuario);

        jLabelCod.setText("Cod: ");

        jTextFieldCod.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(jPasswordFieldConfirmarSenha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtomCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCod)
                    .addComponent(jTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtomCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setText("Cadastro de Usuários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabelTitulo)
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(636, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        
        int resposta = 0;
        resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
        if(resposta == JOptionPane.YES_OPTION){
            mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
            dao.Excluir(mod);
            preencherTabela("select * from usuarios order by cod_usuario");
            
            jTextFieldUsuario.setText("");
            jPasswordFieldSenha.setText("");
            jPasswordFieldConfirmarSenha.setText("");
            jTextFieldCod.setText("");
            
            jButtomCancelar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonExcluir.setEnabled(false);
            
        }
        
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        
        flag = 1;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        
        jButtomCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldPesquisa.setEnabled(false);
        jButtonBuscar.setEnabled(false);
        
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jTextFieldCod.setText("");
        jButtonNovo.setEnabled(false);
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        
        if(jTextFieldUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o usuario para continuar!");
            jTextFieldUsuario.requestFocus();
        }
        else if(jPasswordFieldConfirmarSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha o confirmar senha para continuar!");
            jPasswordFieldConfirmarSenha.requestFocus();
        }
        else if(jPasswordFieldSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha a senha para continuar!");
            jPasswordFieldSenha.requestFocus();
        }
        else 
            
        if(jPasswordFieldSenha.getText().equals(jPasswordFieldConfirmarSenha.getText())){
            if(flag == 1){
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                dao.Salvar(mod);
                preencherTabela("select * from usuarios order by cod_usuario");
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmarSenha.setText("");
                jTextFieldCod.setText("");
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldConfirmarSenha.setEnabled(false);
                jComboBoxTipo.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jTextFieldCod.setText("");
                jButtomCancelar.setEnabled(false);
            
            }else{
                mod.setUsuCod(Integer.parseInt(jTextFieldCod.getText()));
                mod.setUsuNome(jTextFieldUsuario.getText());
                mod.setUsuTipo((String) jComboBoxTipo.getSelectedItem());
                mod.setUsuSenha(jPasswordFieldSenha.getText());
                dao.Alterar(mod);
                preencherTabela("select * from usuarios order by cod_usuario");
            
                jTextFieldUsuario.setText("");
                jPasswordFieldSenha.setText("");
                jPasswordFieldConfirmarSenha.setText("");
                jTextFieldUsuario.setEnabled(false);
                jPasswordFieldConfirmarSenha.setEnabled(false);
                jComboBoxTipo.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jPasswordFieldSenha.setEnabled(false);
            
                jButtonNovo.setEnabled(true);
                jTextFieldCod.setText("");
                jButtonAlterar.setEnabled(false);
                jButtomCancelar.setEnabled(false);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Os campos Senha e Confirme senha precisam ser iguais!");
        }
            
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        mod.setUsuPesquisa(jTextFieldPesquisa.getText());
        BeansUsuario model = dao.buscaUsuario(mod);
        jTextFieldUsuario.setText(model.getUsuNome());
        jPasswordFieldSenha.setText(model.getUsuSenha());
        jPasswordFieldConfirmarSenha.setText(model.getUsuSenha());
        jComboBoxTipo.setSelectedItem(model.getUsuTipo());
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtomCancelar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        preencherTabela("select *from usuarios where nome_usuario like'%"+mod.getUsuPesquisa()+"%'");
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        
        flag = 2;
        jTextFieldUsuario.setEnabled(true);
        jComboBoxTipo.setEnabled(true);
        jPasswordFieldSenha.setEnabled(true);
        jPasswordFieldConfirmarSenha.setEnabled(true);
        
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuarioMouseClicked
        
        String nome_usuario = ""+jTableUsuario.getValueAt(jTableUsuario.getSelectedRow(), 1);
        conex.conexao();
        conex.executaSql("select * from usuarios where nome_usuario='"+nome_usuario+"'"); /// o meu nao tinha o igual apos nome_funcionario e inseri dps CONFERIR
            try {
                conex.rs.first();
                jTextFieldCod.setText(String.valueOf(conex.rs.getInt("cod_usuario")));
                jTextFieldUsuario.setText(conex.rs.getString("nome_usuario"));
                jComboBoxTipo.setSelectedItem(conex.rs.getString("tipo_usuario"));
                jPasswordFieldSenha.setText(conex.rs.getString("senha_usuario"));
                jPasswordFieldConfirmarSenha.setText(conex.rs.getString("senha_usuario"));
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados!");
            }
        
        conex.desconecta();
        
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtomCancelar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        
        jTextFieldCod.setEnabled(false);
        jTextFieldUsuario.setEnabled(false);
        jPasswordFieldSenha.setEnabled(false);
        jPasswordFieldConfirmarSenha.setEnabled(false);
        jComboBoxTipo.setEnabled(false);
        
    }//GEN-LAST:event_jTableUsuarioMouseClicked

    private void jButtomCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtomCancelarActionPerformed
        
        jTextFieldUsuario.setEnabled(!true);
        jComboBoxTipo.setEnabled(!true);
        jPasswordFieldSenha.setEnabled(!true);
        jPasswordFieldConfirmarSenha.setEnabled(!true);
        
        jButtomCancelar.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jTextFieldPesquisa.setEnabled(!false);
        jButtonBuscar.setEnabled(!false);
        jButtonNovo.setEnabled(true);
        jButtonExcluir.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        
        jTextFieldUsuario.setText("");
        jPasswordFieldSenha.setText("");
        jPasswordFieldConfirmarSenha.setText("");
        jTextFieldCod.setText("");
        
    }//GEN-LAST:event_jButtomCancelarActionPerformed

    public void preencherTabela(String sql){
        
        ArrayList dados = new ArrayList();
        
        String [] colunas = new String []{"ID","Usuario","Senha","Tipo"};
        conex.conexao();
        conex.executaSql(sql);
        
        try{
            conex.rs.first();
            do{
                //dados.add(new Object[]{conex.rs.getString("nome_funcionario"),conex.rs.getString("area_funcionario"),conex.rs.getInt("cpf_funcionario"),conex.rs.getInt("cod_funcionario")});
                dados.add(new Object[]{conex.rs.getInt("cod_usuario"),conex.rs.getString("nome_usuario"),conex.rs.getString("senha_usuario"),conex.rs.getString("tipo_usuario")});
                
            }while(conex.rs.next());
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(rootPane, "Busque outro Usuario para atualizar tabela!");
        }
        ModeloTabela modelo = new ModeloTabela(dados, colunas);
        jTableUsuario.setModel(modelo);
        jTableUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableUsuario.getColumnModel().getColumn(0).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTableUsuario.getColumnModel().getColumn(1).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(2).setPreferredWidth(80);
        jTableUsuario.getColumnModel().getColumn(2).setResizable(false);
        jTableUsuario.getColumnModel().getColumn(3).setPreferredWidth(120);
        jTableUsuario.getColumnModel().getColumn(3).setResizable(false);
        jTableUsuario.getTableHeader().setReorderingAllowed(false);
        jTableUsuario.setAutoResizeMode(jTableUsuario.AUTO_RESIZE_OFF);
        jTableUsuario.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        //conex.desconecta();
    }
    
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
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtomCancelar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCod;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuario;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
