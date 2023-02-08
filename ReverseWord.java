import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sentences: ");
        int n = scanner.nextInt();
        String[] sentences = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter sentence " + (i + 1) + ": ");
            sentences[i] = scanner.nextLine();
        }
        for (String sentence : sentences) {
            System.out.println("Original sentence: " + sentence);
            System.out.println("Reversed sentence: " + reverseSentence(sentence));
            System.out.println();
        }
    }

    public static String reverseSentence(String input) {
        String[] words = input.split(" ");
        int wordCount = words.length;
        if (wordCount % 2 == 0) {
            return input;
        } else {
            StringBuilder reversed = new StringBuilder();
            for (int i = wordCount - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }
            return reversed.toString().trim();
        }
    }
}