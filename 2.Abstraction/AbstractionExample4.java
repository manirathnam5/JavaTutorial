interface Demo{
	
	void A ();
	
	void B();
	
	void C();
	
	void D();
	
}


abstract class DemoAbstractClass implements Demo {
	
	public void C(){
		
		System.out.println("Providing the implementation from Abstract class ");
		
	}
	
}


class  OriginalClass extends DemoAbstractClass{
	
   public void A(){
	    System.out.println(" A function overriding");
		
   }
   
   public void B(){
	   System.out.println(" B function overriding");
   }
   
   public void D(){
	   
	   System.out.println(" C function overriding");
	   
   }
   
}


class AbstractionExample4{ 

 public static void main(String[] arg){
	 
	 OriginalClass obj1 = new OriginalClass();
	 obj1.C();
	 obj1.A();
	 obj1.B();
	 obj1.D();
	 
    }
  }