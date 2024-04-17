class Food {
	
	Food(){
		
		
		System.out.println("Constructor invoked");
		
	}
	
	{
		
		System.out.println("Instance Intializer block invoked");
		
	}
	
}

class InstanceIntializerExample2{
	
	 public static void main(String[] arg){
		 
		 Food  f1 = new Food();
		 
		 Food f2 = new Food();
		 
	 }
}