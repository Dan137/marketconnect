/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.ItensVendasDao;
import Model.entidade.ItensVendas;



/**
 *
 * @author Daniel
 */
public class ControlerItemVenda {
    
    public void cadastrarItemVenda(ItensVendas v){
        ItensVendasDao.getInstance().inserir(v);
    }
    public ItensVendas findIDitemVenda(int codigo){
        return (ItensVendas) ItensVendasDao.getInstance().recuperar(codigo);
    }
}
