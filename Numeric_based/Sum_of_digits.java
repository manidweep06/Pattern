import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int r=0,s=0;
		while(n!=0){
		    r=n%10;
		    n=n/10;
            s+=r;            
		}
	    System.out.printf("sum: %d",s);
	}
}
