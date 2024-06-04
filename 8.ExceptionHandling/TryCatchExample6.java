class TryCatchExample6 {


    public static void main(String[] arg){


     try{

        int[] a = {23,44,56,66};

        System.out.println(a[5]); // it will throw ArrayIndexOutOfBoundsException
     }
     catch(ArrayIndexOutOfBoundsException aie){

        System.out.println(" Please access the element with in array index ");
         
    }
    }
}