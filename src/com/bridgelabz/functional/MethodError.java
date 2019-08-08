package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class MethodError {

	public static void main(String[] args) {
		Utility u = new Utility();
		try {
			u.display();
		} catch (Exception e) {
			System.out.println("Error is"+e);
		}
		

	}

}
