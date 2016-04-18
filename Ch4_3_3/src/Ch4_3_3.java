public class Ch4_3_3 {

	public static void main(String[] args) {
		java.util.Scanner sc = 
				new java.util.Scanner(System.in);
		int grade = sc.nextInt();
		char gpa;
		if(grade>79)
			gpa = 'A';
		else
			gpa = 'B';
		switch(gpa){
		case 'A':
			System.out.println("up to 80");
			break;
		case 'B':
			System.out.println("low to 80");
			break;
		
		}
	}

}
