import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arraySentence;
        System.out.print("Enter a sentence: ");
        String sentence = stdin.nextLine();

        arraySentence = sentence.split(" ");
        int length = arraySentence.length;

        for (int i = length - 1; i >= 0; i--) {
            System.out.println(arraySentence[i]);
        }

    }
}