import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            int c=0;
            if(i==0){
                if(a[0]<a[1]){
                    c++;
                }
                if(a[0]<a[n-1]){
                    c++;
                }
                b[0]=c;
            }
            else if(i==n-1){
                if(a[n-1]<a[0]){
                    c++;
                }
                if(a[n-1]<a[n-2]){
                    c++;
                }
                b[n-1]=c;
            }
            else{
                if(a[i]<a[i-1]){
                    c++;
                }
                if(a[i]<a[i+1]){
                    c++;
                }
                b[i]=c;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
