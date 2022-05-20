/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros;
import java.util.Scanner;
/**
 *
 * @author gabriel cosmo
 */
public class Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0;
        String resp;
        Scanner tec = new Scanner(System.in);
        
        do{ // faça...
            System.out.print("Digite um número: ");
            n = tec.nextInt();
            s += n;
            System.out.print("Quer continuar [s/n]: ");
            resp = tec.next();
        }while(resp.equals("s")); // ...enquanto resp igual a s;
        System.out.println("A soma de todos os valores é " + s);
    } // no fim exiba a soma de todos os números digitados;
    
}
