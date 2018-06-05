package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansCliente;
import modeloConexao.ConexaoBD;

/**
 *
 * @author Rayssa
 */
public class DaoCliente {
    
    ConexaoBD conex = new ConexaoBD();
    BeansCliente mod = new BeansCliente();
    
    public void Salvar(BeansCliente mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into clientes(nome_apelido, nome_cliente, email_cliente, aniversario_cliente, cep_cliente, rua_cliente, numero_cliente, bairro_cliente, cidade_cliente, estado_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pst.setString(1, mod.getNome_apelido());
            pst.setString(2, mod.getNome_completo());
            pst.setString(3, mod.getEmail());
            pst.setInt(4, mod.getTelefone());
            pst.setString(4, mod.getAniversario());
            pst.setInt(5, mod.getCep());
            pst.setString(6, mod.getRua());
            pst.setInt(7, mod.getNumero());
            pst.setString(8, mod.getBairro());
            pst.setString(9, mod.getCidade());
            pst.setString(10, mod.getEstado());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso! ");
            
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,  "Erro ao inserir os dados! \n"+ex );
                 
        }
        
        
        //conex.desconecta();
    }
    
    
    public void Editar(BeansCliente mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update clientes set nome_cliente=?,nome_apelido=?, email_cliente=?, telefone_cliente=?, aniversario_cliente=?, cep_cliente=?, rua_cliente=?, numero_cliente=?, bairro_cliente=?, cidade_cliente=?, estado_funcionario=? where id_cliente=?");
            
            pst.setString(1, mod.getNome_completo());
            pst.setString(2, mod.getNome_apelido());
            pst.setString(3, mod.getEmail());
            pst.setInt(4, mod.getTelefone());
            pst.setString(5, mod.getAniversario());
            pst.setString(6, mod.getRua());
            pst.setInt(7, mod.getCep());
            pst.setInt(8, mod.getNumero());
            pst.setString(9, mod.getBairro());
            pst.setString(10, mod.getCidade());
            pst.setString(11, mod.getEstado());           
            pst.setInt(12, mod.getCod_cliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteracao dos dados!\n" +ex);
        }
        
        //conex.desconecta();
    }
    
        public void Excluir(BeansCliente mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from clientes where id_cliente=?");
            pst.setInt(1, mod.getCod_cliente());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!/n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!/n");
        }
        
        
        //conex.desconecta();
    }
    
    public BeansCliente buscaCliente(BeansCliente mod){
        conex.conexao();
        conex.executaSql("select *from clientes where nome_cliente like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCod_cliente(conex.rs.getInt("id_cliente"));
            mod.setNome_completo(conex.rs.getString("nome_cliente"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,  "Erro ao buscar cliente! \n");
        }
        
        
        
        //conex.desconecta();
        return mod;
    }
    
    
    
}
