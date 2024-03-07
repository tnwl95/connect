import java.util.Scanner;



public class Star {



	public static void main(String[] args) {



		int num;



		Scanner sc = new Scanner(System.in);



		// 입력함수호출



		num = inputInt(sc);



		// 출력함수호출



		if (num == 1) {

			Star.disp1();

		} else if (num == 2) {

			Star.disp2();

		} else if (num == 3) {

			Star.disp3();

		} else if (num == 4) {

			Star.disp4();

		} else if (num == 5) {

			Star.disp5();

		} else {

			Star.disp6();

		}

	}

	//입력함수

	public static int inputInt(Scanner sc) {

		int num = sc.nextInt();

		return num;

	}

	//출력함수

	public static void disp1() {

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}



	public static void disp2() {



		for (int i = 1; i <= 3; i++) {

			for (int j = 0; j < i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}



	public static void disp3() {

		for (int i = 1; i <= 3; i++) {

			for (int j = 3; j > 0; j--) {

				if (i < j) {

					System.out.print(" ");

				} else {

					System.out.print("*");

				}

			}

			System.out.println();

		}

	}



	public static void disp4() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3 - i; j++) {

				System.out.print(" ");

			}

			for (int j = 0; j < 2 * i + 1; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

	}



	public static void disp5() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if (i <= 5 / 2) {

					if (i + j <= 5 / 2 - 1)

						System.out.print(" ");

					else if (j - i >= 5 / 2 + 1)

						System.out.print(" ");

					else

						System.out.print("*");

				} else if (i > 5 / 2) {

					if (i - j >= 5 / 2 + 1)

						System.out.print(" ");

					else if (i + j >= 5 / 2 * 3 + 1)

						System.out.print(" ");

					else

						System.out.print("*");

				}

			}

			System.out.println();

		}

	}



	public static void disp6() {

		System.out.println("홀수를 입력해주세요");



		Scanner sc;

		sc = new Scanner(System.in);



		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 0; j < num; j++) {

				if (i <= num / 2) {

					if (i + j <= num / 2 - 1)

						System.out.print(" ");

					else if (j - i >= num / 2 + 1)

						System.out.print(" ");

					else

						System.out.print("*");

				} else if (i > num / 2) {

					if (i - j >= num / 2 + 1)

						System.out.print(" ");

					else if (i + j >= num / 2 * 3 + 1)

						System.out.print(" ");

					else

						System.out.print("*");

				}

			}

			System.out.println();

		}

	}

}

