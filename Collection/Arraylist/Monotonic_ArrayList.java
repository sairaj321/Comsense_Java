package Collection.Arraylist;
import java.util.*;
public class Monotonic_ArrayList {
	
	public static boolean cal(ArrayList<Integer> list){
		boolean inc=true;
		boolean dec=true;
		
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i)>list.get(i+1)){
				inc=false;
			}
			if(list.get(i)<list.get(i+1)){
				dec=false;
			}
		}
		
		return inc||dec;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(221);
		list.add(42);
		list.add(41);
		list.add(23);
		list.add(7);

		System.out.println(cal(list));
	}

}
