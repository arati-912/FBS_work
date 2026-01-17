class Car 
{
int model;
String brand;
String color;
int price;
double fuelcapacity;
void setmodel(int r)
{
 this.model = r;
}

void setbrand(String br)
{
this.brand = br;
}

void setcolor(String cl)
{
this.color = cl;
}

void setprice(int p)
{
this.price = p;
}

void setfuelcapacity(int c)
{
this.fuelcapacity = c;
}

} //class Car ends here

class TestCar{
public static void main(String[] args) {
       Car c1;
      c1= new Car();
      c1.setmodel(248295);
      c1.setbrand("Reversed Insanity");
      c1.setcolor("Novel");
      c1.setprice(800000);
      c1.setfuelcapacity(50);
System.out.println("Model:"+c1.model+"\nCar brand:"+c1.brand+"\n color : "+c1.color+"\nPrice:"+c1.price+"\nFuel Capacity: "+c1.fuelcapacity);
} //main ends here 
} //Test class ends here 