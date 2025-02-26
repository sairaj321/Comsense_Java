package Collection.Arraylist;
import java.util.*;
public class Multi_dimensionl_arraylist {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
		
//		ArrayList<Integer> arr1=new ArrayList<>();
//		arr1.add(1);arr1.add(2);arr1.add(3);
//		mainlist.add(arr1);
//		
//		ArrayList<Integer> arr2=new ArrayList<>();
//		arr2.add(11);arr2.add(21);arr2.add(31);
//		mainlist.add(arr2);
//		
//		for(int i=0;i<mainlist.size();i++){
//			ArrayList<Integer> curr=mainlist.get(i);
//			for(int j=0;j<curr.size();j++){
//				System.out.print(curr.get(j));
//			}
//			System.out.println();
//		}
		
		
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		ArrayList<Integer> a3=new ArrayList<>();
		
		for(int i=1;i<=5;i++){
			a1.add(i);
			a2.add(i*2);
			a3.add(i*3);
		}
		mainlist.add(a1);
		mainlist.add(a2);
		mainlist.add(a3);
		
		//System.out.println(mainlist);
		
		
		//nested loop to print that element
		
		for(int i=0;i<mainlist.size();i++){
			ArrayList<Integer> curr=mainlist.get(i);
			
			for(int j=0;j<curr.size();j++){
				System.out.print(curr.get(j));
			}
			System.out.println();
		}
	}

}
