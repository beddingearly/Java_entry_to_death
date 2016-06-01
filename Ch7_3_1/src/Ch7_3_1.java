public class Ch7_3_1 {
	public static void main(String[] args) {
		Student joe, jane, current, empty;
		joe = new Student();
		jane = new Student();
		current = joe;
		empty = null;
		joe.name = "ABC";
		joe.age = 37;
		joe.address = "abc";
		jane.name = "DEF";
		jane.age = 38;
		jane.address = "def";
		joe.printNameCard();
		jane.printNameCard();
		current.printNameCard();

	}

}
