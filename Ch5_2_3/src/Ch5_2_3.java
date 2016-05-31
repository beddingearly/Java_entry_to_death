
public class Ch5_2_3 {
	static double convertTemp(double c){
		double f;
		f = (9.0 * c) / 5.0 + 32.0;
		return f;
	}
	static int sumN2N(int max){
		int sum = 0;
		for(int i = 1; i <= max; i++){
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		System.out.print("C = ");
		double c = sc.nextDouble();
		double f = Ch5_2_3.convertTemp(c);
		System.out.print("max = ");
		int max = sc.nextInt();
		max = sumN2N(max);
		System.out.println("sum of 1 to 15:");
		System.out.println(max);
	}

}
