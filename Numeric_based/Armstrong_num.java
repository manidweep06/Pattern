import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int n=num,r=0,s=0;
		while(n!=0){
		    r=n%10;
		    n=n/10;
            s+=r*r*r;            
		}
		if(s==num){
	        System.out.printf("%d is a Armstrong",num);
		}
		else{
	        System.out.printf("%d is not a Armstrong",num);
		}
	}
}
