/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import controller.Controler;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "venda")
public class Venda implements Serializable {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private int codigo;
    
    @Column(name = "datavenda", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVenda;
    
    @Column(name = "prazopagamento", nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPagamento;
    
    @Column(name = "formpag")
    private String formapagamento;
    
    @OneToMany(mappedBy = "codvend", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ItemVenda> itemvenda;
  
    @OneToOne
    @JoinColumn(name="Id")
    private Cliente cliente_id;

    public Venda(int codigo, Date dataVenda, Date dataPagamento,String formapagamento, List<ItemVenda> itemvenda, Cliente cliente_id) {
        this.dataVenda = dataVenda;
        this.codigo = codigo;
        this.dataPagamento = dataPagamento;
        this.formapagamento=formapagamento;
        this.itemvenda=itemvenda;
        this.cliente_id=cliente_id;
        
    }

    public Venda() {

    }

    public String getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(String formapagamento) {
        this.formapagamento = formapagamento;
    }

    public List<ItemVenda> getItensVenda() {
        return itemvenda;
    }

    public void setItensVenda(List<ItemVenda> itemvenda) {
        this.itemvenda = itemvenda;
    }

    /**
     * @return the dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dataPagamento
     */
    public Date getDataPagamento() {
        return dataPagamento;
    }

    public List<ItemVenda> getItemvenda() {
        return itemvenda;
    }

    public void setItemvenda(List<ItemVenda> itemvenda) {
        this.itemvenda = itemvenda;
    }

    
   

    public Cliente getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Cliente cliente_id) {
        this.cliente_id = cliente_id;
    }

    
   public void atualizaQuantidadeProdutos(ItemVenda lstProdutos){
        
    }
//    public void atualizaQuantidadeProdutos(List<Produto> produtos) {
//        Controler controler = new Controler();
//        List<Produto> produtosBanco = controler.listarProdutos();
//        Produto produt = new Produto();
//
//        for (int i = 0; i < produtos.size(); i++) {
//            for (int j = 0; j < produtosBanco.size(); j++) {
//                if (produtos.get(i).getCodigo() == produtosBanco.get(j).getCodigo()) {
//                    produtosBanco.get(j).setQuantidade(produtosBanco.get(j).getQuantidade() - produtos.get(i).getQuantidade());
//                    produt = produtosBanco.get(j);
//                    controler.alterar(produt);
//                }
//            }
//        }
//
//    }

}
