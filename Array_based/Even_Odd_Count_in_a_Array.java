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
        int e=0,o=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        System.out.printf("%d is even count \n",e);
        System.out.printf("%d is odd count",o);
	}
}