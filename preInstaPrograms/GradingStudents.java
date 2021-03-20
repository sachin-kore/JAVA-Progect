package preInstaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
	
	 public static List<Integer> gradingStudents(List<Integer> grades) {
	/*	 for(int marks:grades) {
			 if(marks<33 || marks%5<=2) {
				 list.add(marks);
			 }
			 else if(marks%5>=3) {
				 int add=5-(marks%5);
				 list.add(marks+add);
			 }
		 }
		 return list;
	 }                                          */
		 List<Integer> list=new ArrayList<>();
		 for(int i=0; i<grades.size(); i++) {
			 if(grades.get(i)>=38) {
				 int remainder=grades.get(i)%5;
				 int least_multiple=grades.get(i)-remainder;
				 int upper_multiple=least_multiple+5;
				 int difference=upper_multiple-grades.get(i);
				 if(difference<3) {
					 list.add(upper_multiple);
				 }
				 else {
					 list.add(grades.get(i));
				 }
			 }
			 else {
				 list.add(grades.get(i));
			 }
		 }
		 return list;
	 }
	public static void main(String[] args) {
      List<Integer> listOfInteger = Arrays.asList(73,67,38,33); 
      System.out.println(GradingStudents.gradingStudents(listOfInteger));
	}

}
