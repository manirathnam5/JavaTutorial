// passing array as parameter in method 

class ArrayExample4 {


   public static int printMin(int[] arr){

       int min = arr[0] ;

       for(int i = 1 ; i < arr.length ;i++) {
             
             if (min > arr[i] )
                min = arr[i] ;  
       }

       return min ;

   }



    public static void main(String[] arg){

    int[] arr = {33,54,2,1 ,99};

    System.out.println(printMin(arr));


    }
}