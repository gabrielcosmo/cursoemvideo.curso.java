/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author gabriel cosmo
 */
public class Aluno extends Pessoa{
    private String curso;
    private int mat;
    
    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada...");
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
    
}
