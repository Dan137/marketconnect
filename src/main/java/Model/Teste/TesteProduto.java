    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Teste;

import controller.Controler;

import Model.entidade.Produto;
import controller.ControlerProduto;
import java.util.List;

/**
 *
 * @author Maycon
 */
public class TesteProduto {

    public static void main(String[] args) {
//        Produto produto;
//        Produto produto2;
        ControlerProduto produtocontroler = new ControlerProduto();
//        produto = new Produto(0, "Arroz", 1.45, 10, "sereal", "mariano");
//        produtocontroler.inserir(produto);
//
//        produto2 = new Produto(0, "macarrão", 2.4, 20, "massa", "mariano");
//        produtocontroler.inserir(produto2);
//       ATUALIZA PRODUTO
        /*
        produto = new Produto(2, "Daniel", 2.00, 200);
        produtoControlle.alterar(produto);
         */
//        produto = new Produto(3, "açucar", 7.5, 5);
//        produtoControlle.alterar(produto);
//        Relatorios de Produtos
//
//        List<Produto> produtos = produtocontroler.listarProdutos();
//        for(int i=0; i<produtos.size(); i++){
//            System.out.println("codigo ="+produtos.get(i).getCodigo());
//            System.out.println("nome ="+produtos.get(i).getNome());
//            System.out.println("preco ="+produtos.get(i).getPreco());
//            System.out.println("quantidade ="+produtos.get(i).getQuantidade());
//            System.out.println("============================================");
//        }
//       EXCLUI UM PRODUTO

        List<Produto> produtos = produtocontroler.listarProdutos();
        for (Produto p: produtos) {
            if(p.getCodigo() ==48){
              produtocontroler.excluir(p);
            }
        }

         
//produto = produtoControlle.findId(3);
//String str = " "; 
//str+= "codigo: "+ produto.getCodigo()+"\n nome: " + produto.getNome()+"\n preço: " + produto.getPreco()+ "\n quantidade: " + produto.getQuantidade();
//System.out.println(str);
    }

}
