
public class Ch4_5 {

	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++)
			System.out.print("\t"+i);
		System.out.println();
		
			for(int a = 1; a <= 9; a++){
				System.out.print(a+" ");
				for(int b = 1; b <= 9; b++){
					System.out.print("\t"+a+"*"+b+"="+a*b);
				}
				System.out.println();
			}
		
	}

}
