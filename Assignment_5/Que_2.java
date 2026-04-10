import java.util.Scanner;

public class Que_2 {
	
	public static boolean checkPalindrome(String str) {
		int start = 0;
		int last = str.length()-1;
		while(start < last) {
			if(str.charAt(start)!=str.charAt(last)) {
				return false;
			}
			start++;
			last--;
		}	
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		boolean res = checkPalindrome(str);
		System.out.println("Is Palindrome : "+res);
		sc.close();

	}
	

}
