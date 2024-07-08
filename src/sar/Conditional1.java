package sar;

public class Conditional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String examStatus = "fail";
	if(examStatus == "Pass") {
		System.out.println("Please wait for the further rounds");
		String round1Status="pass";
		if(round1Status == "Pass"){
			System.out.println("you have cleared round1");
			String round2Status= "pass";
			if(round2Status== "pass")
			{
				System.out.println("you have cleared round2");
			}
			else {
				System.out.println("you can go to home");
			}
		}
	}
	else {
		System.out.println("you can go");
	}
	}

}
