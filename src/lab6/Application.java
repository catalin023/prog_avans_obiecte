package lab6;

import lab6.model.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShoppingMall shoppingMall = new ShoppingMall();

        Proprietar prop1 = new Proprietar("Popescu", "Ion", 20);
        Proprietar prop2 = new Proprietar("Ionescu", "Vasile", 30);


        Magazin sho1 = new Magazin(1, "shop1", prop1, 2000, 56);
        sho1.setChirie(new MagazinAlimentar());
        Magazin sho2 = new Magazin(2, "shop2", prop2, 3000, 100);
        sho2.setChirie(new MagazinHaine());
        Magazin sho3 = new Magazin(3, "shop3", prop1, 4000, 90);
        sho3.setChirie(new MagazinHaine());
        Magazin sho4 = new Magazin(4, "shop4", prop2, 3300, 120);
        sho4.setChirie(new MagazinChimicale());

        shoppingMall.getMagazine().add(sho1);
        shoppingMall.getMagazine().add(sho2);
        shoppingMall.getMagazine().add(sho3);
        shoppingMall.getMagazine().add(sho4);

        List<Magazin> magazine = shoppingMall.getMagazine();
        Collections.sort(magazine, Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume).thenComparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));
        System.out.println("Sortare dupa proprietar si chirie: "+magazine);

        List<Magazin> magazineProp1 = shoppingMall.getmagazineByProprietar(prop1);
        Collections.sort(magazineProp1, Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getVenit)
                .thenComparing(Magazin::getSuprafata)
                .thenComparing(Magazin::getSuprafata));

        System.out.println("Venitul obtinut de"+ prop1 + "este: "+shoppingMall.venitBYProprietar(prop1));

        System.out.println("Chiria obtinuta de"+ prop1 + "este: "+shoppingMall.chirieByProprietar(prop1));


    }

}
