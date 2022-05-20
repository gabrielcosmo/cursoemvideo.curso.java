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
public final class Bolsista extends Aluno{ //Bolsista é final = não pode ser herdada.
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+this.getNome());
    }
    
    //Método sobrescrito, pois já existe na superclasse Pessoa. 
    //Aqui funciona de forma diferente;
    @Override
    public void pagarMensalidade(){
        System.out.format("%s é bolsista! Pagamento facilitado!\n", this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    
}
