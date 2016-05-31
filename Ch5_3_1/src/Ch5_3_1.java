
public class Ch5_3_1 {
	static int i = 1;
	static void funcA(){
		i=3;
		
	}
	public static void main(String[] args){
		System.out.println("Init is "+i);
		i++;
		System.out.println("Before funcA i = "+i);//2

		funcA();
		System.out.println("after funcA i = "+i);//3
		i++;
		System.out.println("now i = "+i);
	}
}
