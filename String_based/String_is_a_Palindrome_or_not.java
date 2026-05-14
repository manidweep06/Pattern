
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        StringBuilder rev = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        String r =rev.toString();
        if(s.equals(r)){
            System.out.printf("%s is a Palindrome",s);
        }
        else{
            System.out.printf("%s is not a Palindrome",s);
        }
	}    
}