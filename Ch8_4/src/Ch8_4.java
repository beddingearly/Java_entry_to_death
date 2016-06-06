abstract class Account{
	public String accountid;
	private double amount;
	public double interest;
	public abstract void callInterest();
	public void setBalance(double a){amount = a;}
	public double getBalance(){return amount;}
}
class SavingAccount extends Account{
	public boolean haveCard;
	public SavingAccount(String id, double amount, double interest, boolean haveCard){
		accountid = id;
		setBalance(amount);
		this.interest = interest;
		this.haveCard = haveCard;	
	}
	public void callInterest(){
		double  amount = getBalance();
		System.out.println(amount * interest);
	}
	public void printAccount(){
		System.out.println(accountid);
		//System.out.println(amount);
		System.out.println(interest);
		System.out.println(haveCard);
		
	}
	public void printNULL(){
		System.out.println();
	}
}
public class Ch8_4 {

	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount("456", 15000.00, 0.02, false);
		Account s2 = new SavingAccount("123", 5000.00, 0.015, true);
		
		s1.printAccount();
		//s2.printAccount();
		s2.callInterest();
		s1.callInterest();
		//s2.printNULL();
		s1.printNULL();
	}

}
