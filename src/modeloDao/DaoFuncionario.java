package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansFuncionario;
import modeloConexao.ConexaoBD;

/**
 *
 * @author Leandro
 */
public class DaoFuncionario {
    ConexaoBD conex = new ConexaoBD();
    BeansFuncionario mod = new BeansFuncionario();
        
    public void Salvar(BeansFuncionario mod){
        conex.conexao();
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into funcionarios(nome_funcionario,apelido_funcionario,cpf_funcionario,area_funcionario,email_funcionario,telefone_funcionario,aniversario_funcionario,endereco_funcionario,numero_funcionario,cep_funcionario,bairro_funcionario,cidade_funcionario,estado_funcionario) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,mod.getNome());
            pst.setString(2,mod.getApelido());
            pst.setInt(3,mod.getCpf());
            pst.setString(4,mod.getArea());
            pst.setString(5,mod.getEmail());
            pst.setInt(6,mod.getTelefone());
            pst.setString(7,mod.getAniversario());
            pst.setString(8,mod.getEndereco());
            pst.setInt(9,mod.getNumero());
            pst.setInt(10,mod.getCep());
            pst.setString(11,mod.getBairro());
            pst.setString(12,mod.getCidade());
            pst.setString(13,mod.getEstado());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!\n");
        }

                
        //conex.desconecta();
    }
    
    public void Editar(BeansFuncionario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("update funcionarios set nome_funcionario=?,apelido_funcionario=?, cpf_funcionario=?, area_funcionario=?, email_funcionario=?, telefone_funcionario=?, aniversario_funcionario=?, endereco_funcionario=?, numero_funcionario=?, cep_funcionario=?, bairro_funcionario=?, cidade_funcionario=?, estado_funcionario=? where cod_funcionario=?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getArea());
            pst.setInt(3, mod.getCpf());
            pst.setString(4, mod.getEmail());
            pst.setInt(5, mod.getTelefone());
            pst.setString(6, mod.getAniversario());
            pst.setString(7, mod.getEndereco());
            pst.setInt(8, mod.getCep());
            pst.setInt(9, mod.getNumero());
            pst.setString(10, mod.getBairro());
            pst.setString(11, mod.getCidade());
            pst.setString(12, mod.getEstado());
            pst.setString(13, mod.getApelido());
            
            pst.setInt(14, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na alteracao dos dados!/n");
        }
        
        //conex.desconecta();
    }
    
    public void Excluir(BeansFuncionario mod){
        conex.conexao();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from funcionarios where cod_funcionario=?");
            pst.setInt(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!/n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!/n");
        }
        
        
        //conex.desconecta();
    }

    
    public BeansFuncionario buscaFuncionario(BeansFuncionario mod){
        conex.conexao();
        conex.executaSql("select *from funcionarios where nome_funcionario like'%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_funcionario"));
            mod.setNome(conex.rs.getString("nome_funcionario"));
            mod.setApelido(conex.rs.getString("apelido_funcionario"));
            mod.setCpf(conex.rs.getInt("cpf_funcionario"));
            mod.setArea(conex.rs.getString("area_funcionario"));
            mod.setEmail(conex.rs.getString("email_funcionario"));
            mod.setTelefone(conex.rs.getInt("telefone_funcionario"));
            mod.setAniversario(conex.rs.getString("aniversario_funcionario"));
            mod.setEndereco(conex.rs.getString("endereco_funcionario"));
            mod.setNumero(conex.rs.getInt("numero_funcionario"));
            mod.setCep(conex.rs.getInt("cep_funcionario"));
            mod.setBairro(conex.rs.getString("bairro_funcionario"));
            mod.setCidade(conex.rs.getString("cidade_funcionario"));
            mod.setEstado(conex.rs.getString("estado_funcionario"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionario: Funcionario nao cadastrado!");
        }
        
        //conex.desconecta();
        return mod;
    }



    
}
