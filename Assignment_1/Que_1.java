import java.util.Scanner;

public class Que_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		String b =  Integer.toBinaryString(num);
		System.out.println("Binary Equivalent : "+b);
		
		String o = Integer.toOctalString(num);
		System.out.println("Octal Equivalent : "+o);
		
		String h = Integer.toHexString(num);
		System.out.println("Hexadecimal Equivalent : "+h);
		
		
	}

}
