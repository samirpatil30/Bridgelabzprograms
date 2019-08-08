package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class SpringSeason {

	public static void main(String[] args) {
		Utility u = new Utility();
		int month,day;
		Scanner sc= new Scanner(System.in);
		System.out.println("\n enter the day" );
		day= sc.nextInt();
		System.out.println("\n enter the month");
		month= sc.nextInt();
		u.month(day,month);
		sc.close();
	}

}
