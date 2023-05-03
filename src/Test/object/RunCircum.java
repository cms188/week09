package Test.object;

public class RunCircum {

	public static void main(String[] args) {
		Circle c1 = new Circle(); //클래스 c1 생성
		Circle c2 = new Circle();//클래스 c2 생성
		
		c1.setR(5); //반지름이 5인 원
		c2.setR(12); //반지름이 12인 원
		
		c1.calCircum();
		c1.calcArea();
		
		c2.calCircum();
		c2.calcArea();
		
		printCircle(c1);
		printCircle(c2);
		
	}
	
	public static void printCircle(Circle c) { //얘를 static영역에 넣어도 가능함
		System.out.println("===========================================");
		System.out.println("* 원의 반지름이 "+c.getR()+"cm인 원의 둘레: " + c.getCircum()+ "㎝");
		System.out.println("* 원의 반지름이 "+c.getR()+"cm인 원의 면적: " + c.getArea()+ "㎠");
//		System.out.printf("* 반지름이 %d㎝ 인 원의 둘레: %.3f㎝\n", c.getR(), c.getCircum());
//		System.out.printf("* 반지름이 %d㎝ 인 원의 면적: %.3f㎠\n", c.getR(), c.getArea());
	}

}
