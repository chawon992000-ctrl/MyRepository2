package mygit;

public class C {
	
	public static void main(String args[]) {
		System.out.println("Class C입니다.");
		System.out.println("Class C에 master 다녀감");
		System.out.println();

		A a = new A();
		B b = new B();
		a.myA();
		b.myB();
		
	}

}
