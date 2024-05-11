abstract class Vehicle{

  abstract void drive();
  
   }

    
  
  class Car extends Vehicle{
  
   public void drive(){
   
    System.out.println("I am driving car");
	
	}

  }
 
 
 class Truck extends Vehicle{

   public void drive(){

     System.out.println("I am driving Truck");
     }
 }

class AbstractionExample1{

   public static void main(String[] arg){
        Vehicle  v = new Vehicle();
		v.drive();
		
        Vehicle  v1 = new Car();
		v1.drive();
		Vehicle  v2 = new Truck();
		v2.drive();
		
   }
   
}
	
	
	