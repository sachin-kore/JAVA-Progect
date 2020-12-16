package array;

class A {
	public int i1 = 1;
	protected int i2 = 2;
}
class B extends A {
	public void print() {
		B obj = new B();
		System.out.println(obj.i1); //Line 8
		System.out.println(obj.i2); //Line 9
		System.out.println(this.i2); //Line 10
		System.out.println(super.i2); //Line 11
	}

	public static void main(String [] args) {
		new B().print();
	}
}
