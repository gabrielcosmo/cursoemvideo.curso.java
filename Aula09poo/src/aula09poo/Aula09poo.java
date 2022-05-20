/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09poo;
/**
 *
 * @author gabriel cosmo
 */
public class Aula09poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa("Gabriel", 2003, "r");
        Livro l1 = new Livro("Como fazer amigos e Influenciar Pessoas",
        "Dale Carnegie", 293, p1);
        p1.fazerAnivarsario();
        
        System.out.println("===========================================");
        l1.abrir();       
        l1.folhear(129);
        l1.avancarPag();
        
        System.out.println("============================================");
        System.out.println(l1.detalhes());
    }
    
}
