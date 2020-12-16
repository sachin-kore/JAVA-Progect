package array;

public class Binary {
	
	public String reverseOnlyLetters(String S) {
		char[] character=S.toCharArray();
		int i=0;
		int j=S.length()-1;
		while(i<j) {
			while(i<j && !Character.isLetter(S.charAt(i))) {
				i++;
			}
			while(j>i && !Character.isLetter(S.charAt(j))) {
				j--;
			}
			char temp=character[i];
			character[i++]=character[j];
			character[j--]=temp;
		}
		return new String(character);
		
		
	}
	public static void main(String[] args) {
		String str="sa_c_hi_n";
		Binary b=new Binary();
		System.out.println(b.reverseOnlyLetters(str));
	}

}
