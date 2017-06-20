package odde;

import java.util.Scanner;

public class even {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num=sc.nextInt();
		sc.close();
		if(num%2==0){
			System.out.println("The given number is even number");
		}
		else
		{
			System.out.println("The given number is odd numbner");
		}
	}

}
