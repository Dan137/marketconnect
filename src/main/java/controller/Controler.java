/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.ClienteDao;
import Model.DAO.EnderecoDao;
import Model.DAO.FuncionarioDao;
import Model.DAO.ProdutoDAO;
import Model.entidade.Cliente;
import Model.entidade.Endereco;
import Model.entidade.Funcionario;
import java.util.List;
import Model.entidade.Produto;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Maycon
 */
@ManagedBean
@SessionScoped
public class Controler {
    private Cliente cliente;
    private Endereco endereco;

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
    
    public Controler() {
        this.cliente = new Cliente();
        this.endereco = new Endereco();
    }
    // ==============================CONTROLER DE PRODUTO=============================


    // ==============================CONTROLER DE CLIENTE=============================
   

    // ==============================CONTROLER DE FUNCIOANARIOS=============================
    public void cadFuncionario(Funcionario funcionario) {
        FuncionarioDao.getInstance().inserir(funcionario);
    }

    public void UpdateFuncionario(Funcionario funcionario) {
        FuncionarioDao.getInstance().alterar(funcionario);
    }

    public Funcionario retorFuncionario(int id) {
        return (Funcionario) FuncionarioDao.getInstance().recuperar(id);
    }

    public void removerFuncionario(Funcionario funcionario) {
        FuncionarioDao.getInstance().deletar(funcionario);
    }

    // ==============================CONTROLER DE ENDERECO=============================
    public void cadEndereco(Endereco endereco) {
        EnderecoDao.getInstance().inserir(endereco);
    }

    public void alteraEndereco(Endereco endereco) {
        EnderecoDao.getInstance().alterar(endereco);
    }

    public Endereco getEndereco(int numero) {
        return (Endereco) EnderecoDao.getInstance().recuperar(numero);
    }
}
