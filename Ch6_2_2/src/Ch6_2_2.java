
public class Ch6_2_2 {

	public static void main(String[] args) {
		int i, j, total = 0, sum;
		int grades[][] = {{54,68},{67,78},{89,93}};
		for(i = 0; i < grades.length; i++){
			sum = 0;
			for(j = 0; j < grades[i].length; j++){
				sum += grades[i][j];
				total += grades[i][j]; 
			}
			System.out.println("sum = "+sum);
		}
		double sales[][] = new double[4][2];
		sales[0][0] = 123.4;
		sales[0][1] = 143.5;
		sales[1][0] = 142.3;
		sales[1][1] = 198.4;
		sales[2][0] = 234.6;
		sales[2][1] = 200.5;
		sales[3][0] = 167.1;
		sales[3][1] = 150.4;
		
		for(i = 0; i < sales.length; i++){
			for(j = 0; j < sales[i].length; j++){
				System.out.println(sales[i][j]);
			}
			
		}
	}
}