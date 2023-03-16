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
public class Mamifero extends Animal{
    protected String corPele;

    public Mamifero(String corPele) {
        this.corPele = corPele;
    }
    
    

    
    //implementação dos métodos abrstratos herdardos da classe animal
    @Override
    public void locomover() {
        System.out.println("andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamifero se alimetando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Mamifero emitindo som");
    }
    
    
}
