package modeloConexao;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Rayssa
 */
public class ConexaoBDantigorayssa {
   public Statement stm; // realiza a pesquisa
    public ResultSet rs; // armazena o resultado da pesquisa
    private String driver = "org.postgresql.Driver"; // identifica o serviço de banco de dados
    private String caminho = "jdbc:postgresql://localhost:5432/projetoSalaoVanity"; // dizer qual o caminho do BD, onde está alocado
    private String usuario = "postgres"; // usuario BD
    private String senha = "7369"; // Senha BD
    public Connection con; // RELIZA A CONEXÃO COM O BD
    
    public void conexao(){
        
       try {
           System.setProperty("jdbc.Drivers", driver); // responsavel por setar a propriedade do driver de concexão 
           con = DriverManager.getConnection(caminho, usuario, senha);
           JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Erro ao se concectar com o banco de dados: \n" + ex);
       } 
    }

    public void executaSql(String sql){
       try {
           stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao executa sql \n" + ex.getMessage());
       }
        
    }
            
    
     public void desconecta(){
       try {
           con.close();
           JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!");
       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Erro ao desconcetar o BD: \n" + ex);
       }
       }
}
