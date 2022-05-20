/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author gabriel cosmo
 */
public interface Controlador { // interface Controlador;
    //métodos abstratos;
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMundo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
