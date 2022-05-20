package ativaula12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel cosmo
 */
public class Produto {
    private String nome;
    private double precoCusto, precoVenda, margemLucro;

    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.setPrecoVenda(precoVenda);
        this.margemLucro = precoVenda - precoCusto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        if (precoVenda > this.precoCusto){
            this.precoVenda = precoVenda;
        } else {
            System.out.println("ERRO! O Preço de venda deve ser superior ao de compra.");
        }
        
    }

    public double getMargemLucro() {
        return margemLucro;
    }
    
    public void setMargemLucro(double margemLucro){
        this.margemLucro = margemLucro;
    }
    
}
