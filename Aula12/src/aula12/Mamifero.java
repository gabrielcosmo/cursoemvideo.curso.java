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
public class Mamifero extends Animal{
    //métodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Correndo...");    
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero...");
    }
    
}
