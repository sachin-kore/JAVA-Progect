package student;

public class Print {

	public static void main(String[] args) {
		String data ="A20B3C12";
		char[] arr = data.toCharArray();
		String tmpStr = "";
		String tmpNum = "";
		for (int i = 0; i < arr.length; i++) {
			try{
				Integer.parseInt(arr[i]+"");
				System.out.print(arr[i]);
				tmpNum = tmpNum+arr[i];
			}catch(Exception e){
				if(!(tmpStr.equals("") || tmpNum.equals(""))){
					for(int j=0;j<Integer.parseInt(tmpNum);j++){
						System.out.print(tmpStr);
					}
					tmpStr = "";
					tmpNum = "";
				}
				tmpStr = tmpStr+arr[i];
			}
			if(i==arr.length-1){
				for(int j=0;j<Integer.parseInt(tmpNum);j++){
					System.out.print(tmpStr);
				}
			}
		}
	}
}
