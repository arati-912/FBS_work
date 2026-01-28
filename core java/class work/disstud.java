class Student{

int rollno;
String Name;
int marks;

//setters
void setrollno(int rn){
this.rollno=rn;
}

void setName(String N){
this.Name=N;
}

void setmarks(int m){
this.marks=m;
}

//getters
int getrollno(){
return this.rollno;
}

String getName(){
return this.Name;
}

int getmarks(){
return this.marks;
}


void Display(){
System.out.println("roll no is :"+rollno);
System.out.println("Name  is :"+Name);
System.out.println("marks is :"+marks+"\n");


}

}//class ends here

class Stud{
public static void main(String[] a){

Student s1=new Student();
Student s2=new Student();

s1.setrollno(22090);
s1.setName("Virat Kohali");
s1.setmarks(550);

s2.setrollno(121090);
s2.setName("Arati mt");
s2.setmarks(600);

if(s1.getmarks()>s2.getmarks()){
System.out.println("\nstudent1 Firstclss\n");
}
else{
System.out.println("\nstudent2 is Firstclass\n");
}
System.out.println("**Student onr is here");
s1.Display();
System.out.println("**Student two is here");
s2.Display();




}
}
