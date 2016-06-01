
public class Student {
	private String name;
	private String address;
	private int age;
	
	public Student(String a, String b, int c){
		name = a;
		address = b;
		age = c;
		
	};
	public Student(String a, String b){
		name = a;
		address = b;
		age = 13;
	}
	
	public void printNameCard(){
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		
	}
	public String name(){return name;};
	public String address(){return address;};
	public int age(){return age;};
	
	
}
