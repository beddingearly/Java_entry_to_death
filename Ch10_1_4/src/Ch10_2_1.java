
public class Ch10_2_1 {
	public static void main(String[] args){
		try{
			int index = (int)(Math.random() * 10);
			if(index < 10){
				throw new ArithmeticException("< 10");
			}
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			System.out.println("reason: ");
			e.printStackTrace();
		}
		finally{
			System.out.println(" End");
		}
	}
}
