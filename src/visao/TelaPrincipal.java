package visao;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modeloBeans.Hora;
import modeloConexao.ConexaoBD;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Rayssa
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    Connection con = ConexaoBD.conexao();


    ConexaoBD conecta = new ConexaoBD();
    /*
    FormCliente cli = new FormCliente();
    FormFuncionario func = new FormFuncionario();
    FormUsuario usu = new FormUsuario();
    FormSalao salao = new FormSalao();
    FormAgendamento agendamento = new FormAgendamento();
    FormAgenda agenda = new FormAgenda();
    FormAgendaFuncionario agendafunc = new FormAgendaFuncionario();
    FormCaixa caixa = new FormCaixa();
    */
    
    
    public TelaPrincipal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        
        conecta.conexao();
        
                        // coloca uma figura na barra de título da janela
        URL url = this.getClass().getResource("/Imagens/salao.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        
        //exibe a data atual do sistema
        Date data = new Date();
        DateFormat formatadorD = DateFormat.getDateInstance(DateFormat.LONG);
        jLabelDataAtual.setText(formatadorD.format(data));
        
        //exibe a hora Atual do sistema
        mostra_hora = new Hora();
        mostra_hora.ler_hora();
        jLabelHoraAtual.setText("Horário: " + mostra_hora.hora);
        
        timer1.start();
    }
    private Hora mostra_hora;

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonCliente = new javax.swing.JButton();
        jButtonFuncionario = new javax.swing.JButton();
        jButtonUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAgendamento = new javax.swing.JButton();
        tbtSalao = new javax.swing.JButton();
        jButtonAgenda = new javax.swing.JButton();
        jButtonAgendaFuncionario = new javax.swing.JButton();
        jButtonServicos = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonFecharBemVindo = new javax.swing.JButton();
        jLabelNUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelDataAtual = new javax.swing.JLabel();
        jLabelHoraAtual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadCliente = new javax.swing.JMenuItem();
        jMenuItemCadFuncionarios = new javax.swing.JMenuItem();
        jMenuItemCadUsuarios = new javax.swing.JMenuItem();
        jMenuItemSalao = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemAgenda = new javax.swing.JMenuItem();
        jMenuItemAgendamentoo = new javax.swing.JMenuItem();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuAgenda = new javax.swing.JMenu();
        jMenuItemAgendaHoje = new javax.swing.JMenuItem();
        jMenuItemAgendamento = new javax.swing.JMenuItem();
        jMenuItemAgendaFuncionario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCaixa = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem-Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Cadastros");
        jPanelInternal.add(jLabel3);
        jLabel3.setBounds(20, 20, 100, 14);

        jButtonCliente.setText("Cliente");
        jButtonCliente.setToolTipText("Cliente");
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonCliente);
        jButtonCliente.setBounds(10, 50, 90, 23);

        jButtonFuncionario.setText("Funcionarios");
        jButtonFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFuncionarioActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonFuncionario);
        jButtonFuncionario.setBounds(120, 50, 130, 23);

        jButtonUsuario.setText("Usuários");
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonUsuario);
        jButtonUsuario.setBounds(270, 50, 90, 23);

        jLabel1.setText("Agenda");
        jPanelInternal.add(jLabel1);
        jLabel1.setBounds(20, 100, 60, 14);

        jButtonAgendamento.setText("Agendamento");
        jButtonAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendamentoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonAgendamento);
        jButtonAgendamento.setBounds(10, 130, 110, 23);

        tbtSalao.setText("Salão");
        tbtSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtSalaoActionPerformed(evt);
            }
        });
        jPanelInternal.add(tbtSalao);
        tbtSalao.setBounds(390, 50, 70, 23);

        jButtonAgenda.setText("Agenda");
        jButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonAgenda);
        jButtonAgenda.setBounds(150, 130, 100, 23);

        jButtonAgendaFuncionario.setText("Agenda do Funcionário");
        jButtonAgendaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendaFuncionarioActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonAgendaFuncionario);
        jButtonAgendaFuncionario.setBounds(280, 130, 180, 23);

        jButtonServicos.setText("Serviços");
        jButtonServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonServicosActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonServicos);
        jButtonServicos.setBounds(480, 50, 100, 23);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(10, 50, 620, 240);

        jLabelTitulo.setText("Sistema de gerenciameto de:");
        jInternalFrameBemVindo.getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(20, 20, 280, 14);

        jButtonFecharBemVindo.setText("Sair");
        jButtonFecharBemVindo.setToolTipText("Fechar tela Bem-Vindos");
        jButtonFecharBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharBemVindoActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonFecharBemVindo);
        jButtonFecharBemVindo.setBounds(560, 20, 51, 23);

        jLabelNUsuario.setText("BEM VINDO(A) ,  ");
        jInternalFrameBemVindo.getContentPane().add(jLabelNUsuario);
        jLabelNUsuario.setBounds(10, 310, 100, 20);
        jInternalFrameBemVindo.getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(100, 310, 190, 20);
        jInternalFrameBemVindo.getContentPane().add(jLabelDataAtual);
        jLabelDataAtual.setBounds(320, 310, 160, 20);
        jInternalFrameBemVindo.getContentPane().add(jLabelHoraAtual);
        jLabelHoraAtual.setBounds(490, 310, 140, 20);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(30, 30, 680, 370);

        jMenuCadastro.setText("Cadastros");

        jMenuItemCadCliente.setText("Clientes");
        jMenuItemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadCliente);

        jMenuItemCadFuncionarios.setText("Funcionários");
        jMenuItemCadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFuncionariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadFuncionarios);

        jMenuItemCadUsuarios.setText("Usuários");
        jMenuItemCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadUsuariosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadUsuarios);

        jMenuItemSalao.setText("Salão");
        jMenuItemSalao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalaoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemSalao);

        jMenuItem1.setText("Serviço");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem1);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorios.setText("Relatórios");

        jMenuItemCliente.setText("Clientes");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemCliente);

        jMenuItemFuncionario.setText("Funcionários");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemFuncionario);

        jMenuItemUsuarios.setText("Usuários");
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemUsuarios);

        jMenuItemAgenda.setText("Agenda do Dia");
        jMenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemAgenda);

        jMenuItemAgendamentoo.setText("Agendamento");
        jMenuItemAgendamentoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendamentooActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemAgendamentoo);

        jMenuBar1.add(jMenuRelatorios);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem Vindos");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuAgenda.setText("Agenda");

        jMenuItemAgendaHoje.setText("Agenda Hoje");
        jMenuItemAgendaHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaHojeActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMenuItemAgendaHoje);

        jMenuItemAgendamento.setText("Agendamento");
        jMenuItemAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendamentoActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMenuItemAgendamento);

        jMenuItemAgendaFuncionario.setText("Agenda do Funcionário");
        jMenuItemAgendaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgendaFuncionarioActionPerformed(evt);
            }
        });
        jMenuAgenda.add(jMenuItemAgendaFuncionario);

        jMenuBar1.add(jMenuAgenda);

        jMenu1.setText("Caixa");

        jMenuItemCaixa.setText("Caixa");
        jMenuItemCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCaixaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCaixa);

        jMenuBar1.add(jMenu1);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1346, 848));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteActionPerformed
        
        FormCliente tela = new FormCliente();
        tela.setVisible(true);
        
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("funcionário")|| conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(cli==null){
                    cli = new FormCliente();
                    cli.setVisible(true);
                    cli.setResizable(false);
                }else{
                    cli.setVisible(true);
                    cli.setResizable(false);
                }
                //FormCliente tela = new FormCliente();
                //tela.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
        
    }//GEN-LAST:event_jMenuItemCadClienteActionPerformed

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        
        FormCliente tela = new FormCliente();
        tela.setVisible(true);
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("funcionário") || conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(cli==null){
                    cli = new FormCliente();
                    cli.setVisible(true);
                    cli.setResizable(false);
                }else{
                    cli.setVisible(true);
                    cli.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonFecharBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharBemVindoActionPerformed
       jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonFecharBemVindoActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        jInternalFrameBemVindo.setVisible(true);
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jButtonFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncionarioActionPerformed
        
        FormFuncionario tela = new FormFuncionario();
        tela.setVisible(true);
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(func==null){
                    func = new FormFuncionario();
                    func.setVisible(true);
                    func.setResizable(false);
                }else{
                    func.setVisible(true);
                    func.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
        
    }//GEN-LAST:event_jButtonFuncionarioActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
        
        FormUsuario usuario = new FormUsuario();
        usuario.setVisible(true);
        
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(usu==null){
                    usu = new FormUsuario();
                    usu.setVisible(true);
                    usu.setResizable(false);
                }else{
                    usu.setVisible(true);
                    usu.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
    }//GEN-LAST:event_jButtonUsuarioActionPerformed

    private void jMenuItemCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadUsuariosActionPerformed
        FormUsuario tela = new FormUsuario();
        tela.setVisible(true);
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(usu==null){
                    usu = new FormUsuario();
                    usu.setVisible(true);
                    usu.setResizable(false);
                }else{
                    usu.setVisible(true);
                    usu.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
        
        
    }//GEN-LAST:event_jMenuItemCadUsuariosActionPerformed

    private void tbtSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtSalaoActionPerformed
        
        FormSalao tela = new FormSalao();
        tela.setVisible(true);
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(salao==null){
                    salao = new FormSalao();
                    salao.setVisible(true);
                    salao.setResizable(false);
                }else{
                    salao.setVisible(true);
                    salao.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
        
    }//GEN-LAST:event_tbtSalaoActionPerformed

    private void jMenuItemSalaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalaoActionPerformed
        FormSalao tela = new FormSalao();
        tela.setVisible(true);
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(salao==null){
                    salao = new FormSalao();
                    salao.setVisible(true);
                    salao.setResizable(false);
                }else{
                    salao.setVisible(true);
                    salao.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
    }//GEN-LAST:event_jMenuItemSalaoActionPerformed

    private void jMenuItemCadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFuncionariosActionPerformed
        
        
        FormFuncionario tela = new FormFuncionario();
        tela.setVisible(true);
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("administrador")){
                if(func==null){
                    func = new FormFuncionario();
                    func.setVisible(true);
                    func.setResizable(false);
                }else{
                    func.setVisible(true);
                    func.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
        
    }//GEN-LAST:event_jMenuItemCadFuncionariosActionPerformed

    private void jButtonAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendamentoActionPerformed
        
        FormAgendamento tela = new FormAgendamento();
        tela.setVisible(true);
        /*
        try {
            conecta.executaSql("select * from usuarios where nome_usuario='"+jLabelUsuario.getText()+"'");
            conecta.rs.first();
            if(conecta.rs.getString("tipo_usuario").equals("administrador") || conecta.rs.getString("tipo_usuario").equals("funcionario")){
                if(agendamento==null){
                    agendamento = new FormAgendamento();
                    agendamento.setVisible(true);
                    agendamento.setResizable(false);
                }else{
                    agendamento.setVisible(true);
                    agendamento.setResizable(false);
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
            }
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Você não tem permissão para esta funcionalidade\n Contate o administrador do sistema!");
        }
        */
    }//GEN-LAST:event_jButtonAgendamentoActionPerformed

    private void jMenuItemAgendaHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaHojeActionPerformed
        FormAgenda tela = new FormAgenda();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgendaHojeActionPerformed

    private void jMenuItemAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendamentoActionPerformed
        FormAgendamento tela = new FormAgendamento();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgendamentoActionPerformed

    private void jButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaActionPerformed
        FormAgenda tela = new FormAgenda();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonAgendaActionPerformed

    private void jMenuItemAgendaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaFuncionarioActionPerformed
        FormAgendaFuncionario tela = new FormAgendaFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemAgendaFuncionarioActionPerformed

    private void jButtonAgendaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendaFuncionarioActionPerformed
        FormAgendaFuncionario tela = new FormAgendaFuncionario();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonAgendaFuncionarioActionPerformed

    private void jMenuItemCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCaixaActionPerformed
        FormCaixa tela = new FormCaixa();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItemCaixaActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // METODO PARA CHAMAR RELATORIO DE CLIENTES

        
        int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatório?","Atenção",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            String src = "C:/Users/Leandro/Documents/NetBeansProjects/10.0 - ProjetoSalaoVanity/Relatórios/Clientes/RelatorioCliente.jasper";
            
            JasperPrint jasperPrint = null;
            
            try {
                jasperPrint = JasperFillManager.fillReport(src,null,con );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n"+e);
            }
            
            JasperViewer view = new JasperViewer(jasperPrint,false);
            view.setVisible(true);
        
        }
        
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed
         // METODO PARA CHAMAR RELATORIO DE FUNCIONARIOS
         
         int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatório?","Atenção",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            String src = "C:/Users/Leandro/Documents/NetBeansProjects/10.0 - ProjetoSalaoVanity/Relatórios/Funcionários/RelatorioFuncionário.jasper";
            
            JasperPrint jasperPrint = null;
            
            try {
                jasperPrint = JasperFillManager.fillReport(src,null,con );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n"+e);
            }
            
            JasperViewer view = new JasperViewer(jasperPrint,false);
            view.setVisible(true);
        
        }
         
         
    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
         // METODO PARA CHAMAR RELATORIO DE USUARIOS
         
         int confirma = JOptionPane.showConfirmDialog(null, "Confirma a impressão do relatório?","Atenção",JOptionPane.YES_NO_OPTION);
        if(confirma == JOptionPane.YES_OPTION){
            String src = "C:/Users/Leandro/Documents/NetBeansProjects/10.0 - ProjetoSalaoVanity/Relatórios/Usuários/RelatorioUsuários.jasper";
            
            JasperPrint jasperPrint = null;
            
            try {
                jasperPrint = JasperFillManager.fillReport(src,null,con );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n"+e);
            }
            
            JasperViewer view = new JasperViewer(jasperPrint,false);
            view.setVisible(true);
        
        }
         
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendaActionPerformed
         // METODO PARA CHAMAR RELATORIO DE AGENDA DO DIA
    }//GEN-LAST:event_jMenuItemAgendaActionPerformed

    private void jMenuItemAgendamentooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgendamentooActionPerformed
         // METODO PARA CHAMAR RELATORIO DE AGENDAMENTO
    }//GEN-LAST:event_jMenuItemAgendamentooActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        
        mostra_hora.ler_hora();
        jLabelHoraAtual.setText("Horário: " + mostra_hora.hora);
        
    }//GEN-LAST:event_timer1OnTime

    private void jButtonServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonServicosActionPerformed
        FormServicos servico = new FormServicos();
        servico.setVisible(true);
    }//GEN-LAST:event_jButtonServicosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormServicos servico = new FormServicos();
        servico.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgenda;
    private javax.swing.JButton jButtonAgendaFuncionario;
    private javax.swing.JButton jButtonAgendamento;
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonFecharBemVindo;
    private javax.swing.JButton jButtonFuncionario;
    private javax.swing.JButton jButtonServicos;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelDataAtual;
    private javax.swing.JLabel jLabelHoraAtual;
    private javax.swing.JLabel jLabelNUsuario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAgenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAgenda;
    private javax.swing.JMenuItem jMenuItemAgendaFuncionario;
    private javax.swing.JMenuItem jMenuItemAgendaHoje;
    private javax.swing.JMenuItem jMenuItemAgendamento;
    private javax.swing.JMenuItem jMenuItemAgendamentoo;
    private javax.swing.JMenuItem jMenuItemCadCliente;
    private javax.swing.JMenuItem jMenuItemCadFuncionarios;
    private javax.swing.JMenuItem jMenuItemCadUsuarios;
    private javax.swing.JMenuItem jMenuItemCaixa;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemSalao;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    private javax.swing.JButton tbtSalao;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables
}
