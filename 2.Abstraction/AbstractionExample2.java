abstract class Shape{
	
	abstract void draw();
	
}

 class Circle  extends Shape{
	
	void draw(){
		System.out.println( "Drawing circle");
	}
 }

 class Rectangle extends Shape{
	
	void draw(){
		System.out.println( "Drawing rectangle");
	 }
  }

 class AbstractionExample2{
	 
	 public static void main(String[] arg){
		 
	     Shape  s1 = new Circle();
          s1.draw();
         Shape  s2 = new Rectangle();
          s2.draw();

	 }

 }	 
    
  
 
