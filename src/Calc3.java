import java.util.Scanner;

public class Calc3 {
	//변수선언
	private		int num1,num2;
	private		char ch;
	private     double result; 
	private		char ans;
			
	public Calc3() {
		
	}
	public Calc3(int n1,char c,int n2) {
		num1 = n1;
		ch = c;
		num2 = n2; 
	}
	
	public void setNum1(int n) {
		num1 = n;
	}
	public void setNum2(int n) {
		num2 = n;
	}
	public void setCh(char c) {
		ch = c; 
	}
	
	public int getNum1() {
		return num1; 
	}
	public int getNum2() {
		return num2;
	}
	public char getCh() {
		return ch;
	}
	
	public double plus(int n1,int n2) {
		return result = n1+n2; 
	}
	
	public double sub(int n1,int n2) {
		return result = n1-n2; 
	}
	
	public double div(int n1,int n2) {
		return result = n1/n2; 
	}
	
	public double mul(int n1,int n2) {
		return result = n1*n2; 
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Calc3 calc = new Calc3();
		
		int num = sc.nextInt();
		//calc.setNum1(num);
	//	calc.setNum1(sc.nextInt());
		char ch = sc.next().charAt(0);	//	calc.setCh(ch);
		int num2 = sc.nextInt();
	//	calc.setNum2(num2);
		
		Calc3 calc = new Calc3(num,ch,num2);
		
		System.out.println(calc.getNum1()+""+calc.getCh()+""+calc.getNum2()+"=");
		
		switch (ch) { 
		case '+': System.out.println(calc.plus(num, num2)); break ;
		case '-': System.out.println(calc.sub(num, num2)); break ;
		case '/': System.out.println(calc.div(num, num2)); break ;
		case '*': System.out.println(calc.mul(num, num2)); break ;
		
		}
		

	
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public char getAns() {
		return ans;
	}
	public void setAns(char ans) {
		this.ans = ans;
	}
	

}