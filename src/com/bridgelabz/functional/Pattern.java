package com.bridgelabz.functional;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		 char pattern ;
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("enter the character you want to print");
		   pattern = scanner.next().charAt(0);
		   switch(pattern)
		   {
		   
		   case'k':
		   
		           System.out.println("**    ***");
		           System.out.println("**   ***");
		           System.out.println("**  ***");
		           System.out.println("** ***");
		           System.out.println("*****");
		           System.out.println("** ***");
		           System.out.println("**   ***");
		           System.out.println("**    ***");
		           System.out.println("**     ***");
		           break;
		           
		   case'd' :
		   	
			   	   System.out.println("**********");
		           System.out.println("**       **");
		           System.out.println("**        **");
		           System.out.println("**         **");
		           System.out.println("**         **");
		           System.out.println("**         **");
		           System.out.println("**        **");
		           System.out.println("**       **");
		           System.out.println("**********");
		   	break;
		   	
		   case'w' :
		   	       System.out.println("**             *             **");
		           System.out.println(" **           ***           **");
		           System.out.println("  **         ** **         **");
		           System.out.println("   **       **   **       **");
		           System.out.println("    **     **     **     ** ");
		           System.out.println("     **   **       **   **  ");
		           System.out.println("      ** **         ** **   ");
		           System.out.println("       ***           ***   ");
		           System.out.println("        *             *    ");
		           
		   	break;
		   	default:
		   	System.out.println("enter valid value");
		   				
	}
     scanner.close();
	}
}
