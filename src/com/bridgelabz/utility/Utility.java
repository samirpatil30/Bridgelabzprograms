package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	
		
	

	/**
	 * purpose: To find the enter year is leap year or not
	 * @param year
	 * author: Samir Patil
	 */
	public  void leap(int year) {
		
		if(year>=1582)
		
			if((year%400==0)&&(year%100!=0)||(year%4==0))
			{
				System.out.println("leap yr"+year);
			}
			else
			{
				System.out.println("not leap year"+year);
			}
		
		else
		{
			System.out.println("Enter another year ");
		}
		
	}

	public void display() {
		
		
	}

	/**
	 * purpose: to perform the operation on data members and check the operator precedence
	 * @param a
	 * @param b
	 * @param c
	 */
	public void operation(int a, int b, int c) {
		int d,e,f;
		d= a + (b *c);
		e=(a * b) + c;
		f=c + (a / b);
		System.out.println("d= a + (b *c) =="+d);
		System.out.println("e=(a * b) + c=="+e);
		System.out.println("f=c + (a / b) =="+f);
		
	}

	
	/**
	 * purpose: to check the month enter by user is spring or not
	 * @param date
	 * @param month
	 */
	public void month(int day, int month) {
		if(month==3 || month==4 || month==5 || month== 6 && day<=30 && day>=1)
		{
			System.out.println("\n Spring season");
		}
		else
		{
			System.out.println("Season is not spring season");
		}
		
	}

	
	/**
	 * purpose: To print sum of numbers on dice
	 * param:sum stores the addition of numbers on dice
	 * @return
	 */
	public int sum() {
		int sum=0;
		Random r= new Random();
		for(int i=1;i<=2;i++)
		{
			sum= sum+r.nextInt(6);
		}
		System.out.println("Sum of two random number on dice "+sum);
		return sum;
		
	}

	public void coinPercentage() {
		int toss,cnt=0,cnt1=0;
		double head= 0.0;
		double tail=0.0;
		double rand_num;
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n How many times you want to toss a coin");
		toss= scanner.nextInt();
		scanner.close();
		for(int i=0;i<toss;i++)
		{
			rand_num= Math.random();
			if(rand_num>0.5)
			{
				
				head= head+rand_num;
				cnt++;
			}
			else
			{
				tail= tail+rand_num;
				cnt1++;
			}
			
		}
		
		System.out.println("head appears "+cnt+" times");
		System.out.println("tail appears "+cnt1+" times");
		
		double avg_heads= head/toss;
		double avg_tail= tail/toss;
		
		System.out.println("\n average of heads is \t"+avg_heads);
		System.out.println("\n average of tails is \t"+avg_tail);
			
		}

	/**
	 * purpose: This function is write to check primes numbers in given range
	 */
	public void prime_checker() {
		int start_num,end_num;
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n enter the Start number");
		start_num= scanner.nextInt();
		System.out.println("\n enter the end number");
		end_num= scanner.nextInt();
		scanner.close();
		int number,count;
		
		for(number=start_num;number<end_num;number++)
		{
			count=0;
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && number!=1)
			{
		      	System.out.println(number);
			}
		}
		
	}

	public void anagram_checker() {
		Scanner scanner= new Scanner(System.in);
		String string1;
		String string2;
		System.out.println("\n enter the first string ");
		string1= scanner.next();
		System.out.println("\n enter the second string");
		string2= scanner.next();
		scanner.close();
		char str1[]= string1.toCharArray();
		char str2[]= string2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<str2.length;j++)
			{
				if(str1[i]!=str2[i])
				{
					System.out.println("String are not anagram");
					
				}
				else
				{
					System.out.println("String are anagram");	
				}				
			}
			
		}
	
	}

	public boolean palindrome_checker() {
		String str1= "madam";
		String str2="";
		
		int len= str1.length();
		
		for(int i=len-1;i>=0;i--)
		{
			str2= str2+str1.charAt(i);
		}
		if(str1.equals(str2))
		{
			System.out.println("String are palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		return false;
	}

	public void distance(int x, int y) {
		double distance;
		distance= Math.sqrt(x*x + y*y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
		
	}

	public void repeated() {
		int array[]= {1,2,3,4,1,2,6,7,8,8,6};
		int array_size= array.length;
		for(int i=0;i<array_size;i++)
		{
			for(int j=i+1;j<array_size;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("\n repeated num"+array[i]);
				}
			}
		}
		
	}

	public void findBigSmall() {
		int array[]= {1,70,30,100,85};
		int s_big,f_big,temp,f_small=0,s_small=0;
		f_big=array[0];
		s_big= array[1];
		f_small=array[0];
		s_small= array[1];
		if(s_small<f_small)
		{
			
			temp= s_small;
			s_small=f_small;
			f_small=temp;
		}
		for(int i=2;i<array.length;i++)
		{
			if(array[i]<f_small)
			{
				s_small=f_small;
				f_small=array[i];
			}
			else if(array[i]<s_small)
			{
				s_small=array[i];
			}
			
		}
		
		
		if(s_big>f_big)
		{
			temp= s_big;
			s_big=f_big;
			f_big=temp;
		}
		for(int i=2;i<array.length;i++)
		{
			if(array[i]>f_big)
			{
				s_big=f_big;
				f_big=array[i];
			}
			else if(array[i]>s_big)
			{
				s_big=array[i];
			}
			
			}
		System.out.println("\n second biggest number is=="+s_big);
		System.out.println("\n second smallest number is=="+s_small);
		}

	public void loanChecker() {
		double year=0,rate=0,principal=0;
		double n=12;
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n enter principal ");
		principal=scanner.nextDouble();
		
		System.out.println("\n enter year ");
		year=scanner.nextDouble();
			
		System.out.println("\n enter rate ");
		rate=scanner.nextDouble();

		
		
		 double r = (rate / 100) / 12;   // monthly interest rate
	         n = 12 * year;
		
		double payment= principal*r/(1-Math.pow(1+r, -n));
		double interest = payment * n - principal;
		
		 System.out.println("Monthly payments = " + payment);
	        System.out.println("Total interest   = " + interest);
	        scanner.close();

		
	}

	/**purpose: to sort the array using bubble sort
	 * @param array
	 */
	public void bubble_sort(int[] array) {
		int len= array.length;
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					
					temp= array[j];
					array[j]= array[j+1];
					array[j+1]= temp;
				}
			}
		
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(""+array[i]);
		}
			
	}

	public void powerOfTwo() {
		int i=0;
		int powerOftwo=1;
		int n;
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n enter the number upto which you want to find power");
		n= scanner.nextInt();
		scanner.close();
		while (i<=n) {
			System.out.println(""+powerOftwo);
			powerOftwo= 2*powerOftwo;
			i=i+1;
			
		}
		
	}

	public void tempeatureconversion() {
	int tempeature=0,celsius=0,fahrenheit=0;
	Scanner scanner= new Scanner(System.in);
	System.out.println("\n Enter your choice 1) celsius_to_fahrenheit 2) fahrenheit_to_celsius");
	int ch= scanner.nextInt();

	switch (ch) {
	case 1:
		System.out.println("\n enter the tempeature");
		tempeature= scanner.nextInt();
		celsius=(celsius * 9/5) + 32;
		System.out.println("\n tempeature in celcius is"+celsius);
		break;

	case 2:
		System.out.println("\n enter the tempeature");
		tempeature= scanner.nextInt();
		fahrenheit= (fahrenheit - 32) * 5/9;
		System.out.println("\n tempeature in fahrenheit is"+fahrenheit);
		break;
	default:
		System.out.println("\n enter correct choice");
		break;
	}
	scanner.close();
		
	}

	public int magic_number() {
		Scanner scanner= new Scanner(System.in);
		int low = 0, high = 127, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int c = scanner.nextInt();
			mid = (low + high) / 2;
			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		scanner.close();
		return low;


	}

	public void min_max() {
		double array[]= new double[5];
		double min=0.0,max,avg;
		double add=0;
		for(int i=0;i<array.length;i++)
		{
			array[i]= Math.random();
		}
		for(int i=0;i<array.length;i++)
		{
			add= add+array[i];
			
		}

		avg= add/5;
		System.out.println("Average value is \t"+avg);
		
	}

	public void trig_opreation() {
		int angle=0;
		double rad;
		double pie= 3.14,sin,cos;
		Scanner scanner= new Scanner(System.in);
		System.out.println("\n enter angle in degrees");
		angle= scanner.nextInt();
		scanner.close();
		
		rad= angle*pie/180;
		sin= Math.sin(rad);
		cos= Math.cos(rad);
		
		System.out.println("after conversion of degree  "+angle +" into radian the Radian is ="+rad+"radian");
		System.out.println("Sin is"+sin);
		System.out.println("Cos is"+cos);
		
	}

	public void dice_roll() {
		Scanner scanner= new Scanner(System.in);
		int n=0;
		System.out.println("\n how many times you want to roll dice");
		n= scanner.nextInt();
		Random random= new Random();
		int array[]= new int [5];
		
		int cnt=0;
		int res[]=new int[5],j = 0;
		for(int i=0;i<n;i++)
		{
			array[i]= random.nextInt(6)+1;
		}
		Arrays.sort(array);
		
		for(int i=1;i<array.length-1;i++)
		{
			
				if(array[i]==array[i-1])
				{
					res[j]= array[i];
					cnt++;
				}
			
		}
		System.out.println("\n max time repeated num is"+res[0]+"\t repeated time is"+cnt);
		scanner.close();

		
	}

	
	
}
	
	
	


