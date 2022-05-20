/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author gabriel cosmo
 */
public class TesteFuncao01 {

    /**
     * @param args the command line arguments
     */
    static int fatorial(int n1){
        int f = 1;
        for (int c=1; c<=n1; c++){
            f *= c;
        }
        return f;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int f = fatorial(5);
        System.out.println("O fatorial de 5 é " + f);
        
    }
    
}
