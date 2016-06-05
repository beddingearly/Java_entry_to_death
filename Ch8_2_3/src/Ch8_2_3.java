interface IArea{
	void area();
}
interface IShow{
	void show();
}
class Circle implements IArea, IShow{
	public double x;
	public double y;
	public double r;
	public Circle(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void area(){
		System.out.println(3.1415926 * r * r);
	}
	public void show(){
		System.out.println(x+" "+y+" "+r);
	}
}
public class Ch8_2_3 {

	public static void main(String[] args) {
		Circle c = new Circle(16.0, 15.0, 15.0);
		c.area();
		c.show();
	}

}
