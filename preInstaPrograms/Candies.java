package preInstaPrograms;

import java.util.Arrays;

public class Candies {
	
	 public int solution(int[] arr) {
		 int count =1;
		 Arrays.sort(arr);
		 int len=arr.length;
		 for(int i=1; i<len-1; i++) {
			if(arr[1-i]!=arr[i]) {
				count++;
			}
		 }
		return count;
		 
	 }

	public static void main(String[] args) {
        int[] arr1= {80, 80, 1000000000, 80, 80, 80, 80, 80, 80, 123456789};
        Candies c=new Candies();
        System.out.println(c.solution(arr1));
	}

}
