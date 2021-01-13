package basic;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println("Program Started");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc1.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact * i;
		}
		System.out.println("Fact of given no: "+fact);
		sc1.close();
		System.out.println("Program Ended");
	}

}
