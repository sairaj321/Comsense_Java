package Company;


public class PermanantEmployee extends Company {
	
	private long empId;
	private String empName;
	private String empContact;
	private String department;
	private String designation;
	private double basicSalary;
	private String grade;
	double HRA,DA,PF,Allowance,grossSalary;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	void Calculate()
	{
		HRA=0.2*getBasicSalary();
		DA=0.5*getBasicSalary();
		PF=0.11*getBasicSalary();
		
		if(grade=="A")
		{
			Allowance=1700;
		}
		else if(grade=="B")
		{
			Allowance=1500;
		}
		else if(grade=="C")
		{
			Allowance=1300;
		}
		else {
			Allowance=0;
		}
		
		grossSalary=getBasicSalary()+HRA+DA+Allowance-PF;
	}
	
	void getData()
	{
		super.getData();
		System.out.println("*Permanent Employee Details");
		System.out.println("Employee ID        :"+ getEmpId());
		System.out.println("Employee Name      :"+getEmpName());
		System.out.println("Contact Number     :"+getEmpContact());
		System.out.println("Employee Department:"+getDepartment());
		System.out.println("Employee Designation:"+getDesignation());
		System.out.println("Basic Salary        :"+getBasicSalary());
		System.out.println("Grade of Employee   :"+getGrade());
		System.out.println("*");
	}
	
	void printSalarySlip()
	{
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("                        "+CompanyName+"                                   ");
		System.out.println("                   "+CompanyAddress+"                                   ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(getEmpId()+"                           "+getEmpName()+"                         ");
		System.out.println(getEmpContact()+"                    "+getDesignation()+" "+getDepartment()+"    ");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Basic Salary :"+getBasicSalary());
		System.out.println("Grade        :"+getGrade());
		System.out.println("HRA          :"+HRA);
		System.out.println("DA           :"+DA);
		System.out.println("Allowance    :"+Allowance);
		System.out.println("PF           :"+PF);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Gross Salary :"+grossSalary);
		System.out.println("------------------------------------------------------------------------------");
	}
}