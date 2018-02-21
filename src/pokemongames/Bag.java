/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongames;

import java.util.ArrayList;

/**
 *
 * @author Core I7
 */
public class Bag {
     private ArrayList<Pokemon> pokemonBag;
	public Bag(){
		pokemonBag = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemonBag.add(pokemon);
	}

	

	
    
}
