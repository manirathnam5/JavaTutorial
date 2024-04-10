class A{

 public void show(){
   System.out.println("Showing ...");
   }
   }
   
class B{

  public void show(){
  
  System.out.println("Showing B ...");
  
    }
  
   }
  // Mulitple inheritance example
  // Its not supported in java throws error
  class C extends A, B {
  
   public static void main(String[] arg){
   
    C  obj = new C();
	obj.show();
	
     	}
	}