
 // When exception occurs but not handled by catch block  
 
class FinallyBlockExample2{


    public static void main(String[] arg) {

          try{

                int a = 10;
                int b = 10/0;

                System.out.println(b) ;
          }
          catch(NullPointerException npe){
            System.out.println(npe);
          }

          finally {

            System.out.println("Important code will executed ") ;

          }

          System.out.println("Rest of the code ") ;

    }
}