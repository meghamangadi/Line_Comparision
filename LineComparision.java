package com.bridgeLabz;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparsion Computation Program");

		int x1,x2,x3,x4,y1,y2,y3,y4 ;
		double Distance1 ,Distance2 ;
		
		Scanner sc = new Scanner(System.in);
	System.out.println("For line 1");
		
		System.out.println("Enter the value of X1");
		x1 = sc.nextInt();
		
		System.out.println("Enter the value of X2");
		x2 = sc.nextInt();
		
		System.out.println("Enter the value of Y1");
		y1 = sc.nextInt();
		
		System.out.println("Enter the value of Y2");
		y2 = sc.nextInt();
		
    System.out.println("For line 2");
		
		System.out.println("Enter the value of X1");
		x3 = sc.nextInt();
		
		System.out.println("Enter the value of X2");
		x4 = sc.nextInt();
		
		System.out.println("Enter the value of Y1");
		y3 = sc.nextInt();
		
		System.out.println("Enter the value of Y2");
		y4 = sc.nextInt();
		
		Distance1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		Distance2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
		
		System.out.println("Distance 1 :"+Distance1);
		System.out.println("Distance 2 :"+Distance2);
		
		if(Distance1==Distance2) {
			System.out.println("Length of two lines are equal");
		}else if(Distance1>Distance2){
			System.out.println("Length of line 1 is greater than line 2");
		}else {
			System.out.println("Length of line 2 is greater than line 1");
		}

	}
}
