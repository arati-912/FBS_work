class ElectricBill{

      static double ratePerUnit=4.6;
       String CustmerName;
      int unitConsumed;


ElectricBill(String name,int unit){
  this.CustmerName=name;
  this.unitConsumed=unit;
 }

void setunitConsumed(int unit){
this.unitConsumed=unit;
}
void setCustmerName(String name){
this.CustmerName=name;
}

static void setratePerUnit(double rate){

      ratePerUnit=rate;
}



//getrers
int getunitConsumed(){
return this.unitConsumed;
}
String getCustmerName(){
return this.CustmerName;
}

static double getratePerUnit(){

     return ratePerUnit;
}

 double calculateBill() {
        return unitConsumed * ratePerUnit;
    }


void display(){
System.out.print("Name is :"+this.CustmerName);
System.out.print("unit  is :"+this.unitConsumed);


}
}//class ends here
class bill{
public static void main(String [] args){

ElectricBill e1=new ElectricBill("Arati",78);

ElectricBill e2=new ElectricBill("parth",50);




}


}