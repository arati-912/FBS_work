class Date {
    int day, month, year;
String dow;

void setDay(int d){
this.day=d;
}
void setMonth(int m){
this.month=m;
}
void setYear(int y){
this.year=y;
}
void setDow(String str){
this.dow=str;
}





    
}//Date end here
class Test {
public static void main(String[] a) {
Date d1=new Date();
d1.setDay(2);
d1.setMonth(12);
d1.setYear(2025);
d1.setDow("monday");
System.out.println("Date:"+d1.day+"/"+d1.month+"/"+d1.year);
System.out.println("Day of week:"+d1.dow);
       

    }
}
