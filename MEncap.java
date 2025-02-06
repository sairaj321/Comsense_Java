
public class MEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj=new Encapsulation();
		obj.setacc_no(92910101);
		obj.setname("Sairaj");
		obj.set_balance(100);
		System.out.println("Account number: "+obj.getacc_no());
		System.out.println("Account name: "+obj.getname());
		System.out.println("Account balance: "+obj.get_balance());
	}

}
