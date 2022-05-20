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
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;
    
    /*
    Ao ser declarado uma nova Visualizacao são passados dois valores pelo
    construtor, um do tipo Gafanhoto e outro do tipo Video,
    o Gafanhoto ganha mais um acrésimo ao seu total de aulas assitidas 
    e o Video mais viws;
    */
    public Visualizacao(Gafanhoto espectador, Video filme) {
        
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssitido(this.espectador.getTotAssitido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        } else if(porc <= 50){
            tot = 5;
        } else if(porc <= 90){
            tot = 8;
        } else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
