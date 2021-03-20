package preInstaPrograms;

public class CountApplesAndOranges {
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int[] arr1=new int[apples.length];
		int[] arr2=new int[oranges.length];
		int count1=0;
		int count2=0;
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=a+apples[i];
			if(arr1[i]>=s && arr1[i]<=t) {
				count1++;
			}
		}
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=b+oranges[i];
			if(arr2[i]>=s && arr2[i]<=t) {
				count2++;
			}
		}
		System.out.println(count1+" \n"+count2);
	}

	public static void main(String[] args) {
        int s=7,t=11,a=5,b=15;
        int[] arr1= {-2,2,1};
        int[] arr2= {5,-6,0};
        CountApplesAndOranges.countApplesAndOranges(s, t, a, b,arr1,arr2);
        
	}

}
