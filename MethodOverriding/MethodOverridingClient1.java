// Method overring example 

class Vehicle {

  void run(){
  
   System.out.println(" Vehicle is running ");
   
   }
   
   }
   
 class Bike  extends Vehicle {
 
  void run(){
  
   System.out.println("Bike is running "); 
   
   }
   
   }
   
   class MethodOverridingClient1{
   
   public static void main(String[] arg){
	   
	   
	   Bike obj = new Bike();
	 
      //it will call sublcass run method 	 
	   obj.run();
	   
   }
   
   }
   