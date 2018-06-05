/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modeloBeans.BeansAgenda;
import modeloConexao.ConexaoBD;

/**
 *
 * @author Leandro
 */
public class DaoAgenda {
    
    BeansAgenda agenda = new BeansAgenda();
    ConexaoBD conex = new ConexaoBD();
    ConexaoBD conexCliente = new ConexaoBD();
    ConexaoBD conexFuncionario = new ConexaoBD();
    int codCliente;
    int codFuncionario;
    String nomeFuncionario;
    
    public void Salvar(BeansAgenda agenda){
        
        BuscaFuncionario(agenda.getNomeFuncionario());
        BuscaCliente(agenda.getNomeCliente());
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into agenda (agenda_codcliente,agenda_codfuncionario,agenda_data,agenda_servico,agenda_hora,agenda_valorinicial,agenda_desconto,agenda_valorfinal,agenda_obs,agenda_status,agenda_tempoestimado)values(?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, codCliente);
            pst.setInt(2, codFuncionario);
            pst.setDate(3, new java.sql.Date(agenda.getData().getTime()));
            pst.setString(4, agenda.getServico());
            pst.setString(5, agenda.getHora());
            pst.setString(6, agenda.getValorInicial());
            pst.setString(7, agenda.getDesconto());
            pst.setString(8, agenda.getValorFinal());
            pst.setString(9, agenda.getObservacoes());
            pst.setString(10, agenda.getStatus());
            pst.setString(11, agenda.getTempoestimado());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar agendamento!"+ex);
        }
        
        //conex.desconecta();
        
    }    
    
    public String BuscaFuncionario(String nomeFuncionario){
        
        conexFuncionario.conexao();
        conexFuncionario.executaSql("select * from funcionarios where nome_funcionario='"+nomeFuncionario+"'");
        try {
            conexFuncionario.rs.first();
            codFuncionario = conexFuncionario.rs.getInt("cod_funcionario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcionario nao encontrado!");
        }
        return nomeFuncionario;
    }
    
    public int BuscaCodFuncionario(String nomeFuncionario){
        
        conexFuncionario.conexao();
        conexFuncionario.executaSql("select * from funcionarios where nome_funcionario='"+nomeFuncionario+"'");
        try {
            conexFuncionario.rs.first();
            codFuncionario = conexFuncionario.rs.getInt("cod_funcionario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Funcionario nao encontrado!");
        }
        
        return codFuncionario;
    }
    
    public void BuscaCliente(String nomeCliente){
        
        conexCliente.conexao();
        conexCliente.executaSql("select * from clientes where nome_cliente='"+nomeCliente+"'");
        try {
            conexCliente.rs.first();
            codCliente = conexCliente.rs.getInt("id_cliente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado!"+ex);
        }
        
    }
    
    
    
    public void Alterar(BeansAgenda agenda,int cod){
        if(cod==1){
            conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento em atendimento!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atender agendamento!"+ex);
        }
        
        //conex.desconecta();
        }
        else{
            conex.conexao();
            agenda.setStatus("Finalizado");
        try {
            PreparedStatement pst = conex.con.prepareStatement("update agenda set agenda_status=? where agenda_cod=?");
            pst.setString(1, agenda.getStatus());
            pst.setInt(2, agenda.getAgendaCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Agendamento finalizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atender agendamento!"+ex);
        }
        
        //conex.desconecta();
        }
        
        
    }
    
    public void BuscaAgendamento(BeansAgenda agenda){
        
        conexFuncionario.conexao();
        conexFuncionario.executaSql("select * from agenda where agenda_data = '"+agenda.getData()+"'");
        try{
            conexFuncionario.rs.first();
            codFuncionario = conexFuncionario.rs.getInt("cod_funcionario");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Agendamento não encontrado!");
        } 
    }
    
    public BeansAgenda buscaAgendaPorCodigo(int cod){
        
        BeansAgenda agen = new BeansAgenda();
        conex.conexao();
        conex.executaSql("select * from agenda inner join clientes on agenda_codcliente = id_cliente inner join funcionarios on agenda_codfuncionario = cod_funcionario where agenda_cod ='"+cod+"'");
        try{
            conex.rs.first();
            agen.setNomeCliente(conex.rs.getString("nome_cliente"));
            agen.setNomeFuncionario(conex.rs.getString("nome_funcionario"));
            agen.setData(conex.rs.getDate("agenda_data"));
            agen.setObservacoes(conex.rs.getString("agenda_obs"));
            agen.setValorFinal(conex.rs.getString("agenda_valorfinal"));
            agen.setServico(conex.rs.getString("agenda_servico"));
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar agendamento por código!");
        } 
        return agen;
    }
    
    
}
