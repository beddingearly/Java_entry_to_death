
public class Ch10_2_2 {
	static int cal(int a, int b, int c)throws IllegalArgumentException, 
					ArrayIndexOutOfBoundsException{
			int index;
			int data[] = {22, 14, 36, 68, 87};
			if(c <= 0){
				System.out.println(c);
				throw new IllegalArgumentException("c < 0");
			}
			else{
				index = a * b / c;
				if(index >= 5){
					System.out.println(index);
					throw new ArrayIndexOutOfBoundsException("index >= 5");
				}
			}
	return data[index];
	}
	
	public static void main(String[] args) {
		int result;
		try{
			int a = (int)(Math.random() * 10);
			int b = (int)(Math.random() * 10);
			int c = (int)(Math.random() * 10);
			result = cal(a, b, c);
			System.out.println(result);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			System.out.println("result: ");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
