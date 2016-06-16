package homework2;

abstract class Measure{
	public final double PI = 3.14;
	public double x;
	public double y;
	public double z;
	public double height;
	public double weight;
	public abstract void circle(Shape s);
	public abstract void triangle(Shape s);
}

interface Shape{
	public void print();
}

class Area extends Measure{
	public Area(double x, double y, double z, double h, double w){
		this.x = x;
		this.y = y;
		this.z = z;
		height = h;
		weight = w;
	}	
	public void circle(Shape c){
		System.out.println("Circle's area : "+z*z*PI);
	}
	public void triangle(Shape c){
		System.out.println("Triangle's area : "+height*weight/2);
	}
}
class Perimeter extends Measure{
	public Perimeter(double x, double y, double z, double h, double w){
		this.x = x;
		this.y = y;
		this.z = z;
		height = h;
		weight = w;
	}
	public void circle(Shape c){
		System.out.println("Circle's perimeter : "+2*PI*z);
	}
	public void triangle(Shape t){
		System.out.println("Triangle's perimeter : "+(x+y+z));
	}
}
class Circle implements Shape{
	public void print(){
		System.out.println("This is Circle");
	}
}
class Triangle implements Shape{
	public void print(){
		System.out.println("This is Triangle");
	}

}

public class homework2 {

	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Measure a = new Area(5.0, 10.0, 5.0, 10.0, 5.0);
		Measure p = new Perimeter(5.0, 10.0, 5.0, 10.0, 5.0);
		c.print();
		a.circle(c);
		t.print();
		p.triangle(t);
		
	}
}
