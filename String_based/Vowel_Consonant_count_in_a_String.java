
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int vow=0,con=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if("aeiou".indexOf(c) != -1){                
                vow++;
            }
            else if(Character.isLetter(c)){
                con++;
            }
        }
        System.out.printf("consonant count:%d \n vowel count:%d",con,vow);
	}    
}