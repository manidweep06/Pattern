import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int s=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int l=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>l&&a[i]>s){
                s=l;
                l=a[i];
            }
            else if(a[i]<l&&a[i]>s){
                s=a[i];
            }
        }
        System.out.println(s);
	}
}