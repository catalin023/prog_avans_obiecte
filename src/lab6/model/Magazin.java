package lab6.model;

import lab6.interfate.FunctieGeneralChirie;

public class Magazin {
    private int id;
    private String numeMagazin;
    private Proprietar proprietar;
    private int venit;
    private int suprafata;
    private int chirie;

    public Magazin(int id, String numeMagazin, Proprietar proprietar, int venit, int suprafata, int chirie) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
        this.chirie = chirie;
    }

    public Magazin(int id, String numeMagazin, Proprietar proprietar, int venit, int suprafata) {
        this.id = id;
        this.numeMagazin = numeMagazin;
        this.proprietar = proprietar;
        this.venit = venit;
        this.suprafata = suprafata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeMagazin() {
        return numeMagazin;
    }

    public void setNumeMagazin(String numeMagazin) {
        this.numeMagazin = numeMagazin;
    }

    public Proprietar getProprietar() {
        return proprietar;
    }

    public void setProprietar(Proprietar proprietar) {
        this.proprietar = proprietar;
    }

    public int getVenit() {
        return venit;
    }

    public void setVenit(int venit) {
        this.venit = venit;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public int getChirie() {
        return chirie;
    }

    public void setChirie(FunctieGeneralChirie fg) {
        this.chirie = fg.chirie(this.suprafata);
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "id=" + id +
                ", numeMagazin='" + numeMagazin + '\'' +
                ", proprietar=" + proprietar +
                ", venit=" + venit +
                ", suprafata=" + suprafata +
                ", chirie=" + chirie +
                '}';
    }

}
