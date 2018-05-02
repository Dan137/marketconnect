/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;

import Model.entidade.Endereco;
import Model.entidade.Funcionario;
import controller.Controler;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class TesteFuncionario {

    public static void main(String[] args) {
        Controler ctrl = new Controler();
        Funcionario funcionario1 = null;
        Funcionario funcionario2 = null;

        Date dataAdmissao = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String data = sdf.format(dataAdmissao);

//        insere o endereco do funcionario
        TesteFuncionario.cadastraEndereco(3, ctrl);
//    ----------------- CADASTRA FUNCIONÁRIO---------------------------
        funcionario1 = new Funcionario("Tiago", 0, "tiago@gmail.com", "(87) xxxx-xxxx", dataAdmissao, ctrl.getEndereco(3));
        ctrl.cadFuncionario(funcionario1);
        
//        funcionario2 = new Funcionario("Julio", 0, "Julio@gmail.com", "(87) xxxx-xxxx", dataAdmissao);
//        ctrl.cadFuncionario(funcionario2);
//    ----------------- ATUALIZA FUNCIONÁRIO---------------------------
//    funcionario1 = new Funcionario ("valmir", 4, "valmir.df@gmail.com", "+55 (87) xxx-xxxx", dataAdmissao);
//    ctrl.UpdateFuncionario(funcionario1);

//    ----------------- BUSCA FUNCIONÁRIO---------------------------
//        Funcionario funcionario = ctrl.retorFuncionario(4);
//        String str = " ";
//        str += "codigo: " + funcionario.getCodigo() + "\n "
//                + "nome: " + funcionario.getNome() + "\n "
//                + "data de admissão: " + funcionario.getDataAdmissao() + "\n "
//                + "email: " + funcionario.getEmail() + "\n"
//                + "telefone" + funcionario.getTelefone();
//        System.out.println(str);

//    ----------------- REMOVER FUNCIONÁRIO---------------------------
//        Funcionario funcionario = ctrl.retorFuncionario(4);
//        ctrl.removerFuncionario(funcionario);
        
    }
    public static void cadastraEndereco(int numero, Controler controler) {
        Endereco endereFunc = new Endereco("Rua da igreja", numero, "centro", "Garanhuns-PE", "xx-225-00");
       
        controler.cadEndereco(endereFunc);
    }

}
