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
public class Polimorfismo {

    public static void main(String[] args) {
        Animal[] animais = new Animal[4];
        
        animais[0] = new Mamifero("Marrom");
        animais[1] = new Ave("Azul");
        animais[2] = new Peixe("Cinza");
        animais[3] = new Reptil("CInza claro");
        
        
        for (Animal animal : animais) {
            System.out.println("------------------");
            animal.alimentar();
            animal.emitirSom();
            animal.locomover();
            System.out.println("------------------");
            System.out.println("\n");
        }
        
        Ave passarinho = new Ave("Verde");
        passarinho.fazerNinho();
        System.out.println("------------------");
        System.out.println("\n");
        
        Peixe nemo = new Peixe("laranja");
        nemo.soltarBolha();
        
        
    }
    
}
