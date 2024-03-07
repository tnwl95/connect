
import java.util.Scanner;

public class Cal {
	Scanner sc = new Scanner(System.in);

	static int getnum1(sc) {
		
		System.outprintln("첫번쪠 입력 값:");
		int num1 = scanner.nextInt();
		System.out.println(num1);
		return num1;		
	}


	public static void main(String[] args) {

		String op; // +-/*
		int num1, num2;
		double result = 0;

		// 입력기능수행. = 메소드
		// 메소드 호출

		num1 = Cal.inputInt(sc);

		op = Cal.inputString(sc);

		num2 = Cal.inputInt(sc);

		//
		// 연산함수호출
		switch (op) {
		case "+":
			result = Cal.add(num1, num2);
			break;
		case "-":
			result = Cal.sub(num1, num2);
			break;
		case "*":
			result = Cal.mul(num1, num2);
			break;
		case "/":
			result = Cal.div(num1, num2);
			break;

		}

		// 출력함수 호출
		Cal.disp(num1, op, num2, result);

	}

	private static void disp(int num1, String op, int num2, double result) {
		System.out.print(num1 + "" + op + "" + num2 + "=" + result);
		;

	}

	public static double div(int n1, int n2) {

		double result = (double) n1 / n2;

		return result;
	}

	public static int mul(int n1, int n2) {

		int result = n1 * n2;

		return result;
	}

	public static int sub(int n1, int n2) {

		int result = n1 - n2;

		return result;
	}

	public static int add(int n3, int n4) {

		int result = n3 + n4;

		return result;
	}

	public static int inputInt(Scanner sc) { // sc =
		int num = sc.nextInt();

		return num;
	}

	public static String inputString(Scanner sc) {
		String s = sc.next();
		return s;
	}
}
