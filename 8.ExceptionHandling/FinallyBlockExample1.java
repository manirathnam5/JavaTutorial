// Finally block is executed 

class FinallyBlockExample1{

   
    public static void main(String[] arg) {
       
        try{

            int[] arr = new int[5] ;

             System.out.println(arr[0]) ;
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println(aie) ;
        }

        finally{

            System.out.println("Important code like db connection , resources closing ") ;
        }

        System.out.println("Rest of the code") ;


    }


}