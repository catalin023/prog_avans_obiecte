package lab8;

import java.io.*;

public class MainEx2CitireOcteti {
    public static void main(String[] args) {
        readData();
    }

    private static void readData() {
        Object[] o = FileManagement.citireObiectDinFisier("persoanaOcteti.txt");

        for (int i = 0; i < o.length; i++) {
            Persoana p = (Persoana) o[i];
            if (p.getNume().equals(p.getPrenume())){
                System.out.println(p);
            }
        }

    }
}
