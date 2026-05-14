import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int n = s.length(); // String length instead of array n
        int[] fr = new int[n]; 
        int visited = -1;

        for(int i = 0; i < n; i++) {
            if(fr[i] == visited) 
                continue;
        
            int count = 1; 
            for(int j = i + 1; j < n; j++) {
                // Use s.charAt() instead of a[i]
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                    fr[j] = visited; 
                }
            }
            fr[i] = count;
        }

        System.out.println(" Element | Frequency");
        for(int i = 0; i < fr.length; i++) {
            if(fr[i] != visited) {
                System.out.println("    " + s.charAt(i) + "    |    " + fr[i]);
            }
        }
    }
}