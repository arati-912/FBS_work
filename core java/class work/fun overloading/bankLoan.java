class Employee{
int id;
String name;
double salary;



}

class student{
int rollno;
String name;
int percentage;



}
class bank{

void Aploan(student s1){

//for student

if(s1.percentage>80){
System.out.print("Your loan is 2Lakh\n");
}
else if(s1.percentage>=60){
System.out.print("Your loan is 1Lakh\n");
}
else if(s1.percentage>=40){
System.out.print("Your loan is 50k\n");
}
else {
System.out.print("no loan approved\n");
}

}
void Aploan(Employee e1){

//for employee

if(e1.salary>12){
System.out.print("Your loan is 7Lakh\n");
}
else if(e1.salary>=10){
System.out.print("\nYour loan is 6Lakh\n");
}
else if(e1.salary>=6){
System.out.print("\nYour loan is 5k");
}
else if(e1.salary>=4){
System.out.print("\nYour loan is 4k");
}
else {
System.out.print("\nno loan approved");
}


}
}//class ends here

class TestEmp{
public static void main(String[] args){

Employee e1=new Employee();
e1.id=456;
e1.name="ganesh";
e1.salary=12;

student s1=new student();
 s1.rollno=456;
s1.name="Chiku";
s1.percentage=80;

bank b1=new bank();

b1.Aploan(e1);

b1.Aploan(s1);

}
}
