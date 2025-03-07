package Collection.LinkedList;

import Collection.LinkedList.LinkedList.Node;

public class Search_Iterative {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}}
		public static Node head;
		public static Node tail;
		public static int size;
		
		public void add(int data){
			Node newnode=new Node(data);
			size++;
			
			if(head==null){
				head=tail=newnode;
				return;
			
			}
			
			//newnode.next=head;
			//head=newnode;
			tail.next=newnode;
			tail=newnode;
		}
		public void print(){
			
			if(head==null){
				System.out.println("LL is empty");
			}
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+"->");
				
				temp=temp.next;
			}
			System.out.println("null");
		}
		
		public int cal(int key){
			Node temp=head;
			int i=0;
			while(temp!=null){
				if(temp.data==key){
					return i;
				}
				temp=temp.next;
				i++;
			}
			return -1;
		}
	

	public static void main(String[] args) {
		Search_Iterative ll=new Search_Iterative();
	
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.print();
		System.out.println(ll.cal(4));
	}

	

}
