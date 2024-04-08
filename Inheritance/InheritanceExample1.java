 class Animal {
 
 public void eat(){
   System.out.println("I am eating");
   
   }
   
   }
   
   class Dog extends Animal{
   
   public void bark(){
   
    System.out.println("T am barking ") ;
	
     	}
	
   }
	class InheritanceExample1{
		
		public static void main(String[] arg){
			
			Dog  dg = new Dog();
			
			dg.bark();
			
		}
	}
	
 