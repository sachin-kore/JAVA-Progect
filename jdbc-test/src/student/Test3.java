package student;

import java.util.Arrays;

public class Test3 {
	   // private Object sb;
		public void largestNumber(int[] nums) {
	        int len=nums.length;
	        String[] s=new String[len];
	        for(int i=0; i<len; i++)
	            s[i]=(String.valueOf(nums[i]));
	            Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
	            StringBuilder sb=new StringBuilder();
	            for(String str:s)
	                sb.append(str);
	            String result="";
		System.out.println(result=sb.toString());
	      System.out.println( result.startsWith("0")? "0":result);
	    }
	public static void main(String[] args) {
		int[] num= {10,2};
	    Test3 t= new Test3();
	    t.largestNumber(num);
	} 
} 
