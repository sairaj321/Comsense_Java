package Collection.Stack;
import java.util.Stack;
public class PushAtButton {
	
	
	public static void pushatbuttom(Stack<Integer> s,int data){
		
		if(s.isEmpty()){
			s.push(data);
			return;
		}
		int top=s.pop();
		pushatbuttom(s,data);
		s.push(top);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		pushatbuttom(s,4);
		while(!s.isEmpty()){
			System.out.println(s.pop());
		}
	}

	private static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
