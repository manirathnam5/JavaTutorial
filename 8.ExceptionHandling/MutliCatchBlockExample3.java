
    class MutliCatchBlockExample3 {

    public static void main(String[] arg) {

           
        try{

           String str = null;

           System.out.println(str.length()) ; // throw null pointer exception 
        }
        catch(ArithmeticException ae) {
            System.out.println(ae) ;
        }
        catch(ArrayIndexOutOfBoundsException aie) {
            System.out.println(aie);
        }
        catch(NullPointerException npe){
            System.out.println(" Object is null ") ;
        }

        System.out.println("Rest of the code ") ;

    }
}