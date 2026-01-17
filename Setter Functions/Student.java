class Student 
{
int rollno;
String name;
double marks;
void setrollno(int r)
{
 this.rollno = r;
}

void setname(String str)
{
this.name = str;
}

void setmarks( double a)
{
this.marks = a;
}
} //class student ends here


class TestStudent{
public static void main(String[] args) {
       Student s1;
      s1= new Student();
      s1.setrollno(6);
      s1.setname("Himanshu");
      s1.setmarks(80);
System.out.println("Roll No:"+s1.rollno+"\nStudent Name:"+s1.name+"\nMarks:"+s1.marks);
} //main ends here 
} //Test class ends here 