/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;
import aula12.animais.*; //as classes de animais estão em outro pacote;
/**
 *
 * @author gabriel cosmo
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Objetos das classes filhas da classe Animal;
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        //Objetos das classes filhas de Mamifero, Reptil,Peixe e Ave;
        Cachorro c = new Cachorro();
        Canguru can = new Canguru();
        Cobra co = new Cobra();
        Ave ar = new Arara();
        Peixe px = new Peixe();
        
        c.locomover();
        can.locomover();
        co.locomover();
        ar.locomover();
        p.locomover();
        
        //métodos 
        c.emitirSom();
        ar.alimentar();
    }
    
}
