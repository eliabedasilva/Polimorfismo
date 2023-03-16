/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author santo
 */
public class Ave extends Animal{
    protected String corPena;
    
    public Ave(String corPena) {
        this.corPena = corPena;
    }
    
    //implementação dos métodos abrstratos herdardos da classe animal
    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("ave se alimetando");
    }

    @Override
    public void emitirSom() {
        System.out.println("ave emitindo som");
    }
    
    // método especifico da classe Ave com a finalidade de represemta a ave construindo um ninho
    public void fazerNinho(){
        System.out.println("Fazendo ninho");
    }
    
}
