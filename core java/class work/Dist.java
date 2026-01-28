class Distance{

int km;
int m;

void display(){
System.out.println("km : "+this.km);
System.out.println("m : "+this.m);
}

}//class ends here

class Dist{

public static void main(String[] a){

Distance d1=new Distance();
d1.km=45;
d1.m=9;

d1.display();
}
}

