class Date{
int day,month,year;
String dow;

//default constructor

Date(){
System.out.print("deafault constructor called here\n");
this.day=12;
this.month=1;
this.year=2025;

}

//parameyerized constructor

Date(int day ,int month,int year,String dow){
System.out.print("parameterized constructor called here\n");

this.day=day;
this.month=month;
this.year=year;
this.dow=dow;

}


void setday(int d){
this.day=d;
}

void setmonth(int m){
this.month=m;
}

void setyear(int y){
this.year=y;
}

void setdow(String w){
this.dow=w;
}

int getday(){
return this.day;
}
int getmonth(){
return this.month;
}

int getyear(){
return this.year;
}

String getdow(){
return this.dow;
}
void display(){
System.out.println("Day :"+day+"/"+month+"/"+year);
System.out.println("day of week: "+dow);

}
}//class Date ends here

class Test{
public static void main(String[] a){

Date arr[]=new Date[3];
arr[0]=new Date();
arr[1]=new Date(7,12,2025,fri);

for(int i;i<0;i<4;i++){
System.out.print("hi");

System.out.print(arr[i]);
}


d1.display();





//d2.display();
/*
if(d1.getday()>d2.getday()){
      System.out.println("d1 is younger");
}
else{
       System.out.println("d2 is younger");

}
       System.out.println("dow is :"+getdow());
*/
}
}

