/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBeans;

import java.util.Date;

/**
 *
 * @author Leandro
 */
public class BeansCaixa {
    
    private String saldo;
    private String saque;
    private String deposito;
    private String descentrada;
    private String descsaida;
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescentrada() {
        return descentrada;
    }

    public void setDescentrada(String descentrada) {
        this.descentrada = descentrada;
    }

    public String getDescsaida() {
        return descsaida;
    }

    public void setDescsaida(String descsaida) {
        this.descsaida = descsaida;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getSaque() {
        return saque;
    }

    public void setSaque(String saque) {
        this.saque = saque;
    }

    public String getDeposito() {
        return deposito;
    }

    public void setDeposito(String deposito) {
        this.deposito = deposito;
    }
    
}
