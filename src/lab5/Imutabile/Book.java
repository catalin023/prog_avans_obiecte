package lab5.Imutabile;

public class Book {
    private String nume;

    private Autor autor;

    public Book(String nume, Autor autor) {
        this.nume = nume;
        this.autor = autor;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
