import java.util.*;
public class Que_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int quantity, choice;
		double totalBill = 0;
		
		do {
			System.out.println("\n1. Dosa - Rs.40");
			System.out.println("2. Samosa - Rs.15");
			System.out.println("3. Idli - Rs.40");
			System.out.println("4. Maggi - Rs.30");
			System.out.println("5. Oats - Rs.20");
			System.out.println("6. Pizza - Rs.100");
			System.out.println("7. Poha - Rs.20");
			System.out.println("8. Tea - Rs.10");
			System.out.println("9. Cutlet - Rs.50");
			System.out.println("10. Pasta - 80 ");
			System.out.println("0. Exit.");
			
			System.out.println("Enter the Choice : ");
			choice = sc.nextInt();
			
			if(choice >= 1 && choice <= 10) {
				System.out.println("Enter the Quantity : ");
				quantity = sc.nextInt();
				
				switch(choice)
				{
				case 0:
						break;
				case 1:
					totalBill += 40 * quantity;
					break;
				case 2:
					totalBill += 15 * quantity;
					break;
				case 3:
					totalBill += 40 * quantity;
					break;
				case 4:
					totalBill += 30 * quantity;
					break;
				case 5:
					totalBill += 20 * quantity;
					break;
				case 6:
					totalBill += 100 * quantity;
					break;
				case 7:
					totalBill += 20 * quantity;
					break;
				case 8:
					totalBill += 10 * quantity;
					break;
				case 9:
					totalBill += 50 * quantity;
					break;
				case 10:
					totalBill += 80 * quantity;
					break;
										
				}
						
			}
		}while(choice != 0);
		System.out.println("\nTotal Bill : "+totalBill);
	}

}
