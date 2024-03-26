package lab5.BibliotecaSingleton;

public class ApplicationBiblioteca {
    public static void main(String[] args) {
        Biblioteca librarius = Biblioteca.getInstanceBiblioteca();
        Biblioteca metropolitana = Biblioteca.getInstanceBiblioteca();
        System.out.println(librarius.equals(metropolitana));

        librarius.addCarte("Luceafarul");
        metropolitana.addCarte("Ion");

        System.out.println(librarius.getCarti());
    }
}
