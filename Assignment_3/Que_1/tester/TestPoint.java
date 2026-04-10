package tester;

import com.app.geometry.*;
import java.util.*;

public class TestPoint {
	
	Point2D p1 = new Point2D();
	Point2D p2 = new Point2D();
	
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter the Coordinate of X1 : ");
		int x1 = sc.nextInt();
		p1.setX(x1);
		System.out.println("Enter the Coordinate of Y1 : ");
		int y1 = sc.nextInt();
		p1.setY(y1);
		System.out.println("Enter the Coordinate of X2 : ");
		int x2 = sc.nextInt();
		p2.setX(x2);
		System.out.println("Enter the Coordinate of Y2 : ");
		int y2 = sc.nextInt();
		p2.setY(y2);
		
	}	
	public void printRecord() {
		System.out.println(p1.getDetails());
		System.out.println(p2.getDetails());
	}
	
	public void checkEqual() {
		if(p1.isEqual(p2)) {
			System.out.println("Coordinates are Located at Same Position");
		}
		else {
			System.out.println("Coordinates are Located at Different Position");
		}
	}
	public void calculate() {
		double res = p1.calculateDistance(p2);
		System.out.println("Distance : "+res);
	}
	
	
	
	public static void main(String[] args) {
	
//		boolean res = p1.equals(p2);
//		System.out.println(res);
		
		TestPoint t1 = new TestPoint();
		t1.acceptRecord();
		t1.printRecord();
		t1.checkEqual();
		t1.calculate();
						
	}
	
	

	
		
		
		
		
		
		
		
	
}
