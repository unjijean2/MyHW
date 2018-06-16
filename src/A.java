public class A {
	public static void main(String[] args) {
		System.out.println("****************");

		B b = new B("B_Hello!");
		b.println();

		C c = new C("C_World!");
		b.show();

		System.out.println("****************");

		B bb = new B("B_devB");
		bb.println();
	}
}