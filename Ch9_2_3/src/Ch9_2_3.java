interface IValue{
	int value();
}
class MyValue{
	private int v = 50;
	public IValue getIValueObject(){
		final int v2 = 10;
		IValue temp = new IValue(){
			private int v = 20;
			public int value(){
				int v = 30;
				return MyValue.this.v + this.v + v + v2;
			}
		};
		return temp;
	}
}
public class Ch9_2_3 {

	public static void main(String[] args) {
		MyValue mv = new MyValue();
		IValue c = mv.getIValueObject();
		System.out.println(c.value());
	}
}
