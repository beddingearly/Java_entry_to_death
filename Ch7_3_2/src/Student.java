
public class Student {
	private String name;
	private String address;
	private int age;
	public void printNameCard(){
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println();
	}
	public void setName(String n){name = n;}
	public void setAddress(String a){address = a;}
	public void setAge(int aa){age = aa;}
	public String getName(){return name;}
	public String getAddress(){return address;}
	public int getAge(){return age;}
	
}
