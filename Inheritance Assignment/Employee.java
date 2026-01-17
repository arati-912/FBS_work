package Pk1;

class Employee {
	int id;
	String Name;
	Double salary;

	Employee() {
		this.id = 07;
		this.Name = "Himanshu";
		this.salary = 40000.0;
	}

	Employee(int id, String name, Double salary) {
		this.id = id;
		Name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return Name;
	}

	void setName(String name) {
		Name = name;
	}

	Double getSalary() {
		return salary;
	}

	void setSalary(Double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee ID: "+this.id);
		System.out.println("Employee Name: "+this.Name);
		System.out.println("salary: "+this.salary);
	}

}

class HR extends Employee{
	double commission;
	String Region;
	
	public HR() {
		super();
		this.commission=2000;
		this.Region="Mumbai";
	}
	public HR(int id, String name, Double salary, Double com, String reg) {
		super(id, name, salary);
		this.commission=com;
		this.Region=reg;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	void display() {
		super.display();
		System.out.println("HR Commission: "+this.commission);
		System.out.println("Region: "+this.Region);
	}

}

class TestEmployee{
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.display();
		
		System.out.println();
		
		HR h1 = new HR(6,"Nikhil",40000.0,2000.0,"Pune");
		h1.display();
	}
}