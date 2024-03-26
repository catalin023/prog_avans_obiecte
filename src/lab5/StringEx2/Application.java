package lab5.StringEx2;

public class Application {
    public static void main(String[] args) {
        String text = new String("Odata creat un sir de caractere cu continutul sau nu mai poate fi modificat.");
        System.out.println(text.length());
        System.out.println(text.matches("[a-zA-Z]*"));
        String[] cuvinte = text.split(" ");

        if(cuvinte.length%2==0){
            System.out.println(cuvinte[(cuvinte.length)/2-1] + " : " + cuvinte[(cuvinte.length)/2]);
        }
        else {
            System.out.println(cuvinte[(cuvinte.length-1)/2]);
        }

        StringBuilder text_rev = new StringBuilder(text).reverse();
        System.out.println(text_rev);
    }
}
