package Test.overloading;

public class OverloadingTest {
	public int calc(int n1, int n2) { // 메소드 선언
		return n1 * n2;
	}
	public int calc(int n1, int n2, int n3) { //메소드 선언22
		return n1 + n2 + n3;
	}

	public static void main(String[] args) {
		OverloadingTest ot = new OverloadingTest(); //참조변수 생성
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		System.out.println(n1 + "X" + n2 +" = "+ ot.calc(n1, n2));
		System.out.println(n1 + "+" + n2 +"+" +n3+" = "+ ot.calc(n1, n2, n3));

	}

}	//책 보면서 하셈
