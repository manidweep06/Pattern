import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int t=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            t=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=t;
        }        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }        
	}
}