import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // 1. Create a char array the same size as the string
        char[] temp = new char[s.length()];
        int j = 0; // Separate pointer for the new array

        // 2. Fill the array only with non-space characters
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp[j] = s.charAt(i);
                j++;
            }
        }

        // 3. Create a final String using only the filled portion of the array
        String result = new String(temp, 0, j);
        System.out.println("Result: " + result);
    }
}