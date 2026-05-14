import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c >= 'A' && c <= 'Z') {
                arr[i] = (char) (c + 32);
            } 
            else if (c >= 'a' && c <= 'z') {
                arr[i] = (char) (c - 32);
            }
        }

        String result = new String(arr);
        System.out.println("Toggled Case: " + result);
    }
}