final class ParentClass{

 void mehtod(){
 
   System.out.println("final parent class");
   
   }
}
   
   class ChildClass extends ParentClass{
   
   
   void method(){
   System.out.println(" child class ");
   
          }
   }
   
   
   class FinalClassExample{
	   
	   public static void main(String[] arg){
		   
		   ParentClass p = new ChildClass();
		   p.mehtod();
		   
	       }
   }
   
   