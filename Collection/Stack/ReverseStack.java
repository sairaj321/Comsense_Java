package Collection.Stack;

import java.util.Stack;

public class ReverseStack {
public static void pushatbuttom(Stack<Integer> s,int data){
		
		if(s.isEmpty()){
			s.push(data);
			return;
		}
		int top=s.pop();
		pushatbuttom(s,data);
		s.push(top);
		
		
	}

public static void reverseStack(Stack<Integer>s ){
	if(s.isEmpty()){
		return;
	}
	int top=s.pop();
	reverseStack(s);
	pushatbuttom(s,top);
	}

public static void printStack(Stack<Integer> s){
	while(!s.isEmpty()){
		System.out.println(s.pop());
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>s =new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		reverseStack(s);
		printStack(s);
		
	}

}
