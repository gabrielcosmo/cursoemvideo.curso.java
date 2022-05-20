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
public class Cacharro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au! au! au!...");
    }
    
    // mesmo método reagir() só que com assinaturas diferentes, o que muda a ação;
    public void reagir(String frase){
        if (frase.equals("toma comida" ) || frase.equals("Olá")){
            System.out.println("Abanar e latir.");
        } else{
            System.out.println("Rosnar.");
        }
    }
    
    public void reagir(int hora, int min){
        if (hora <12){
            System.out.println("Abanar.");
        } else if(hora >= 18){
            System.out.println("ignorar");
        } else{
            System.out.println("Abanar e latir");
        }
    }
    
    public void reagir(boolean dono){
        if (dono){
            System.out.println("Abanar.");
        } else{
            System.out.println("Latir");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade<5) {
            if (peso<10) {
                System.out.println("abanar.");
            } else {
                System.out.println("latir");
            }
        } else {
            if (peso<10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("ignorar...");
            }
        }
    }
}
