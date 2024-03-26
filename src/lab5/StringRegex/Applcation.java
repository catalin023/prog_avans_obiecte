package lab5.StringRegex;

public class Applcation {
    public static void main(String[] args) {

        System.out.println("a".matches("[abc]"));
        System.out.println("k".matches("[^abc]"));
        System.out.println("z".matches("[a-z]"));
        System.out.println("B".matches("[a-zA-Z]"));
        System.out.println("jK".matches("[a-z][A-Z]"));
        System.out.println("abacbac".matches("[abc]+"));
        System.out.println("".matches("[abc]*"));
        System.out.println("abcab".matches("[abc]{5}"));
        System.out.println("abacbabc".matches("[abc]{5,}"));
        System.out.println("cbabbbca".matches("[abc]{5,10}"));

    }
}
