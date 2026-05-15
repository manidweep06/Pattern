import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + " "; // Add a space at the end to catch the last word
        
        String longest = "";
        String currentWord = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
                currentWord += c; // Build the word character by character
            } else {
                // We hit a space, so the word ended. Compare it.
                if (currentWord.length() > longest.length()) {
                    longest = currentWord;
                }
                currentWord = ""; // Reset for the next word
            }
        }

        System.out.println("Longest: " + longest);
    }
}
