package preInstaPrograms;

import java.util.Arrays;

public class AvarageSalaryExludingMaxAndMin {
	
	 public double average(int[] salary) {
		 Arrays.sort(salary);
		 double sum=0,c=0;
		 for(int i=1; i<=salary.length-2; i++) {
			 sum=sum+salary[i];
			 c++;
		 }
		 double s=sum/c;
		return s;
	 }

	public static void main(String[] args) {
        int[] arr= {6000,5000,4000,3000,2000,1000};
        AvarageSalaryExludingMaxAndMin a=new AvarageSalaryExludingMaxAndMin();
        System.out.println(a.average(arr));
	}

}
