/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author gabriel cosmo
 */
public abstract class Animal {
    //Atributos de Animal
    protected float peso;
    protected String nome;
    protected int idade, membros;
    // Métodos
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
     // Métodos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
