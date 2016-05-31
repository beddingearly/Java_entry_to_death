
public class Ch5_2_2 {
	static void convertTemp(double c){
		double f;
		System.out.println("C/F");
		f = (9 * c) / 5.0 + 32.0;
		System.out.println(c+"\t"+f);
	}
	
	static void sumN2N(int start, int end){
		int i, sum = 0;
		for(i = start; i <= end; i++){
			System.out.println("|"+i);
			sum += i;
		}
		System.out.println("\n"+start+"to"+end);
		System.out.println("sum = "+sum);
		
	}
	
	public static void main(String[] args) {
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		System.out.println("input C:");
		double c = sc.nextDouble();
		System.out.print("max = ");
		int max = sc.nextInt();
		convertTemp(c);
		sumN2N(1,max);
		Ch5_2_2.sumN2N(6, 10);

	}

}
