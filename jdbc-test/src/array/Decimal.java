package array;

public class Decimal {

	public int search(int[] nums, int target) {
		if(nums.length==0) return -1;
		int left=0;
		int right=nums.length-1;
		while(left<=right){
			int middle=left+(right-left)/2;
			if(nums[middle]==target){
				return middle;
			}
			else if(nums[middle]>target){
				right=middle-1;
			}
			else{
				left=middle+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
        int[] num= {-1,0,3,5,9,12};
        int t=9;
        Decimal d=new Decimal();
        System.out.println(d.search(num, t));
	}
}





