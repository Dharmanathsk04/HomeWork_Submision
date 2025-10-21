package com.tka1.Test1;

import java.util.Scanner;

public class Homework_2 {

	
	public static void main(String[] args) {
		
		
		System.out.println("Enter the number 1 :");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		System.out.println("Enter the nuber 2 : ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter number 3 : ");
		int n3 = sc.nextInt();
		
		if(n1<n2 && n1<n3) {
			
			System.out.println(n1+" is less ");
		}
		
		else if(n2 < n1 && n2<n3) {
			
			System.out.println(n2+" is less");
		}
		
		else {
			
			System.out.println(n3+" is less");
		}
	}
}
