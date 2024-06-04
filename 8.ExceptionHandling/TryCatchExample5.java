class TryCatchExample5{



    public static void main(String[] arg) {

        try{

            int a = 50/0;


        } 
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e) ;
        }

        

    }
}