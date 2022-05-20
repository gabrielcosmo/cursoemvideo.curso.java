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
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status () {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Caneta tampada? " + this.tampada);
    }
    
    void rabiscar () {
        if (!this.tampada) {
            System.out.println("Estou rabiscando!");
        } else {
            System.out.println("Não posso rabiscar, porque estou tampada.");
        }
    }
    
    void tampar () {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
