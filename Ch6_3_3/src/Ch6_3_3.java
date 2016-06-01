
public class Ch6_3_3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("programming");
		char charArr[] = {'J', 'a', 'v', 'a'};
		System.out.println("origin char:"+sb);
		sb.append('-');
		sb.insert(2, "fuck");
		sb.setCharAt(3, 'E');
		//sb.reverse();
		System.out.println(sb);
	}

}
