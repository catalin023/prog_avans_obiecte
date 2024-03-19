package lab4_ShoppingMall.Clase;

import lab4_ShoppingMall.Interfete.BankCard;

public record DebitCard(String nume, double limitAmount) implements BankCard {
    private static double spentAmount;

    public static double getSpentAmount() {
        return spentAmount;
    }

    public static void setSpentAmount(double spentAmount) {
        DebitCard.spentAmount = spentAmount;
    }

    @Override
    public void doTransaction(double amount) {
        if (amount <= limitAmount) {
            spentAmount += amount;
            System.out.println("Utilizator " + nume() + " a cheltuit " + amount);
            System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
        } else {
            System.out.println("Not enough money");
        }
    }
}
