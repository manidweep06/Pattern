import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int t = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(t==a[i]){
                System.out.printf("Target found at %d",i);
                return;
            }
        }                
        System.out.printf("Target not found");
	}
}