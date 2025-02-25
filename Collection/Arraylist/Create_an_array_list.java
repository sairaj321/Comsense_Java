//1. Write a Java program to create an array list, add some colors (strings) and 
//print out the collection.

package Collection.Arraylist;
import java.util.ArrayList;
public class Create_an_array_list {

	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<>();
		
		list.add("red");
		list.add("yellow");
		list.add("blue");
		
		System.out.println(list);
	}

}
