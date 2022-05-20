/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package testearraylist;
import java.util.ArrayList;
/**
 *
 * @author gabriel cosmo
 */
public class TesteArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<String> produto = null;
         produto.add("maça");
         produto.add("melancia");
         produto.add("laranja");
         
         produto.forEach((p) -> {
             System.out.printf("Produto: ");
        });
    }
    
}
