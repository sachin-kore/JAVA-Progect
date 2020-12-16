package array;

import java.util.Scanner;

public class Max {
	int adjacentElementsProduct(int[] inputArray) {
	int maxproduct=inputArray[0]*inputArray[1];
	for(int pos=0; pos<inputArray.length-1; pos++) {
		if(maxproduct<inputArray[pos]*inputArray[pos+1]) {
			maxproduct=inputArray[pos]*inputArray[pos+1];
		}
		//return maxproduct;
	}
	return maxproduct;
	
	
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the array elements:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Max m=new Max();
		System.out.println( m.adjacentElementsProduct(arr));
		sc.close();
	}

}
