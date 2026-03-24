import java.util.*;
public class Que_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1=0;
		double num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Num1 : ");
		
		if(!sc.hasNextInt() &&sc.hasNextDouble())
		{
			num1 = sc.nextDouble();
			
			System.out.println("enter the 2nd number");
			if(!sc.hasNextInt() &&sc.hasNextDouble())
			{
				num2 = sc.nextDouble();	
			}
			else {
				System.out.println("Given Number is Not Double.");				
			}
		}
		else {
			System.out.println("Given Number is Not Double.");
		}
		
		double avg = (num1 + num2)/2;
		System.out.println("Average : "+avg);

	}

}
