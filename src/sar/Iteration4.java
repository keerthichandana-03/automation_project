package sar;

public class Iteration4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=7;
		int weeks= 3;
		int i=1;
		while(i<=weeks)
		{
			System.out.println("week:" + i);
			for(int j=1;j<=days;++j)
			{
				System.out.println("day:" + j);
			}
			i++;
		}

	}

}
