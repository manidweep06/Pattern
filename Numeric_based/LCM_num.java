import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int a=n1,b=n2,temp=0;
		while(b!=0){
		    temp=a%b;
		    a=b;
		    b=temp;
		}
		int lcm=(n1*n2)/a;
		System.out.printf("%d is the lcm",lcm);
	}
}
