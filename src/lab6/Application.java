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
        Proprietar prop3 = new Proprietar("Georgescu", "Mihai", 40);
        Proprietar prop4 = new Proprietar("Popa", "Andrei", 50);


        Magazin sho1 = new Magazin(1, "shop1", prop1, 2000, 56);
        sho1.setChirie(new MagazinAlimentar());
        Magazin sho2 = new Magazin(2, "shop2", prop2, 3000, 100);
        sho2.setChirie(new MagazinHaine());
        Magazin sho3 = new Magazin(3, "shop3", prop1, 4000, 90);
        sho3.setChirie(new MagazinHaine());
        Magazin sho4 = new Magazin(4, "shop4", prop2, 3300, 120);
        sho4.setChirie(new MagazinChimicale());
        Magazin sho5 = new Magazin(5, "shop5", prop3, 5000, 150);
        sho5.setChirie(new MagazinAlimentar());
        Magazin sho6 = new Magazin(6, "shop6", prop4, 6000, 200);
        sho6.setChirie(new MagazinHaine());
        Magazin sho7 = new Magazin(7, "shop7", prop4, 7000, 250);
        sho7.setChirie(new MagazinChimicale());

        shoppingMall.getMagazine().addAll(List.of(sho1, sho2, sho3, sho4, sho5, sho6, sho7));


        List<Magazin> magazine = shoppingMall.getMagazine();
        Collections.sort(magazine, Comparator.comparing(Magazin::getProprietar, Comparator.comparing(Proprietar::getNume).thenComparing(Proprietar::getPrenume))
                .thenComparing(Magazin::getChirie));
        System.out.println("Sortare dupa proprietar si chirie: "+magazine);



        List<Magazin> magazineProp1 = shoppingMall.getmagazineByProprietar(prop1);
        Collections.sort(magazineProp1, Comparator.comparing(Magazin::getNumeMagazin)
                .thenComparing(Magazin::getVenit)
                .thenComparing(Magazin::getChirie)
                .thenComparing(Magazin::getSuprafata));
        System.out.println("Sortare dupa nume, venit, chirie si suprafata pentru proprietarul 1 "+magazineProp1);



        for (Proprietar proprietar : shoppingMall.getProprietari()){
            System.out.println("Venitul obtinut de"+ prop1 + "este: "+shoppingMall.venitBYProprietar(proprietar));
        }

        for (Proprietar proprietar : shoppingMall.getProprietari()) {
            System.out.println("Chiria obtinuta de" + prop1 + "este: " + shoppingMall.chirieByProprietar(proprietar));
        }

    }

}
