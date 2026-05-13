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
		int f=1;
		for(int i=1;i<=num;i++){
           f*=i;
		}
		if(num==0|num==1){
		    System.out.println(f);
		}
	    else{
	        System.out.println(f);
	    }
	        
    }
}
