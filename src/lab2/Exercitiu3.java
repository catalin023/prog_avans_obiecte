package lab2;

import java.util.Scanner;

public class Exercitiu3 {

    public static void rezolva(){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt()+1;

        long[] v = new long[N+1];

        v[0] = 0;
        v[1] = 1;

        int pointer = 2;
        while(pointer <= N){
            v[pointer] = v[pointer-1]+v[pointer-2];
            pointer++;
        }
        System.out.println(v[N]);

    }

}
