package lab7.exercitiu1;

import lab7.exercitiu1.model.Currency;
import lab7.exercitiu1.model.Payment;
import lab7.exercitiu1.model.Tranzactie;
import lab7.exercitiu1.model.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static lab7.exercitiu1.model.Currency.*;

public class Application {
    public static void main(String[] args) {
        User user1 = new User("Ion", "Popescu", "AAAA1B310075");
        User user2 = new User("Alexandru", "Toader", "AAAA5C21475");
        User user3 = new User("Mihai", "Cionanu", "KADA244JD242");

        List<Tranzactie> tranzactii = new ArrayList<>();

        makePayment(300, RON, user1, "factura", tranzactii);
        makePayment(50, USD, user2, "factura", tranzactii);
        makePayment(100, RON, user1, "magazin", tranzactii);
        makePayment(200, USD, user2, "arenda", tranzactii);
        makePayment(150, USD, user3, "arenda", tranzactii);
        makePayment(400, GBP, user1, "factura", tranzactii);

        tranzactii.add(tranzactii.get(1).stornare());
        System.out.println("Tranzactia initiala: " + tranzactii.get(1));
        System.out.println("Tranzactia stornata: " + getTranzactieByRefNmb(tranzactii, tranzactii.get(1).getId()));

        tranzactii.add(tranzactii.get(4).stornare());
        System.out.println(tranzactii.get(4));
        System.out.println(getTranzactieByRefNmb(tranzactii, tranzactii.get(4).getId()));

        printCounties(tranzactii);

        userTranzactiiInfo(user1, tranzactii);

    }

    private static void userTranzactiiInfo(User user1, List<Tranzactie> tranzactii) {
        for (Tranzactie tranzactie : tranzactii) {
            if (tranzactie.getPayment().getUser().equals(user1)) {
                System.out.println("Suma: "+ tranzactie.getAmount() +" "+ tranzactie.getPayment().getCurrency());
            }
        }
    }

    public static void makePayment(double amount, Currency currency, User user, String purpose, List<Tranzactie> tranzactii) {
        Payment payment = new Payment(amount, currency, user, purpose);
        tranzactii.add(new Tranzactie(payment));
    }

    public static Tranzactie getTranzactieByRefNmb(List<Tranzactie> tranzactii, int refNmb){
        for(Tranzactie tranzactie : tranzactii){
            if(tranzactie.getRefNmb() == refNmb){
                return tranzactie;
            }
        }
        return null;
    }

    public static void printCounties(List<Tranzactie> tranzactii){
        Set<String> currencies = new HashSet<>();
        for(Tranzactie tranzactie : tranzactii){
            currencies.add(tranzactie.getPayment().getCurrency().getName());
        }
        System.out.println(currencies);
    }
}
