package lab5.Imutabile;

public final class BookImutabile {
    private final String nume;

    private final Autor autor;

    public BookImutabile(String nume, Autor autor) {
        this.nume = nume;
        this.autor = new Autor(autor);
    }

    public String getNume(){
        return nume;
    }

    public Autor getAutor() {
        return new Autor(autor);
    }
}
