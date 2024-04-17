package lab8;

import java.io.*;
import java.util.Scanner;

public class MainEx2ScriereOcteti {
    public static void main(String[] args) {
        readData();
    }

    private static void readData(){
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Nume: ");
            String nume = s.nextLine();
            System.out.println("Prenume: ");
            String prenume = s.nextLine();
            System.out.println("Varsta: ");
            int varsta = s.nextInt();
            s.nextLine();
            System.out.println("Suma: ");
            int suma = s.nextInt();
            s.nextLine();
            System.out.println("Valuta: ");
            String valuta = s.nextLine();
            checkSuma(suma);
            Persoana p = new Persoana(nume, prenume, varsta, suma, valuta);

            FileManagement.scriereObiectInFisier("persoanaOcteti.txt", p);
        }
        catch (MyException e) {
            readData();

        }
    }



    private static void checkSuma(int suma) throws MyException {
        if(suma > 2000){
            System.out.println("Suma mai mare ca 2000");
            throw new MyException("Suma e mai mare ca 2000");
        }
    }

}
