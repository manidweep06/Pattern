import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1){
            System.out.println((int)Math.pow(2,n/2));        }
        else{
            System.out.println((int)Math.pow(3,(n/2)-1));
        }
    
    }
}
