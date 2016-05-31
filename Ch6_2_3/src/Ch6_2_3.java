
public class Ch6_2_3 {
	public static double sum(double...numbers){
		double total = 0.0;
		int count = numbers.length;
		for(int i = 0; i < count; i++){
			total += numbers[i];
			
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum1 = sum(20.0, 30.0, 40,0);
		double sum2 = sum(2.0, 3.0, 4.0);
		System.out.println(sum1+"\n"+sum2);

	}

}
