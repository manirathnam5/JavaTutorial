class Animal{
	
	void eat(){
		
		System.out.println("Eating");
		
	}
}

 class Dog extends Animal{
	 
	 void bark(){
		 
		 System.out.println("barking ...");
	 }
 }
 
 class Cat extends Animal{
	 
	 void meowing(){
		 System.out.println(" Meowing ...");
		 
	   } 
   }
   
  class InheritanceExample3{

    public static void main(String[] arg){

   Dog dg = new Dog();
   dg.bark();
   dg.eat();
   Cat ct = new Cat();
   ct.meowing();
   ct.eat();   
	}
  }