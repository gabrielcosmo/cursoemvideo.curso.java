/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;
/**
 *
 * @author gabriel cosmo
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        m.emitirSom();
        
        Lobo l = new Lobo();
        l.emitirSom();
        
        Cacharro c = new Cacharro();
        c.emitirSom();
           
        //a ação do método vai depender dos parametros passados;
        c.reagir("Olá");
        c.reagir(true);
        c.reagir(10,5);
        c.reagir(2,17.4f);
    }
    
}
