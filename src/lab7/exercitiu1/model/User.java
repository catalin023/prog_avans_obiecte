package lab7.exercitiu1.model;

public class User {
    private String nume;
    private String prenume;
    private String iban;

    public User(String nume, String prenume, String iban) {
        this.nume = nume;
        this.prenume = prenume;
        this.iban = iban;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void makePayment(float amount, Currency currency, String purpose){
        new Payment(amount, currency, this, purpose);
    }


    @Override
    public String toString() {
        return "User{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
