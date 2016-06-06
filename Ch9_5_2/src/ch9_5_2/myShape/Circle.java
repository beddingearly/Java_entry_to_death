package ch9_5_2.myShape;

//import Shape;

public class Circle {
	private double r;
	private double x;
	private double y;
	public Circle(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void area(){
		System.out.println(3.1415926 * r * r);
	}
}
