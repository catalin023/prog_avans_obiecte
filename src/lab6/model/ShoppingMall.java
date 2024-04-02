package lab6.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingMall {
    private List<Magazin> magazine;

    public ShoppingMall() {
        this.magazine = new ArrayList<>();
    }

    public List<Magazin> getMagazine() {
        return magazine;
    }

    public void setMagazine(List<Magazin> magazine) {
        this.magazine = magazine;
    }

    @Override
    public String toString() {
        return "ShoppingMall{" +
                "magazine=" + magazine +
                '}';
    }

    public List<Magazin> getmagazineByProprietar(Proprietar proprietar){
        List<Magazin> magazineByProprietar = new ArrayList<>();
        for(Magazin magazin : magazine){
            if(magazin.getProprietar().equals(proprietar)){
                magazineByProprietar.add(magazin);
            }
        }
        return magazineByProprietar;
    }

    public int venitBYProprietar(Proprietar proprietar){
        int venit = 0;
        for(Magazin magazin : magazine){
            if(magazin.getProprietar().equals(proprietar)){
                venit += magazin.getVenit();
            }
        }
        return venit;
    }

    public int chirieByProprietar(Proprietar proprietar){
        int chirie = 0;
        for(Magazin magazin : magazine){
            if(magazin.getProprietar().equals(proprietar)){
                chirie += magazin.getChirie();
            }
        }
        return chirie;
    }
}
