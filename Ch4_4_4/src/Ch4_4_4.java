//break is to jump out the loop
//continue is to run to the next loop
public class Ch4_4_4 {

	public static void main(String[] args) {
	java.util.Scanner sc = new java.util.Scanner(System.in);
	int num = 15, sum = 0;
	for(int i = 1; i <= num; i++){
		System.out.print("|"+i);
		sum += i;
	}
	System.out.println();
	System.out.println(sum);
	for(int j = 2; j < num; j++){
		if(j % 2 != 0)continue;
		System.out.print("|"+j);
	}

	}

}
