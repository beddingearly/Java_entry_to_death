import java.util.*;
public class Ch10_6_4 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>(4);
		alist.add("ABC");
		alist.add("DEF");
		
		ListIterator<String> iterator = alist.listIterator(0);
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		ListIterator<String> iterator1 = alist.listIterator(alist.size());
		while(iterator1.hasPrevious()){
			System.out.println(iterator1.previous());
		}
	}

}
