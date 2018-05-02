/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name="clienteJuridico")
public class ClienteJuridico extends Cliente{
//    duvida
   
    private String cnpj;

    public ClienteJuridico() {
    }

    public ClienteJuridico(String cnpj, Integer codigo, String nome, Date dataAbertura, String cpf,  String email, String telefone, Endereco endereco) {
        super(codigo, nome, dataAbertura, cpf, email, telefone, endereco);
        this.cnpj = cnpj;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
