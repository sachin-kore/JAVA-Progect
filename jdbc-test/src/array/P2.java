package array;

public class P2 {
	public static boolean powerOf5(int n){ 

		if(n == 0){ 
			return false; 
		}
		int m=0;
		while(m>=0) {
			if(Math.pow(5, m)==n){ 
				return true;
			}else{ 
				return false;
			}
		}
		return true;
	}  
	public static void main(String[] args) {
		System.out.println(P2.powerOf5(31));

	}

}
