/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonteste;

import java.util.*;

/**
 *
 * @author eleno
 */
public class Pokemonteste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokemon> pokemons = new ArrayList();
        pokemons.add (new Pikachu());
        pokemons.add (new Pigeot());
        pokemons.add (new Ratata());
        pokemons.add (new Beedril());
        pokemons.add (new Staryu());
        for (int i=0; i<pokemons.size();i++)
        {   
           pokemons.get(i).setNome();
           pokemons.get(i).emitirSom();
           pokemons.get(i).ataqueAnuncio();
        }
    }
    
}
