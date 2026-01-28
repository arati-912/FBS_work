class Employee{
int ID ;
String Name;
double Salary;

void setID(int id){
this.ID=id;
}
void setName(String name){
this.Name=name;
}

void setSalary(double sal){
this.Salary=sal;
}

//getters

int getID(){
return this.ID;
}
String getName(){
return this.Name;
}

double getSalary(){
return this.Salary;
}

void display(){
System.out.println("ID     :"+this.ID);
System.out.println("Name   :"+this.Name);
System.out.println("Salary :"+this.Salary);
}


 Employee(){                                          //default constructor
System.out.printf("default cunstructor called\n");
this.ID=456;
this.Name="Arati Talvankr";
this.Salary=80000;
}

 Employee(int id,String name,double sal){              //parameterized constructure
System.out.printf("Parameterised constructor\n");
this.ID=id;
this.Name=name;
this.Salary=sal;
}

}                                                           //class employee ends here


class TestEmp{

public static void main(String[] b){

Employee[] arr=new Employee[3];

arr[0]=new Employee();
arr[1]=new Employee();
arr[2]=new Employee(456,"art",45666);
for(int i=0;i<4;i++){
arr[i].display();
}


}
}
