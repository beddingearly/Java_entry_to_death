class Person{
	private int id;
	private String name;
	private double height;
	public static void  printName(){
		System.out.println("Persion");
	}
	public int getId(){return id;}
	public String getName(){return name;}
	public double getHeight(){return height;}
	
	public void setId(int id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setHeight(double height){this.height = height;}
	
	/*public Person(int id, String name, double height){
		this.id = id;
		this.name = name;
		this.height = height;
	}*/
	public void printPeison(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(height);
	}
	public Person(){}
}
class Student extends Person{
	private int grade;
	public Student(int id, String name, double height,int grade){
		setId(id);
		setName(name);
		setHeight(height);
		this.grade = grade;
	}
	public void printPeison(){
		System.out.println(getId());
		System.out.println(getName());
		System.out.println(getHeight());
		System.out.println(grade);
	}
}
public class Ch8_1_3 {

	public static void main(String[] args) {
		Student joe = new Student(1, "ABC", 185.0, 55);
		joe.printPeison();
		joe.printPeison();
		

	}

}
