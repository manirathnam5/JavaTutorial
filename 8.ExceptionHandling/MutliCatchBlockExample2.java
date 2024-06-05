class MutliCatchBlockExample2
 {


    public static void main(String[] arg) {

          try{

            int[] arr   = new int[5] ;

                arr[10]  = 20;
          }
          catch(ArithmeticException ae) {
            System.out.println(ae) ;
          }

          catch(ArrayIndexOutOfBoundsException aie){
            System.out.println(aie) ;
          }
           
          catch(Exception e){
            System.out.println(e) ;
          }


          System.out.println("Rest of the code ") ;
    }
}
