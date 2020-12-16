package student;

import java.util.HashSet;
import java.util.Scanner;

public class Practece {
	public int singleNumber(int[] nums) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i:nums){
			if(set.contains(i)){
				set.remove(i);
			}
			else{
				set.add(i);
			}
		}
		for(int i:set){
			return i;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements:");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Practece p=new Practece();
		System.out.println( p.singleNumber(arr));
		sc.close();
	}

}
