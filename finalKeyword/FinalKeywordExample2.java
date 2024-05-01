
class Cook {

 final void prepareFood(){
 
 
   System.out.println("Preparing Food");
   
   }
}
   class Veg extends Cook{
   
    void prepareFood(){
	System.out.println("Preparing Veg food");
	}
   }
   
   class NonVeg extends Cook{
	   
	   void prepareFood(){
		   
		   System.out.println("Preparing Non-veg food");
	   }
   }
   
   class FinalKeywordExample2{
	   
	   public static void main(String[] arg){
		   Cook c1 = new Veg();
		   c1.prepareFood();
		   Cook c2 = new NonVeg();
		   c2.prepareFood();
		   
	   }
   }
		   