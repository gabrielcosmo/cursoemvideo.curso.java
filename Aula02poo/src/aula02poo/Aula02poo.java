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
public class Aula02poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "bic";
        c1.ponta = 0.7f;
        c1.carga = 50;
        c1.tampada = true;
        
        c1.destampar();
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta(); 
        c2.cor = "Vermelha";
        c2.tampada = false;
        
        c2.status();
    }
    
}
