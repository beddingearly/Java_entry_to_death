class Person{
	public String name;
	public String address;
	public final String getName(){return name;}
	public final String getAddress(){return address;}
	public final void setName(String name){this.name = name;}
	public final void setAddress(String address){this.address = address;}
}
final class Customer extends Person{
	public String shippingAddress;
	public Customer(String n, String a, String shipping){
		setName(n);
		setAddress(a);
		shippingAddress = shipping;
	}
	public void customerInfo(){
		
	}
}

public class Ch8_6 {

	public static void main(String[] args) {
		Customer joe = new Customer("ABC", "DEF", "GHI");
		//String a = joe.getname()
		joe.customerInfo();

	}

}
