package com.capgemini.helloworld;

public class UsingContinue {
	public static void main(String[] args) {
		System.out.println("Printing numbers from 1-50 excluding number divided by 5 :- ");
		for (int i = 1; i <= 50; i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}