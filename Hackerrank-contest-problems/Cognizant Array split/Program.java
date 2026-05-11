import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int s=0,count=0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] l = new int[n];
        l[0]=a[0];
        for(int i=1;i<n;i++){
            l[i] =l[i-1]+a[i] ;
        }
        s=l[n-1];
        for(int i=0;i<n-1;i++){
            int left=l[i];
            int right=s-left;
            if((Math.abs(left-right))%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
