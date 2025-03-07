package Collection.Stack;
import java.util.Stack;

public class CollectionStack {
	
	
	

	public static void main(String []args){
		
		//Stack<Integer> s=new Stack<>();
		
		Stack<Integer> s = new Stack<>();
		 
		s.push(1);
		s.push(2);
		s.push(3);
		
		
		s.pop();
		
		System.out.println(s);
		
		
		System.out.println(s.peek());
	}
}
