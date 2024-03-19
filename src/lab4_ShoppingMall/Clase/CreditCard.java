package lab4_ShoppingMall.Clase;

import lab4_ShoppingMall.Interfete.BankCard;

public record CreditCard(String nume) implements BankCard {
    private static double spentAmount;

    public static double getSpentAmount() {
        return spentAmount;
    }

    public static void setSpentAmount(double spentAmount) {
        CreditCard.spentAmount = spentAmount;
    }

    @Override
    public void doTransaction(double amount) {
        spentAmount += amount;
        System.out.println("Utilizator " + nume() + " a cheltuit " + amount);
        System.out.println("Suma totala cheltuita cu cardul de credit este " + spentAmount);
    }
}
