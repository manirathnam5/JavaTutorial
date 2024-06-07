class ThrowKeywordExample1{


   static void validat(int age) {


        if(age > 18 ) {

            System.out.println("Eligible to vote ") ;
        }
        else {

            throw  new ArithmeticException("Not eligible to vote ") ;
        }
    }


    public static void main(String[] arg) {


          validat(3) ;

          System.out.println("Throw keyword ");

    }
}