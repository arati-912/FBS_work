class Admin {
	int id;
    String name;
    double salary;
    double allowence;
	void setID(int id)
	{ 
		this.id = id;
	}
	void setName(String str)
	{ 
		this.name = str;
	}
    void setSalary(double sal)
	{ 
		this.salary = sal;
	}
void setallowence(double allo)
	{ 
		this.allowence = allo;
	}
	}//Admin class ends here
class TestAdmin {
	public static void main(String args[]){
		Admin A1;
		A1= new Admin();
		A1.setID(006);
		A1.setName("Himanshu");
		A1.setSalary(50000);
                A1.setallowence(20000);
		System.out.println("Admin ID:"+A1.id+"\nAdmin Name:"+A1.name+"\nAdmin salary:"+A1.salary+"\nAdmin Allowence:"+A1.allowence);
		
	}   //main ends here

} //test class ends here