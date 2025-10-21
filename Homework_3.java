package com.tka1.Test1;

import java.util.Scanner;

public class Homework_3 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num%3==0 && num%5==0) {
			
			System.out.println("Mango And Apple");
		}
		
		else if(num%5==0) {
			
			System.out.println("Apple");
		}
		
		else if(num%3==0) {
			
			System.out.println("Mango");
		}
		
		else {
			
			System.out.println("The number is : "+num);
		}
	}
}
