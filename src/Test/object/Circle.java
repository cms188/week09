package Test.object;

public class Circle {
	private int r;
	private double circum;
	private double area;
	
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	
	public void calCircum() {
		//원의 둘레를 계산하는 메소드
		circum = 2 * Math.PI * r;
	}
	public void calcArea() {
		//원의 면적을 계산하는 메소드
		area = Math.PI * r * r;	//r*r 은 Math.POW(r, 2) 로 사용할수있음.
	}
	
	
}
