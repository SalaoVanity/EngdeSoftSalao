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
import modeloBeans.BeansServico;
import modeloConexao.ConexaoBD;

/**
 *
 * @author Leandro
 */
public class DaoServico {
    
    ConexaoBD conex = new ConexaoBD();
    BeansServico mod = new BeansServico();
    
    public void Salvar(BeansServico mod){
        
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into servicos (nome_servico) values (?)");
            pst.setString(1, mod.getNome());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Serviço inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir serviço!"+ex);
        }
        
        
        
    }
    
}
