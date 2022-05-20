/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09poo;
import java.time.Year;
/**
 *
 * @author gabriel cosmo
 */
public class Pessoa {
    private String nome,sexo;
    private int AnoNasc, idade;
     
    // Métodos personalizados;
    public void fazerAnivarsario() {
        System.out.println("Parabéns " + this.getNome().toUpperCase() + " pelos seus " + 
                this.getIdade() + " anos.");
        this.setIdade(this.getIdade() + 1);
    }
    
    // Métodos Especiais;

    public Pessoa(String nome, int AnoNasc, String sexo) {
        this.nome = nome;
        this.setAnoNasc(AnoNasc);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return AnoNasc;
    }

    public void setAnoNasc(int AnoNasc) {
        this.AnoNasc = AnoNasc;
        this.setIdade(Integer.parseInt(""+ Year.now()) - this.getAnoNasc());
    }

    public int getIdade() {
        return idade;
    }
    
    private void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo.toUpperCase().equals("M") || sexo.toUpperCase().equals("F")){
            this.sexo = sexo;
        } else {
            this.sexo = "invalido";
        }
    }
    
}
