import java.util.*;
public class Ch10_6_1 {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<>();
		String name0 = "ABC";
		String name1 = "DEF";
		System.out.println("isEmpty? "+hset.isEmpty());
		hset.add("GHI");
		hset.add(name0);
		hset.add("JKL");
		System.out.println("isEmpty? "+hset.isEmpty());
		System.out.println("now size: "+hset.size());
		System.out.println("content: "+hset);
		hset.clear();
		System.out.println("isEmpty? "+hset.isEmpty());
		System.out.println();
	}

}
