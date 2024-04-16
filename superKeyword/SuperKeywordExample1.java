class Animal {

  String color = "Blue";
  
  }
  
  class Lion extends Animal {
  
   String color = "yellow";
   
   
   void printColor(){
	   System.out.println("Lion color" + color);
	   System.out.println("Animal color " + super.color);
   
   }
   
  }
   class SuperKeywordExample1{
   
   public static void main(String[] arg){
	   
	   Lion l1 = new Lion();
	   //System.out.println(l1.color);
      
	  l1.printColor();
	  
	  }
   
    }