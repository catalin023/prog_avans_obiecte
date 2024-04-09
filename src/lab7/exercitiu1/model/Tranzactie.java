package lab7.exercitiu1.model;

import lab7.exercitiu1.interfataImpl.ConversieCurrencyImpl;

import java.util.List;

public class Tranzactie extends ConversieCurrencyImpl implements Cloneable{
    static int tranzactieId = 1;
    private int id;
    private Payment payment;
    private Currency currency = Currency.EUR;
    private double amount;
    private int refNmb;

    public Tranzactie(Payment payment) {
        this.id = tranzactieId;
        tranzactieId++;
        this.payment = payment;
        this.amount = conversieValutaToEur(payment);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getRefNmb() {
        return refNmb;
    }

    public void setRefNmb(int refNmb) {
        this.refNmb = refNmb;
    }


    public Tranzactie stornare(){
        Tranzactie stornareTranzactie = this.clone();
        stornareTranzactie.refNmb = this.id;
        stornareTranzactie.amount = -this.amount;
        stornareTranzactie.id = tranzactieId;
        tranzactieId++;
        return stornareTranzactie;
    }




    @Override
    public Tranzactie clone() {
        try {
            Tranzactie clone = (Tranzactie) super.clone();
            clone.payment = this.payment.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Tranzactie{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                ", refNmb=" + refNmb +
                '}';
    }
}
