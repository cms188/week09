package Test.Constructor;

public class ConstructorTest1 {
	private int k;
	
//	생성자가 하나도 정의가 안되어 있으면 JAM이 실행할 때 기본생성자를 만들어서 사용함.	
//	public ConstructorTest1() {
//		
//	}	2) 이렇게 기본생성자를 맹글어놓으면 1번에서 기본생성자를 사용할수있음 
	
	public ConstructorTest1(int k) {
		this.k = k;
	}
	
	public static void main(String[] args) {
		ConstructorTest1 ct1 = new ConstructorTest1(100);
		ConstructorTest1 ct2 = new ConstructorTest1(500);
		//ConstructorTest1 ct3 = new ConstructorTest1();  // 1) 인수가 없는 기본생성자는 다른생성자가 정의되어 있으면 사용할수없음
		
		System.out.println("ct1이 참조하는 객체의 k필드의 값은 : "+ ct1.k);
		System.out.println("ct2이 참조하는 객체의 k필드의 값은 : "+ ct2.k);

	}

}
