package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Magic_number {

	public static void main(String[] args) {
		
		Utility utility= new Utility();
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n enter the number betwwen 1 to 127");
		scanner.next();
		try {
			System.out.println("guessed no is " + utility.magic_number());
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
		

	}

}
