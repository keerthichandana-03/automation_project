package sar;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the desired number");
		Integer a=sc.nextInt();
		if(a<35)
		
			System.out.println("Fail");
		else if(a==35)
			System.out.println("pass");
		else if(a>=35 && a<=70)
			System.out.println("3rd class");
		else if(a>=70 && a<=85)
			System.out.println("2nd class");
		
		else
		{
			System.out.println("First class");
		}
		
		

	}

}
