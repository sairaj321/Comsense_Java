package Collection.Arraylist;
import java.util.*;
public class Opreations_arraylist {

	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>();
		
		//add element
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		//System.out.println(list);
		
		//get element
		int i=list.get(2);
		//System.out.println(i);
		
		//remove element
		
		list.remove(3);
		//System.out.println(list);
		
		//set in the index 
		list.set(1,90);
		System.out.println(list);
		
		//contains element 
		System.out.println(list.contains(90));
		
		
	}

}
