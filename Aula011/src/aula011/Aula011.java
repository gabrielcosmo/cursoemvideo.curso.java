/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula011;

/**
 *
 * @author gabriel cosmo
 */
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //A classe Pessoa não pode ser instanciada pois é abstrata.
        Visitante v = new Visitante();
        v.setNome("João");
        v.setIdade(31);
        v.setSexo("M");
        
        Aluno a = new Aluno();
        a.setNome("Marcos");
        a.setIdade(20);
        a.setSexo("M");
        a.setMatricula(143564);
        a.setCurso("Informática");
        a.pagarMensalidade();
        
        Bolsista b = new Bolsista();
        b.setNome("Maria");
        b.setSexo("F");
        b.setIdade(23);
        b.setCurso("Engenharia");
        
        System.out.println(b.toString()); 
        System.out.println(v.toString());
        System.out.println(a.toString());
    }
    
}
