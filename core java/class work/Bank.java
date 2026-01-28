import java.util.Scanner;
class BankAccount{

int accNo;
String HolderN;
double CBalence;
static double IntrestRate;

static BankAccount obj=new BankAccount();


BankAccount(int accNo,String name,double CBalence){            //parameterized constructor
            System.out.println("parameterized constructor called\n");

              this.accNo=accNo;
              this.HolderN=name;
             this.CBalence=CBalence;
             //this.IntrestRate=IntrestRate;
}


BankAccount(){            //default constructor
          System.out.println("default constructor called\n");

              this.accNo=143;
              this.HolderN="arati";
             this.CBalence=56;
            // this.IntrestRate=12;
}

 static{
    IntrestRate=12.5;
       
}

//getters

int getaccNo(){
return this.accNo;
}

 double getIntrestRate(){
 return this.IntrestRate;
}

String getHolderN(){
return this.HolderN;
}

double getCBalence(){
return this.CBalence;
    }

//setters
void setaccNo(int  accNo){
 this.accNo=accNo;
}

static void setIntrestRate(double In){
  IntrestRate=In;
}

void setHolderN(String name){
 this.HolderN=name;
}

void setCBalence(double CBalence){
 this.CBalence=CBalence;
    }

void display(){
        System.out.println("\naccNo:"+getaccNo());
        System.out.println("HolderN:"+getHolderN());
        System.out.println("CBalence:"+getCBalence());
        System.out.println("IntrestRate:"+getIntrestRate());
        
        }


}//class end here


class TestBank{
public static void main(String[] args){
/*
Scanner sc=new Scanner(System.in);

System.out.println("Enter AccNo");
int accNo=sc.nextInt();

sc.nextLine();

System.out.println("Enter HolderN");
String name=sc.nextLine();

System.out.println("Enter CBalence");
double balance=sc.nextDouble();

System.out.println("Enter IntrestRate");
double rate=sc.nextstatic();
*/

BankAccount b1=new BankAccount(123,"arti",2500);
BankAccount b2=new BankAccount(127,"arru",2800);
BankAccount b3=new BankAccount(129,"art",2300);
        b1.display();
        b2.display();
        b3.display();
BankAccount.setIntrestRate(7.8);
      b1.display();
        b2.display();

//

      



       }
}

