class Printer{

void print(){
System.out.printf("blank :\n");
}


int print(int a){
System.out.printf("a is:"+a+"\n");
//return this.a;
}



char print(char ch){
System.out.printf("charecter is  :"+ch+"\n");
//return this.ch;
}



String print(String str){
System.out.printf("string is  :"+str);
//return this.str;
}


}
class Test{

public static void main(String[] a){

Printer p1=new Printer();
p1.print();
p1.print(10);
p1.print('a');
p1.print("Arati");
}
}



