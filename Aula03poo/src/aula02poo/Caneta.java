/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02poo;

/**
 *
 * @author gabriel cosmo
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status () {
        System.out.println("Modelo: " + this.modelo);       
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Caneta tampada? " + this.tampada);
    }
    
    public void rabiscar () {
        if (!this.tampada) {
            System.out.println("Estou rabiscando!");
        } else {
            System.out.println("[ERRO] Não posso rabiscar, estou tampada.");
        }
    }
    
    public void tampar () {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
