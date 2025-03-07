package Collection.LinkedList;
import java.util.LinkedList;
public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		
		
		ll.addFirst(1);
		ll.addLast(2);
		
		
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
	}

}
