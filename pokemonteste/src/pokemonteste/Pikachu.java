/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;
/**
 *
 * @author eleno
 */
public class Pikachu extends Pokemon implements Normal {
    
    @Override
    public void emitirSom() {
        System.out.println("Pika,Pika!");
    }
        public void setNome() {
        this.nome="Pikachu";
    }

    @Override
    public void ataqueAnuncio() {
        System.out.println(this.nome + "usa choque do trovão");
    }
}
