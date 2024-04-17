package lab8;

import java.io.Serializable;

public class Persoana implements Serializable {

    private String nume;
    private String prenume;
    private int varsta;
    private int suma;
    private String valuta;

    public Persoana(String nume, String prenume, int varsta, int suma, String valuta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.suma = suma;
        this.valuta = valuta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", suma=" + suma +
                ", valuta='" + valuta + '\'' +
                '}';
    }
}
