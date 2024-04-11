// Method overloading example by changing no.of arguments


class Adder{

     public int  add(int a , int b){
  
   return a + b;
   
   }
   
   
   public int add(int a , int b , int c){
   
    return a + b + c;
	
	}
	
	}
	
	class MethodOverloadingExample1{
		
		public static void main(String[] arg){
			
			Adder obj = new Adder();
			
			System.out.println(obj.add(20,30));
			
			System.out.println(obj.add(40,50));
			
		}
		
	}
	