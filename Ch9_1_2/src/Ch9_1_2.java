class Payment{
	private String payNo;
	private double amount;
	class Card{
		public String type;
		public String number;
		public void printCard(){
			System.out.println(getNo());
			System.out.println(amount);
			System.out.println(type);
			System.out.println(number);
		}
	}
	public Payment(String payNo, double amount){
		this.payNo = payNo;
		this.amount = amount;	
	}
	private String getNo(){return payNo;}
}
public class Ch9_1_2 {

	public static void main(String[] args) {
		Payment P1 = new Payment("pay002", 5600.0);
		Payment.Card master = P1.new Card();
		master.type = "ABCDEF";
		master.number = "1234555556";
		//P1.amount = 123.00;
		master.printCard();
		master.printCard();
		Payment.Card slave = P1.new Card();
	}

}
