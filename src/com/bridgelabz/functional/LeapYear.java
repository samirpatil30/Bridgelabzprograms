package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class LeapYear {
/**
 * Purpose: This Program Help to find Leap Year
 * 
 * @param args
 */
	public static void main(String[] args) 
	{
		Utility utility= new Utility();
		int  year = 0;
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n enter year");
		year= scanner.nextInt();
		utility.leap(year);
	}
}
