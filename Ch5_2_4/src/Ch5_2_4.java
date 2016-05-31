
public class Ch5_2_4 {
	
	static void funcA(int c, boolean b){
		c++;
		b = false;
		System.out.println("during A = "+c+"-"+b); 
				
	}
	static void funcB(int temp[], String b){
		temp[0] = 150;
		b = "J";
		System.out.println("during B = "+temp[0]+"-"+b);
	}
	static int semp[] = {1,2,3};
	static String b = "C";
	static void funcC(){
		semp[1] = 222;
		b = "W";
		System.out.println("during C = "+semp[1]+"-"+b);
	}
	public static void main(String[] args) {
		boolean a = true;
		int c = 1;
		int temp[] = {1,2};
		System.out.println("before A = "+c+"-"+a);
		funcA(c,a);
		System.out.println("after A = "+c+"-"+a);
		String b = "Z";
		System.out.println("before B = "+temp[0]+"-"+b);
		funcB(temp, b);
		System.out.println("after B = "+temp[0]+"-"+b);
		int semp[] = {998,997,996};
		
		System.out.println("before C = "+semp[1]+"-"+b);

		funcC();
		System.out.println("after C = "+semp[1]+"-"+b);
	}

}
