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

/**
 *
 * @author Maycon
 */
public class Controler {

    public Controler() {

    }
    // ==============================CONTROLER DE PRODUTO=============================

    public void inserir(Produto produto) {
        ProdutoDAO.getInstance().inserir(produto);

    }

    public void alterar(Produto produto) {
        ProdutoDAO.getInstance().alterar(produto);
    }

    public void excluir(Produto produto) {
        ProdutoDAO.getInstance().deletar(produto);
    }

    public Produto findId(int codigo) {
        return (Produto) ProdutoDAO.getInstance().recuperar(codigo);
    }

    public List<Produto> listarProdutos() {
        return ProdutoDAO.getInstance().recuperarTodos();
    }

    // ==============================CONTROLER DE CLIENTE=============================
    public void inserirCliente(Cliente cliente) {
        ClienteDao.getInstance().inserir(cliente);

    }

    public void updateCliente(Cliente cliente) {
        ClienteDao.getInstance().alterar(cliente);

    }

    public Cliente findIDCliente(int codigo) {
        return (Cliente) ClienteDao.getInstance().recuperar(codigo);

    }

    public void deleteCliente(Cliente cliente) {
        ClienteDao.getInstance().deletar(cliente);

    }

    public List<Cliente> findAllClientes() {
        return ClienteDao.getInstance().recuperarTodos();

    }

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
