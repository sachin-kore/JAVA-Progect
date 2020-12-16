package array;

public class Problem {
	public static boolean powerOf5(int n){ 
		double sum=0;
		if(n == 0){ 
			return false; 
		} 
			int i=0;
			sum=Math.pow(5, i);
			if(sum==n) 
				return true; 
			i++;
			return false;	
}
	public static void main(String[] args) {
		int num=25;
	
		System.out.println( Problem.powerOf5(num));
	}

}
