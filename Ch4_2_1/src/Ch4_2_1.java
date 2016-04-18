public class Ch4_2_1 {

	public static void main(String[] args) {
		int a = 6, b = 12;
		System.out.println("a = "+a+" b = "+b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = "+a+" b = "+b);
	}

}
