import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize Scanner for dynamic input
        Scanner sc = new Scanner(System.in);

        // 2. Get the main text (Source)
        System.out.println("Enter the main text/sentence:");
        String text = sc.nextLine();

        // 3. Get the pattern (What you're searching for)
        System.out.println("Enter the pattern to find:");
        String pattern = sc.nextLine();

        int tLen = text.length();
        int pLen = pattern.length();
        boolean found = false;

        // 4. Pattern Matching Logic
        // We only loop until (tLen - pLen) to stay within bounds
        for (int i = 0; i <= tLen - pLen; i++) {
            int j;

            // Check the 'window' starting at index i
            for (j = 0; j < pLen; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break; // Mismatch: move the window one step right
                }
            }

            // If j reached the end of pLen, the pattern was found
            if (j == pLen) {
                System.out.println("Pattern found at index position: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Pattern not found in the given text.");
        }
        
        sc.close(); // Good practice to close the stream
    }
}