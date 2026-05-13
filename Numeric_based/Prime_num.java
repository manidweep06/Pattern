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
		int c=0;
		for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                c++;
            }
		}
		if(c>2|num==0|num==1){
		    System.out.printf("%d is not a prime!",num);
		}
		else{
		    System.out.printf("%d is a prime!",num);
		}
	}
}
