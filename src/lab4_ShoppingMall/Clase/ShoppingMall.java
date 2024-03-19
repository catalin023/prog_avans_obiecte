package lab4_ShoppingMall.Clase;

import lab4_ShoppingMall.Interfete.BankCard;

public class ShoppingMall {
    BankCard card;

    public ShoppingMall(BankCard card) {
        this.card = card;
    }

    public ShoppingMall() {
    }

    public BankCard getCard() {
        return card;
    }

    public void setCard(BankCard card) {
        this.card = card;
    }

    public void achizitie(double amount){
        card.doTransaction(amount);
    }
}
