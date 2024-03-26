package lab5.BibliotecaSingleton;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private static Biblioteca biblioteca;

    private List<String> carti = new ArrayList<>();

    private Biblioteca(){}

    public static Biblioteca getInstanceBiblioteca() {
        if(biblioteca == null){
            biblioteca = new Biblioteca();
        }
        return biblioteca;
    }

    public List<String> getCarti() {
        return carti;
    }

    public void addCarte(String s){
        carti.add(s);
    }
}
