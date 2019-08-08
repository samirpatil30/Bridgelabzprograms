package com.bridgelabz.functional;

import java.util.Scanner;

public class DayofWeek {

	public static void main(String[] args) {
		int m0=0,y0,d0,x;
		int year,month,day;
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("\n enter day");
		day= scanner.nextInt();
		
		System.out.println("\n enter month");
		month= scanner.nextInt();
		
		System.out.println("\n enter year");
		year= scanner.nextInt();
		
		 y0 = year-(14-month)/12;
		x=y0+y0/4-y0/100+y0/400;
		m0= month+12*((14-month)/12)-2;
		d0=(day+x+31*m0/12)%7;
	
		if(d0==0)
		{
			System.out.println("The is sunday");
		}
		else if (d0==1) {
			System.out.println("The is Monday");
		}
		else if (d0==2) {
			System.out.println("The is Tuesday");
		}
		else if (d0==3) {
			System.out.println("The is Wedday");
		}
		else if (d0==4) {
			System.out.println("The is Thrusday");
		}
		else if (d0==5) {
			System.out.println("The is Friday");
		}
		else if (d0==6) {
			System.out.println("The is Saturday");
		}
		

		scanner.close();
	}

}
