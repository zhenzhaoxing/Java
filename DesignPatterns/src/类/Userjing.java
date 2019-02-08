package 类;

public class Userjing {
int  id ;
String name;
String pwd;
  String company ="蝎子集团";

public Userjing(int id ,String name){
	this.id=id;
	this.name=name;
}

public  void printCompany(){
	System.out.println(company);
}




public static void main(String[] args) {
	Userjing u1 = new Userjing(10, "甄兆星");
	 
      System.out.println(u1.id);
     
	     u1.printCompany();
	
}
}
