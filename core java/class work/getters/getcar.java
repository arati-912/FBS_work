class Car{

int price;
int model;
String color;
int fuelCapacity;
String brand;

void setprice(int price){
this.price=price;
}
void setmodel(int model){
this.model=model;
}

void setcolor(String color){
this.color=color;
}

void setfuelCapacity(int fuel){
this.fuelCapacity=fuelCapacity;
}

void setbrand(String brand){
this.brand=brand;
}

// getters

int getprice(){
return this.price;
}
int getmodel(){
return this.model;
}

String getcolor(){
return this.color;
}

int getfuelCapacity(){
return this.fuelCapacity;
}

String getbrand(){
return this.brand;
}

Car(){//deafault constructor
System.out.printf("Constructor called here");
this.price=1500000;
this.model=45;
this.color="wine";
this.fuelCapacity=20;
this.brand="BMW";
}//constructor end here

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
c1.display();
}
}
