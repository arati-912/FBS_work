package Pk1;

class Student {
	int id;
	String Name;
	double Distance;
	static int count = 0;

	Student() {
		this.id = 131;
		this.Name = "Nikhil";
		this.Distance = 100;
		count++;
	}

	Student(int no, String n, double current) {
		this.id = no;
		this.Name = n;
		this.Distance = current;
		count++;
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

	double getDistance() {
		return Distance;
	}

	void setDistance(double distance) {
		Distance = distance;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Student.count = count;
	}

	void display() {
		System.out.println("Firstbit id is: " + this.id);
		System.out.println("Name is: " + this.Name);
		System.out.println("Distance travelled " + this.Distance);
	}
}

class placedstudent extends Student{                                             //step 1 
	String CompanyName;
	String Designation;
	placedstudent(){
		super();                                                              	 //step 4a
		System.out.println("Default constructor");
		this.CompanyName="Google";
		this.Designation="Engineer";
	}

	placedstudent(int no, String n, int d ,String s,String current){
		super(no,n,d);                                                            //step 4b
		System.out.println("parameterized Constructor");
		this.CompanyName=s;
		this.Designation=current;
	}
	
	String getCompanyName() {
		return CompanyName;
	}

	void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	String getDesignation() {
		return Designation;
	}

	void setDesignation(String designation) {
		Designation = designation;
	}

	void display() {
		super.display();
		System.out.println("Company name is " + this.CompanyName);
		System.out.println("Designation is " + this.Designation);
	}
}

class demoinheritance {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Student total count :" + Student.getCount());

		Student s2 = new Student();
		System.out.println("Student total count :" + Student.getCount());
      
		placedstudent ps1 = new placedstudent(201,"Himanshu",100,"Microsoft","Software Engineer");
		System.out.println("Student total count :"+Student.getCount());
		
		placedstudent ps2 = new placedstudent();
		System.out.println("Student total count :"+Student.getCount());
		
		System.out.println();
		ps1.display();
		System.out.println();
		s1.display();
		
		
	}
}