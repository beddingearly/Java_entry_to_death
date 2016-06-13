class UserException extends Exception{
	private static final long serialVersionUID = 1L;
	private int data;
	public UserException(int data){
		this.data = data;
	}
}
public class Ch10_2_3 {

	public static void main(String[] args) {
		try{
			int i;
			for(i = 0; i < 10; i++){
				if(i == 5){
					throw new UserException(5);
				}
				System.out.println("count: "+i);
			}
		}
		catch(UserException e){
			System.out.println(e.getMessage());
			System.out.println("result: ");
			e.printStackTrace();
		}
		finally{
			System.out.println("end");
		}
	}

}
