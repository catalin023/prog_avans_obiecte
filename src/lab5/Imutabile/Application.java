package lab5.Imutabile;

public class Application {
    public static void main(String[] args) {
        Autor autor = new Autor("Eminescu", 20);

        Book carte1 = new Book("Luceafarul", autor);
        System.out.println("mutabil Book: " + carte1.getAutor());

        BookImutabile carte2 = new BookImutabile("Povesti", autor);;

        autor.setNume("Creanga");

        System.out.println("Book mutable: " + carte1.getAutor());

        Autor autor2 = carte2.getAutor();
        System.out.println("Book imutable: " + autor2);

    }
}
