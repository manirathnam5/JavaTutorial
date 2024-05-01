class Bike {

  final int speed = 100;
  
  /*
  we can't change the final variable because 
  once final variable is assigned it can't be changed
  */
  void run(){
	  speed = 200;
	  
  }
  
}
 
 class FinalKeywordExample1{
	 
	 public static void main(String[] arg){
		 
		 Bike  b1 = new Bike();
		 
		 b1.run();
		 
	      }
 }
 
 
 //output : compile time error 
  
  