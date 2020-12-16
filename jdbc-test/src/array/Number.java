package array;

public class Number {

	public static void main(String[] args) {
		String str="Atomation";
		//String str1="";
		int len=str.length();
		/*StringBuilder str1=new StringBuilder();
		str1.append(str);
		System.out.println(str1);
		str1=str1.reverse();
		/*for(int i=len-1; i>=0; i--) {
			str1=str1+str.charAt(i);
		}*/
		//System.out.println(str1);  
		char chars[]=str.toCharArray();
	    for(int i=chars.length-1; i>=0; i--) {
	    	System.out.print(chars[i]);
	    }
		
		
	}

}
