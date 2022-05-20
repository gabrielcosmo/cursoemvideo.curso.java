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
public class Aluno extends Pessoa{ //Aluno é subclasse de Pessoa
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.format("Pagando mensalidade do aluno %s\n", this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
