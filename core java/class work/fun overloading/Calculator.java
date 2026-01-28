class Calculator{

void add(int a , int b){
System.out.println("fun1");
System.out.println(a+b);
}

void add(int a ,double b){
System.out.println("fun2");
System.out.println(a+b);
}

void add(double a , int b){
System.out.println("fun3");
System.out.println(a+b);
}

void add(double a , double b){
System.out.println("fun4");
System.out.println(a+b);
}



void sub(double a, double b){
System.out.println("funs1");
System.out.println(a-b);
}
void sub(double a,int b){
System.out.println("funs2");
System.out.println(a-b);
}
void sub(int a, double b){
System.out.println("funs3");
System.out.println(a-b);
}
void sub(int a,int b){
System.out.println("funs4");
System.out.println(a-b);
}


void mul(int a, int b){
System.out.println("funs1");
System.out.println(a-b);
}
void mul(int a, double b){
System.out.println("funs2");
System.out.println(a-b);
}
void mul(double a, int b){
System.out.println("funs3");
System.out.println(a-b);
}
void mul(double a, double b){
System.out.println("funs4");
System.out.println(a-b);
}


void div(int a, int b){
System.out.println("funs1");
System.out.println(a-b);
}
void div(int a, double b){
System.out.println("funs2");
System.out.println(a-b);
}
void div(double a, int b){
System.out.println("funs3");
System.out.println(a-b);
}
void div(double a, double b){
System.out.println("funs4");
System.out.println(a-b);
}


}// class end here

class Calculate{
public static void main(String[] a){

Calculator c1=new Calculator();
int x=10;
//float f=10.15;
double d=15.68;

c1.add(x,x);
c1.add(d,x);
c1.add(x,d);
c1.add(d,d);


c1.sub(x,x);
c1.sub(d,x);
c1.sub(x,d);
c1.sub(d,d);

c1.mul(x,x);
c1.mul(d,x);
c1.mul(x,d);
c1.mul(d,d);


c1.div(x,x);
c1.div(d,x);
c1.div(x,d);
c1.div(d,d);



}
}




