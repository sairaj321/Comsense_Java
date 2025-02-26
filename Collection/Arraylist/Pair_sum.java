package Collection.Arraylist;
import java.util.*;
public class Pair_sum {

	public static void cal(ArrayList<Integer>list,int target){
		
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				int sum=list.get(i)+list.get(j);
				if(sum==target){
					System.out.println(list.get(i)+" "+list.get(j));
					
				}
			}
		}
	}
	
	 
	public static boolean twopointer(ArrayList<Integer>list ,int target)
	{
		int lp=0;
		int rp=list.size()-1;
		
		while(lp<rp){
			
			if(list.get(lp)+list.get(rp)==target){
				return true;
			}else if(list.get(lp)+list.get(rp)<target){
				lp++;
			}else if(list.get(lp)+list.get(rp)>target){
				rp--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int target=5;
		//cal(list,target);
		System.out.println(twopointer(list,target));
	}

}
