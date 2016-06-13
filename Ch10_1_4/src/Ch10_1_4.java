
public class Ch10_1_4 {
	static void printErrMsg(Exception e){
		System.out.println("Wrong: "+e.getMessage());
		System.out.println("reason: ");
		e.printStackTrace();
	}
	public static void main(String[] args) {
		int data[] = {22, 14, 36, 68, 87};
		try{
			int index = (int)(Math.random() * 10);
			int i = data[index];
			for(i = 2; i > -1; i--){
				System.out.println("result: "+10 / i);
			}
		}
		catch(ArithmeticException e){
			printErrMsg(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			printErrMsg(e);
		}
		finally{
			System.out.println("end!");
		}
	}

}
