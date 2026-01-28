class Student{

int rollno;
String Name;
int marks;

void setrollno(int rn){
this.rollno=rn;
}

void setName(String N){
this.Name=N;
}

void setmarks(int m){
this.marks=m;
}


}//class ends here

class Stud{
public static void main(String[] a){

Student s1=new Student();
s1.setrollno(22090);
s1.setName("Virat Kohali");
s1.setmarks(550);
System.out.println("Roll no: "+s1.rollno+    "NAme   : "+s1.Name+    "Marks  : "+s1.marks);
//s1.display();
}
}
