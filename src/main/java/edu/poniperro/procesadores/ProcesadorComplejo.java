package edu.poniperro.procesadores;

import edu.poniperro.interfaces.Compleja;
import edu.poniperro.util.Idioma;

public class ProcesadorComplejo extends ProcesadorBasico implements Compleja {

    @Override
    public boolean correcto (Idioma idioma) {
        for (String palabra: texto) {
            if (!idioma.diccionario.contains(palabra.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
}
