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
public class Video implements AcoesVideo{ //Video implementa a interface AcoesVideo;
    private String titulo;
    private int avaliacao, views, curtidas;
    private boolean reproduzino;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzino = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova; //avaliacao recebe a média de todas as avalções do vídeo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzino() {
        return reproduzino;
    }

    public void setReproduzino(boolean reproduzino) {
        this.reproduzino = reproduzino;
    }
    
    @Override
    public void play() {
        this.reproduzino = true;
    }

    @Override
    public void pause() {
        this.reproduzino = false;
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", "
                + "views=" + views + ", curtidas=" + curtidas + ", "
                + "reproduzino=" + reproduzino + '}';
    } 
}
