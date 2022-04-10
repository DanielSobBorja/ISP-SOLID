package edu.poniperro.procesadores;

import edu.poniperro.interfaces.Basica;
import edu.poniperro.interfaces.Compleja;
import edu.poniperro.util.Idioma;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTexto implements Basica, Compleja {

	private List<String> texto = new ArrayList<>();

	@Override
	public void nueva(String palabra) {
		texto.add(palabra);
	}

	@Override
	public String texto() {
		return texto.stream().collect(Collectors.joining(" "));
	}

	@Override
	public boolean correcto(Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
