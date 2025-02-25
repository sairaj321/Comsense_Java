package Collection.Arraylist;

import java.util.*;

public class Sorting_arraylist {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();

		list.add(12);
		list.add(26);
		list.add(324);
		list.add(24);
		list.add(75);
		
		//ascending order
		Collections.sort(list);
		System.out.println(list);
		
		
		//descending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
