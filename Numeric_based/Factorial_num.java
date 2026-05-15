import java.util.*;

class Codechef {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            
            // Single condition: Only calculate if number is 0 or positive
            if (num >= 0) {
                long f = 1;
                for (int i = 1; i <= num; i++) {
                    f *= i;
                }
                System.out.println(f);
            } else {
                System.out.println("Invalid Input"); 
            }
        }
    }
}
