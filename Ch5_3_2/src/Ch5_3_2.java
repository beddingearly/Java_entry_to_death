
public class Ch5_3_2 {
	static int a = 1;
	static double b = 2.0; 
	static void funcA(){
		int a = 3;
		double b = 4.0;
		System.out.println("after funcA ="+a+"-"+b);//3-4.0
	}
	
	static void funcB(int a, double b){
		System.out.println("before funcB setting ="+a+"-"+b);//5-6.0
		a = 3;
		b = 4.0;
		System.out.println("after funcB setting ="+a+"-"+b);//3-4.0
		
	}
	
	static void funcC(){
		a = 3;
		b = 4.0;
		
	}
	public static void main(String[] args) {
		System.out.println("before call funcA = "+a+"-"+b);//1-2.0
		System.out.println("before funcA = "+a+"-"+b);//1-2.0
		funcA();
		System.out.println("before call funcA = "+a+"-"+b);//1-2.0
		System.out.println("before call funcB = "+a+"-"+b);//1-2.0
		funcB(5,6.0);
		System.out.println("before funcC ="+a+"-"+b);//1-2.0
		funcC();
		System.out.println("before funcC ="+a+"-"+b);//3-4.0
	}

}
