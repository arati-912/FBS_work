class Product{
int PId;
String PName;
int Quantity;
void display(){
 System.out.println("PId: "+this.PId);
 System.out.println("Pname: "+this.PName);
 System.out.println("Quantity: "+this.Quantity);
}

}//product class ends here

class TestProduct{

public static void main(String[] args){
Product p1=new Product();
p1.PId=45621;
p1.PName="Arati";
p1.Quantity=5;
p1.display();
}
}