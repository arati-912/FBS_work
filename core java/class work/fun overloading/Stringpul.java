class Stringpul{
 String Name;

    Stringpul(String Name){
        this.Name = Name;
    }

}//class ends here

class TString{

public static void main(String[] a){
String cName1="firstbit";
String cName2="firstbit";
String cName3="Infosis";
String cName4=new String("firstbit");

cName1="TCS";

if(cName1.equals(cName4)){
System.out.printf("equal");
}
else{
System.out.println("Not equal");
}
}
}