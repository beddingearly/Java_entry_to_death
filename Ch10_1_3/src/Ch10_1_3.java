
public class Ch10_1_3 {

	public static void main(String[] args) {
		try{
			for(int i = 2; i > -1; i--){
				System.out.println(10 / i);
			}
		}
		catch(ArithmeticException e){
			System.out.println("wrong "+e.getMessage());
			System.out.println("wrong reason ");
			e.printStackTrace();
		}
		finally{
			System.out.println("end");
		}
		System.out.println("Java end");
	}

}
