class Customer{
	private int id;
	private char rank;
	private Date birthday;
	public Customer(int id, char r, int m, int d, int y){
		this.id = id;
		rank = r;
		birthday = new Date(d, m, y);
	}
	public void printCustomer(){
		System.out.println(id);
		System.out.println(rank);
		birthday.printDate();
	}
}

class Date{
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void printDate(){
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
}

public class Ch7_5 {

	public static void main(String[] args) {
		Customer c1 = new Customer(1, 'L', 1, 15, 1967);
		Customer c2 = new Customer(2, 'H', 5, 25, 1978);
		c1.printCustomer();
		c2.printCustomer();
		

	}

}
