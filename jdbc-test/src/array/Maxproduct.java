package array;

public class Maxproduct {
      
	 public int maxProduct(int[] nums) {
		    int m=Integer.MIN_VALUE,n=m;
		        for(int i:nums){
		            if(i>=m){
		                n=m;
		                m=i;
		            }
		            else if(i>n){
		                n=i;
		            }
		        }
		        return (m-1)*(n-1);
	 }
	
	public static void main(String[] args) {
		int[] num= {3,4,5,2};
		Maxproduct m=new Maxproduct();
		System.out.println(m.maxProduct(num));
	}

}
