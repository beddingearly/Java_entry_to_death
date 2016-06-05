interface IArea{
	final double PI = 3.1415926;
	void area();
}

class Circle implements IArea{
	public double x;
	public double y;
	private double r;
	
	public Circle(double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void area(){
		System.out.println(PI * r * r);
	}
}
public class Ch8_2_2 {

	public static void main(String[] args) {
		Circle c= new Circle(16.0, 15.0, 15.0);
		c.area();
		System.out.println(IArea.PI);

	}

}
