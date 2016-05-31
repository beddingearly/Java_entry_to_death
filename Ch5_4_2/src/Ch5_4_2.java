
public class Ch5_4_2 {

	static int f(int i){
		if(i == 1)
			return 1;
		else
			return i * f(i-1);
	}
	public static void main(String[] args) {
		System.out.println("input: ");
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		int j = sc.nextInt();
		System.out.println("output:"+f(j));
	}

}
