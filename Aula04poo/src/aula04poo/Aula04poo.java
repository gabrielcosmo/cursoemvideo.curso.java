/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04poo;

/**
 *
 * @author gabriel cosmo
 */
public class Aula04poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("Bic", "Azul", 0.5f);
        //c1.setModelo("Bic Cristal");
        //c1.setPonta(0.5f);
        c1.status();
        
        System.out.format("Tennho uma caneta %s de ponta %.2f\n", 
                c1.getModelo(),c1.getPonta());
    }
    
}
