/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativaula8;

/**
 *
 * @author gabriel cosmo
 */
public class Aluno {
    String nome, cpf;
    int idade, turma;
    
    Aluno(String nome, String cpf, int idade, int turma){
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s \nIdade: %s \nTurma: %s \nCPF: %s", 
                this.nome, this.idade, this.turma, this.cpf);
    }
}
