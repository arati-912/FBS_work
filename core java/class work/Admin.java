class Admin{
int experienceYr;
String role;
String organization;
double salary;


//setters
void setexperienceYr(int EX){
this.experienceYr=EX;
}
void setrole(String role){
this.role=role;
}
void setorganization(String org){
this.organization=org;
}
void setsalary(double sal){
this.salary=sal;
}

//getters
int experienceYr(){
return this.experienceYr;
}

String role(){
return this.role;
}

String organization(){
return this.organization;
}

double salary(){
return this.salary;
}

// default constructor
Admin(){
System.out.print("Deafault constructor called\n");

         int experienceYr = 5;
         String role = "Administrator";
         String organization = "ABC Corp";
         double salary = 60000.0; 

}

// parameterized constructor
Admin(int ex,String role, String org,double sal){
System.out.print("Parametrized constructor called\n");

this.experienceYr=ex;
this.role=role;
this.organization=org;
this.salary=sal;

}

void display(){
System.out.print(this.experienceYr+"\n");
System.out.print(this.role+"\n");
System.out.print(this.organization+"\n");
System.out.print(this.salary+"\n");

}

}//class end here


class TestAdmin{
public static void main (String[] a){
Admin[] arr=new Admin[4];

arr[0]=new Admin();
arr[1]=new Admin();
arr[2]=new Admin();
arr[3]=new Admin(5,"Administrator","ABC Corp", 60000.0);
for(int i=0;i<4;i++){
arr[i].display();
}
}

}


