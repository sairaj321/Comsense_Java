package Collection.Arraylist;

import java.util.ArrayList;

public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<>();

		list.add(12);
		list.add(26);
		list.add(324);
		list.add(24);
		list.add(75);
		int temp=0;
		for(int i=0;i<list.size();i++){
			
			if(list.get(i)>temp){
				temp=list.get(i);
			}
		}
		
		System.out.println("max number is :"+temp);
	}

}
