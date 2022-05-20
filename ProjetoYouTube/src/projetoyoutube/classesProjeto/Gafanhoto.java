/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube.classesProjeto;

/**
 *
 * @author gabriel cosmo
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssitido;

    public Gafanhoto(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade); //super() faz referencia ao construtor de Pessoa;
        this.login = login;
        this.totAssitido = 0;
    }
    
    public void viuMaisUm(){
        this.totAssitido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + "login=" + login + ", totAssitido=" + totAssitido + '}'+
                "\n"+super.toString(); /* chamada do toString de Pessoa,
        pois todo Gafanhoto é uma Pessoa*/
    }
    
}
