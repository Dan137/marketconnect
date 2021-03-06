/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.entidade;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Daniel
 */
@Entity
@Table(name = "itemVenda")
public class ItemVenda implements Serializable {
    
    @Id ()
    @GeneratedValue ()
    @Column (name="codigo")
    private int id;
    
    @Column (name = "quantprodvend")
    private int quantidade;
    
    @Column (length = 15)
    private double valorTot;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codprod")
    private Produto produto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Venda codvend;
    
    
    
    public ItemVenda() {
    }

    public ItemVenda(int id, int quantidade, double valorTot, Produto produto, Venda codvend) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorTot = valorTot;
        this.produto = produto;
        this.codvend=codvend;
    }

 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTot() {
        return valorTot;
    }

    public void setValorTot(double valorTot) {
        this.valorTot = valorTot;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getCodvend() {
        return codvend;
    }

    public void setCodvend(Venda codvend) {
        this.codvend = codvend;
    }
    
}
