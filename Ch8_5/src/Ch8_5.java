abstract class Shape{
	public double x;
	public double y;
	public abstract void area();
}
interface IPerimeter{
	void perimeter();
}
class Rectangle extends Shape implements IPerimeter{
	public double width;
	public double height;
	public Rectangle(double x, double y, double w, double h){
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}
	public void area(){
		System.out.println(width * height);
	}
	public void perimeter(){
		System.out.println(2 * (width * height));
	}
	
}
public class Ch8_5 {

	public static void main(String[] args) {
		Shape s;
		Rectangle r;
		Rectangle r1 = new Rectangle(5.0, 15.0, 6.0, 5.0);
		Shape r2 = new Rectangle(10.0, 10.0, 8.0, 9.0);
		IPerimeter r3 = new Rectangle(15.0, 15.0, 4.0, 8.0);
		r = (Rectangle)r3;
		r.perimeter();
		//r3.width = 3;
		//r3.area();
		r.x = 1;
		r.width = 2;
	}

}
