package lab10;

import java.util.Arrays;
import java.util.Comparator;

public class ex2 {
    public static void main(String[] args) {
        int[] list = {1, 5, 0, 6, 12, 9, -5, 10, 6, 7, -6, 17};

        Arrays.sort(list);
        System.out.println("Sortare crescatoare " + Arrays.toString(list));

        Integer[] descList = Arrays.stream(Arrays.stream(list).boxed().toArray(Integer[]::new)).sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        System.out.println("Sortare descrescatoare " + Arrays.toString(descList));

        int[] sqrList = Arrays.stream(list).map(a -> a*a).toArray();
        System.out.println("Elementele patratice " + Arrays.toString(sqrList));



    }
}
