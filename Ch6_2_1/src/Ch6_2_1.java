
public class Ch6_2_1 {
	
	public static void main(){
		int i, sum = 0;
		double ave, total = 0.0;
		int temp[];
		int tips[] = {150, 200, 300};
		double sales[] = new double[4];
		sales[0] = 145.6;
		sales[1] = 178.9;
		sales[2] = 197.3;
		sales[3] = 156.7;
		temp = tips;
		for(i = 0; i < tips.length; i++){
			sum +=temp[i];
			System.out.println("["+temp[i]+"]");
		}
		System.out.println("sum = "+sum);
		/*for (double ele : sales){
			total += ele;
			System.out.println("["+ele+"]");
			
		}*/
		System.out.println("total = "+total);
		
		
	}
}
