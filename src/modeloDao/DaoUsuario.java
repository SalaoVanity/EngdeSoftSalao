/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansUsuario;
import modeloConexao.ConexaoBD;


public class DaoUsuario {
    
    ConexaoBD conex = new ConexaoBD();
    BeansUsuario mod = new BeansUsuario();
    

    
    public void Salvar(BeansUsuario mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into usuarios(nome_usuario,senha_usuario,tipo_usuario) values(?,?,?)");
            pst.setString(1,mod.getUsuNome());
            pst.setString(2,mod.getUsuSenha());
            pst.setString(3,mod.getUsuTipo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario!\n");
        }

                
        //conex.desconecta();
    }
    
    
    public void Alterar(BeansUsuario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update usuarios set nome_usuario=?, senha_usuario=?, tipo_usuario=? where cod_usuario=?");
            pst.setString(1, mod.getUsuNome());
            pst.setString(2, mod.getUsuSenha());
            pst.setString(3, mod.getUsuTipo());
            pst.setInt(4, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteracao do usuario!/n");
        }
        
        //conex.desconecta();
    }
    
    public void Excluir(BeansUsuario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from usuarios where cod_usuario=?");
            pst.setInt(1, mod.getUsuCod());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!/n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!/n");
        }
        
        
        //conex.desconecta();
    }
    
    public BeansUsuario buscaUsuario(BeansUsuario mod){
        conex.conexao();
        conex.executaSql("select *from usuarios where nome_usuario like'%"+mod.getUsuPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setUsuCod(conex.rs.getInt("cod_usuario"));
            mod.setUsuNome(conex.rs.getString("nome_usuario"));
            mod.setUsuSenha(conex.rs.getString("senha_usuario"));
            mod.setUsuTipo(conex.rs.getString("tipo_usuario"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
        }
        
        //conex.desconecta();
        return mod;
    }
    
    
}
