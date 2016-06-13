import java.util.*;
public class Ch10_6_3 {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		hset.add("ABC");
		hset.add("DEF");
		
		Iterator<String> iterator = hset.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}

}
