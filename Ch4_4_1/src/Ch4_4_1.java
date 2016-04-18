
public class Ch4_4_1 {

	public static void main(String[] args) {
		System.out.println("请输入for循环的最大值： ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0, i, j;
		for(i = 1; i <= num; i++){
			System.out.print("|"+i);
			sum += i;
		}
		System.out.println();
		System.out.println("从小到"+num+"总和:"+sum);
		System.out.println("------------------");
		sum = 0;
		for(j = num; j >= 1; j--){
			System.out.print("|"+j);
			sum += j;
		}
		System.out.println();
		System.out.println("从"+num+"到小总和："+sum);
	}

}
