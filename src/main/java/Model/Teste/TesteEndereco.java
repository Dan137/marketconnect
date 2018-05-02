/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;

import Model.entidade.Endereco;
import controller.Controler;

/**
 *
 * @author Daniel
 */
public class TesteEndereco {
    public static void main(String[] args) {
        Controler controler = new Controler();
        
//        ----------------- CADASTRA ENDERECO!! ---------------------------
        Endereco enderecoCliente = new Endereco("Rua C", 5, "centro", "Paranatama-PE", "55-355-00");       
        controler.cadEndereco(enderecoCliente);
//
//        Endereco enderecoFuncionario = new Endereco("Rua C", 6, "centro", "Paranatama-PE", "55-355-00");       
//        controler.cadEndereco(enderecoFuncionario);
//        
//    }----------------------- ATUALIZA O ENDERECO!! ---------------------------
//   Endereco endereco = new Endereco ("rua da igreja", 5, "centro", "São João", "55-565-000");
//    controler.alteraEndereco(endereco);
    }
} 