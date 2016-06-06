abstract class Shape{
	public double x;
	public double y;
	public abstract void area();
}
class Circle extends Shape{
	private double r;
	public Circle(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void area(){
		System.out.println(3.1415926 * r * r);
	}
}
class Rectangle extends Shape{
	private double width;
	private double height;
	public Rectangle(double x, double y, double w, double h){
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	public void area(){
		System.out.println(height * width);
	}
}
class Triangle extends Shape{
	private double height;
	private double bottom;
	public Triangle(double x, double y, double h, double b){
		this.x = x;
		this.y = y;
		height = h;
		bottom = b;
	}
	public void area(){
		System.out.println(height * bottom / 2);
	}
	
}

public class Ch9_4_1 {

	public static void main(String[] args) {
		Shape s;
		Circle c = new Circle(5.0, 10.0, 5.0);
		Rectangle r = new Rectangle(10.0, 10.0, 15.0, 15.0);
		Triangle t = new Triangle(10.0, 10.0, 20.0, 5.0);
		s = c;
		s.area();
		s = r;
		s.area();
		s = t;
		s.area();

	}

}
