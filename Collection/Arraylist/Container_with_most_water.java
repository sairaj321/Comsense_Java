package Collection.Arraylist;
import java.util.*;
public class Container_with_most_water {

	public static int cal(ArrayList<Integer> height){
		int maxwater=0;
		
		for(int i=0;i<height.size();i++){
			for(int j=i+1;j<height.size();j++){
				int ht=Math.max(height.get(i), height.get(j));
				int wid=j-i;
				int currwater=ht*wid;
				maxwater=Math.max(maxwater, currwater);
			}
		}
		return maxwater;
	}
	public static void main(String[] args) {
		ArrayList<Integer> height=new ArrayList<>();

		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		
		
		System.out.println(cal(height));
		
	}

}
