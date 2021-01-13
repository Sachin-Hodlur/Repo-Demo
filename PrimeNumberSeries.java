package basic;

import java.util.Scanner;

public class PrimeNumberSeries {
	
	public static void main(String[] args) {
		System.out.println("Program Started");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Starting limit: ");
		int start = sc1.nextInt();
		System.out.println("Enter End limit: ");
		int end = sc1.nextInt();
		int primeCount = 0;
		for(int i=start;i<=end;i++)
		{
			int num = i;
			int count = 1;
			for(int j=1;j<=num/2;j++)
			{
				if(num%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(num+",");
				primeCount++;
			}
		}
		System.out.println("\nTotal Prime Numbers in the range: "+primeCount);
		System.out.println("Program Ended");
	}

}
