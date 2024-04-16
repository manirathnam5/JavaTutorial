//Super keyword in java
/* 
uses of super keyword

1. super to instance variables
2. super keyword to parent class method
3. super is used to invoke parent class constructor

*/
 class Vehicle{
	 
	 String color = "White ";
	 
 }
 
 class Car extends Vehicle{
	 
	 String color = "Red" ;
	 
	 void doPrint(){
		 System.out.println(color );
		 System.out.println(super.color);
	 }
	 
 }
 
 class SuperKeywordExample2{
	 
	  public static void main(String[] arg){
		  
		  Car  c = new Car();
		  c.doPrint();
		  
	  }
 }