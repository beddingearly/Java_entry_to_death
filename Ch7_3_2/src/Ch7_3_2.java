
public class Ch7_3_2 {
//·ÃÎÊÆ÷·½·¨
	public static void main(String[] args) {
		Student joe = new Student();
		Student jane = new Student();
		
		joe.setName("ABC");
		jane.setName("DEF");
		joe.setAddress("abc");
		jane.setAddress("def");
		joe.setAge(11);
		jane.setAge(22);
		joe.printNameCard();
		jane.printNameCard();
		
		int age = jane.getAge();
		String address = jane.getAddress();
		String name = jane.getName();
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		
		
	}

}
