import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int temp=0;
		while(b!=0){
		    temp=a%b;
		    a=b;
		    b=temp;
		}
		System.out.printf("%d is the gcd or hcf",a);
	}
}
