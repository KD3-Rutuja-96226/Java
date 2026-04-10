//java program to count number of words in a String.

import java.util.Scanner;

public class Que_3 {
	public static int countWords(String[] str) {
		int count = 0;
		for(String arr : str) {
			count++;	
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		String[] arr = str.trim().split(" ");
		int res = countWords(arr);
		System.out.println("Count Words : "+res);
		
		
	}

}
