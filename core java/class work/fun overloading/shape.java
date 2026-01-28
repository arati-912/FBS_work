class Shape{

void area(int s1){
System.out.print("squre :"+(s1*s1));
}

void area(int len,int bre){
System.out.print("\nreactangle :"+(len*bre));
}

void area(double radi){
System.out.print("\ncircle :"+(3.14*radi*radi));
}

void area(double bs,double hi){
System.out.print("\ntriangle :"+(0.5*bs*hi));
}

}//class ends here

class TestShape{
public static void main(String[] args){
Shape s1=new Shape();
s1.area(4);       //squre
s1.area(4,9);       //rectanfgle
s1.area(12.5);       //circle
s1.area(6.0,8.0);    //triangle
}
}

