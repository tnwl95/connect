
public class ClassExam02 {

	private int a;

	public ClassExam02() { // 디폴트생성자
		System.out.println("디폴트생성자");
	}

	public ClassExam02(int aa) { // 디폴트생성자
		a = aa;
	}

	//method : setter(외부에서 주는 데이터를 입력하는 함수), getter(외부에서 필드값을 얻어가는 함수) 
	
	public void setA(int num) {
		a = num;
	}
	
	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {
		
	
	ClassExam02 ce2 = new ClassExam02(); // 생성자호출

	ClassExam02 ce3 = new ClassExam02(10); // 생성자호출

	ClassExam02 ce4 = new ClassExam02(5600); // 생성자호출
	
	ce2.setA(500); //ce.a = 500; 직접접근x
	System.out.println(ce2.getA());
	System.out.println(ce3.getA());
	System.out.println(ce4.getA());
	}

}

