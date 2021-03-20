package preInstaPrograms;

import java.util.Scanner;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		//int count=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("enter string:-");
       String str=sc.next();
      // str=str.toLowerCase();
       str=str.replaceAll("[^a-zA-Z]","");
       System.out.print(str);
       sc.close();
	}

}
