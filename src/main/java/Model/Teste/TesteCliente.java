/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;

import Model.entidade.Cliente;
import Model.entidade.ClienteJuridico;
import Model.entidade.Endereco;
import controller.Controler;
import controller.ControlerCliente;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class TesteCliente {

    public static void main(String[] args) {

        Date dataHoje = new Date();
        ControlerCliente cl = new ControlerCliente();
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        String dataAbertura = formataData.format(dataHoje);

//        ----------------- CADASTRA CLIENTE!! ---------------------------
//        Cliente cliente1 = new Cliente(0, "pessoaJuridica", "Daniel ", dataHoje, "703.968.604-00", "daniel.verissimo@gmail.com", "(87) 9.8135-5794", cl.getEndereco(5));
//         Endereco enderecoCliente = new Endereco("Rua C", 5, "centro", "Paranatama-PE", "55-355-00");
//        Cliente cliente2 = new Cliente(0, "pessoa fisica", "Daniel ", dataHoje, "703.968.604-00", "daniel.verissimo@gmail.com", "(87) 9.8135-5794", enderecoCliente);       
//        cl.inserirCliente(cliente2);
//        ----------------- CADASTRA CLIENTEJURIDICO!! ---------------------------
//         Endereco enderecoCliente = new Endereco("Rua C", 5, "centro", "Paranatama-PE", "55-355-00");
//        ClienteJuridico cj = new ClienteJuridico("123345454", 0, "pessoaJuridica", "Daniel ", dataHoje, "703.968.604-00", "daniel.verissimo@gmail.com", "(87) 9.8135-5794", enderecoCliente);
//        cl.cadClienteJuridico(cj);
//        ----------------- ATUALIZA CLIENTE!! ---------------------------
//    Cliente upCliente = new Cliente (2, "Maycon Abilio Rego", dataHoje, "father", "mother", "maycon.abilioreg@gmail.com", "(87) xxxx-xxxx");
//    controler.updateCliente(upCliente);
//        ----------------- BUSCAR CLIENTE!! -----------------------------
//        Cliente cliente = controler.findIDCliente(2);
//        String str = " ";
//        str += "nome: " + cliente.getNo+me() + "\n"
//                + "codigo: " + cliente.getCodigo() + "\n"
//                + "email: " + cliente.getEmail() + "\n"
//                + "data admissão: " + cliente.getDataAbertura() + "\n"
//                + "telefone: " + cliente.getTelefone();
//        System.out.println(str);
//        ----------------- BUSCAR TODOS OS CLIENTE!! ---------------------
//         List<Cliente> clientes = controler.findAllClientes();
//        for(Cliente c: clientes){
//            System.out.println("codigo: "+c.getCodigo());
//            System.out.println("nome: "+c.getNome());
//            System.out.println("email: "+c.getEmail());
//            System.out.println("data de admissão: "+c.getDataAbertura());
//            System.out.println("telefone: "+c.getTelefone());
//            System.out.println("============================================");
//        }
//        ----------------- DELETAR UM CLIENTE--- ---------------------
//        Cliente cliente = controler.findIDCliente(4);
//        controler.deleteCliente(cliente);
    }

}
