class HR{

int ID ;
String Name;
double Commition,Salary;

//setters
void setID(int id){this.ID=id;}
void setName(String Name){this.Name=Name;}
void setCommition(double Commi){this.Commition=Commi;}
void setSalary(double Sal){this.Salary=Sal;}

//getters

int getID(){return this.ID;}
String getName(){return this.Name;}
double getCommition(){return this.Commition;}
double getSalary(){return this.Salary;}

//default constructor

HR(){
System.out.println("default constructor called\n");

this.ID=4587;
this.Name="Arati Talvankar";
this.Salary=45000;
this.Commition=5000;
}

//parameterized constructor

HR(int id,String name,double sal,double comi){
System.out.println("parametrized constructor called\n");

this.ID=id;
this.Name=name;
this.Salary=sal;
this.Commition=comi;
}

void display(){                //function defination

System.out.println("Name      :"+this.Name);
System.out.println("ID        :"+this.ID);
System.out.println("Commition :"+this.Commition);
System.out.println("Salary    :"+this.Salary);
}
}//class ends here


class TestHR{

public static void main(String[] a){
HR[] arr=new HR[3];

arr[0]=new HR();
arr[1]=new HR();
arr[2]=new HR(123,"art",45222,45);
for(int i=0;i<3;i++){
arr[i].display();
}

HR h1=new HR();
HR h2=new HR(412,"Arati Talvankar",4500,500000);


h1.display();//call/invoke
h2.display();//call/invoke
}
}
