/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09poo;

/**
 *
 * @author gabriel cosmo
 */
public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Métodos personalizados;
    public String detalhes() {
        return "Ficha do Livro " + this.getTitulo() + 
                "\n+ Título: " + this.getTitulo() + 
                "\n+ Autor: " + this.getAutor() + 
                "\n+ Total de Páginas: " + this.getTotPaginas() + 
                "\n+ Leitor: "+ this.getLeitor().getNome() +
                "\n+ Página Atual: " + this.getPagAtual();
    }
    @Override
    public void abrir() {
        this.setAberto(true);
        System.out.println("Livro aberto... pronto para ler.");
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        System.out.println("Livro fechado.");
    }
    
    @Override
    public void folhear(int p) {
        if (this.isAberto()){
            if (p > this.getTotPaginas()){
                this.setPagAtual(0);
            }else {
                this.setPagAtual(p);
            }
        }
        System.out.println("Agora estou na página " + this.getPagAtual() +".");
    }
    
    @Override
    public void avancarPag() {
        if (this.isAberto()){
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("Avançada uma página... estou na págnina " + 
                    this.getPagAtual() + ".");
        }
    }

    @Override
    public void voltarPag() {
        if (this.isAberto()) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("Avançada uma página... estou na págnina " + 
                    this.getPagAtual() + ".");
        }
    }
    // Métodos Especiais;

    public Livro(String titulo, String autor, int totPaginas,  Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;             
        this.leitor = leitor;
        this.pagAtual = 0; 
        this.aberto = false;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
