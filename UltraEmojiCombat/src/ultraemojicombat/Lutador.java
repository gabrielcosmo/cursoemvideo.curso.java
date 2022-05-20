/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultraemojicombat;

/**
 *
 * @author gabriel cosmo
 */
public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    //Métodos Públicos
    public void apresentar() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos.");
        System.out.println("pesando " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " vitória (s)");
        System.out.println(this.getDerrotas() + " derrota (s)");
        System.out.println(this.getEmpates()+" empate (s)");
        System.out.println("-----------------------------------------------------");
    }
    public void status() {
        System.out.println("==========================================");
        System.out.println(this.getNome() + " é peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " lutas");
        System.out.println("Perdeu " + this.getDerrotas() + " lutas");
        System.out.println("Empatou " + this.getEmpates() + " lutas");
        System.out.println("==========================================");
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+ 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos Especiais

    public Lutador(String nome, String nacionalidade, int idade,float altura,float peso, 
            int vitorias, int derrotas, int empates ) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        // deve ser usado o setPeso() para ser configurada a categoria 
        //logo após a criação do objeto;
        this.setPeso(peso); 
        this.vitorias = vitorias;        
        this.derrotas = derrotas;
        this.empates = empates; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria(); // a categoria sempre é alterada conforme o peso muda;
    }
    
}
