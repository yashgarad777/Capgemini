package com.capgemini.helloworld;

public class UsingBreak {
	public static void main(String[] args) {
		System.out.println("Breaking the loop at value 8:- ");
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
			if ((i + 1) == 8) {
				break;
			}
		}
	}

}