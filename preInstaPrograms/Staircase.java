package preInstaPrograms;

import java.util.Arrays;

public class Staircase {

	public static void main(String[] args) {
		int n=6;
	/*	StringBuilder sb=new StringBuilder();
		for(int i=0; i<n; i++)
			sb.append(" ");
			int j=0;
			
			for(int i=1; i<=n; i++) {
				sb.replace(sb.length()-i,sb.length()-j,"#");
				System.out.println(sb);
				j++;
			}                     */
		char[] arr=new char[n];
		Arrays.fill(arr,' ');
		int i=0;
		for( i=1; i<=n; i++) {
			arr[n-i]='#';
			System.out.println(arr);
		}
	}

}
