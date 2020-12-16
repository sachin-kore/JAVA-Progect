package student;

public class Tohexa {
	  char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
	    
	    public String toHex(int num) {
	        if(num == 0) return "0";
	        String result = "";
	        while(num != 0){
	            result = map[(num & 15)] + result; 
	            num = (num >>> 4);
	        }
	        return result;
	    }

	public static void main(String[] args) {
		int n=-1;
		Tohexa t=new Tohexa();
		System.out.println(t.toHex(n));
	}

}
