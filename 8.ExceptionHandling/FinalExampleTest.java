class FinalExampleTest {  
    //declaring final variable  
    final int age = 18;  
    void display() {  
      
    // reassigning value to age variable   
    // gives compile time error  
    age = 55;  
    }  
    class FinallyExample {    
        public static void main(String args[]){   
        try {    
          System.out.println("Inside try block");  
        // below code throws divide by zero exception  
         int data=25/0;    
         System.out.println(data);    
        }   
        // handles the Arithmetic Exception / Divide by zero exception  
        catch (ArithmeticException e){  
          System.out.println("Exception handled");  
          System.out.println(e);  
        }   
        // executes regardless of exception occurred or not   
        finally {  
          System.out.println("finally block is always executed");  
        }    
        System.out.println("rest of the code...");    
        }    
    public static void main(String[] args) {  
      
    FinalExampleTest obj = new FinalExampleTest();  
    // gives compile time error  
    obj.display();  
   
    }  
}  