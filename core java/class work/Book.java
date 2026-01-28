class Book{
int ISBN;
String bName;
String Auther;
String Category;
double Price;
void display(){
System.out.println("ISBN:"+this.ISBN);
System.out.println("bName:"+this.bName);
System.out.println("Auther:"+this.Auther);
System.out.println("Category:"+this.Category);
System.out.println("Price:"+this.Price);
}

}//Class ends here

class TestBook{
public static void main(String[] a){

Book b1=new Book();
b1.ISBN=4565;
b1.bName="Ikiguy";
b1.Auther="APJ Kalam";
b1.Category="good";
b1.Price=798.45;
b1.display();
}
}
