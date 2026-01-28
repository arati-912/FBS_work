class complex{

int real;
int img;
void display(){
System.out.println("Add of real no : " +this.real);
System.out.println("Add of img no : " +this.img);

}
}//class ends here

class Com{

public static void main(String[] a){

complex c1=new complex();
complex c2=new complex();
complex c3=new complex();

c1.real=78;
c1.img=45;
c2.real=8;
c2.img=98;
c3.real=c1.real+c2.real;
c3.img=c1.img+c2.img;
c3.display();


   }
}




