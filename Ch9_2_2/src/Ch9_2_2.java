interface IValue{
	int value();
}
class MyValue{
	public IValue getIValueObject(){
		IValue temp = new IValue(){
			private int v =50;
			public int value(){
				return v;
			}
		};
		return temp;
	}
}
public class Ch9_2_2 {

	public static void main(String[] args) {
		MyValue mv = new MyValue();
		IValue c = mv.getIValueObject();
		System.out.println(c.value());

	}

}
