/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.DAO.VendaDao;
import Model.entidade.Vendas;

/**
 *
 * @author Daniel
 */
public class ControlerVenda {
    
    public void cadastrarVenda(Vendas v){
        VendaDao.getInstance().inserir(v);
    }
}
