import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] count = new int[26]; // One slot for each letter a-z

        for (int i = 0; i < s1.length(); i++) {
            // Find index (0-25) by subtracting 'a'
            count[s1.charAt(i) - 'a']++; 
            count[s2.charAt(i) - 'a']--;
        }

        boolean isAnagram = true;
        for (int i : count) {
            if (i != 0) {
                isAnagram = false;
                break;
            }
        }

        System.out.println(isAnagram ? "Anagrams" : "Not Anagrams");
    }
}