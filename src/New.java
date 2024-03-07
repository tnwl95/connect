public class New {

	private int a;

	public New() { // 디폴트생성자

		System.out.println("디폴트생성자");

	}

	public New(int aa) { // 디폴트생성자

		a = aa;

	}

	public static void main(String[] args) {

		New ce2 = new New(); // 생성자호출

		New ce3 = new New(10); // 생성자호출

		New ce4 = new New(5600); // 생성자호출

		System.out.println(ce2.a);

		System.out.println(ce3.a);

		System.out.println(ce4.a);

	}
}
