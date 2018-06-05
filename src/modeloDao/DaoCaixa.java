/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modeloBeans.BeansCaixa;
import modeloConexao.ConexaoBD;

/**
 *
 * @author Leandro
 */
public class DaoCaixa {
    
    ConexaoBD conex = new ConexaoBD();
    BeansCaixa mod = new BeansCaixa();
    
    public void InserirDespeza(BeansCaixa mod){
        
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into caixa(caixa_descsaida,caixa_despeza,caixa_data) values(?,?,?)");
            pst.setString(1,mod.getDescsaida());
            pst.setString(2,mod.getSaque());
            pst.setString(3,mod.getData());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Despeza inserida com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir despeza!\n");
        }

        //conex.desconecta();
        
    }
    
        public void InserirEntrada(BeansCaixa mod){
        
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("insert into caixa(caixa_descentrada,caixa_entrada,caixa_data) values(?,?)");
            pst.setString(1, mod.getDescentrada());
            pst.setString(2,mod.getDeposito());
            pst.setString(3,mod.getData());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Entrada inserida com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir entrada!\n");
        }

        //conex.desconecta();
        
    }
        
        public void Saldo(BeansCaixa mod){
        
        conex.conexao();
        
        try{
            PreparedStatement pst = conex.con.prepareStatement("select caixa_saldo from caixa");
            pst.setString(1,mod.getDeposito());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Entrada inserida com sucesso!");
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao inserir entrada!\n");
        }

        //conex.desconecta();
        
    }
        
    
    
}
