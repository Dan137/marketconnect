/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.ProdutoDAO;
import Model.ProdutoModel;
import Model.entidade.Produto;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Daniel
 */
@ManagedBean
public class ControlerProduto {
    private Produto produto;
    private ProdutoModel produtomodel;
    

    public ControlerProduto() {
        this.produto= new Produto();
        this.produtomodel = new ProdutoModel();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    public void inserir(Produto produto) {
        produtomodel.cadProdModel(produto);

    }

    public void alterar(Produto produto) {
       
    }

    public void excluir(Produto produto) {
        
    }

    public Produto findId(int codigo) {
        return null;
    }

    public List<Produto> listarProdutos() {
        return this.produtomodel.listarProdutos();
    }
    
}
