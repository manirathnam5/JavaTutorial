
class Bike{
	
	Bike(){
		
		System.out.println("Constructor invoked");
		
	}
	
	{
		
		System.out.println("Instance Intializer block ");
		
	}
	
	
}

class InstanceIntializerExample1 {
	
	 public static void main(String[] arg){
		 
		 Bike  b1 = new Bike();
		 
	 }
}