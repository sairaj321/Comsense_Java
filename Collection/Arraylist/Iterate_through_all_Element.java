//Write a Java program to iterate through all elements in an array list.

package Collection.Arraylist;
import java.util.*;
public class Iterate_through_all_Element {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("blue");
		list.add("red");
		list.add("green");
		list.add("black");

		
		for(String lists:list){
				System.out.println(lists);
		}
	}

}
