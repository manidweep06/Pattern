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
		int r=0,rev=0;
		while(n!=0){
		    r=n%10;
		    n=n/10;
		    rev=rev*10+r;
		}
		System.out.printf("%d is the reverse",rev);

	}
}
