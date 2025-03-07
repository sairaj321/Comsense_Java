package Collection.LinkedList;

import Collection.LinkedList.Search_Iterative.Node;

public class Reverse_linkedlist {

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
		
		
		public void reverse(){
			
			Node prev=null;
			Node curr =head;
			Node next;
			
			while(curr!=null){
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
				
			}
			tail=head;
			head=prev;
		}
		
	

	public static void main(String[] args) {
		Reverse_linkedlist ll=new Reverse_linkedlist();
	
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
		ll.print();
		//System.out.println(ll.cal(4));
		//ll.reverse();
		//ll.print();
		System.out.println("hello"+null);
		
	}

}
