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
 * 
 */
public class ConexaoBD {
   public Statement stm; // realiza a pesquisa
    public ResultSet rs; // armazena o resultado da pesquisa
    private static final String driver = "org.postgresql.Driver"; // identifica o serviço de banco de dados
    private static final String caminho = "jdbc:postgresql://localhost:5436/projetoSalaoVanity"; // dizer qual o caminho do BD, onde está alocado
    private static final String usuario = "postgres"; // usuario BD
    private static final String senha = "Brainteam7"; // Senha BD
    public static Connection con; // RELIZA A CONEXÃO COM O BD
    
    public static Connection conexao(){
        
       try {
           System.setProperty("jdbc.Drivers", driver); // responsavel por setar a propriedade do driver de concexão 
           con = DriverManager.getConnection(caminho, usuario, senha);
           //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Erro ao se conectar com o banco de dados: \n");
       } 
       return con;
    }

    public void executaSql(String sql){
       try {
           stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
           rs = stm.executeQuery(sql);
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao executa sql \n"+ex);
       }
        
    }
            
    
     public void desconecta(){
       try {
           con.close();
           //JOptionPane.showMessageDialog(null, "BD desconectado com sucesso!");
       } catch (SQLException ex) {
           
           JOptionPane.showMessageDialog(null, "Erro ao desconcetar o BD: \n");
       }
       }
}
