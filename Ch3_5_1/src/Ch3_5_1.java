public class Ch3_5_1 {
	public static void main(String[] args) {
		int a = 123;
		float b = 15.5f;
		long c = 345678;
		
		System.out.println(a+134);
		System.out.println(a+c);
	}

}
/*
 * 宽化数据类型转换不需要特别的语法，自动转化为范围较大的数据类型，不会损失精度
 */