
public class Ch7_3_4 {

	public static void main(String[] args) {
		Date mydate = new Date();
		Date yourdate = new Date();
		
		mydate.setDate(1, 2, 3);
		yourdate.setDate(4,5);
		
		mydate.printDate();
		yourdate.printDate();

	}

}
