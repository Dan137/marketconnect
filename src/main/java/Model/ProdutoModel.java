/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.DAO.ProdutoDAO;
import Model.entidade.Produto;

/**
 *
 * @author Daniel
 */
public class ProdutoModel {

    public void cadProdModel(Produto produto) {
        try {
            ProdutoDAO.getInstance().inserir(produto);
        } catch (Exception e) {
            System.out.println("errooo!" + e);
        }

    }
}
