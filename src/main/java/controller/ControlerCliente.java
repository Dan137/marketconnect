/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ClienteJuridicoModel;
import Model.ClienteModel;
import Model.EnderecoModel;
import Model.entidade.Cliente;
import Model.entidade.ClienteJuridico;
import Model.entidade.Endereco;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Daniel
 */
@ManagedBean
@SessionScoped
public class ControlerCliente {

    private ClienteModel clienteModel;
    private EnderecoModel enderecoModel;
    private Cliente cliente;
    private ClienteJuridico clientejuridico;
    private ClienteJuridicoModel cjm;
    private Endereco endereco;

    public ControlerCliente() {
        this.cliente = new Cliente();
        this.clientejuridico = new ClienteJuridico();
        this.clienteModel = new ClienteModel();
        this.endereco = new Endereco();
        this.enderecoModel = new EnderecoModel();
        this.cjm = new ClienteJuridicoModel();
    }
//    GETTERs AND SETTERs

    public ClienteModel getClienteModel() {
        return clienteModel;
    }

    public void setClienteModel(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
    }

    public EnderecoModel getEnderecoModel() {
        return enderecoModel;
    }

    public void setEnderecoModel(EnderecoModel enderecoModel) {
        this.enderecoModel = enderecoModel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ClienteJuridico getClientejuridico() {
        return clientejuridico;
    }

    public void setClientejuridico(ClienteJuridico clientejuridico) {
        this.clientejuridico = clientejuridico;
    }

//    -------------------------- CONTROLER CLIENTE ---------------------------
    public void inserirCliente(Cliente cliente) {
        if (!(cliente.getTipoCliente().equals("pessoaJuridica"))) {
            clienteModel.valcadCliente(cliente);
        } else {
            clientejuridico = (ClienteJuridico) cliente;
            cjm.cadClienteJuridicoModel(clientejuridico);
        }
    }

    public void updateCliente(Cliente cliente) {

    }

    public Cliente findIDCliente(int codigo) {
        return null;

    }

    public void deleteCliente(Cliente cliente) {

    }

    public List<Cliente> findAllClientes() {
        return null;

    }
//    ------------------- CONTROLER CLIENTE JURIDICO---------------------------

    public void cadClienteJuridico(ClienteJuridico cj) {
        this.cjm.cadClienteJuridicoModel(cj);
    }
//    -------------------------- CONTROLER ENDERECO ---------------------------

    public void cadEndereco(Endereco endereco) {
        enderecoModel.cadEnderecoModel(endereco);
//        return "cadastroCliente";      
    }

    public void alteraEndereco(Endereco endereco) {

    }

    public Endereco getEndereco(int numero) {
        return enderecoModel.getEnderecoId(numero);
    }
}
