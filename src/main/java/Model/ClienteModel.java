/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.DAO.ClienteDao;
import Model.entidade.Cliente;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class ClienteModel {

    private List<Cliente> clientes;

    public ClienteModel() {
    }

    public void valcadCliente(Cliente cliente) {
        ClienteDao.getInstance().inserir(cliente);
        
//        Cliente novo = getClienteByCPF(cliente.getCpf());
//        if (novo == null) {
//
//        }

    }

    public static Cliente getClienteByCPF(String cpf) {
        ClienteDao cd = new ClienteDao();
        return cd.procurarByCpf(cpf);
    }

}
