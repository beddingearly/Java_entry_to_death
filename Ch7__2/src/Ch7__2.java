class Student{
	private String name;
	private String address;
	private int age;
	private int counter = 0; 
	public Student increment(){
		counter++;
		return this;
	}
	public Student decrement(){
		counter--;
		return this;
	}
	public int getAge(){
		return age;
	}
}
public class Ch7__2 {

	public static void main(String[] args) {
		

	}

}
