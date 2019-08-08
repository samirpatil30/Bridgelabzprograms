package com.bridgelabz.functional;

import java.util.Scanner;

public class Prime_factorization {

	public static void main(String[] args) {
		int i,j,num,isprime;
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n enter the number");
		num= scanner.nextInt();
		
		for(i=2;i<num ;i++)
		{
			if(num%i==0)
			{
				isprime=1;
				for(j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						isprime=0;
						break;
					}
				}
				if(isprime==1)
				{
					System.out.println(i);
				}
			
			}
		}
		
	}

}
