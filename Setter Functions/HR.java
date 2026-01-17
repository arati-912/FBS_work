class HR {
	int id;
    String name;
    double salary;
    double commission;
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
void setCommission(double com)
	{ 
		this.commission = com;
	}
	}//HR class ends here
class TestHR {
	public static void main(String args[]){
		HR H1;
		H1= new HR();
		H1.setID(006);
		H1.setName("Himanshu");
		H1.setSalary(25000);
                H1.setCommission(10000);
		System.out.println("HR ID:"+H1.id+"\nHR NAME:"+H1.name+"\nHR SALARY:"+H1.salary+"\nHR Commission:"+H1.commission);
		
	}   //main ends here

} //test class ends here