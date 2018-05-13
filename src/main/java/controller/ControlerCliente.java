/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.ClienteModel;
import Model.EnderecoModel;
import Model.entidade.Cliente;
import Model.entidade.Endereco;

import java.util.List;

/**
 *
 * @author Daniel
 */
public class ControlerCliente {

    private ClienteModel clienteModel;
    private EnderecoModel enderecoModel;
    private Cliente cliente;
    private Endereco endereco;

    public ControlerCliente() {
        this.cliente = new Cliente();
        this.clienteModel = new ClienteModel();
        this.endereco = new Endereco();
        this.enderecoModel = new EnderecoModel();
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

//    -------------------------- CONTROLER CLIENTE ---------------------------
    public void inserirCliente(Cliente cliente) {

        clienteModel.valcadCliente(cliente);
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
//    -------------------------- CONTROLER ENDERECO ---------------------------

    public void cadEndereco(Endereco endereco) {
        enderecoModel.cadEnderecoModel(endereco);
    }

    public void alteraEndereco(Endereco endereco) {

    }

    public Endereco getEndereco(int numero) {
        return enderecoModel.getEnderecoId(numero);
    }
}
