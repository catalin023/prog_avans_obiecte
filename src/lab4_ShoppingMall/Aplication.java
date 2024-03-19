package lab4_ShoppingMall;

import lab4_ShoppingMall.Clase.CreditCard;
import lab4_ShoppingMall.Clase.DebitCard;
import lab4_ShoppingMall.Clase.ShoppingMall;
import lab4_ShoppingMall.Interfete.BankCard;

public class Aplication {
    public static void main(String[] args) {
        ShoppingMall shop = new ShoppingMall();
        BankCard debit = new DebitCard("Catalin", 200);
        BankCard credit = new CreditCard("Victoria");

        shop.setCard(debit);
        shop.achizitie(150);
        shop.achizitie(300);

        shop.setCard(credit);
        shop.achizitie(400);

        shop.setCard(debit);
        shop.achizitie(30
        );
    }
}
