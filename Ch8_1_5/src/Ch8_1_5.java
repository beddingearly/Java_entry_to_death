class Person{
	public static int count = 0;
	public int id;
	public String name;
	public Person(int id, String name){
		this.id = id;
		this.name = name;
		count++;
	}
	public void personInfo(){
		System.out.println("=========");
		System.out.println(id);
		System.out.println(name);
		System.out.println("=========");
	}
}
class Student extends Person{
	private String id;
	private String name;
	private int grade;
	public Student(int id, String n, String no, int grade){
		super(id, n);
		name = "student";
		this.id = no;
		this.grade = grade;
	}
	public void personInfo(){
		super.personInfo();
		System.out.println(super.name);
		System.out.println(super.id);
		System.out.println(name);
		System.out.println(id);
		System.out.println(count);
		System.out.println(grade);
	}
}
public class Ch8_1_5 {

	public static void main(String[] args) {
		Student joe = new Student(123, "ABC", "S102", 85);
		Student jane = new Student(456, "DEF", "S103", 86);
		joe.personInfo();
		jane.personInfo();

	}

}
