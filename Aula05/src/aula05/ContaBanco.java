/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author gabriel cosmo
 */
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("==============");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("==============");
    }
    
    //Métodos personalizados
    public void abrirConta(String t) {
        // conta inica com um tipo t e status verdadeiro;
        this.setTipo(t);
        this.setStatus(true);
        // se tipo t igaul a CC (conta corrente)...
        if (t.equals("CC")) {
            // saldo começa com R$50;
            this.setSaldo(50);
        } 
        // senão, se tipo t igual a CP (conta poupança)...
        else if (t.equals("CP")) {
            // saldo começa com R$150;
            this.setSaldo(150);
        }
    }
    
    public void fecharConta() {
        // se conta com saldo poositivo;
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser fechada. "
                    + "Pois ainda a valor depositado.");
        } 
        // senão, se conta com saldo negativo;
        else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser fechada. Pois ainda a débito.");
        } 
        // senão conta con saldo zerado;
        else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v) {
        // se a conta estiver aberta...
        if (this.isStatus()) {
            // ... adivicione v;
            this.setSaldo( this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " 
                    + this.getDono());
        }
        // senão status da conta está falso, conta fechada;
        else {
            System.out.println("Conta fechada. Não é possível depositar");
        }
    }
    
    public void sacar(float v) {
        if (this.isStatus()) {
            // se valor do saque for no máximo o valor do saldo;
            if (this.getSaldo() >= v) {
                // subtração do valor do saque;
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta " + 
                        this.getDono());
            }
            // senão o valor do saque é maior do que o valor na conta;
            else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        // se tipo de conta for cc...
        if ("CC".equals(this.getTipo())) {
            // ...mensalidade a pagar é de R$12;
            v = 12;
        }
        // senão, se o tipo de conta for cp...
        else if ("CP".equals(this.getTipo())) {
            // ...menslididade a pagar é R$20;
            v = 20;
        }
        // se conta aberta;
        if (this.isStatus()) {
            // subtraçao da mensalidade;
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + 
                    this.getDono());
        } 
        // senão, a conta está fechada;
        else {
            System.out.println("Impossivel pagar uma conta fechada.");
        }
    }
    
    //Métodos especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public final void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public final void setStatus(boolean status) {
        this.status = status;
    }
}
