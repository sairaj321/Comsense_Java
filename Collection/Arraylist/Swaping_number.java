package Collection.Arraylist;

import java.util.ArrayList;

public class Swaping_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<>();

		list.add(12);
		list.add(26);
		list.add(324);
		list.add(24);
		list.add(75);
		
		System.out.println(list);
		
		int temp=list.get(1);
		list.set(1, list.get(2));
		list.set(2, temp);
		
		System.out.println(list);
	}

}
