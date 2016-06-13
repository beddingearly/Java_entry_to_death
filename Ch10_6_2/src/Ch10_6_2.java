import java.util.*;
public class Ch10_6_2 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>(4);
		String name = "ABC";
		alist.add(name);
		alist.add("DEF");
		alist.add("GHI");
		System.out.println(alist.size());
		for(String element : alist){
			System.out.println(element);
		}
		alist.remove(0);
		alist.set(0, "ABC");
		for(String element : alist){
			System.out.println(element);
		}
		
	}

}
