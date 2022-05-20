/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author gabriel cosmo
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Gabriel Cosmo");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1243);
        p2.setDono("Ana");
        p2.abrirConta("CP");
        p2.depositar(150);
        p2.sacar(300);
        p2.fecharConta();
        p2.estadoAtual();
    }
    
}
