
public class Date {
	private int day;
	private int month;
	private int year;
	
	public void setDate(int a, int b, int c){
		day = a;
		month = b;
		year = c;
		
	};
	public void setDate(int a, int b){
		day = a;
		month = b;
		year = 1234;
	};
	public void printDate(){
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		
	};

}
