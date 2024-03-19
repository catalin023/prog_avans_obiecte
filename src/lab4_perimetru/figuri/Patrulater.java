package lab4_perimetru.figuri;

import lab4_perimetru.interfete.Interfata1;

public class Patrulater implements Interfata1 {
    private int l;

    public Patrulater(int l) {
        this.l = l;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }


    @Override
    public double calculPerimetru() {
        return 4*l;
    }
}
