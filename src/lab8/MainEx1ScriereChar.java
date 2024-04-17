package lab8;

import java.io.*;
import java.util.Scanner;

public class MainEx1ScriereChar {
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
            writeData(nume, prenume, varsta, suma, valuta);
        }
        catch (MyException e) {
            readData();

        }
    }

    private static void writeData(String nume, String prenume, int varsta, int suma, String valuta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("persoane.txt", true))) {

            String text = nume+";"+ prenume+";"+ varsta+";"+ suma+";"+ valuta+"\n";

            bw.write(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void checkSuma(int suma) throws MyException {
        if(suma > 2000){
            System.out.println("Suma mai mare ca 2000");
            throw new MyException("Suma e mai mare ca 2000");
        }
    }
}
