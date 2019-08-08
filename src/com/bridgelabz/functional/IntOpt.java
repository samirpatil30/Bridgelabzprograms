package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOpt {

	public static void main(String[] args) {
		int  a,b,c;
		Utility u= new Utility();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter the value of A,B,C");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		u.operation(a,b,c);
		

	}

}
