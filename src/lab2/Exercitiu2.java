package lab2;

import java.util.Scanner;

public class Exercitiu2 {

    public static void rezolva(){
        Scanner s = new Scanner(System.in);

        String etxt = s.nextLine();
//        System.out.println(etxt);

        String[] splits = etxt.split(" ");

        int[] vec = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            vec[i] = Integer.parseInt(splits[i]);
        }

        for (int i = 0; i < vec.length-1; i++) {
            if(i==0)
                System.out.print(vec[i]);

            if(vec[i] < vec[i+1])
                System.out.print(" < ");
            else if(vec[i] > vec[i+1])
                System.out.print(" > ");
            else
                System.out.print(" = ");

            System.out.print(vec[i+1]);
        }

    }

}
