package Collection.Arraylist;

import java.util.ArrayList;

public class MostFrequent_Number {

	public static void main(String[] args) {
		// :nums = [1,100,200,1,100], key = 1
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(100);
		list.add(200);
		list.add(1);
		list.add(100);
		
		int key=1;
		
		cal(list,key);
	}

}
