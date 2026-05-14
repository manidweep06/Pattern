import java.util.*; 
public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int[] fr = new int[n]; 
        int visited = -1;
        
        
        for(int i = 0; i < n; i++) {
            if(fr[i] == visited) {
                continue; 
            }
        
            int count = 1; 
            for(int j = i + 1; j < n; j++) {
                if(a[i] == a[j]) {
                    count++;
                    fr[j] = visited; 
                }
            }
            fr[i] = count;
        }
        
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++) {
            if(fr[i] != visited) {
                System.out.println("    " + a[i] + "    |    " + fr[i]);
            }
        }
    }
}