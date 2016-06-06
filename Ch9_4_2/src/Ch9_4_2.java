interface IArea{
	void area();
}
class Circle implements IArea{
	private double r;
	public Circle(double r){
		this.r = r;
	}
	public void area(){
		System.out.println(r * r * 3.14);
	}
}
class Rectangle implements IArea{
	private double height;
	private double width;
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	public void area(){
		System.out.println(width * height);
	}
}
public class Ch9_4_2 {

	public static void main(String[] args) {
		IArea a;
		Circle c = new Circle(6.0);
		Rectangle r = new Rectangle(10.0, 15.0);
		a = c;
		a.area();
		a = r;
		a.area();

	}
}
