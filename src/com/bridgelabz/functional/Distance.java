package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		Utility utility= new Utility();
		System.out.println("\n enter the 1 command line argument");
		int x= Integer.parseInt(args[0]);
		System.out.println("\n enter the 2 command line argument");
		int y= Integer.parseInt(args[1]);
		
		utility.distance(x,y);
		
	}

}
