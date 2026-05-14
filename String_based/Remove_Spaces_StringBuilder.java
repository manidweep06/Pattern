import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // Only append if the character is NOT a space
            if (c != ' ') {
                sb.append(c);
            }
        }

        System.out.println("Result: " + sb.toString());
    }
}