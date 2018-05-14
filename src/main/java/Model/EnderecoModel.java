/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.DAO.EnderecoDao;
import Model.entidade.Endereco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class EnderecoModel {

    private List<Endereco> enderecos;

    public EnderecoModel() {
        
    }

    public void cadEnderecoModel(Endereco endereco) {
         EnderecoDao.getInstance().inserir(endereco);
//        enderecos = EnderecoDao.getInstance().recuperarTodos();
//        for(Endereco e: enderecos){
//            if(e.getNumero()==endereco.getNumero()){
//               
//            }
//        }
    }
    public Endereco getEnderecoId(int id){
      return (Endereco) EnderecoDao.getInstance().recuperar(id);
    }

}
