/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.DAO.ClienteJuridicoDao;
import Model.entidade.ClienteJuridico;

/**
 *
 * @author Daniel
 */
public class ClienteJuridicoModel {
     

    public ClienteJuridicoModel() {
    }   
//    ------------------------CRUD ----------------------
    public void cadClienteJuridicoModel(ClienteJuridico cj){
        ClienteJuridicoDao.getInstance().inserir(cj);
    }
    
    
}
