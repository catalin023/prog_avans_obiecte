package lab4_perimetru.figuri;

import lab4_perimetru.interfete.Interfata1;

public class Cerc implements Interfata1 {
    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }


    @Override
    public double calculPerimetru() {
        return 2*Math.PI*raza;
    }
}