/**
 * Create a method that accepts a string and checks if it is a positive string
 * A A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order. 
 * For Example: ANT is a positive String (Since T comes after N and N comes after A). The method should return true if the entered string is positive.
 */
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str=scanner.next();
    int len=str.length();
    if(checkString(str,len,scanner))
    	System.out.print("Positive string");
    else
    	System.out.print("Negative string");
	}
	private static boolean checkString(String str,int len,Scanner scanner){
		char []arr=str.toCharArray();
		for(int index=0;index<len-1;index++)
		{
			if(arr[index]>arr[index+1])
				return false;
		}
		return true;
	}

}