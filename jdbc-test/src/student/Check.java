package student;

public class Check {
	public int singleNumber(int[] nums) {
		int result=0;
		int len=nums.length;
		for(int i=0; i<len; i++) {
			for(int j=1; j<len; j++) {
				if(nums[i]!=nums[j]) {
					result=nums[i];
				}
			}
		}
		return result;	
	}
	public static void main(String[] args) {
		int[] arr= {4,1,2,1,2};
		Check c=new Check();
		System.out.println(c.singleNumber(arr));

	}

}
