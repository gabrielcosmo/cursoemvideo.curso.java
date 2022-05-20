/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;
import java.util.Random;
/**
 *
 * @author gabriel cosmo
 */
public class Luta {
    //Atributos
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovado;
    
    //Métodos personalizados
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado =  true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    } 
    public void lutar() {
        if (this.aprovado) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("#### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2
            
            switch(vencedor) {
                case 0: // empate;
                    System.out.println("Empate!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // vitória do desafiado
                    System.out.println("Vitória de " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // vitória do desafiante;
                    System.out.println("Vitória de " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
        } else {
            System.out.println("---------------------------------------"
                    + "----------------------------------------");
            System.out.println("* A não luta pode acontecer! "
                    + "Lutadores de categorias diferentes não podem lutar.");
            System.out.println("---------------------------------------"
                    + "----------------------------------------");
        }
    }
    
    // Métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    
}
