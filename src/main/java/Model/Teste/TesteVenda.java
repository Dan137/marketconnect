/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;


import Model.entidade.ItensVendas;
import Model.entidade.Produto;
import Model.entidade.Vendas;

import controller.Controler;
import controller.ControlerItemVenda;

import controller.ControlerVenda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class TesteVenda {

    public static void main(String[] args) {

        /*
        DUVIDA:
        será preciso colocar a quantidade de produto na hora da venda?
        2 possíveis soluções:
        fazer uma lógica para que no final da venda o sistema fazer uma contagem de produtos vendidos e adicionar na lista
        ou diminuir um a cada condição satisfeita?
         */
        ControlerItemVenda cv = new ControlerItemVenda();
        ControlerVenda ctrlVenda = new ControlerVenda();
        ControlerItemVenda ctrl = new ControlerItemVenda();
        Controler c = new Controler();

        Date dataVenda = new Date();
        Date dataPagamento = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String datVend = sdf.format(dataVenda);
        String datPagam = sdf.format(dataPagamento);
//      --------------------cadastra venda----------------------------
        Vendas vend = new Vendas(0, dataVenda, dataPagamento, null, c.findIDCliente(5));
        ctrlVenda.cadastrarVenda(vend);
        
        //        COMPRAS
        cadItemVend(ctrl, c);

    }

    public static void cadItemVend(ControlerItemVenda ctrl, Controler c) {
        ItensVendas iv = new ItensVendas(0, 2, 45, c.findId(6), null);
        ctrl.cadastrarItemVenda(iv);
    }

    public static List<Produto> lstProdVend() {
        List<Produto> lstProdutos = new ArrayList();
        Produto p = new Produto(10, "arroz", 2.3, 2, "serial");
        Produto p1 = new Produto(11, "macarrão", 2.3, 2, "serial");

        lstProdutos.add(p);
        lstProdutos.add(p1);

        TesteVenda.atualizaQuantProduto(lstProdutos);
        return lstProdutos;
    }

    public static void atualizaQuantProduto(List<Produto> prodVends) {
        Controler c = new Controler();
        List<Produto> prodBD = c.listarProdutos();
        for (int i = 0; i < prodVends.size(); i++) {
            for (int j = 0; j < prodBD.size(); j++) {
                if (prodVends.get(i).getCodigo() == prodBD.get(j).getCodigo()) {
                    prodBD.get(j).setQuantidade(prodBD.get(j).getQuantidade() - 1);
                    c.alterar(prodBD.get(j));
                }
            }
        }
    }

}
