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
public class Reptil extends Animal{
    protected String corEscama;

    public Reptil(String corEscama) {
        this.corEscama = corEscama;
    }

    //implementação dos métodos abrstratos herdardos da classe animal
    @Override
    public void locomover() {
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("reptil se alimetando");
    }

    @Override
    public void emitirSom() {
        System.out.println("reptil emitindo som");
    }
    
}
