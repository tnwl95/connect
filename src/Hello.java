
public class Hello {

	public static void main(String []args) { //프로그램을 시작해주고 끝내줌.

		//datatype 변수명 ;
		// 변수명 = 값; ==(같다) =(대입 = 초기화)
		// 변수 - 지역변수 local variable : method안에 선언되어지는 변수
		                            // : 항상 꼭 초기화를 해야한다.
		
		int num; 
		num = 10;
		
		char ch = 'A'; // "" 문자열, ''문자
		
		System.out.println(num);
		 System.out.println((int)ch) ;
		
		 Hello hello; // hello는 레퍼런스 변수
		 hello = new Hello (); // 객체 생성
	}
}
