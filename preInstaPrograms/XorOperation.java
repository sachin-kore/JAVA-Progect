package preInstaPrograms;

public class XorOperation {
	
	public int xorOperation(int n, int start) {
		if(n==0) return start;
		
		int[] nums=new int[n];
		int res=0;
		for(int i=0; i<n; i++) {
			nums[i]=start+2*i;
			res=res^nums[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
       int n=5;
       int start=0;
       XorOperation x=new XorOperation();
       System.out.println(x.xorOperation(n, start));
	}

}

