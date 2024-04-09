package lab7.exercitiu1.model;

import lab7.exercitiu1.model.Currency;

public class Payment implements Cloneable{
    private double amount;
    private Currency currency;
    private User user;
    private String purpose;

    public Payment(double amount, Currency currency, User user, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public Payment clone() {
        try {
            Payment clone = (Payment) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                ", currency=" + currency +
                ", user=" + user +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
