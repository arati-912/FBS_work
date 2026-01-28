class Car{

int price;
int model;
String color;
int fuelCapacity;
String brand;
void display(){

System.out.println("price       : "+this.price);
System.out.println("model       : "+this.model);
System.out.println("color        : "+this.color);
System.out.println("fuelCapacity: "+this.fuelCapacity);
System.out.println("brand       : "+this.brand);
}


}//class ends here

class TestCar{
 public static void main(String[] a){

Car c1=new Car();
c1.price=1500000;
c1.model=45;
c1.color="wine";
c1.fuelCapacity=20;
c1.brand="BMW";
c1.display();
}
}

