
  class MyCustomeException extends Exception{

 public MyCustomeException(String str){

    super( str);
 }

  }

class ExceptionExample1{


    public static void main(String[] arg) {

      try{

        throw new MyCustomeException("My own exception") ;

      } 
      catch( MyCustomeException mce){
        System.out.println("Caught the exception") ;
        System.out.println(mce.getMessage()) ;
      }
      System.out.println("Rest of the code ") ;
    }
}