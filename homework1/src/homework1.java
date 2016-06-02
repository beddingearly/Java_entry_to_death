
public class homework1 {

	public static void main(String[] args) {
		java.util.Scanner sc =
				new java.util.Scanner(System.in);
		while(true){
			System.out.println("Please input the money you should pay:");
			double input = sc.nextDouble();
			input = input*100;
			double temp = 500 - input;
			temp = (int)temp * 100;
			double rest = temp / 10000;
			int counter = 0;
			while(rest - 2.00 >= 0){
				rest -= 2.00;
				counter++;
			}
			while(rest - 1.00 >= 0){
				rest -= 1.00;
				counter++;
			}
			while(rest - 0.50 >=0){
				rest -= 0.50;
				counter++;
			}
			while(rest - 0.10 >= 0){
				rest -= 0.10;
				counter++;
			}
			while(rest - 0.05 >= 0){
				rest -= 0.05;
				counter++;
			}
			while(rest - 0.02 >= 0){
				rest -= 0.02;
				counter++;
			}
			while(rest - 0.01 >= 0){
				rest -= 0.01;
				counter++;
				
			}
			System.out.println(counter);
		}
		

	}

}
