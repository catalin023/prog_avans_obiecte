package lab8;

import java.io.*;
import java.util.Scanner;

public class MainEx1CitireChar {
    public static void main(String[] args) {
        readData();
    }

    private static void readData() {
        try (BufferedReader br = new BufferedReader(new FileReader("persoane.txt"))) {
            String text;
            while ((text = br.readLine()) != null) {
                String[] words = text.split(";");
                if (words[0].equals(words[1])) {
                    for (int i = 1; i < words.length; i++) {
                        System.out.print(words[i] + " ");
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
