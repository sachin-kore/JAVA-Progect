package student;

import java.util.Scanner;

public class Example {
	static int minTurn(int n, int k) 
	{ 


		if (n % 2 == 0) 
			n++; 


		return Math.min((k + 1) / 2, (n - k + 1) / 2);

	} 
	static public void main (String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the value of n1:");
		 int n1=sc.nextInt();
		 System.out.println("enter the value of k1:");
		int k1=sc.nextInt();
		System.out.print(minTurn(n1, k1)); 
		sc.close();
	} 
} 