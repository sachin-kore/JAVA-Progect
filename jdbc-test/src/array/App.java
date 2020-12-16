package array;
import java.util.*;


public class App{
	public int removeElement(int[] nums, int val) {
        int len=nums.length-1;
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i:nums){
            arr.add(i);
        if(i==val){
            arr.remove(i);
        }
        }
        return len; 
        }
              
	public static void main(String[] args) {
		int[] num= {3,2,2,3};
		int val=2;
		App a=new App();
		System.out.println(a.removeElement(num, val));
	}
}
