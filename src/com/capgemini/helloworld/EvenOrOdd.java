package com.capgemini.helloworld;

import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check even or odd:- ");
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
	}
	
	
	
	
	
	

}