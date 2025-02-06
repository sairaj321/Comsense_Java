package Company;


public class TemporaryEmployee extends Company {
	private String empName;
	private String empContact;
	private String department;
	private double wagePerDay;
	private int presentDays;
	double grossSalary;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getWagePerDay() {
		return wagePerDay;
	}

	public void setWagePerDay(double wagePerDay) {
		this.wagePerDay = wagePerDay;
	}

	public int getPresentDays() {
		return presentDays;
	}

	public void setPresentDays(int presentDays) {
		this.presentDays = presentDays;
	}
	

	void getdata()
	{
		super.getData();
		System.out.println("*Temporary Employee Details");
		System.out.println("Employee Name      :"+getEmpName());
		System.out.println("Contact Number     :"+getEmpContact());
		System.out.println("Employee Department:"+getDepartment());
		System.out.println("Wage per Day       :"+getWagePerDay());
		System.out.println("Present Days       :"+getPresentDays());
		System.out.println("Salary of Employee  :"+getPresentDays()*getWagePerDay());
		System.out.println("*");
	}
	
	void printSalarySlip()
	{
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                        "+CompanyName+"                                   ");
		System.out.println("                   "+CompanyAddress+"                                   ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                                     "+getEmpName()+"                         ");
		System.out.println(getEmpContact()+"                     "+getDepartment()+"    ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Daily Wages  :"+getWagePerDay());
		System.out.println("Present Days :"+getPresentDays());
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Gross Salary :"+getPresentDays()*getWagePerDay());
		System.out.println("------------------------------------------------------------------------------");
	}
}