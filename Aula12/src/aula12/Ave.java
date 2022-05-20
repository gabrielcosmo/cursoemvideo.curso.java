/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author gabriel cosmo
 */
public class Ave extends Animal{
    private String corPerna;

    public String getCorPerna() {
        return corPerna;
    }

    public void setCorPerna(String corPerna) {
        this.corPerna = corPerna;
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave...");
    }
    
    public void constriurNinho(){
        System.out.println("Construido ninho...");
    }
}
