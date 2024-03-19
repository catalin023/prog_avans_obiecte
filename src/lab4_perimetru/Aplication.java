package lab4_perimetru;

import lab4_perimetru.figuri.Cerc;
import lab4_perimetru.figuri.Patrulater;

public class Aplication {
    public static void main(String[] args) {
        Cerc cerc = new Cerc(4);
        Patrulater patrat = new Patrulater(5);

        System.out.println(cerc.calculPerimetru());
        System.out.println(patrat.calculPerimetru());
    }
}
