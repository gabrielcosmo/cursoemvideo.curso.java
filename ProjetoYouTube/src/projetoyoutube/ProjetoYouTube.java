/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoyoutube;

import projetoyoutube.classesProjeto.Gafanhoto;
import projetoyoutube.classesProjeto.Video;
import projetoyoutube.classesProjeto.Visualizacao;
/**
 *
 * @author gabriel cosmo
 */
public class ProjetoYouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("João", "M", 22, "JO");
        g[1] = new Gafanhoto("Maria", "F", 25, "mary");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        
        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(9);
        
        System.out.println(vis[0].toString());
        
    }
    
}
