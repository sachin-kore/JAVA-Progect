package preInstaPrograms;

public class TwoCatsAndMouseGame {
	
	 static String catAndMouse(int x, int y, int z) {
		 if(Math.abs(x-z)<Math.abs(y-z)) {
			 return "Cat A";
		 }
		 if(Math.abs(x-z)>Math.abs(y-z)) {
			 return "Cat B";
		 }
		 else {
			 return "Mouse C";
		 }
	 }

	public static void main(String[] args) {
        int a=1;
        int b=5;
        int c=4;
        System.out.println(TwoCatsAndMouseGame.catAndMouse(a, b, c)) ;
	}

}
