
public class Ch4_4_2 {

	public static void main(String[] args) {
		System.out.print("ÇëÊäÈëÒ»¸ö½×³Ë£º");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		int i = 1, j, sum;
		while(i <= num){
			sum = 1;
			j = 1;
			while(j <= i){
				sum *= j;
				j++;
			}
			System.out.println(i+"! = "+sum);
			i++;
		}

	}

}
