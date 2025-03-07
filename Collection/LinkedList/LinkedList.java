package Collection.LinkedList;

public class LinkedList {
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addfirst(int data){
		//step 1
		Node newnode=new Node(data);
		size++;
		
		if(head==null){
			head=tail=newnode;
			return;
		}
		//step 2
		newnode.next=head;
		
		//step 3
		head=newnode;
	}
	
	
	public void addlast(int data){
		Node newnode =new Node(data);
		size++;
		if(head==null){
			head=tail=newnode;
			return;
		}
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
	
	public void addmid(int idx,int data){
		
		Node newnode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
		
		while(i<idx-1){
			temp=temp.next;
			i++;
		}
		
		newnode.next=temp.next;
		temp.next=newnode;
	}
	
	public int removefirst(){
		if(size==0){
			System.out.println("Empty LL");
			return Integer.MIN_VALUE;
		}else if(size==1){
			int val=head.data;
			head=tail=null;
			return val;
		}
		int val=head.data;
		head=head.next;
		return val;
	}
	
	public int removelast(){
		if(size==0){
			System.out.println("Empty set");
			return Integer.MIN_VALUE;
		}else if(size==1){
			int val=head.data;
			head=tail=null;
			return val;
		}
		
		Node prev=head;
		for(int i=0;i<size-2;i++){
			prev=prev.next;
			
		}
		int val=prev.next.data;
		prev.next=null;
		tail=prev;
		size--;
		
		return val;
	}
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.addfirst(2);
		ll.addfirst(1);
		ll.addlast(3);
		ll.addlast(4);
		ll.addmid(2, 10);
		//System.out.println("Size of LL is: "+ll.size);
		//System.out.println(ll.removefirst());
		//System.out.println(ll.removelast());
		ll.print();
		
	}

}
