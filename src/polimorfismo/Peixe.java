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
public class Peixe extends Animal{
    protected String corEscama;

    public Peixe(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //implementação dos métodos abrstratos herdardos da classe animal
    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("peixe se alimetando");
    }

    @Override
    public void emitirSom() {
        System.out.println("peixe emitindo som");
    }
    
    //método especifico da classe peixe responsavél por representar o  peixe soltando bolhas
    public void soltarBolha(){
        System.out.println("Soutando bolhas");
    }
}
