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
public abstract class  Animal {
    //classe animal abstrata para ser herdada 
    
    // atributos protejidos para poderem ser acessados pelas classe filhas
    protected double peso;
    protected int idade;
    protected String membros;
    
    
    //métodos abstratos para serem implementados pelas classes filhas
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
}
