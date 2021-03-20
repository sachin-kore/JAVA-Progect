package preInstaPrograms;

public class NivenNumber {

	static int nivenNumber(int n) {
		int c=n,d,sum=0,out;
			while(c>0) {
		        d=c%10;
				sum=sum+d;
				c=c/10;
			}
			if(n%sum==0) {
				out=n/sum;
				return out;
			}
			else {
				return 0;
			}
	}

	
	public static void main(String[] args) {
      int n1=126;
      System.out.println(NivenNumber.nivenNumber(n1));
	}

}
