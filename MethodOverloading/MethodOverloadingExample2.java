class Adder{

   public int add(int a , int b){
   
   return a+ b;
   
   }
   
   
   public long add(long a, long b){
   
   return a + b;
   
   }
   
   
   }
   
   class MethodOverloadingExample2{
   
   public static void main(String[] arg){
   
   Adder obj = new Adder();
   
   System.out.println(obj.add(10,10));
   
   System.out.println(obj.add(20,30));
   
   }
   }