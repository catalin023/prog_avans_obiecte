package lab10;

import lab10.Magazin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;


public class ex3 {
    public static void main(String[] args) {
        Magazin m1 = new Magazin("m1", 12);
        Magazin m2 = new Magazin("m2", 19);
        Magazin m3 = new Magazin("m3", 12);
        Magazin m4 = new Magazin("m4", 26);
        Magazin m5 = new Magazin("m5", 3);
        Magazin m6 = new Magazin("m6", 2);
        Magazin m7 = new Magazin("m7", 12);
        Magazin m8 = new Magazin("m8", 26);
        Magazin m9 = new Magazin("m9", 7);
        Magazin m10 = new Magazin("m10", 7);

        ArrayList<Magazin> magazine = new ArrayList<>();
        magazine.add(m1);
        magazine.add(m2);
        magazine.add(m3);
        magazine.add(m4);
        magazine.add(m5);
        magazine.add(m6);
        magazine.add(m7);
        magazine.add(m8);
        magazine.add(m9);
        magazine.add(m10);

        Map<Integer, List<Magazin>> GroupByNrAngajati = magazine.stream().collect(groupingBy(Magazin::getNumarAngajati));

        for (Map.Entry<Integer, List<Magazin>> entry : GroupByNrAngajati.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        Integer nrAngajati = magazine.stream().map(Magazin::getNumarAngajati).reduce(0, Integer::sum);
        System.out.println("Nr angajati: " + nrAngajati);

    }
}
