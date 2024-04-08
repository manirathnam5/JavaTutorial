class Animal {

  public void eat (){
  
   System.out.println("Animal eating");
   
   }
   
}
   
  class Dog extends Animal {
	  
	  public void bark(){
		  
		  System.out.println(" Dog barking");
		  
	  }
  }	  
  class Puppy extends Dog{

     public void weep(){
       System.out.println(" Puppy weeping");

	 }

    public void bark(){
		
		System.out.println("Puppy barking");
		
	}
	
  }
  
  class InheritanceExample2{
	   
	   public static void main(String[] arg){
		   
		     Dog  obj = new Dog();
			 obj.bark();
			 obj.eat();
			 Puppy puppy = new Puppy();
			 puppy.weep();
			 puppy.bark();
			
	   }
  }

  
	  