interface IArea{
	void area();
}
interface IShow{
	void show();
}
interface IShape extends IArea, IShow{
	void perimeter();
}
class Circle implements IShape{
	public double x;
	public double y;
	private double r;
	public Circle(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void area(){
		System.out.println(r * r * 3.1415926);
	}
	public void show(){
		System.out.println(x+" "+y+" "+r);
	}
	public void perimeter(){
		System.out.println(2.0 * 3.1415926 * r);
	}
	
}
public class Ch8_3_1 {

	public static void main(String[] args) {
		Circle c = new Circle(16.0, 15.0, 16.0);
		c.area();
		c.perimeter();
		c.show();

	}

}
