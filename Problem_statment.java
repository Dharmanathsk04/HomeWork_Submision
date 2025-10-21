package com.tka1.Test1;

import java.util.Scanner;

public class Problem_statment {

	
	public static void main(String[] args) {
		
		System.out.println("Enter the marks for maths : ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println(m);
		
		System.out.println("Enter marks for Science : ");
		int s = sc.nextInt();
		System.out.println(s);
		
		System.out.println("Enter marks for history : ");
		int h = sc.nextInt();
		System.out.println(h);
		
		System.out.println("Enter marks for english : ");
		int e = sc.nextInt();
		System.out.println(e);
		
		System.out.println("Enter marks for biology : ");
		int b = sc.nextInt();
		System.out.println(b);
		
		int total = m+s+h+e+b;
		System.out.println("the total is : "+total);
		
		float per = (total/350F)*100;
		System.out.println("The percentage is : "+per+"%");
		
		if(per>90) {
			System.out.println("your grade is : A");
		}
		
		else if(per < 90 && per>=75) {
			
			System.out.println("Your Grade is : B");
		}
		
		else if(per <=75 && per>=55) {
			
			System.out.println("Your grade is : C");
		}
		
		else if(per<=55 && per>=30) {
			
			System.out.println("Your Grade is : D");
		}
		
		else {
			
			System.out.println("Your Grade is : F");
		}
		
		
		
	}
}
