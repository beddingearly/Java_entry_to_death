
public class Student {
	private String name;
	private String address;
	private int age;
	
	public void printNameCard(){
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);	
	}
	
	public void setName(String n){name = n;};
	public void setAddress(String m){address = m;};
	public boolean setAge(int b){
		if(validAge(b)){
			age = b;
			return true;
		}
		else
			return false;
	};
	private boolean validAge(int v){
		if(v < 0 || v > 100){
			return false;
		}
		else
			return true;
		
	}
	
	public String getName(){return name;};
	public String getAddress(){return address;}
	public int getAge(){return age;}
	
	
}
