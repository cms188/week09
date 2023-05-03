package Test.overloading;

public class OverloadingTest2 {

	public int Calc(int n1, int n2) {
		return n1 * n2;
	}
	public double Calc(double n1, double n2) {
		return n1 + n2;
	}
	public static void main(String[] args) {
		
		OverloadingTest2 ot2 = new OverloadingTest2();
		
		System.out.println("calc(10, 20)의 결과 : "+ ot2.Calc(10, 20));	//메소드의 인수가 다른 것 뿐아니라 인수의 타입만 달라도
		
		System.out.println("calc(10, 20)의 결과 : "+ ot2.Calc(50.0, 20.5));	//오버로딩 할 수 있다.
		
		
		System.out.println("calc(10, 20)의 결과 : "+ ot2.Calc(50, 20.5));	//정수값과 실수값이 같이있으면 double형을 호출함
	}

}
