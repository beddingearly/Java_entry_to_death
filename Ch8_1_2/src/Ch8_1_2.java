class Person{
	private int id;
	private String name;
	private double height;
	
	public void setId(int id){this.id = id;}
	public void setName(String name){this.name = name;}
	public void setHeight(double height){this.height = height;}

	public void personInfo(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(height);
	}

}

class Student extends Person{
	private int grade;
	public Student(int id, String n, double h, int grade){
		setId(id);
		setName(n);
		setHeight(h);
		this.grade = grade;
	}
	public void studentInfo(){
		personInfo();
		System.out.println(grade);
	}
}


public class Ch8_1_2 {

	public static void main(String[] args) {
		Student joe = new Student(123, "ABC", 175.0, 85);
		Student jane = new Student(456, "abc", 150.0, 65);
		
		joe.studentInfo();
		jane.studentInfo();

	}

}
