package sar;

import java.util.Scanner;

public class Monday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the day");
String day=sc.nextLine();
if(day.equals("Monday" )|| 
		day.equals ("Tuesday" )||
 day.equals("Wednesday") || 
	day.equals	("Thursday") || 
		day.equals("Friday") )
{ 
	System.out.println("Uff,Its a week day");
	
}
else {
	System.out.println("Yay, Its a weekend");
}

	}

}
