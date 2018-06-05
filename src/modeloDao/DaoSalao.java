package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansSalao;
import modeloConexao.ConexaoBD;

/**
 *
 * @author Rayssa
 */
public class DaoSalao {
    
    ConexaoBD conex = new ConexaoBD();
    BeansSalao mod = new BeansSalao();
    
    
    public void Salvar (BeansSalao mod){
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into salao(nome_salao, email_salao, cnpj_salao, telefone, cep_salao, rua_salao, numero_salao, bairro_salao, cidade_salao, estado_salao) values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome_salao());
            pst.setString(2,mod.getEmail_salao());
            pst.setInt(3,mod.getCnpj_salao());
            pst.setInt(4,mod.getTelefone());
            pst.setInt(5,mod.getCep_salao());
            pst.setString(6,mod.getRua_salao());
            pst.setInt(7,mod.getNumero_salao());
            pst.setString(8,mod.getBairro_salao());
            pst.setString(9,mod.getCidade_salao());
            pst.setString(10,mod.getEstado_salao());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir usuario!\n");
        }

                
        //conex.desconecta();
        
    }

    public BeansSalao BuscaSalao(BeansSalao mod) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
