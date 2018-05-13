/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.ItensVendasDao;
import Model.entidade.ItemVenda;



/**
 *
 * @author Daniel
 */
public class ControlerItemVenda {
    
    public void cadastrarItemVenda(ItemVenda v){
        ItensVendasDao.getInstance().inserir(v);
    }
    public ItemVenda findIDitemVenda(int codigo){
        return (ItemVenda) ItensVendasDao.getInstance().recuperar(codigo);
    }
}
