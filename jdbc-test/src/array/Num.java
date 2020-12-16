package array;

public class Num {
	
	public int addDigits(int num) {
        if(num==0) return 0;
		//return num%9!=0?num%9:9;
        int sum=0;
        String str=String.valueOf(num);
        for(int i=0; i<str.length(); i++) {
        	sum=sum+(str.charAt(i)-'0');
        }
         if(sum<10) {
        	 return sum;
         }
         else {
        	 return addDigits(sum);
         }
    } 

	public static void main(String[] args) {
       Num n=new Num();
       System.out.println(n.addDigits(11));
	}

}
