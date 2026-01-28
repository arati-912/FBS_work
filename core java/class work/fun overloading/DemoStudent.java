class Student{
String name;
int id;
int distance;
static int count=0;



//default constroctor
Student(){
System.out.print("\nstudent default constructor called");
this.name="Arati";
this.id=456;
this.distance=45;
count++;
}

//parameterized constructor
Student(String name,int id,int distance){
System.out.print("\nStudent parametrized constructor callled");
this.name=name;
this.id=id;
this.distance=distance;
count++;
}


//setters

void setname(String name){
this.name=name;
}

void setid(int id){
this.id=id;
}

void setdistance(int distance){
this.distance=distance;
}

void setcount(int count){
Student.count=count;
}




//getters

String getname(){
return this.name;
}

int getid(){
return this.id;
}

int getdistance(){
return this.distance;
}

static int getcount(){
return count;
}

void display(){
System.out.print("name is :"+this.name);
System.out.print("id is :"+this.id);
System.out.print("distance is :"+this.distance);
}

}//student class ends here

class PlacedStudent extends Student{
String ComName;
String Desigination;


//default constructor
PlacedStudent(){
super();
System.out.print("\nPlacedStudent default constructor called");
this.ComName="FBS";
this.Desigination="Manager";
}


//parameterized constructor
PlacedStudent(String ComName,String Desigination){
super();
System.out.print("\nPlacedStudent parameterized constructor called");
this.ComName=ComName;
this.Desigination=Desigination;
}

//setters
void setComName(String ComName){
this.ComName=ComName;
}
void setDesigination(String Desigination){
this.Desigination=Desigination;
}


//getters
String getComName(){
return ComName;
}
String getDesigination(){
return this.Desigination;
}


void display(){
//per();
super.display();
System.out.print("ComName is:"+this.ComName);
System.out.print("Desigination is:"+this.Desigination);
}

}//Class placedstudent ends here

class DemoStudent2{
public static void main(String[] args){

Student s1=new Student();
System.out.print("\ntotal count is"+Student.getcount());

PlacedStudent ps1=new PlacedStudent();
System.out.print("\ntotal count is"+Student.getcount());

}

}


































