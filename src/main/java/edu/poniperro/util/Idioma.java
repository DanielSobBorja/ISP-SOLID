package edu.poniperro.util;

import java.util.Arrays;
import java.util.List;

public enum Idioma {
	
	EN ("I","am","angry"), 
	ES ("tengo","hambre"), 
	CA ("tenc", "fam");
	
	public List<String> diccionario;

	private Idioma(String ... palabras) {
		this.diccionario = Arrays.asList(palabras);
	}
	

}
