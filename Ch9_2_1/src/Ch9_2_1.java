class MyNumber{
	public String result;
	public MyNumber(){
		MyInt myInt = new MyInt(100){public String getResult(){return "INT"+value;} };
			//	System.out.println("INT"+value);
		
		result = myInt.getResult();
		
	}
	class MyInt{
		public int value;
		public MyInt(int v){value = v;}//System.out.println("int"+value);}
		public String getResult(){return "int"+value;}
		
	}
}
public class Ch9_2_1 {

	public static void main(String[] args) {
		String str = "";
		MyNumber myNum = new MyNumber();
		str = myNum.result;
		System.out.println(str);

	}

}
