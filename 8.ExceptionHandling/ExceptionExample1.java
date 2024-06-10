
  class MyCustomeException extends Exception{




  }

class ExceptionExample1{


    public static void main(String[] arg) {

      try{

        throw new MyCustomeException() ;

      } 
      catch( MyCustomeException mce){
        System.out.println("Caught the exception") ;
        System.out.println(mce.getMessage()) ;
      }
      System.out.println("Rest of the code ") ;

    }
}