class Book 
{
int ISBN;
String bname;
String category;
int price;
void setISBN(int r)
{
 this.ISBN = r;
}

void setbname(String bn)
{
this.bname = bn;
}

void setcategory(String ctr)
{
this.category = ctr;
}

void setprice(int p)
{
this.price = p;
}
} //class Book ends here


class TestBook{
public static void main(String[] args) {
       Book b1;
      b1= new Book();
      b1.setISBN(248295);
      b1.setbname("Reversed Insanity");
      b1.setcategory("Novel");
      b1.setprice(800);
System.out.println("ISBN:"+b1.ISBN+"\nBook Name:"+b1.bname+"\nCategory : "+b1.category+"\nPrice:"+b1.price);
} //main ends here 
} //Test class ends here 