class Counter{
	private int count;
	
	public Counter(int count){
		this.count = count;
	};
	
	public Counter counter(double num){
		count += num;
		return this;
	};
	
	public Counter counter(int num){
		count += num;
		return this;
	};
	
	public int getCounter(){return count;};
};
public class Ch7_4_2 {
	
	public static void main(String[] args) {
		Counter c = new Counter(10);
		int counter = c.counter(2).getCounter();
		System.out.println(counter);
		

	}

}
