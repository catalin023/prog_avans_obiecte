package lab10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class ex1 {
    public static void main(String[] args) {
        Integer[] list = {0, 6, 12, 9, -5, 10, 6, 7, -6, 17};

        Arrays.sort(list, (Integer o1, Integer o2) -> (o1.compareTo(o2)));
        System.out.println("lista sortata "+ Arrays.toString(list));

        Integer sumaList = Arrays.stream(list).reduce(0, Integer::sum);
        System.out.println("Suma: " + sumaList);

        Integer sumaList2 = Arrays.stream(list).collect(summingInt(Integer::intValue));
        System.out.println("Suma: " + sumaList2);

        Double avg = Arrays.stream(list).collect(averagingInt(Integer::intValue));
        System.out.println("Average: " + avg);

        Integer minim = Arrays.stream(list).min((a, b) -> a - b).get();
        System.out.println("Minim: " + minim);

        Integer maxim = Arrays.stream(list).max((a, b) -> a - b).get();
        System.out.println("Maxim: " + maxim);

        Integer[] filterList = Arrays.stream(list).filter(intValue -> intValue>5).toArray(Integer[]::new);
        System.out.println("Filter: " + Arrays.toString(filterList));
    }
}
